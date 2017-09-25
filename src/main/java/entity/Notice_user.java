package entity;

import java.util.Date;

public class Notice_user {
	private Page page;	
	public Page getPage() {
		if(page==null)
			page = new Page();
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	private Integer notid;//公告编号
	private Integer userid;//用户
	private String userName;//用户名字
	private Integer status;//状态
	private Date readtime;//阅读时间
	private String content;//反馈内容


	public Integer getNotid() {
		return notid;
	}
	public void setNotid(Integer notid) {
		this.notid = notid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getReadtime() {
		return readtime;
	}
	public void setReadtime(Date readtime) {
		this.readtime = readtime;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
