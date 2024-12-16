package com.controller;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClobSelectMySQL{
  public static Connection getConnection() throws Exception {
	  String driver = "com.mysql.jdbc.Driver";
	 String url = "jdbc:mysql://localhost/scoreprediction?autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "root";
    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }
  public static ArrayList<String> getCLOB(int id) throws Exception {
	  
	  ArrayList<String> al=new ArrayList<>();
	  System.out.println("vaibhav=="+id);
    Connection conn = null;
   
   
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    String query = "SELECT file FROM studynotes2 WHERE id = ?";
    String str1="**********7777777777";
    try {
      conn = getConnection();
      pstmt = conn.prepareStatement(query);
      pstmt.setInt(1, id);
      rs = pstmt.executeQuery();
      rs.next();
      Clob clob = rs.getClob(1);
      // materialize CLOB onto client
     // String wholeClob = clob.getSubString(1, (int) clob.length());
      
      long wholeClob1 = clob.position(str1,1);
      System.out.println("jjbb===="+wholeClob1);
      wholeClob1=wholeClob1-1;
      String wholeClob = clob.getSubString(1,(int) wholeClob1);
      
      System.out.println(wholeClob);
      
      String st[]=wholeClob.split("123456");
      
      
      for(int i=0;i<st.length;i++)
      {
       al.add(st[i]);	  
    	  
      }
    
     
    } finally {
      rs.close();
      pstmt.close();
      conn.close();
     
    
    }
    return al; 
    
  }

  public static void main(String args[]) throws Exception {
   //String content=getCLOB(1);
   //System.out.println(getCLOB(1));
  
   
  }
}