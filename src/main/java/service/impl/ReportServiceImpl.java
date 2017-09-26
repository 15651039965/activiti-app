package service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import mapper.ReportMapper;
import mapper.UserMapper;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import service.report.ReportService;
import utils.JumpCmd;
import entity.WorkTask;
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,timeout=5)
@Service
public class ReportServiceImpl implements ReportService {
@Autowired
ReportMapper reportmapper;
@Autowired
UserMapper usermapper;
@Autowired
IdentityService identityservice;
@Autowired
RuntimeService runtimeservice;
@Autowired
TaskService taskservice;
@Autowired
HistoryService historyService;
@Autowired
ManagementService managementService;
@Autowired
RepositoryService repositoryService;


	public ProcessInstance startWorkflow(WorkTask worktask, String username,Map<String, Object> variables) {
		reportmapper.save(worktask);
		System.out.println("任务表id"+worktask.getTaskid());	
		String businesskey=String.valueOf(worktask.getTaskid());//使用tb_task表的主键作为businesskey,连接业务数据和流程数据
		identityservice.setAuthenticatedUserId(username);
		ProcessInstance instance=runtimeservice.startProcessInstanceByKey("myProcess",businesskey,variables);//variables主要放一些流程变量	
		
		System.out.println(instance+"=========");
		
		System.out.println(businesskey);
		
		String instanceid=instance.getId();
		worktask.setProcessinstanceid(instanceid);	
		reportmapper.update(worktask);
		System.out.println("任务实例id"+worktask.getProcessinstanceid());
	
		return instance;
	}
	//维修任务列表处理流程
	@SuppressWarnings("unused")
	public ProcessInstance startWorkflowlist(List<WorkTask> worktasklist, String username,Map<String, Object> variables) {
		reportmapper.saveWorkTaskList(worktasklist);
		System.out.println("任务个数"+worktasklist.size());
		if(worktasklist!=null){
			for(WorkTask worktask:worktasklist){
				String businesskey=String.valueOf(worktask.getTaskid());//使用tb_task表的主键作为businesskey,连接业务数据和流程数据
				identityservice.setAuthenticatedUserId(username);
				ProcessInstance instance=runtimeservice.startProcessInstanceByKey("ServiceProcess",businesskey,variables);//variables主要放一些流程变量
				System.out.println(instance+"=========");
				
				System.out.println(businesskey);
				
				String instanceid=instance.getId();
				worktask.setProcessinstanceid(instanceid);
				
				reportmapper.update(worktask);
				System.out.println("上报人的名字："+variables.get("publishname")+"     "+variables.get("deptleaderuserId"));
				return instance;
			}
		}else{
			System.out.println("worktasklist为空");
		}
		
		return null;
		
		
	}


	@SuppressWarnings("unchecked")
	public List<WorkTask> getpagedepttask(String username, int firstrow,int rowcount) {
		System.out.println("登录名000000 :"+username);
		List<WorkTask> results=new ArrayList<WorkTask>();
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).listPage(firstrow, rowcount);
		System.out.println("tasks");
		System.out.println("tasks"+tasks.size());
		for(Task task:tasks){
			String instanceid=task.getProcessInstanceId();//流程实例id
		   System.out.println("任务id"+task.getId());
		
			ProcessInstance ins=runtimeservice.createProcessInstanceQuery().processInstanceId(instanceid).singleResult();
			System.out.println(ins.getBusinessKey());
			String businesskey=ins.getBusinessKey();
			System.out.println("businesskey:"+businesskey);//businesskey相当于task表的taskid
			WorkTask a=reportmapper.get(Integer.parseInt(businesskey));
		      
			System.out.println(instanceid+"**");

				List<Comment> comments=this.getProcessComments(task.getId());
									
			a.setTaskid(Integer.parseInt(businesskey));	
			a.setTask(task);
			results.add(a);
			results.addAll((Collection<? extends WorkTask>) comments);
			
		}
		return results;
	}

	public int getalldepttask(String username) {
		
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).list();
	
		return tasks.size();
	}

	public List<WorkTask> getpagejltask(String username, int firstrow,int rowcount) {
		
		List<WorkTask> results=new ArrayList<WorkTask>();
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).listPage(firstrow, rowcount);
		System.out.println(tasks.toString());
		for(Task task:tasks){
			String instanceid=task.getProcessInstanceId();
			ProcessInstance ins=runtimeservice.createProcessInstanceQuery().processInstanceId(instanceid).singleResult();
			String businesskey=ins.getBusinessKey();
			System.out.println("businesskey:"+businesskey);//businesskey相当于task表的taskid
			WorkTask a=reportmapper.get(Integer.parseInt(businesskey));
						
			a.setTaskid(Integer.parseInt(businesskey));
			System.out.println("安排人的名字："+taskservice.getVariable(task.getId(), "buildname")+"     "+taskservice.getVariable(task.getId(), "builddate"));
			a.setTask(task);
			results.add(a);
		}
		return results;
	}

	public int getalljltask(String username) {
		
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).list();
		return tasks.size();
	}

	
	
public List<WorkTask> getpagesgtask(String username, int firstrow,int rowcount) {
		
		List<WorkTask> results=new ArrayList<WorkTask>();
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).listPage(firstrow, rowcount);
		System.out.println(tasks.toString());
		for(Task task:tasks){
			String instanceid=task.getProcessInstanceId();
			ProcessInstance ins=runtimeservice.createProcessInstanceQuery().processInstanceId(instanceid).singleResult();
			String businesskey=ins.getBusinessKey();
			System.out.println("businesskey:"+businesskey);//businesskey相当于task表的taskid
			WorkTask a=reportmapper.get(Integer.parseInt(businesskey));			
			System.out.println("备注："+taskservice.getComment("message")+"安排人的名字："+taskservice.getVariable(task.getId(), "planname")+"     "+taskservice.getVariable(task.getId(), "plandate"));			
			a.setTaskid(Integer.parseInt(businesskey));
			a.setTask(task);
			results.add(a);
			
		}
		return results;
	}

	public int getallsgtask(String username) {
		
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).list();
		return tasks.size();
	}
	
		
	
public List<WorkTask> getpageyztask(String username, int firstrow,int rowcount) {
		
		List<WorkTask> results=new ArrayList<WorkTask>();
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).listPage(firstrow, rowcount);
		System.out.println(tasks.toString());
		for(Task task:tasks){
			String instanceid=task.getProcessInstanceId();
			ProcessInstance ins=runtimeservice.createProcessInstanceQuery().processInstanceId(instanceid).singleResult();
			String businesskey=ins.getBusinessKey();
			System.out.println("businesskey:"+businesskey);//businesskey相当于task表的taskid
			WorkTask a=reportmapper.get(Integer.parseInt(businesskey));		
			a.setTaskid(Integer.parseInt(businesskey));
			System.out.println("验收人的名字："+taskservice.getVariable(task.getId(), "deptleaderacceptname")+"     "+taskservice.getVariable(task.getId(), "deptleaderacceptdate"));
			a.setTask(task);
			results.add(a);
		}
		return results;
	}

	public int getallyztask(String username) {
		
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).list();
		return tasks.size();
	}
	
		
	
	public WorkTask getWorkTask(int taskid) {
		WorkTask worktask=reportmapper.get(taskid);
		return worktask;
	}
	
		
	 public List<Comment> getProcessComments(String taskId) {
	        List<Comment> historyCommnets = new ArrayList<Comment>();
            //获取流程实例的ID
	        Task task = this.taskservice.createTaskQuery().taskId(taskId).singleResult();
	        ProcessInstance pi =runtimeservice.createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult();
            //通过流程实例查询所有的(用户任务类型)历史活动   
	        List<HistoricActivityInstance> hais = historyService.createHistoricActivityInstanceQuery().processInstanceId(pi.getId()).activityType("userTask").list();
            //查询每个历史任务的批注
	        for (HistoricActivityInstance hai : hais) {
	            String historytaskId = hai.getTaskId();
	            List<Comment> comments = taskservice.getTaskComments(historytaskId);
	            //如果当前任务有批注信息，添加到集合中
	            if(comments!=null && comments.size()>0){
	                historyCommnets.addAll(comments);
	            }
	        }
	         return historyCommnets;
	    } 

	 
	 
	 
	public void save(WorkTask worktask) {
		// TODO Auto-generated method stub
		reportmapper.save(worktask);
	}
	
	public List<WorkTask> getpagedeptaccepttask(String username, int firstrow,int rowcount) {
		System.out.println("登录名 :"+username);
		List<WorkTask> results=new ArrayList<WorkTask>();
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).listPage(firstrow, rowcount);		
		System.out.println("tasks");
		System.out.println("tasks"+tasks.size());
		for(Task task:tasks){
			String instanceid=task.getProcessInstanceId();//流程实例id
		   System.out.println(instanceid+"ins");
		   
		/*   
		   historyService.createHistoricTaskInstanceQuery() // 创建历史任务实例查询  
           .taskCandidateUser("") // 指定办理人  
           .finished() // 查询已经完成的任务    
           .list(); 
			reportservice.taskRollback(task.getId());
			
			 Task task3 = taskservice.createTaskQuery().singleResult();  
			 
			
			
			
			
			
			*/
			
			ProcessInstance ins=runtimeservice.createProcessInstanceQuery().processInstanceId(instanceid).singleResult();
			System.out.println(ins.getBusinessKey());
			String businesskey=ins.getBusinessKey();
			System.out.println("businesskey:"+businesskey);//businesskey相当于task表的taskid
			WorkTask a=reportmapper.get(Integer.parseInt(businesskey));
		      
			System.out.println(instanceid+"**");
													
			a.setTaskid(Integer.parseInt(businesskey));	
			a.setTask(task);
			results.add(a);
			
			
		}
		return results;
	}

	public int getalldeptaccepttask(String username) {
		
		List<Task> tasks=taskservice.createTaskQuery().taskCandidateUser(username).list();
		return tasks.size();
	}
	//实现节点的跳转
	public void taskRollback(String taskId){
	    //根据要跳转的任务ID获取其任务
	    HistoricTaskInstance hisTask = historyService
	                .createHistoricTaskInstanceQuery().taskId(taskId)
	                .singleResult();
	    //进而获取流程实例
	    ProcessInstance instance = runtimeservice
	                .createProcessInstanceQuery()
	                .processInstanceId(hisTask.getProcessInstanceId())
	                .singleResult();
	    //取得流程定义
	    ProcessDefinitionEntity definition = (ProcessDefinitionEntity) repositoryService.getProcessDefinition(hisTask.getProcessDefinitionId());
	    //获取历史任务的Activity
	    ActivityImpl hisActivity = definition.findActivity(hisTask.getTaskDefinitionKey());
	    //实现跳转
	    managementService.executeCommand(new JumpCmd(instance.getId(), hisActivity.getId()));
		
		
	}

	
	
}
