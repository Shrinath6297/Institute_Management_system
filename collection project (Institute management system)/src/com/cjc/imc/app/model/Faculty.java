package com.cjc.imc.app.model;

public class Faculty {
private int fid;
private String Fname;
private course course;

public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public course getcourse()
{
	return course;
}
public void setcourse(course course) {
	
	this.course=course;
}

}
