package mapper;

import java.util.List;

import entity.WorkTask;

public interface ReportMapper {
	public void save(WorkTask worktask);
	public void saveWorkTaskList(List<WorkTask> worktasklist);
	public WorkTask get(Integer taskid);
	public WorkTask findByProcessinstanceid(String processinstanceid);
	public void update(WorkTask worktask);
}
