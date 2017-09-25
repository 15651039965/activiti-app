package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 
 * @author Boris_dy E-mail: dy@ui8.cn
 * @version 创建时间：2016年11月4日 上午10:32:18
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
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
	
	private Integer userid;
	private String loginname;
	private String password;//MD5加密
	private Integer role;//1:系统管理员  2:路政局工作人员 3：企业负责人  4：巡检人员 5: 来宾账户  6：监理
	private String name;
	private Integer age;
	private Integer sex;//1:男 2:女 
	private String phone;
	private String telephone;
	private String email;
	private String np;
	private String identity;
	private Integer education;//1：小学、2：初中、3：高中（职高、中专）4：大专（高职）、5：本科、6：研究生。
	private String school;
	private String idcard;
	private String home;
	private String place;
	private String ecname;
	private String ecphone;
	private Integer incid;
	private Integer jobs;//1.资料员 2.财务员 3.项目经理 4.系统负责人
	private Date lastlogin;//最后登录时间
	private String weixinid;
	private String QQ;
	private Integer count;
	private String code;
	private Integer status;//1：正常  2：锁定24小时   3：注销
	private String appkey;//唯一key
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getLoginname() {
		return loginname;
	}
	public Integer getCount() {
		if(count==null){
			return 0;
		}
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNp() {
		return np;
	}
	public void setNp(String np) {
		this.np = np;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getEcname() {
		return ecname;
	}
	public void setEcname(String ecname) {
		this.ecname = ecname;
	}
	public String getEcphone() {
		return ecphone;
	}
	public void setEcphone(String ecphone) {
		this.ecphone = ecphone;
	}
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	public Integer getJobs() {
		return jobs;
	}
	public void setJobs(Integer jobs) {
		this.jobs = jobs;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public String getWeixinid() {
		return weixinid;
	}
	public void setWeixinid(String weixinid) {
		this.weixinid = weixinid;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public Integer getStatus() {
		if(status==null){
			return 0;
		}
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAppkey() {
		return appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", loginname=" + loginname
				+ ", password=" + password + ", role=" + role + ", name="
				+ name + ", age=" + age + ", sex=" + sex + ", phone=" + phone
				+ ", telephone=" + telephone + ", email=" + email + ", np="
				+ np + ", identity=" + identity + ", education=" + education
				+ ", school=" + school + ", idcard=" + idcard + ", home="
				+ home + ", place=" + place + ", ecname=" + ecname
				+ ", ecphone=" + ecphone + ", incid=" + incid + ", jobs="
				+ jobs + ", lastlogin=" + lastlogin + ", weixinid=" + weixinid
				+ ", QQ=" + QQ + ", status=" + status + "]";
	}


}
