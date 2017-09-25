package pagemodel;

import java.util.Date;

public class FaultForm {
private Integer source;//故障来源
private Date utime; //上报日期
private Integer type;//故障类型
private String username;//上报人
private Integer postype;//道路类型
public Integer getSource() {
	return source;
}
public void setSource(Integer source) {
	this.source = source;
}
public Date getUtime() {
	return utime;
}
public void setUtime(Date utime) {
	this.utime = utime;
}
public Integer getType() {
	return type;
}
public void setType(Integer type) {
	this.type = type;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Integer getPostype() {
	return postype;
}
public void setPostype(Integer postype) {
	this.postype = postype;
}
@Override
public String toString() {
	return "FaultForm [source=" + source + ", utime=" + utime + ", type="
			+ type + ", username=" + username + ", postype=" + postype + "]";
}

}
