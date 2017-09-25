package entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 故障实体
 * @author Boris_dy E-mail: dy@ui8.cn
 * @version 创建时间：2016年11月15日 下午5:25:25
 */
public class Fault implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Page page;		
	private String username; //上传人姓名
	private String Ousername;//处理人姓名
	private String Cusername;	//审核人姓名
	private boolean selected;//选中状态
	private String copinion;//验收人意见
	
	
	private Integer faultid;//编号
	private Integer poleid;//标杆ID
	private Integer signsid; //标志故障id
	private Integer otherid; //窖井盖故障id
	private String lon;	//WGS84经度	
	private String lat;	//WGS84纬度	
	private String baidulon;	//百度坐标	
	private String baidulat;	//百度坐标	
	private String roadname;	//百度道路名称
	private String fpicture; //故障照片
	private Integer type; //故障类型	1：标杆故障 2：标牌故障	
	private Integer content; //故障原因   1.膜脱落,2.膜淡化,3.逆反射系数不达标,4.卷边,5.转向,6.非国际,7.抱箍缺少,8.净空高不达标,9.设置不合理 10.缺失,11.建议增设,12.与交通组织矛盾,13.内容有误,14.标牌与标杆不配套,15.非公指示牌	
	private String exp; //故障说明
	private Integer status; //故障状态：   1:待审核 2.不需处理 3.重新上报 4.待发布 5.待维修  6.待验收 7.验收失败 8.完成
	private Integer clazz; //故障严重等级	1:低 2：高 3：特高
	private Date utime; //上报日期
	private Integer userid;//上报人ID
	private Integer faulttype;//上报类型	1:手动 
	private String voice; //语音留言
	private Integer cuserid;//审核 人 
	private Date ctime;	//审核时间
	private String message; //审核意见    (不需要处理和重新上报都需要填写)
	private Integer ouserid;//维修人
	private String opinion;//维修意见
	private String opicture;//维修后照片
	private Date otime; //维修时间
	private Integer source;//故障来源	1:巡查上报 2.其他
	private Integer taskid;//任务编号

	public Page getPage() {
		if(page == null){
			page = new Page();
		}
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOusername() {
		return Ousername;
	}
	public void setOusername(String ousername) {
		Ousername = ousername;
	}	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public Integer getFaultid() {
		return faultid;
	}
	public void setFaultid(Integer faultid) {
		this.faultid = faultid;
	}
	public Integer getPoleid() {
		return poleid;
	}
	public void setPoleid(Integer poleid) {
		this.poleid = poleid;
	}
	public String getFpicture() {
		return fpicture;
	}
	public void setFpicture(String fpicture) {
		this.fpicture = fpicture;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getContent() {
		return content;
	}
	public void setContent(Integer content) {
		this.content = content;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getClazz() {
		return clazz;
	}
	public void setClazz(Integer clazz) {
		this.clazz = clazz;
	}
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public Date getUtime() {
		return utime;
	}
	public void setUtime(Date utime) {
		this.utime = utime;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getFaulttype() {
		return faulttype;
	}
	public void setFaulttype(Integer faulttype) {
		this.faulttype = faulttype;
	}
	public Integer getOuserid() {
		return ouserid;
	}
	public void setOuserid(Integer ouserid) {
		this.ouserid = ouserid;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public String getOpicture() {
		return opicture;
	}
	public void setOpicture(String opicture) {
		this.opicture = opicture;
	}
	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getTaskid() {
		return taskid;
	}
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}
	public Integer getCuserid() {
		return cuserid;
	}
	public void setCuserid(Integer cuserid) {
		this.cuserid = cuserid;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Integer getSignsid() {
		return signsid;
	}
	public void setSignsid(Integer signsid) {
		this.signsid = signsid;
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
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public Integer getOtherid() {
		return otherid;
	}
	public void setOtherid(Integer otherid) {
		this.otherid = otherid;
	}
	public String getCusername() {
		return Cusername;
	}
	public void setCusername(String cusername) {
		Cusername = cusername;
	}

	public String getCopinion() {
		return copinion;
	}
	public void setCopinion(String copinion) {
		this.copinion = copinion;
	}
	
}
