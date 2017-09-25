package entity;

import java.io.Serializable;
import java.util.Date;

import org.activiti.engine.task.Task;

/**
 * 故障任务(tb_task
 * @author kevin
 * @version 创建时间：2016年11月29日
 */
public class WorkTask implements Serializable{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Page page;
	private Integer taskid;	//编号
	private String processinstanceid;
	String processdefid;
	private Integer type; //工程类型 1:维修 2:更换 3:新建 4：移除
	private Integer style;	//设施类型 1.标志 2.标杆 3.标线 4.窨井盖 5.其它
	private Integer protid;	//原设施ID
	private Date begintime;	//创建时间
	private Date endtime;	//预计完成时间
	private String file; //文件	
	private Integer incid;	//执行公司
	private String epicture;//执行后照片
	private String roadstart; //起始路段
	private String roadover; //终止路段
    private String content;//任务描述
	private Task task;
	private String taskId;
	private String taskname;
	Date taskcreatetime;
	private String spicture;//施工前照片
	private int tasktype;//任务类型
	private int channel;//渠道来源
	private String roadid;//道路id
	private String scheme;//施工方案
	private int budget;//预算
	private int postype;//位置类型
	private int evaluate;//任务评价
	private String carno;//车牌号
	private int typeid;//绑定设施id
    private Road road;
    private Inc inc;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Road getRoad() {
		return road;
	}
	public void setRoad(Road road) {
		this.road = road;
	}
	public Inc getInc() {
		return inc;
	}
	public void setInc(Inc inc) {
		this.inc = inc;
	}
	public String getSpicture() {
		return spicture;
	}
	public void setSpicture(String spicture) {
		this.spicture = spicture;
	}
	public int getTasktype() {
		return tasktype;
	}
	public void setTasktype(int tasktype) {
		this.tasktype = tasktype;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getRoadid() {
		return roadid;
	}
	public void setRoadid(String roadid) {
		this.roadid = roadid;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getPostype() {
		return postype;
	}
	public void setPostype(int postype) {
		this.postype = postype;
	}
	public int getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(int evaluate) {
		this.evaluate = evaluate;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	
	public Date getTaskcreatetime() {
		return taskcreatetime;
	}
	public void setTaskcreatetime(Date taskcreatetime) {
		this.taskcreatetime = taskcreatetime;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getProcessdefid() {
		return processdefid;
	}
	public void setProcessdefid(String processdefid) {
		this.processdefid = processdefid;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	
	public String getProcessinstanceid() {
		return processinstanceid;
	}
	public void setProcessinstanceid(String processinstanceid) {
		this.processinstanceid = processinstanceid;
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
	public Integer getTaskid() {
		return taskid;
	}
	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStyle() {
		return style;
	}
	public void setStyle(Integer style) {
		this.style = style;
	}
	public Integer getProtid() {
		return protid;
	}
	public void setProtid(Integer protid) {
		this.protid = protid;
	}

	public String getEpicture() {
		return epicture;
	}
	public void setEpicture(String epicture) {
		this.epicture = epicture;
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

	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Integer getIncid() {
		return incid;
	}
	public void setIncid(Integer incid) {
		this.incid = incid;
	}
	@Override
	public String toString() {
		return "WorkTask [page=" + page + ", taskid=" + taskid
				+ ", processinstanceid=" + processinstanceid
				+ ", processdefid=" + processdefid + ", type=" + type
				+ ", style=" + style + ", protid=" + protid + ", begintime="
				+ begintime + ", endtime=" + endtime + ", file=" + file
				+ ", incid=" + incid + ", epicture=" + epicture
				+ ", roadstart=" + roadstart + ", roadover=" + roadover
				+ ", content=" + content + ", task=" + task + ", taskId="
				+ taskId + ", taskname=" + taskname + ", taskcreatetime="
				+ taskcreatetime + ", spicture=" + spicture + ", tasktype="
				+ tasktype + ", channel=" + channel + ", roadid=" + roadid
				+ ", scheme=" + scheme + ", budget=" + budget + ", postype="
				+ postype + ", evaluate=" + evaluate + ", carno=" + carno
				+ ", typeid=" + typeid + ", road=" + road + ", inc=" + inc
				+ "]";
	}
	
}
