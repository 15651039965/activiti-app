package controller.report;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import entity.WorkTask;
import service.impl.ReportServiceImpl;
import service.impl.userServiceImpl;
@Controller
public class ServiceReportController {
	@Autowired
	RepositoryService rep;
	@Autowired
	RuntimeService runservice;
	@Autowired
	FormService formservice;
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
	
	//使用组任务分配用户
	@RequestMapping(value="/starttaskfaultlist",method=RequestMethod.POST)
	public String start_reportFault(String userIds,List<WorkTask> worktasklist ,HttpSession session){
		
		String username=(String) session.getAttribute("username");	
		
		userIds="jianlitest ,jianli001,Zhangcheng ";
		Map<String,Object> variables=new HashMap<String, Object>();
		variables.put("supervisorserviceuserId", userIds);
		System.out.println("##################################"+userIds);
		ProcessInstance ins=reportservice.startWorkflowlist(worktasklist, username, variables);
		System.out.println("流程id"+ins.getId()+"已启动");
		return "index";
	}
	//维修任务监理审核任务完成
	@RequestMapping(value="/task/jlservicecomplete/{taskId}")
	@ResponseBody
	public String jlservicecomplete(String userIds,String status,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
	    userIds="Yezhutest,zhangquan,yezhu001";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("supervisorserviceacceptname", username);
		variables.put("supervisorserviceacceptdate", new Date());
		variables.put("owneruserserviceId", userIds);
		variables.put("status", status);//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//维修任务业主审核任务完成
	@RequestMapping(value="/task/yzservicecomplete/{taskId}")
	@ResponseBody
	public String yzservicecomplete(String status,String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		//在任务完成时添加流程变量指定下一个任务分配者
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("ownerserviceacceptname", username);
		variables.put("ownerserviceacceptdate", new Date());
		variables.put("deptleaderserviceplanuserId", userIds);
		variables.put("status", status);//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//维修任务项目经理安排任务完成
	@RequestMapping(value="/task/deptleaderserviceplancomplete/{taskId}")
	@ResponseBody
	public String deptleaderserviceplancomplete(String status,String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		//在任务完成时添加流程变量指定下一个任务分配者
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("deptleaderserviceplancompletename", username);
		variables.put("deptleaderserviceplancompletedate", new Date());
		variables.put("buildserviceuserId", userIds);
		variables.put("status", status);//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//维修任务施工人员任务完成
	@RequestMapping(value="/task/sgservicecomplete/{taskId}")
	@ResponseBody
	public String sgservicecomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		String epicture=(String) session.getAttribute("epicture");
		//在任务完成时添加流程变量指定下一个任务分配者
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("buildservicename", username);
		variables.put("buildservicedate", new Date());
		variables.put("epicture",epicture);//施工后照片
		variables.put("deptleaderserviceacceptuserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//维修任务项目经理验收任务完成
	@RequestMapping(value="/task/deptleaderserviceacceptcomplete/{taskId}")
	@ResponseBody
	public String deptleaderserviceacceptcomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		 // 在任务完成时加流程变量
		userIds="jianlitest ,jianli001,Zhangcheng ";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("deptleaderacceptname", username);
		variables.put("deptleaderacceptdate", new Date());
		variables.put("supervisorserviceacceptuserId", userIds);
		
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//维修任务监理验收任务完成
	@RequestMapping(value="/task/jlserviceacceptcomplete/{taskId}")
	@ResponseBody
	public String jlserviceacceptcomplete(String userIds1,String userIds,String status,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		userIds1="jingli001,jinglitest,Quancheng";
	    userIds="Yezhutest,zhangquan,yezhu001";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("supervisorserviceacceptname", username);
		variables.put("supervisorserviceacceptdate", new Date());
		variables.put("ownerserviceacceptuserId", userIds);
		variables.put("deptleaderserviceplanuserId", userIds1);
		variables.put("status", status);//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//维修任务业主验收任务完成
	@RequestMapping(value="/task/yzserviceacceptcomplete/{taskId}")
	@ResponseBody
	public String yzserviceacceptcomplete(String status,String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("ownerserviceacceptname", username);
		variables.put("ownerserviceacceptdate", new Date()); 
		variables.put("deptleaderserviceplanuserId", userIds);
		variables.put("status", status);//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		
		return JSON.toJSONString("success");
	}
}
