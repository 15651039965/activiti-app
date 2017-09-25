package controller.report;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.impl.ReportServiceImpl;
import service.impl.userServiceImpl;

import com.alibaba.fastjson.JSON;
@Controller
public class GeneralReportController {
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
	
	//组任务分配一般任务的施工方案任务完成
	@RequestMapping(value="/task/deptleaderschemecomplete/{taskId}")
	@ResponseBody
	public String deptleaderschemecomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		
		 // 在任务完成时加流程变量
		userIds="Yezhutest,yezhu001,zhangquan";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("plangeneralname",username );
		variables.put("plangeneraldate",new Date());
		variables.put("deptleadergeneralacceptname", username);
		variables.put("deptleadergeneralacceptdate", new Date());
		variables.put("owneruserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}

		//业主验收一般任务完成
	@RequestMapping(value="/task/generalyzcomplete/{taskId}")
	@ResponseBody
	public String buildcomplete(String userIds,String status,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("ownergeneralacceptname", username);
		variables.put("ownergeneralacceptdate", new Date());
		variables.put("deptleaderplanuserId", userIds);
		variables.put("status", "同意");
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
    //项目经理一般任务安排施工
	@RequestMapping(value="/task/deptleadergeneralplancomplete/{taskId}")
	@ResponseBody
	public String deptleadergeneralplancomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		
		 // 在任务完成时加流程变量
		userIds="weixiu001,weixiutest";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("generalplanname",username );
		variables.put("generalplandate",new Date());
		variables.put("builduserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//一般任务施工人员任务完成
	@RequestMapping(value="/task/sggeneralcomplete/{taskId}")
	@ResponseBody
	public String sggeneralcomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		
		//在任务完成时添加流程变量指定下一个任务分配者
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("buildgeneralname", username);
		variables.put("buildgeneraldate", new Date());
		variables.put("deptleadergeneralacceptuserId", userIds);
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//一般任务项目经理验收完成
	@RequestMapping(value="/task/deptleadergeneralacceptcomplete/{taskId}")
	@ResponseBody
	public String deptleadergeneralacceptcomplete(String userIds,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		 // 在任务完成时加流程变量
		userIds="jianlitest ,jianli001,Zhangcheng ";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("deptleadergeneralacceptname", username);
		variables.put("deptleadergeneralacceptdate", new Date());
		variables.put("supervisoruserId", userIds);
		
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//一般任务监理验收任务完成
	@RequestMapping(value="/task/jlgeneralcomplete/{taskId}")
	@ResponseBody
	public String jlgeneralcomplete(String userIds1,String userIds,String status,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
		String username=(String) session.getAttribute("username");
		userIds1="jingli001,jinglitest,Quancheng";
	    userIds="Yezhutest,zhangquan,yezhu001";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("supervisorgeneralacceptname", username);
		variables.put("supervisorgeneralacceptdate", new Date());
		variables.put("owneruserId", userIds);
		variables.put("deptleaderplanuserId", userIds1);
		variables.put("status", "同意");//状态同意或者不同意
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
	//一般任务业主验收完成
	@RequestMapping(value="/task/yzgeneralacceptcomplete/{taskId}")
	@ResponseBody
	public String yzgeneralacceptcomplete(String userIds,String status,HttpSession session,@PathVariable("taskId") String taskId,HttpServletRequest req){
	
		String username=(String) session.getAttribute("username");
		userIds="jingli001,jinglitest,Quancheng";
		Map<String,Object> variables=new HashMap<String,Object>();
		variables.put("ownergeneralacceptname", username);
		variables.put("ownergeneralacceptdate", new Date());
		variables.put("deptleaderplanuserId", userIds);
		variables.put("status", "同意");
		taskservice.claim(taskId, username);
		taskservice.complete(taskId, variables);
		return JSON.toJSONString("success");
	}
}
