package com.interfaceses;

import java.util.Scanner;

import com.Database.ConnectionClass;
import com.pojo.StudentPojo;

public class StudentImp implements StudentInterface{
	
	Scanner sc = new Scanner(System.in);
	StudentPojo s= null;
	ConnectionClass obj=new ConnectionClass();

	@Override
	public void studentlIST() throws Exception {
		obj.selects();
	}

	@Override
	public   void regieterStudent() throws Exception {
		System.out.println("eneter student name");
	String sname=sc.next();
	System.out.println("eneter address name");
	String address=sc.next();
	
	System.out.println("eneter std name");
	String std=sc.next();
	 
	
	s= new StudentPojo(sname, address, std);
	obj.insert(s);
	
	
		
	}

	@Override
	public void updateStudent() throws Exception {
		System.out.println("eneter sroll name");
		int sroll=sc.nextInt();
		System.out.println("eneter student name");
		String sname=sc.next();
		System.out.println("eneter address name");
		String address=sc.next();
		
		System.out.println("eneter std name");
		String std=sc.next();
		 
		
		s= new StudentPojo(sroll,sname, address, std);
		obj.update(s);
		
	}
	
	

}
