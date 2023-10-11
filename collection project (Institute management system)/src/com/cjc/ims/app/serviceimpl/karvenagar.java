package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.imc.app.model.Batch;
import com.cjc.imc.app.model.Faculty;
import com.cjc.imc.app.model.course;
import com.cjc.imc.app.model.students;
import com.cjc.ims.app.services.cjc;


public class karvenagar implements cjc
{
Scanner sc =new Scanner (System.in);
List<course> clist=new ArrayList<>();
List<Faculty>flist=new ArrayList<>();
List<Batch>blist=new ArrayList<>();
List<students>slist=new ArrayList<>();

course c=new course();

public void addcourse()
{
System.out.println("Enter course id");	
c.setCid(sc.nextInt());
System.out.println("Enter course name");	
c.setCname(sc.next());
clist.add(c);
}
public void viewcourse()
{
	Iterator<course> itr=clist.iterator();
	while(itr.hasNext())
	{
		course c=itr.next();
		System.out.println("cid="+c.getCid());
		System.out.println("cname="+c.getCname());
		
	}
}
	
	Faculty f=new Faculty();
	
	public void addfaculty()
	{
	System.out.println("Enter Faculty id");	
	f.setFid(sc.nextInt());
	System.out.println("Enter Faculty name");	
	f.setFname(sc.next());
	f.setcourse(c);
	flist.add(f);
	}
	public void viewfaculty()
	{
		Iterator<Faculty> itr=flist.iterator();
		while(itr.hasNext())
		{
			Faculty f=itr.next();
			System.out.println(f.getcourse().getCid());
			System.out.println(f.getcourse().getCname());
			System.out.println("fid="+f.getFid());
			System.out.println("fname="+f.getFname());
			
		}
}
	Batch b=new Batch();
	public void addbatch()
	{
	System.out.println("Enter Batch id");	
	b.setBid(sc.nextInt());
	System.out.println("Enter Batch name");	
	b.setBname(sc.next());
	b.setFaculty(f);
	blist.add(b);
	}
	public void viewbatch()
	{
		Iterator<Batch> itr=blist.iterator();
		while(itr.hasNext())
		{
			Batch b=itr.next();
			System.out.println(b.getFaculty().getcourse().getCid());
			System.out.println(b.getFaculty().getcourse().getCname());
			System.out.println(b.getFaculty().getFid());
			System.out.println(b.getFaculty().getFname());
			System.out.println("bid="+b.getBid());
			System.out.println("bname="+b.getBname());	
		}
}
	students s=new students();
	
	public void addstudent()
	{
	System.out.println("Enter Student id");	
	s.setsid(sc.nextInt());
	System.out.println("Enter Student name");	
	s.setsname(sc.next());
	s.setbatch(b);
	slist.add(s);
	}
	public void viewStudent()
	{
		Iterator<students> itr=slist.iterator();
		while(itr.hasNext())
		{
			students s=itr.next();
			System.out.println(s.getbatch().getFaculty().getcourse().getCid());
			System.out.println(s.getbatch().getFaculty().getcourse().getCname());
			System.out.println(s.getbatch().getFaculty().getFid());
			System.out.println(s.getbatch().getFaculty().getFname());
			System.out.println(s.getbatch().getbid());
			System.out.println(s.getbatch().getbname());
			System.out.println("sid="+s.getsid());
			System.out.println("sname="+s.getsname());	
		}
}
}
