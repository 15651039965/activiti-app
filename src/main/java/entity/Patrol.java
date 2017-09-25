package entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * 巡查任务（tb_patrol)
 * @author kevin
 */
public class Patrol {
	private Integer	patid;	//编号
	private Integer	areaid;	//区域	
	private String	route;	//路线		
	private String	weather;	//天气	
	private Float	mileage;	//里程 单位km		
	private Integer	userid;	//执行人用户id 
	private String username;//发布人用户姓名
	private Integer	chuser;	//发布人		
	private String cusername;//发布人姓名
	private Integer status; //状态  1.未巡查 2.已巡查
	private String title;//标题
	private String carno;//车牌号	
	private String centent; //巡查内容
	private Date ctime; //发布时间
	private Date begintime; //开始执行时间
	private Date otime; //巡查结束时间
	
	private List<PatrolPos> patrolPos; //巡查记录
	
	private Integer incid;//经理查询本公司
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
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
	public Integer getPatid() {
		return patid;
	}
	public void setPatid(Integer patid) {
		this.patid = patid;
	}
	public Integer getAreaid() {
		return areaid;
	}
	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public Float getMileage() {
		return mileage;
	}
	public void setMileage(Float mileage) {
		this.mileage = mileage;
	}	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getChuser() {
		return chuser;
	}
	public void setChuser(Integer chuser) {
		this.chuser = chuser;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getCentent() {
		return centent;
	}
	public void setCentent(String centent) {
		this.centent = centent;
	}	
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	@JsonIgnore
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
	public List<PatrolPos> getPatrolPos() {
		return patrolPos;
	}
	public void setPatrolPos(List<PatrolPos> patrolPos) {
		this.patrolPos = patrolPos;
	}
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public String getCusername() {
		return cusername;
	}
	public void setCusername(String cusername) {
		this.cusername = cusername;
	}	
	
}
