package entity;

import java.util.List;

public class Bridge {
	//标志列表
	private List<Pole> poles;
	//桥梁
	private String bridgeid;
	//区域id
	private Integer areaid;
	//区属
	private String areaname;
	//桥梁名称
	private String bridgename;
	//所在路名
	private String roadname;
	//跨越
	private String rivers;
	//环线位置
	private String position;
	//管理分类
	private String managetype;
	//管理单位
	private String manage;
	//养护单位
	private String repair;
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
	public List<Pole> getPoles() {
		return poles;
	}
	public void setPoles(List<Pole> poles) {
		this.poles = poles;
	}
	public String getBridgeid() {
		return bridgeid;
	}
	public void setBridgeid(String bridgeid) {
		this.bridgeid = bridgeid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getBridgename() {
		return bridgename;
	}
	public void setBridgename(String bridgename) {
		this.bridgename = bridgename;
	}
	public String getRoadname() {
		return roadname;
	}
	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}
	public String getRivers() {
		return rivers;
	}
	public void setRivers(String rivers) {
		this.rivers = rivers;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getManagetype() {
		return managetype;
	}
	public void setManagetype(String managetype) {
		this.managetype = managetype;
	}
	public String getManage() {
		return manage;
	}
	public void setManage(String manage) {
		this.manage = manage;
	}
	public String getRepair() {
		return repair;
	}
	public void setRepair(String repair) {
		this.repair = repair;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}
	
}
