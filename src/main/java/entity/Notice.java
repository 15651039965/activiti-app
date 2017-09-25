package entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * 公告
 * @author kevin
 */
public class Notice{
	private Page page;
	
	public Page getPage() {
		if(page==null)
			page = new Page();
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	/*编号*/
	private Integer notid;
	/*发布人*/
	private Integer userid;
	/*发布人姓名*/
	private String userName;
	/*当前时间*/
	private Date currtime;
	/*有效时间*/
	private Date extime;
	/*结束时间*/
	private Date ovtime;
	/*主题*/
	private String title;
	/*内容*/
	private String content;
	/*状态*/
	private Integer status;
	//用于app
	private  Integer[] users; 
	
	private List<Notice_user> nusers;
	
	private String file;
	
	private String etime;
	private String otime;
	
	public List<Notice_user> getNusers() {
		return nusers;
	}
	public void setNusers(List<Notice_user> nusers) {
		this.nusers = nusers;
	}
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
	public Date getCurrtime() {
		return currtime;
	}
	public void setCurrtime(Date currtime) {
		this.currtime = currtime;
	}
	public Date getExtime() {
		return extime;
	}
	public void setExtime(Date extime) {
		this.extime = extime;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getOvtime() {
		return ovtime;
	}
	public void setOvtime(Date ovtime) {
		this.ovtime = ovtime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Integer[] getUsers() {
		return users;
	}
	public void setUsers(Integer[] users) {
		this.users = users;
	}
	@JsonIgnore
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	@JsonIgnore
	public String getOtime() {
		return otime;
	}
	public void setOtime(String otime) {
		this.otime = otime;
	}


	
}
