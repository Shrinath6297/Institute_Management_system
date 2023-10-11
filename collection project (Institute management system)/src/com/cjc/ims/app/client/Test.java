package com.cjc.ims.app.client;

import java.util.Scanner;
import com.cjc.imc.app.model.*;
import com.cjc.ims.app.serviceimpl.karvenagar;
import com.cjc.ims.app.services.cjc;


public class Test 
{
	public static void main(String[] args) 
	{
		cjc c= new karvenagar();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add course\n"
					+"2.View course\n"
					+"3.Add Faculty\n"
					+"4.View Faculty\n"
					+"5.Add Batch\n"
					+"6.View Batch\n"
					+"7.Add Student\n"
					+"8.View Student");
			System.out.println("Enter your choise");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				c.addcourse();
				break;
			case 2:
				c.viewcourse();
				break;
			case 3:
				c.addfaculty();
				break;
			case 4:
				c.viewfaculty();
				break;
			case 5:
				c.addbatch();
				break;
			case 6:
				c.viewbatch();
				break;
			case 7:
				c.addstudent();
				break;
			case 8:
				c.viewStudent();
				break;
			default:
				System.out.println("Enter correct choise");
				break;
			}
		}
		
		
		
	}

}
