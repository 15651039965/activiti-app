package pagemodel;


import entity.WorkTask;

public class HistoryProcess {
	String processDefinitionId;
	String businessKey;
	WorkTask worktask;
	public String getProcessDefinitionId() {
		return processDefinitionId;
	}
	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}
	public String getBusinessKey() {
		return businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}
	public WorkTask getWorktask() {
		return worktask;
	}
	public void setWorktask(WorkTask worktask) {
		this.worktask = worktask;
	}

	
	
}
