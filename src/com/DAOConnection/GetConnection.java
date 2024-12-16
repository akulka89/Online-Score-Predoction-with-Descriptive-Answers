package com.DAOConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {

	public static Connection getconnection()
	{
		Connection con=null;
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreprediction","root","root");  
			 
			
			}catch(Exception e){ System.out.println(e);} 
		
		 	return con;
			}
	
	
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<7;j++)
			{
				if(j==i&&j>=(7-i))
				{
					System.out.print("*");
					
				}else
				{
					System.out.print(" ");
				
				
				}	
				
			}
			System.out.println();
		}
		
	}
}
