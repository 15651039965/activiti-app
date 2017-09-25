package entity;

import java.util.Date;

/**
 * 检测记录(tb_check)
 * @author kevin
 */

public class Check {
	private Integer checkid; //编号
	private Date time;	//生成时间		
	private Integer userid;	//生成人员			
	private Integer type;	//检测对象	1.标志，2.标杆，3.标线	
	private Integer poleid;	//标杆编号		
	private Integer signsid;//标牌编号		
	private Integer roadid;	//道路编号	
	private Date checktime;	//检测时间			
	private Integer checkuser;	//检测人		
	private String content;	//检测内容		
	private String result;	//检测结果		
	private Integer status;	//状态  1.未检测  2.检测完成	
	
	private Page page;
	public Page getPage() {
		if(page == null){
			page = new Page();
		}
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Integer getCheckid() {
		return checkid;
	}

	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getPoleid() {
		return poleid;
	}

	public void setPoleid(Integer poleid) {
		this.poleid = poleid;
	}

	public Integer getSignsid() {
		return signsid;
	}

	public void setSignsid(Integer signsid) {
		this.signsid = signsid;
	}

	public Integer getRoadid() {
		return roadid;
	}

	public void setRoadid(Integer roadid) {
		this.roadid = roadid;
	}

	public Date getChecktime() {
		return checktime;
	}

	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}

	public Integer getCheckuser() {
		return checkuser;
	}

	public void setCheckuser(Integer checkuser) {
		this.checkuser = checkuser;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
