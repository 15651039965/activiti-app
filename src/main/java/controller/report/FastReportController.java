package controller.report;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricProcessInstanceQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pagemodel.DataGrid;
import pagemodel.HistoryProcess;
import service.impl.ReportServiceImpl;
import service.impl.userServiceImpl;
import service.user.userService;

import com.alibaba.fastjson.JSON;

import entity.User;
import entity.WorkTask;
@Controller
public class FastReportController {
	@Autowired
	RepositoryService rep;
	@Autowired
	RuntimeService runservice;
	@Autowired
	IdentityService identityservice;
	@Autowired
	ReportServiceImpl reportservice;
	@Autowired
	TaskService taskservice;
	@Autowired
	HistoryService histiryservice;
	@Autowired
	userServiceImpl userservice;
	@RequestMapping("/reportapply")
	public String task(HttpSession session){
		
		return "task";
	}
	
	@RequestMapping("/uploadworkflow")
	public String fileupload(@RequestParam MultipartFile uploadfile,HttpServletRequest request){
		try{
			MultipartFile file=uploadfile;
			String filename=file.getOriginalFilename();
			InputStream is=file.getInputStream();
			rep.createDeployment().addInputStream(filename, is).deploy();
		}catch(Exception e){
			e.printStackTrace();
		}
		return "index";
	}
	
	
	
/**
 * 
 * @param null
 * @return 项目经理待定事项页面
 */
	@RequestMapping("/deptleaderlist")
	public String mytask1(){
		return "deptleaderlist"; 
	}

	/**
	 * 
	 * @param null
	 * @return 监理审核页面  
	 */
		@RequestMapping("/constructionaudit")
		public String mytask2(){
			return "controllist"; 
		}
	
/**
 * 
 * @param null
 * @return 项目经理验收
 */
	@RequestMapping("/deptleaderacceptlist")
	public String mytask3(){
	return "deptleaderacceptlist"; 
}

	
	/**
	 * 维修人员
	 * @return
	 */
@RequestMapping("/builderlist")
public String mytask4(){
return "builderlist"; 
}
	

/**
 * 监理验收
 * @return
 */
@RequestMapping("/supervisoracceptlist")
public String mytask5(){
return "supervisoracceptlist"; 
}


/**
 * 业主验收
 * @return
 */
@RequestMapping("/owneracceptlist")
public String mytask6(){
return "owneracceptlist"; 
}
/**
 * *历史任务
 * @return
 */

@RequestMapping("/historyprocess")
public String mytask7(){
	
	return "historyprocesslist";
	
}
/**
 * 添加用户
 * @param session
 * @return
 */

@RequestMapping("/adduser")
public String mytask8(HttpSession session){
	User user = new User();

	String usernamelist=userservice.findServiceman(user);
	System.out.println(usernamelist);
	session.setAttribute("usernamelist", usernamelist);
	return "adduser";
	
}

/**
 * 
 * @param worktask
 * @param session
 * @return
 */
/*
@RequestMapping(value="/starttask",method=RequestMethod.POST)
public String start_report(WorkTask worktask ,HttpSession session){
	System.out.println(worktask.getChannel());
	String username=(String) session.getAttribute("username");	
	User user = new User();
	user.setUserid(8);
	
	String userIds=userservice.findDeptLeaders(user);
	Map<String,Object> variables=new HashMap<String, Object>();
	variables.put("publishname", username);
	variables.put("publishdate", new Date());
	variables.put("tasktype", worktask.getTasktype());
	variables.put("deptleaderuserId", userIds);
	System.out.println("##################################"+userIds);
	ProcessInstance ins=reportservice.startWorkflow(worktask, username, variables);
	System.out.println("流程id"+ins.getId()+"已启动");
	return "index";
}

*/


/**
 * 使用组分配任务
 * @param worktask
 * @param session
 * @return
 */
@RequestMapping(value="/starttask",method=RequestMethod.POST)
public String start_report(String userIds,WorkTask worktask ,HttpSession session){
	System.out.println(worktask.getChannel());
	String username=(String) session.getAttribute("username");	
	
	userIds="jingli001,jinglitest,Quancheng";
	
	Map<String,Object> variables=new HashMap<String, Object>();
	variables.put("publishname", username);
	variables.put("publishdate", new Date());
	variables.put("tasktype", worktask.getTasktype());
	variables.put("deptleaderuserId", userIds);

	System.out.println("##################################"+userIds);
	ProcessInstance ins=reportservice.startWorkflow(worktask, username, variables);
	System.out.println("流程id"+ins.getId()+"已启动");
	return "index";
}

/**项目经理页面*/

	@RequestMapping(value="/depttasklist",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public DataGrid<WorkTask> getdeptplantasklist(HttpSession session,@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
		DataGrid<WorkTask> grid=new DataGrid<WorkTask>();
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(0);
		grid.setRows(new ArrayList<WorkTask>());
		//先做权限检查，对于不是项目经理审批权限的用户,直接返回空
		String username=(String) session.getAttribute("username");
		System.out.println("用户名："+username);
		User user = new User();
		user.setLoginname(username);
		User sysuser=userservice.getUserByUser(user);
	
		if(sysuser.getRole()!=4){							
				return grid;
			}else{
				int firstrow=(current-1)*rowCount;
				List<WorkTask> results=reportservice.getpagedepttask(username,firstrow,rowCount);
				System.out.println(results.size());
				int totalsize=reportservice.getalldepttask(username);
	               
				List<WorkTask> tasks=new ArrayList<WorkTask>();
				for(WorkTask worktask:results){
					WorkTask task=new WorkTask();	
					task.setChannel(worktask.getChannel());
					task.setTasktype(worktask.getTasktype());
					task.setPostype(worktask.getPostype());
					task.setTaskId(worktask.getTask().getId());
					task.setBegintime(worktask.getBegintime());
					task.setEndtime(worktask.getEndtime());			
					task.setType(worktask.getType());
					task.setStyle(worktask.getStyle());				
					task.setContent(worktask.getContent());
					task.setFile(worktask.getFile());
					task.setProcessinstanceid(worktask.getProcessinstanceid());
					task.setProcessdefid(worktask.getTask().getProcessDefinitionId());
					
					
					tasks.add(task);
				}
				grid.setRowCount(rowCount);
				grid.setCurrent(current);
				grid.setTotal(totalsize);
				grid.setRows(tasks);
				
				
				
				return grid;
			}
	}
	

	@RequestMapping(value="/deptaccepttasklist",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public DataGrid<WorkTask> getdeptaccepttasklist(HttpSession session,@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
		DataGrid<WorkTask> grid=new DataGrid<WorkTask>();
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(0);
		grid.setRows(new ArrayList<WorkTask>());
		//先做权限检查，对于不是项目经理审批权限的用户,直接返回空
		String username=(String) session.getAttribute("username");
		System.out.println("用户名："+username);
		User user = new User();
		user.setLoginname(username);
		User sysuser=userservice.getUserByUser(user);

		if(sysuser.getRole()!=4){							
				return grid;
			}else{
				int firstrow=(current-1)*rowCount;				
				List<WorkTask> results=reportservice.getpagedeptaccepttask(username,firstrow,rowCount);
				System.out.println(results.size());
				int totalsize=reportservice.getalldeptaccepttask(username);
				System.out.println("......."+totalsize);
				List<WorkTask> tasks=new ArrayList<WorkTask>();
				for(WorkTask worktask:results){
					WorkTask task=new WorkTask();	
					task.setChannel(worktask.getChannel());
					task.setTasktype(worktask.getTasktype());
					task.setPostype(worktask.getPostype());
					task.setTaskId(worktask.getTask().getId());
					task.setBegintime(worktask.getBegintime());
					task.setEndtime(worktask.getEndtime());			
					task.setType(worktask.getType());
					task.setStyle(worktask.getStyle());				
					task.setContent(worktask.getContent());
					task.setFile(worktask.getFile());
					task.setProcessinstanceid(worktask.getProcessinstanceid());
					task.setProcessdefid(worktask.getTask().getProcessDefinitionId());
					
					
					tasks.add(task);
				}
				grid.setRowCount(rowCount);
				grid.setCurrent(current);
				grid.setTotal(totalsize);
				grid.setRows(tasks);
				
				
				
				return grid;
			}
	}
	
	@RequestMapping(value="/jltasklist",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public DataGrid<WorkTask> gethrtasklist(HttpSession session,@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
		DataGrid<WorkTask> grid=new DataGrid<WorkTask>();
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(0);
		grid.setRows(new ArrayList<WorkTask>());
		//先做权限检查，对于没有人事权限的用户,直接返回空
		String username=(String) session.getAttribute("username");
		User user = new User();
		user.setLoginname(username);
		User sysuser=userservice.getUserByUser(user);
		
		if(sysuser.getRole()!=3){							
				return grid;
			}else{
		int firstrow=(current-1)*rowCount;
		List<WorkTask> results=reportservice.getpagejltask(username,firstrow,rowCount);
		int totalsize=reportservice.getalljltask(username);
		List<WorkTask> tasks=new ArrayList<WorkTask>();
		for(WorkTask worktask:results){
			WorkTask task=new WorkTask();
			task.setChannel(worktask.getChannel());
			task.setTasktype(worktask.getTasktype());
			task.setTaskId(worktask.getTask().getId());
			task.setBegintime(worktask.getBegintime());
			task.setEndtime(worktask.getEndtime());			
			task.setType(worktask.getType());
			task.setStyle(worktask.getStyle());
			task.setRoadid(worktask.getRoadid());
			task.setContent(worktask.getContent());
			task.setFile(worktask.getFile());
			task.setIncid(worktask.getIncid());
			task.setProcessinstanceid(worktask.getProcessinstanceid());
			task.setProcessdefid(worktask.getTask().getProcessDefinitionId());
			tasks.add(task);
		}
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(totalsize);
		grid.setRows(tasks);
		return grid;
			}
				
	}
	
	@RequestMapping(value="/sgtasklist",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public DataGrid<WorkTask> getXJtasklist(HttpSession session,@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
		DataGrid<WorkTask> grid=new DataGrid<WorkTask>();
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(0);
		grid.setRows(new ArrayList<WorkTask>());
		//先做权限检查，对于没有人事权限的用户,直接返回空
		String username=(String) session.getAttribute("username");
		User user = new User();
		user.setLoginname(username);
		
       User sysuser=userservice.getUserByUser(user);
		
		if(sysuser.getRole()!=6){							
				return grid;
			}else{
		int firstrow=(current-1)*rowCount;
		List<WorkTask> results=reportservice.getpagesgtask(username,firstrow,rowCount);
		int totalsize=reportservice.getallsgtask(username);
		List<WorkTask> tasks=new ArrayList<WorkTask>();
		for(WorkTask worktask:results){
			WorkTask task=new WorkTask();
			task.setChannel(worktask.getChannel());
			task.setTasktype(worktask.getTasktype());
			task.setTaskId(worktask.getTask().getId());
			task.setBegintime(worktask.getBegintime());
			task.setEndtime(worktask.getEndtime());			
			task.setType(worktask.getType());
			task.setStyle(worktask.getStyle());
			task.setRoadid(worktask.getRoadid());
			task.setContent(worktask.getContent());
			task.setFile(worktask.getFile());
			task.setIncid(worktask.getIncid());
			task.setProcessinstanceid(worktask.getProcessinstanceid());
			task.setProcessdefid(worktask.getTask().getProcessDefinitionId());
			tasks.add(task);
		}
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(totalsize);
		grid.setRows(tasks);
		return grid;
	}
	}
		
	@RequestMapping(value="/yztasklist",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public DataGrid<WorkTask> getYZtasklist(HttpSession session,@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
		DataGrid<WorkTask> grid=new DataGrid<WorkTask>();
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(0);
		grid.setRows(new ArrayList<WorkTask>());
		//先做权限检查，对于没有人事权限的用户,直接返回空
		String username=(String) session.getAttribute("username");
		User user = new User();
		user.setLoginname(username);
		
User sysuser=userservice.getUserByUser(user);
		
		if(sysuser.getRole()!=2){							
				return grid;
			}else{
		int firstrow=(current-1)*rowCount;
		List<WorkTask> results=reportservice.getpageyztask(username,firstrow,rowCount);
		int totalsize=reportservice.getallyztask(username);
		List<WorkTask> tasks=new ArrayList<WorkTask>();
		for(WorkTask worktask:results){
			WorkTask task=new WorkTask();
			task.setChannel(worktask.getChannel());
			task.setTasktype(worktask.getTasktype());
			task.setTaskId(worktask.getTask().getId());
			task.setBegintime(worktask.getBegintime());
			task.setEndtime(worktask.getEndtime());			
			task.setType(worktask.getType());
			task.setStyle(worktask.getStyle());
			task.setRoadid(worktask.getRoadid());
			task.setContent(worktask.getContent());
			task.setFile(worktask.getFile());
			task.setIncid(worktask.getIncid());
			task.setProcessinstanceid(worktask.getProcessinstanceid());
			task.setProcessdefid(worktask.getTask().getProcessDefinitionId());
			tasks.add(task);
		}
		grid.setRowCount(rowCount);
		grid.setCurrent(current);
		grid.setTotal(totalsize);
		grid.setRows(tasks);
		return grid;
	}
	}
	
	@RequestMapping(value="/dealtask")
	@ResponseBody
	public String taskdeal(@RequestParam("taskId") String taskId,HttpServletResponse response){
		System.out.println("taskId:"+taskId);
		Task task=taskservice.createTaskQuery().taskId(taskId).singleResult();
		System.out.println("task的值"+task);
		ProcessInstance process=runservice.createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult();
		WorkTask worktask=reportservice.getWorkTask(new Integer(process.getBusinessKey()));
		System.out.println("任务类型:"+worktask.getTasktype());		
		return JSON.toJSONString(worktask);
	}


	@RequestMapping(value="/task/deptleaderplancomplete/{taskId}")
	@ResponseBody
	public String deptleaderplancomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		
		 // 在任务完成时加流程变量
		userIds="weixiu001,weixiutest";
	
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("planname",username );
		variables.put("plandate",new Date());
		variables.put("deptleaderacceptname", username);
		variables.put("deptleaderacceptdate", new Date());
		variables.put("builduserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}

	@RequestMapping(value="/task/deptleaderacceptcomplete/{taskId}")
	@ResponseBody
	public String deptleaderacceptcomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		 // 在任务完成时加流程变量
		userIds="jianlitest ,jianli001,Zhangcheng ";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("deptleaderacceptname", username);
		variables.put("deptleaderacceptdate", new Date());
		variables.put("supervisoruserId", userIds);
		
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	
	

	
	//组任务分配
	/*@RequestMapping(value="/task/deptleaderschemecomplete/{taskId}")
	@ResponseBody
	public String deptleaderschemecomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		
		 // 在任务完成时加流程变量
		userIds="Yezhutest,yezhu001,zhangquan";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("planname",username );
		variables.put("plandate",new Date());
		variables.put("deptleaderacceptname", username);
		variables.put("deptleaderacceptdate", new Date());
		variables.put("schemecontent", "方案写完了");
		variables.put("owneruserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	*/
	
	
	@RequestMapping(value="/task/jlcomplete/{taskId}")
	@ResponseBody
	public String hrcomplete(String userIds1,String userIds,String status,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		userIds1="jingli001,jinglitest,Quancheng";
	    userIds="Yezhutest,zhangquan,yezhu001";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("supervisoracceptname", username);
		variables.put("supervisoracceptdate", new Date());
		variables.put("owneruserId", userIds);
		variables.put("deptleaderuserId", userIds1);
		variables.put("status", "拒绝");//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	
	@RequestMapping(value="/task/sgcomplete/{taskId}")
	@ResponseBody
	public String sgcomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
	
		//在任务完成时添加流程变量指定下一个任务分配者
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("buildname", username);
		variables.put("builddate", new Date());
		variables.put("deptleaderacceptuserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
		
	@RequestMapping(value="/task/yzcomplete/{taskId}")
	@ResponseBody
	public String buildcomplete(HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("owneracceptname", username);
		variables.put("owneracceptdate", new Date());
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}

	@RequestMapping("/getfinishprocess")
	@ResponseBody
	public DataGrid<HistoryProcess> getHistory(HttpSession session,@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
		String username=(String) session.getAttribute("username");
		HistoricProcessInstanceQuery process = histiryservice.createHistoricProcessInstanceQuery().processDefinitionKey("myProcess").startedBy(username).finished();
		int total= (int) process.count();
		int firstrow=(current-1)*rowCount;
		List<HistoricProcessInstance> info = process.listPage(firstrow, rowCount);
		List<HistoryProcess> list=new ArrayList<HistoryProcess>();
		for(HistoricProcessInstance history:info){
			HistoryProcess his=new HistoryProcess();
			String bussinesskey=history.getBusinessKey();
			WorkTask worktask=reportservice.getWorkTask(Integer.parseInt(bussinesskey));
			his.setWorktask(worktask);
			his.setBusinessKey(bussinesskey);
			his.setProcessDefinitionId(history.getProcessDefinitionId());
			list.add(his);
		}
		DataGrid<HistoryProcess> grid=new DataGrid<HistoryProcess>();
		grid.setCurrent(current);
		grid.setRowCount(rowCount);
		grid.setTotal(total);
		grid.setRows(list);
		return grid;
	}
	

}
