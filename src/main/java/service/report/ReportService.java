package service.report;

import java.util.List;
import java.util.Map;

import org.activiti.engine.runtime.ProcessInstance;
import entity.WorkTask;

public interface ReportService {
	public ProcessInstance startWorkflow(WorkTask worktask,String userid,Map<String,Object> variables);
	public ProcessInstance startWorkflowlist(List<WorkTask> worktasklist,String username,Map<String,Object> variables);
	public List<WorkTask> getpagedepttask(String username,int firstrow,int rowcount);
	public int getalldepttask(String username);
/*	public List<WorkTask> getpageSGtask(String username,int firstrow,int rowcount);
	public int getallSGtask(String username);
	public List<WorkTask> getpagehrtask(String username,int firstrow,int rowcount);
	public int getallhrtask(String username);
	public List<WorkTask> getpageYZtask(String username,int firstrow,int rowcount);
	public int getallYZtask(String username);
	
	public void updatecomplete(String taskId, WorkTask worktask,String reapply);*/
	public WorkTask getWorkTask(int taskid);
	public void save(WorkTask worktask);
}
