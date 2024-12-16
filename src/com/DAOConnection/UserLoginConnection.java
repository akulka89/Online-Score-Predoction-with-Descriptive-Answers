package com.DAOConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import com.model.UserLoginModel;

public class UserLoginConnection {
	
	public static int userVerify(String email,String password)
	{
		
		UserLoginModel obj=new UserLoginModel();
		
		/*System.out.println(obj.getEmail());
		System.out.println(obj.getPassword());*/
		
		int flage=0;
		Connection con=GetConnection.getconnection();
		String str="select * from teacherregister where email='"+email+"' and password='" +password+ "'";
		
		try{
			PreparedStatement st=con.prepareStatement(str);
			ResultSet rs=st.executeQuery();
			
			/*System.out.println(obj.getEmail());
			System.out.println(obj.getPassword());*/
			while(rs.next())
			{
				
			 obj.setEmail(rs.getString("email"));
			 
			 obj.setPassword(rs.getString("password"));
			 obj.setFname(rs.getString("fname"));
			 obj.setLname(rs.getString("lname"));
			 obj.setId(rs.getInt("id"));
			 flage=rs.getInt("id");
			 
			/* System.out.println(rs.getInt("id"));
			 System.out.println(rs.getString("email"));
			 System.out.println(rs.getString("password"));
			 System.out.println(rs.getString("fname"));
			 System.out.println(rs.getString("lname"));*/
			 
			
			 
			 }
				
			}
		
			catch(Exception e)
			{
	        e.printStackTrace(); 		
			}
		return flage;
	}
	
	
	
	public static int userVerify2(String email,String password)
	{
		
		UserLoginModel obj=new UserLoginModel();
		
		/*System.out.println(obj.getEmail());
		System.out.println(obj.getPassword());*/
		
		int flage=0;
		Connection con=GetConnection.getconnection();
		String str="select * from userregister2 where email='"+email+"' and password='" +password+ "'";
		
		try{
			PreparedStatement st=con.prepareStatement(str);
			ResultSet rs=st.executeQuery();
			
			/*System.out.println(obj.getEmail());
			System.out.println(obj.getPassword());*/
			while(rs.next())
			{
				
			 obj.setEmail(rs.getString("email"));
			 
			 obj.setPassword(rs.getString("password"));
			 obj.setFname(rs.getString("fname"));
			 obj.setLname(rs.getString("lname"));
			 obj.setId(rs.getInt("id"));
			 flage=rs.getInt("id");
			 
			/* System.out.println(rs.getInt("id"));
			 System.out.println(rs.getString("email"));
			 System.out.println(rs.getString("password"));
			 System.out.println(rs.getString("fname"));
			 System.out.println(rs.getString("lname"));*/
			 
			
			 
			 }
				
			}
		
			catch(Exception e)
			{
	        e.printStackTrace(); 		
			}
		return flage;
	}
	
	
	
	public static String profileCreated(int id)
	{
		
		
		String examid="NULL";
		System.out.println("inside profilecreated"+examid);
		Connection con=GetConnection.getconnection();
		String str="select ExamID from profiledata2 where uid='"+id+"'";
		
		try{
			PreparedStatement st=con.prepareStatement(str);
			ResultSet rs=st.executeQuery();
			
			/*System.out.println(obj.getEmail());
			System.out.println(obj.getPassword());*/
			while(rs.next())
			{
				
			 examid=rs.getString("ExamID");
			 System.out.println("examid=============="+rs.getString("ExamID"));
			 
			 }
				
			}
		
			catch(Exception e)
			{
	        e.printStackTrace(); 		
			}
		return examid;
	}
	

}
