package entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * 道路标志牌
 * @author Boris_dy E-mail: dy@ui8.cn
 * @version 创建时间：2016年3月11日 上午11:03:16
 */
public class Signs {
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
	private Pole pole;
	private Type type;
	
	private String username;//显示对应userid的username

	private Integer signsid;//系统编号	自增
	private String scard;//身份标识编号	暂无
	private Integer userid;//录入人ID	外键
	private Integer poleid;//标杆id	外键
	private Integer typeid;//规格类型ID	外键
	private Integer setincid;//安装单位	标志安装单位 外键
	private Date settime;//安装时间	标志安装时间
	private Date inputtime;//录入时间	信息录入时间
	private Date maketime;//生产时间	生产时间
	private Integer makeincid;//生产单位	上传单位 外键
	private String picture;//正面照片	正面照片
	private String backpicture;//背面照片	背面照片
	private String cadpicture;//cad图纸	cad图纸
	private Integer direction;//朝向	1.面向东 2.面向西 3.面向南 4.面向北
	private Integer fixedtype;//固定方式	1:匝带 2:抱箍
	private Integer status;//状态	1:正常 2：损坏 3：到期报废 4：自然损坏5：人为损坏 6：异常移位 7：其它
	private Integer security;//安全状况	1 安全 2 不安全
	private Integer bug;//存在问题	膜脱落,"膜淡化","逆反射系数不达标","卷边","转向","非国际","抱箍缺少","净空高不达标","设置不合理","缺失","建议增设","与交通组织矛盾","内容有误","标牌与标杆不配套","非公指示牌","绿化遮挡"
	private Date updatetime;//最后维护时间
	private String comment;//特殊说明	
	private Date cusertime;//审核时间	--月份查询
	private Integer netheight;//净空高度 mm
	
	private Integer incid;//所属公司
	private boolean selected;//选中状态
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Pole getPole() {
		return pole;
	}
	public void setPole(Pole pole) {
		this.pole = pole;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getSignsid() {
		return signsid;
	}
	public void setSignsid(Integer signsid) {
		this.signsid = signsid;
	}
	public String getScard() {
		return scard;
	}
	public void setScard(String scard) {
		this.scard = scard;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getPoleid() {
		return poleid;
	}
	public void setPoleid(Integer poleid) {
		this.poleid = poleid;
	}
	public Integer getTypeid() {
		return typeid;
	}
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	public Integer getSetincid() {
		return setincid;
	}
	public void setSetincid(Integer setincid) {
		this.setincid = setincid;
	}
	public Date getSettime() {
		return settime;
	}
	public void setSettime(Date settime) {
		this.settime = settime;
	}
	public Date getInputtime() {
		return inputtime;
	}
	public void setInputtime(Date inputtime) {
		this.inputtime = inputtime;
	}
	public Date getMaketime() {
		return maketime;
	}
	public void setMaketime(Date maketime) {
		this.maketime = maketime;
	}
	public Integer getMakeincid() {
		return makeincid;
	}
	public void setMakeincid(Integer makeincid) {
		this.makeincid = makeincid;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getBackpicture() {
		return backpicture;
	}
	public void setBackpicture(String backpicture) {
		this.backpicture = backpicture;
	}
	public String getCadpicture() {
		return cadpicture;
	}
	public void setCadpicture(String cadpicture) {
		this.cadpicture = cadpicture;
	}
	public Integer getDirection() {
		return direction;
	}
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	public Integer getFixedtype() {
		return fixedtype;
	}
	public void setFixedtype(Integer fixedtype) {
		this.fixedtype = fixedtype;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSecurity() {
		return security;
	}
	public void setSecurity(Integer security) {
		this.security = security;
	}
	public Integer getBug() {
		return bug;
	}
	public void setBug(Integer bug) {
		this.bug = bug;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCusertime() {
		return cusertime;
	}
	public void setCusertime(Date cusertime) {
		this.cusertime = cusertime;
	}
	public Integer getNetheight() {
		return netheight;
	}
	public void setNetheight(Integer netheight) {
		this.netheight = netheight;
	}
	@JsonIgnore
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
