package entity;

import java.util.List;

/**
 * 交通道路
 * @author Boris_dy E-mail: dy@ui8.cn
 * @version 创建时间：2016年11月23日 上午10:32:28
 */
public class Road {
	private List<Pole> poles;
	//路段ID
	private String roadid;
	//区域id
	private Integer areaid;
	//区域名称
	private String areaname;
	//所在道路
	private String roadname;
	//段起点
	private String roadstart;
	//段止点
	private String roadover;
	//类型
	private String roadtype;
	//等级
	private String roadgrade;
	//环线位置
	private String position;
	//管理分类
	private String managetype;
	//管理单位
	private String manage;
	//养护单位
	private String repair;
	//道路顺序
	private Integer order;

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
	public String getRoadid() {
		return roadid;
	}
	public void setRoadid(String roadid) {
		this.roadid = roadid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getRoadname() {
		return roadname;
	}
	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}
	public String getRoadstart() {
		return roadstart;
	}
	public void setRoadstart(String roadstart) {
		this.roadstart = roadstart;
	}
	public String getRoadover() {
		return roadover;
	}
	public void setRoadover(String roadover) {
		this.roadover = roadover;
	}
	public String getRoadtype() {
		return roadtype;
	}
	public void setRoadtype(String roadtype) {
		this.roadtype = roadtype;
	}
	public String getRoadgrade() {
		return roadgrade;
	}
	public void setRoadgrade(String roadgrade) {
		this.roadgrade = roadgrade;
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}
	
}
