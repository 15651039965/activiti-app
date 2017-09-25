package entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Line {
	private Page page;	
	public Page getPage() {
		if(page==null)
			page = new Page();
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}	
	private String username;//所对应的userid的username
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private Integer lineid; //编号
	private String	lon;  //WGS84经度
	private String	lat; //WGS84纬度
	private String	baidulon; //百度坐标
	private String	baidulat; //百度坐标
	private String	roadname; //百度道路名称	
	private String	comment;	//备注
	private Integer	userid;	//录入人
	private Date	inputtime;	//录入时间	
	private Integer	draw;	//否需要复线
	private String	picture;	//航拍照片
	private Float	hengdaoxian;	//横道线(m2)
	private String	wenzibiaoji;	//文字标记	
	private Float	gjtingkaozhan;	//公交港湾式停靠站线(个)
	private Float	dzqkuangxian;	//待转区框线(m2)
	private Float	dzqwenzi;	//待转区文字
	private Float	wanggexian;	//网格线(m2)	
	private Float	jiesuxian;	//减速线(m2)	
	private Float	daoliuxian;	//导流线(m2)	
	private Float	lingxingyugao;	//菱形预告标记(个)	
	private Float	zxdanshixian;	//中心单实线（m）	
	private Float	zxshuangshixian;	//中心双实线（m）	
	private Float	zxdanxuxian;	//中心单虚线（m）	
	private Float	bydanxuxian;	//边缘单虚线（m）	
	private Float	byshuangxuxian;	//边缘双虚线（m）	
	private Float	bydanshixian;	//边缘单实线（m）	
	private Float	jtzhixing;	//箭头直行(个)	
	private Float	jtyouzhuan;	//箭头右转(个)	
	private Float	jtzuozhuan;	//箭头左转(个)	
	private Float	jtzhixingzuozhuan;	//箭头直行左转(个)	
	private Float	jtzhixingyouzhuan;	//箭头直行右转(个)	
	private Float	jtshuangxiang;	//箭头双向(个)
	private Float	jtsanxiang;	//箭头三向(个)
	private Float	jtdiaotou;	//箭头掉头
	private Float	jtjzdiaotou;	//箭头禁止掉头
	private Integer status;//数据状态  1：待审核 2：未通过审核 3：正常  4：故障 5：撤除
	private Integer cuserid;//审核人员 	
	private Date cusertime;//审核时间	
	private String copinion;//审核意见	
	private Float length; //长度 m
	private Float area; //面积 m2	
	
	private Integer incid; //公司编号 （查询sql)
	private String time;  //查询
	
	public Integer getLineid() {
		return lineid;
	}
	public void setLineid(Integer lineid) {
		this.lineid = lineid;
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
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
	public Integer getDraw() {
		return draw;
	}
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Float getHengdaoxian() {
		return hengdaoxian;
	}
	public void setHengdaoxian(Float hengdaoxian) {
		this.hengdaoxian = hengdaoxian;
	}
	public String getWenzibiaoji() {
		return wenzibiaoji;
	}
	public void setWenzibiaoji(String wenzibiaoji) {
		this.wenzibiaoji = wenzibiaoji;
	}
	public Float getGjtingkaozhan() {
		return gjtingkaozhan;
	}
	public void setGjtingkaozhan(Float gjtingkaozhan) {
		this.gjtingkaozhan = gjtingkaozhan;
	}
	public Float getDzqkuangxian() {
		return dzqkuangxian;
	}
	public void setDzqkuangxian(Float dzqkuangxian) {
		this.dzqkuangxian = dzqkuangxian;
	}
	public Float getDzqwenzi() {
		return dzqwenzi;
	}
	public void setDzqwenzi(Float dzqwenzi) {
		this.dzqwenzi = dzqwenzi;
	}
	public Float getWanggexian() {
		return wanggexian;
	}
	public void setWanggexian(Float wanggexian) {
		this.wanggexian = wanggexian;
	}
	public Float getJiesuxian() {
		return jiesuxian;
	}
	public void setJiesuxian(Float jiesuxian) {
		this.jiesuxian = jiesuxian;
	}
	public Float getDaoliuxian() {
		return daoliuxian;
	}
	public void setDaoliuxian(Float daoliuxian) {
		this.daoliuxian = daoliuxian;
	}
	public Float getLingxingyugao() {
		return lingxingyugao;
	}
	public void setLingxingyugao(Float lingxingyugao) {
		this.lingxingyugao = lingxingyugao;
	}
	public Float getZxdanshixian() {
		return zxdanshixian;
	}
	public void setZxdanshixian(Float zxdanshixian) {
		this.zxdanshixian = zxdanshixian;
	}
	public Float getZxshuangshixian() {
		return zxshuangshixian;
	}
	public void setZxshuangshixian(Float zxshuangshixian) {
		this.zxshuangshixian = zxshuangshixian;
	}
	public Float getZxdanxuxian() {
		return zxdanxuxian;
	}
	public void setZxdanxuxian(Float zxdanxuxian) {
		this.zxdanxuxian = zxdanxuxian;
	}
	public Float getBydanxuxian() {
		return bydanxuxian;
	}
	public void setBydanxuxian(Float bydanxuxian) {
		this.bydanxuxian = bydanxuxian;
	}
	public Float getByshuangxuxian() {
		return byshuangxuxian;
	}
	public void setByshuangxuxian(Float byshuangxuxian) {
		this.byshuangxuxian = byshuangxuxian;
	}
	public Float getBydanshixian() {
		return bydanshixian;
	}
	public void setBydanshixian(Float bydanshixian) {
		this.bydanshixian = bydanshixian;
	}
	public Float getJtzhixing() {
		return jtzhixing;
	}
	public void setJtzhixing(Float jtzhixing) {
		this.jtzhixing = jtzhixing;
	}
	public Float getJtyouzhuan() {
		return jtyouzhuan;
	}
	public void setJtyouzhuan(Float jtyouzhuan) {
		this.jtyouzhuan = jtyouzhuan;
	}
	public Float getJtzuozhuan() {
		return jtzuozhuan;
	}
	public void setJtzuozhuan(Float jtzuozhuan) {
		this.jtzuozhuan = jtzuozhuan;
	}
	public Float getJtzhixingzuozhuan() {
		return jtzhixingzuozhuan;
	}
	public void setJtzhixingzuozhuan(Float jtzhixingzuozhuan) {
		this.jtzhixingzuozhuan = jtzhixingzuozhuan;
	}
	public Float getJtzhixingyouzhuan() {
		return jtzhixingyouzhuan;
	}
	public void setJtzhixingyouzhuan(Float jtzhixingyouzhuan) {
		this.jtzhixingyouzhuan = jtzhixingyouzhuan;
	}
	public Float getJtshuangxiang() {
		return jtshuangxiang;
	}
	public void setJtshuangxiang(Float jtshuangxiang) {
		this.jtshuangxiang = jtshuangxiang;
	}
	public Float getJtsanxiang() {
		return jtsanxiang;
	}
	public void setJtsanxiang(Float jtsanxiang) {
		this.jtsanxiang = jtsanxiang;
	}
	public Float getJtdiaotou() {
		return jtdiaotou;
	}
	public void setJtdiaotou(Float jtdiaotou) {
		this.jtdiaotou = jtdiaotou;
	}
	public Float getJtjzdiaotou() {
		return jtjzdiaotou;
	}
	public void setJtjzdiaotou(Float jtjzdiaotou) {
		this.jtjzdiaotou = jtjzdiaotou;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public void setArea(Float area) {
		this.area = area;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
	public Float getLength() {
		return length;
	}
	public Float getArea() {
		return area;
	}	

		

}
