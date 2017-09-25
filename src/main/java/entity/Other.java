package entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * 其他——采集
 * @author kevin
 */
public class Other {
	private Integer	otherid; //编号
	private String	lon;  //WGS84经度
	private String	lat; //WGS84纬度
	private String	baidulon; //百度坐标
	private String	baidulat; //百度坐标
	private String	roadname; //百度道路名称
	private Integer	district; //行政区域
	private Integer	type; //类型 1.窨井盖 2.坑洼 3.断面
	private String	picture; //照片	
	private Integer	typeid;	//规格编号	外键
	private Integer userid; //录入人
	private Date inputtime; //录入时间
	private Integer status;//数据状态  1：待审核 2：未通过审核 3：正常  4：故障 5：撤除
	private Integer cuserid;//审核人员 	
	private Date cusertime;//审核时间	
	private String copinion;//审核意见	
	private Integer count;//数量 
	
	private Type types; //app查询type数据
	private Integer incid;//所属公司
	private String userName;//录入人姓名
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
	
	public Integer getOtherid() {
		return otherid;
	}
	public void setOtherid(Integer otherid) {
		this.otherid = otherid;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getBaidulon() {
		return baidulon;
	}
	public void setBaidulon(String baidulon) {
		this.baidulon = baidulon;
	}
	public String getBaidulat() {
		return baidulat;
	}
	public void setBaidulat(String baidulat) {
		this.baidulat = baidulat;
	}
	public String getRoadname() {
		return roadname;
	}
	public void setRoadname(String roadname) {
		this.roadname = roadname;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public Type getTypes() {
		return types;
	}
	public void setTypes(Type types) {
		this.types = types;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Date getInputtime() {
		return inputtime;
	}
	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCuserid() {
		return cuserid;
	}
	public void setCuserid(Integer cuserid) {
		this.cuserid = cuserid;
	}
	public Date getCusertime() {
		return cusertime;
	}
	public void setCusertime(Date cusertime) {
		this.cusertime = cusertime;
	}
	@JsonIgnore
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	public String getCopinion() {
		return copinion;
	}
	public void setCopinion(String copinion) {
		this.copinion = copinion;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
