package entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 标杆POJO
 * @author Boris_dy E-mail: dy@ui8.cn
 * @version 创建时间：2016年11月23日 上午10:11:12
 */
public class Pole {
	//标志集合
	private List<Signs> signs;
	//标志所在道路
	private Road road;
	//标志所在桥梁
	private Bridge bridge;
	//所属区域
	private Area area;

	private String username;//userid所对应的username
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private Integer poleid;//编号 	自增
	private String lon;//WGS84经度	
	private String lat;//WGS84纬度	
	private String baidulon;//百度坐标	
	private String baidulat;//百度坐标	
	private String roadname;//百度道路名称	
	private Integer district;//行政区域 	
	private Integer status;//数据状态 1：待审核 2：未通过审核 3：正常  4：故障 5：撤除
	private String flunk;//失败原因
	private Integer postype;//位置类型 	1：城市道路  2：城市高架  3：国省干道 4：桥梁上方 5：桥梁下方
	private String posid;//位置ID	路政局提供的对应编号
	private Integer pileno;//公路桩号 	
	private Integer direction;//上下行
	private Integer typeid;//类型ID 	外键
	private Integer mkincid;//生产公司 	外键
	private Date mktime;//生产时间	
	private Integer settingincid;//安装公司 	外键
	private Date settingtime;//安装时间	
	private Integer settinguserid;//安装人 	外键
	private Integer userid;//录入人 	
	private Date inputtime;//录入时间	
	private Integer cuserid;//审核人员 	
	private Date cusertime;//审核时间	
	private String copinion;//审核意见
	private Date savetime;//拍照时间	
	private Integer bug;//存在问题 (2)	0:"正常",1:"锈蚀",2:"污浊",3:"倾斜",4:"老旧杆件"
	private Integer security;//是否安全 (1)	0:否 1：是
	private String picture;//全景图片	
	private String markpicture;//铭牌图片
	private String comment;//备注
	private Integer quantity;//标志数量

	private Page page;
	/**
	 * 根据ID获取姓名
	 */
	
	private String cuseridName;//审核人姓名
	private String settinguseridName;//安装人姓名
	private Integer incid;//所属公司
	private String mkincidName;//生产公司名字
	private String settingincidName;//安装公司名字	
	private String shape;//形状
	private String size;//规格
	private String style;//使用类型	
	private Type type;//标杆
	
	public String getMkincidName() {
		return mkincidName;
	}
	public void setMkincidName(String mkincidName) {
		this.mkincidName = mkincidName;
	}
	public String getSettingincidName() {
		return settingincidName;
	}
	public void setSettingincidName(String settingincidName) {
		this.settingincidName = settingincidName;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getCuseridName() {
		return cuseridName;
	}
	public void setCuseridName(String cuseridName) {
		this.cuseridName = cuseridName;
	}
	public String getSettinguseridName() {
		return settinguseridName;
	}
	public void setSettinguseridName(String settinguseridName) {
		this.settinguseridName = settinguseridName;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Bridge getBridge() {
		return bridge;
	}
	public void setBridge(Bridge bridge) {
		this.bridge = bridge;
	}
	public Road getRoad() {
		return road;
	}
	public void setRoad(Road road) {
		this.road = road;
	}
	public List<Signs> getSigns() {
		return signs;
	}
	public void setSigns(List<Signs> signs) {
		this.signs = signs;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
	
	public Integer getPoleid() {
		return poleid;
	}
	public void setPoleid(Integer poleid) {
		this.poleid = poleid;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getFlunk() {
		return flunk;
	}
	public void setFlunk(String flunk) {
		this.flunk = flunk;
	}
	public Integer getPostype() {
		return postype;
	}
	public void setPostype(Integer postype) {
		this.postype = postype;
	}
	public String getPosid() {
		return posid;
	}
	public void setPosid(String posid) {
		this.posid = posid;
	}
	public Integer getPileno() {
		return pileno;
	}
	public void setPileno(Integer pileno) {
		this.pileno = pileno;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public Integer getMkincid() {
		return mkincid;
	}
	public void setMkincid(Integer mkincid) {
		this.mkincid = mkincid;
	}
	public Date getMktime() {
		return mktime;
	}
	public void setMktime(Date mktime) {
		this.mktime = mktime;
	}
	public Integer getSettingincid() {
		return settingincid;
	}
	public void setSettingincid(Integer settingincid) {
		this.settingincid = settingincid;
	}
	public Date getSettingtime() {
		return settingtime;
	}
	public void setSettingtime(Date settingtime) {
		this.settingtime = settingtime;
	}
	public Integer getSettinguserid() {
		return settinguserid;
	}
	public void setSettinguserid(Integer settinguserid) {
		this.settinguserid = settinguserid;
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
	public Date getSavetime() {
		return savetime;
	}
	public void setSavetime(Date savetime) {
		this.savetime = savetime;
	}
	public Integer getBug() {
		return bug;
	}
	public void setBug(Integer bug) {
		this.bug = bug;
	}
	public Integer getSecurity() {
		return security;
	}
	public void setSecurity(Integer security) {
		this.security = security;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getMarkpicture() {
		return markpicture;
	}
	public void setMarkpicture(String markpicture) {
		this.markpicture = markpicture;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCopinion() {
		return copinion;
	}
	public void setCopinion(String copinion) {
		this.copinion = copinion;
	}
	@JsonIgnore
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	public Integer getDirection() {
		return direction;
	}
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	
	
}
