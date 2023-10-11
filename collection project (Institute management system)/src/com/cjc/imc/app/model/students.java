package com.cjc.imc.app.model;

public class students {
private  int sid;
private String sname;
private Batch batch;

public int getsid() {
	return sid;
}
public void setsid(int sid) {
	this.sid = sid;
}
public String getsname() {
	return sname;
}
public void setsname(String sname) {
	this.sname = sname;
}
public Batch getbatch() {
	return batch;
}
public void setbatch(Batch batch) {
	this.batch = batch;
}
}
