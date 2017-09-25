package entity;
/**
 * 类型表(tb_type)
 * @author kevin
 */
public class Type {
	private Integer typeid; //编号
	private String name; //产品名称
	private Integer type; //类
	private String shape; //形状
	private String size; //规格	
	private String length; //长度
	private String width; //宽度	
	private String area; //面积	
	private String color; //颜色
	private String radius;	//半径	
	private String depth; //厚度	
	private String material; //材质	
	private String picture; //示意图	
	private String style; //使用类型	
	private String content; //内容	
	private String lighttype; //反光原理	
	private String lightclass; //反光级别
	private Integer istemp;	//是否临时
	private String standard;	//国家标准编号
	private String comment; //说明
	
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

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getDepth() {
		return depth;
	}

	public void setDepth(String depth) {
		this.depth = depth;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLighttype() {
		return lighttype;
	}

	public void setLighttype(String lighttype) {
		this.lighttype = lighttype;
	}

	public String getLightclass() {
		return lightclass;
	}

	public void setLightclass(String lightclass) {
		this.lightclass = lightclass;
	}

	public Integer getIstemp() {
		return istemp;
	}

	public void setIstemp(Integer istemp) {
		this.istemp = istemp;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
