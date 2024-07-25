package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.interfaceses.StudentImp;
import com.pojo.StudentPojo;

public class ConnectionClass {

	StudentPojo st= new StudentPojo();
	public static  Connection connect() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection db=DriverManager.getConnection("jdbc:mysql://localhost:3306/amit", "root", "123456789");
		System.out.println("success");
		
		return db;
	}
	
	//insert
	
	public void insert (StudentPojo s) throws Exception
	{
		Connection db= connect();
		//statement create
		PreparedStatement pst=db.prepareStatement("insert into student (sname, address, std)Value(?,?,?)");
		pst.setString(1,s.getSname());
		pst.setString(2, s.getAddress());
		pst.setString(3, s.getStd());
		int i= pst.executeUpdate();
		System.out.println("just for git check");
		
		if(i>0)
			System.out.println("insert successful");
		else 
			System.out.println("fail");
	}
	//update

	public void update(StudentPojo s) throws Exception
	{
		Connection db= connect();
		//statement create
		PreparedStatement pst=db.prepareStatement("update  student set sname=?, address=?, std=? where sroll=?");
		
		
		
		pst.setString(1,s.getSname());
		pst.setString(2, s.getAddress());
		pst.setString(3, s.getStd());
		pst.setInt(4, s.getRollnum());
		int i= pst.executeUpdate();
		
		if(i>0)
			System.out.println("upadete successful");
		else 
			System.out.println("fail");
	}
	//select method
	
	public void selects() throws Exception{
		Connection db= connect();
		//statement create
		Statement  statement = db.createStatement();
		ResultSet rs=statement.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString("sname"));
			System.out.println(rs.getString("address"));
			System.out.println(rs.getString("std"));
			
		}
		
		
	}
	
}

