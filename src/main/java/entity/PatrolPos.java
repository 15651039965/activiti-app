package entity;

import java.util.Date;
/**
 * 巡查记录表
 * @author kevin
 */
public class PatrolPos {
	private Integer	posid;	//编号
	private Integer	patid;	//任务编号	
	private Date date; //记录时间
	private String	lon;	//经度
	private String	lat;	//纬度
	private String	baidulon;	//百度经度
	private String	baidulat;	//百度纬度	
	private String	name;	//道路名称	
	
	public Integer getPosid() {
		return posid;
	}
	public void setPosid(Integer posid) {
		this.posid = posid;
	}
	public Integer getPatid() {
		return patid;
	}
	public void setPatid(Integer patid) {
		this.patid = patid;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}	

}
