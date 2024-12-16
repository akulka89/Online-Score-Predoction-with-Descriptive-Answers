package com.controller;

import java.util.Random;

import com.DAOConnection.DBConnnection;

public class randomnumber {

	public static int randommethod(int testid)
	{
		
	int min=DBConnnection.getmin(testid);	
	int max=DBConnnection.getmax(testid);	
		
		
	Random r = new Random();
	
	int code = r.nextInt(max);
	//System.out.println(code);
	return code;
	
	}
	
	
	public static int randommethod()
	{
		
	int min=1;	
	int max=50;
		
		
	Random r = new Random();
	
	int code = r.nextInt(max);
	//System.out.println(code);
	return code;
	
	}
	
/*	public static void main(String[] args) {
		
		randommethod();
	}*/
}
