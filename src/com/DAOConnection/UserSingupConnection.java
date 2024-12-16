package com.DAOConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.model.UserRegisterModel;

public class UserSingupConnection {

	public static Connection getconnection()
	{
		Connection con=null;
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreprediction","root","root");  
			 
			
			}catch(Exception e){ System.out.println(e);} 
		
		 	return con;
			}
	
	
	public static int registerdata(UserRegisterModel obj)
	{
		int flage=0;
		Connection con=getconnection();
		String str="insert into userregister2(fname,lname,email,password,number,gender,date,profile) values(?,?,?,?,?,?,?,?)";
		try{
		PreparedStatement st=con.prepareStatement(str);
		st.setString(1,obj.getFname());
		st.setString(2,obj.getLname());
		st.setString(3,obj.getEmail());
		st.setString(4,obj.getPassword());
		st.setString(5,obj.getNumber());
		st.setString(6,obj.getGender());
		st.setString(7,obj.getDate());
		st.setBlob(8,obj.getImage());
		System.out.println("model=="+obj.getFname());
		int i=st.executeUpdate();
		
		if(i==1)
		{
			flage=1;
			System.out.println("insertion sucessfully");
		}
		else
		{
			System.out.println("insertion failed");
		}	
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		
		return flage;
		
	}
	
	
	public static int TeacherRegisterdata(UserRegisterModel obj)
	{
		int flage=0;
		Connection con=getconnection();
		String str="insert into teacherregister(fname,lname,email,password,number,gender,date) values(?,?,?,?,?,?,?)";
		try{
		PreparedStatement st=con.prepareStatement(str);
		st.setString(1,obj.getFname());
		st.setString(2,obj.getLname());
		st.setString(3,obj.getEmail());
		st.setString(4,obj.getPassword());
		st.setString(5,obj.getNumber());
		st.setString(6,obj.getGender());
		st.setString(7,obj.getDate());
		System.out.println("model=="+obj.getFname());
		int i=st.executeUpdate();
		
		if(i==1)
		{
			flage=1;
			System.out.println("insertion sucessfully");
		}
		else
		{
			System.out.println("insertion failed");
		}	
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		
		return flage;
		
	}
		
	
	
	
	
	public static int emailcheck(String email)
	{
		System.out.println("email check in connection email=="+email);
		int flage=0;
		Connection con=getconnection();
		ResultSet rs=null;
		String str="select email from userregister2";
		try{
		PreparedStatement st=con.prepareStatement(str);
		rs=st.executeQuery();
		
		while(rs.next())
		{
			
	    System.out.println("inside mysql");
			if(email.equals(rs.getString("email")))
			{
				System.out.println("email allready present!!!!");
				flage=0;
			}
			else
			{
				System.out.println("valid email");
				flage=1;
				
			}
			
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		
		return flage;
		
	}
	
	
	
     


public static int emailCheckForTeacher(String email)
{
	System.out.println("email check in connection email=="+email);
	int flage=0;
	Connection con=getconnection();
	ResultSet rs=null;
	String str="select email from teacherregister";
	try{
	PreparedStatement st=con.prepareStatement(str);
	rs=st.executeQuery();
	
	while(rs.next())
	{
		
    System.out.println("inside mysql");
		if(email.equals(rs.getString(1)))
		{
			System.out.println("email allready present!!!!");
			flage=0;
		}
		else
		{
			System.out.println("valid email");
			flage=1;
			
		}
		
	}
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
	
	return flage;
	
}


public static void main(String[] args) {
	
	emailcheck("vaibhav.kasnet@gmail.com");
}

 }


