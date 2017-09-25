package entity;

public class Inc {
	private Integer incid;	//公司编号
	private String name;	//公司名称
	private String ceoname;	//负责人姓名
	private String ceophone;//负责人电话	
	private String telephone;	//公司电话
	private String fax;	//传真
	private String www;	//网站
	private String address;	//地址
	private String logo;	
	private String fshort;//简称
	private Integer empcount;//员工数量
	private Integer type;//企业类型
	//选中状态
	private boolean selected;
	
	private Page page;
	
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		if(page == null)this.page = new Page();
		this.page = page;
	}
	public boolean isSelected() {
			return selected;
		}
		public void setSelected(boolean selected) {
			this.selected = selected;
		}
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCeoname() {
		return ceoname;
	}
	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}
	public String getCeophone() {
		return ceophone;
	}
	public void setCeophone(String ceophone) {
		this.ceophone = ceophone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getWww() {
		return www;
	}
	public void setWww(String www) {
		this.www = www;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getFshort() {
		return fshort;
	}
	public void setFshort(String fshort) {
		this.fshort = fshort;
	}
	public Integer getEmpcount() {
		return empcount;
	}
	public void setEmpcount(Integer empcount) {
		this.empcount = empcount;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	
}
