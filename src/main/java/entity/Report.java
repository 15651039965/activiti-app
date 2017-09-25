package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Report {
	//姓名
	private String name; 
	//时间
	private String dateTime; 
	//标杆数量
	private Integer poleCount;
	//标志数量
	private Integer singsCount;
	//未审核标杆
	private Integer notAuditPole;
	//审核通过标杆
	private Integer yesAuditPole;
	//审核未通过标杆
	private Integer auditErrorPole;
	//未审核标志
	private Integer notAuditSign;
	//审核通过标志
	private Integer yesAuditSign;
	//审核未通过标志
	private Integer auditErrorSign;
	
	private Integer incid; //公司
	private Integer userid;//录入人
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public Integer getPoleCount() {
		return poleCount;
	}
	public void setPoleCount(Integer poleCount) {
		this.poleCount = poleCount;
	}
	public Integer getSingsCount() {
		return singsCount;
	}
	public void setSingsCount(Integer singsCount) {
		this.singsCount = singsCount;
	}
	public Integer getNotAuditPole() {
		return notAuditPole;
	}
	public void setNotAuditPole(Integer notAuditPole) {
		this.notAuditPole = notAuditPole;
	}
	public Integer getYesAuditPole() {
		return yesAuditPole;
	}
	public void setYesAuditPole(Integer yesAuditPole) {
		this.yesAuditPole = yesAuditPole;
	}
	public Integer getAuditErrorPole() {
		return auditErrorPole;
	}
	public void setAuditErrorPole(Integer auditErrorPole) {
		this.auditErrorPole = auditErrorPole;
	}
	public Integer getNotAuditSign() {
		return notAuditSign;
	}
	public void setNotAuditSign(Integer notAuditSign) {
		this.notAuditSign = notAuditSign;
	}
	public Integer getYesAuditSign() {
		return yesAuditSign;
	}
	public void setYesAuditSign(Integer yesAuditSign) {
		this.yesAuditSign = yesAuditSign;
	}
	public Integer getAuditErrorSign() {
		return auditErrorSign;
	}
	public void setAuditErrorSign(Integer auditErrorSign) {
		this.auditErrorSign = auditErrorSign;
	}
	@JsonIgnore
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	@JsonIgnore
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}	
	
}
