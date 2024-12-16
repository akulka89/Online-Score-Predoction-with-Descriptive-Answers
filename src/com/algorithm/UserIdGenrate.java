package com.algorithm;

import java.util.Random;

public class UserIdGenrate {
	
	
	
	public static String ExamIdCreate(String uname)
	{
	 String username=uname;	
	 int len=username.length();
	 
	 String ExamID="123"; 
	 for(int i=0;i<len;i++)
	 {
		 Random r = new Random();
		 int max =len, min = 0;	 
		 int code = r.nextInt(max);
		 System.out.println("char="+username.charAt(code));
		 ExamID=ExamID+username.charAt(code); 
	 }
	 
	 System.out.println("ExamID==="+ExamID);
	
	 return ExamID;
	
	
//	//System.out.println(code);
//	return code;
//	
	}
	
	public static void main(String[] args) {
		
		ExamIdCreate("vaibhav");
		
	}

}
