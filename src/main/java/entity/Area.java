package entity;

import java.util.Date;

public class Area {
	//标杆个数
	private Integer poles;
	//标志个数
	private Integer signs;
	
	private Integer areaid;//编号
	private Integer parentId;//父编号
	private String areaName;//区域名称
	private Integer grade;//区域等级
	private Integer areaType;//区域类型
	private String baiduLat;//纬度
	private String baiduLon;//经度
	private String baiduPoints;//区域图形点集
	private String manage;//主管单位
	private Integer roadtype;//道路类型
	private Integer roadgrade;//道路等级
	private Integer mianroad;//主干路
	private String roadstart;//开始路口
	private String roadover;//结束路口
	private Integer incid;//当前养护公司
	private Date orepairdate;//养护到期时间
	private Date srepairdate;//养护到期时间
	
	private Integer signqty;//标志数量
	private Integer poleqty;//标杆数量
	private Integer roadqty;//道路数量

	private Page page;
	
	
	public Integer getSignqty() {
		return signqty;
	}

	public void setSignqty(Integer signqty) {
		this.signqty = signqty;
	}

	public Integer getPoleqty() {
		return poleqty;
	}

	public void setPoleqty(Integer poleqty) {
		this.poleqty = poleqty;
	}

	public Integer getRoadqty() {
		return roadqty;
	}

	public void setRoadqty(Integer roadqty) {
		this.roadqty = roadqty;
	}

	public Integer getPoles() {
		return poles;
	}

	public void setPoles(Integer poles) {
		this.poles = poles;
	}

	public Integer getSigns() {
		return signs;
	}

	public void setSigns(Integer signs) {
		this.signs = signs;
	}

	public Integer getAreaid() {
		return areaid;
	}

	public void setAreaid(Integer areaid) {
		this.areaid = areaid;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getAreaType() {
		return areaType;
	}

	public void setAreaType(Integer areaType) {
		this.areaType = areaType;
	}

	public String getBaiduLat() {
		return baiduLat;
	}

	public void setBaiduLat(String baiduLat) {
		this.baiduLat = baiduLat;
	}

	public String getBaiduLon() {
		return baiduLon;
	}

	public void setBaiduLon(String baiduLon) {
		this.baiduLon = baiduLon;
	}

	public String getBaiduPoints() {
		return baiduPoints;
	}

	public void setBaiduPoints(String baiduPoints) {
		this.baiduPoints = baiduPoints;
	}

	public String getManage() {
		return manage;
	}

	public void setManage(String manage) {
		this.manage = manage;
	}

	public Integer getRoadtype() {
		return roadtype;
	}

	public void setRoadtype(Integer roadtype) {
		this.roadtype = roadtype;
	}

	public Integer getRoadgrade() {
		return roadgrade;
	}

	public void setRoadgrade(Integer roadgrade) {
		this.roadgrade = roadgrade;
	}

	public Integer getMianroad() {
		return mianroad;
	}

	public void setMianroad(Integer mianroad) {
		this.mianroad = mianroad;
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

	public Integer getIncid() {
		return incid;
	}

	public void setIncid(Integer incid) {
		this.incid = incid;
	}

	public Date getOrepairdate() {
		return orepairdate;
	}

	public void setOrepairdate(Date orepairdate) {
		this.orepairdate = orepairdate;
	}

	public Date getSrepairdate() {
		return srepairdate;
	}

	public void setSrepairdate(Date srepairdate) {
		this.srepairdate = srepairdate;
	}

	public Page getPage() {
		if(page == null){
			page = new Page();
		}
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}
