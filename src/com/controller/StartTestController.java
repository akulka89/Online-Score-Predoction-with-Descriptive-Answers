package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.DBConnnection;
import com.mysql.cj.Session;


@WebServlet("/VaibhavquestionNext")
public class StartTestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		int tid=Integer.parseInt(session.getAttribute("tid").toString()); 
		String tname=DBConnnection.gettestname(tid);
		session.setAttribute("tname1",tname);
		System.out.println("test name=="+tname);
		System.out.println("test tid=="+tid);
		
		//this is code for get 10 random question from data base 
		Map<Integer, String> map = RandomQuestion.getQuestion(tid);
		session.setAttribute("map", map);
        
        
		//this is question id set and we pass first question id here
		
        ArrayList<Integer> keyset1=new ArrayList<>(map.keySet());
        int keyid=keyset1.get(0);
		session.setAttribute("keyset",keyid);
		
		int qnumber=1;
		session.setAttribute("qestionnumber",qnumber);
		
		
		
		
		
		//this is for create empty answerlis with given question id 
		Map<Integer, String> answerlist=new HashMap<Integer,String>();
		
		for(int i=0;i<keyset1.size();i++)
		{
			answerlist.put(keyset1.get(i)," ");
			
		}
		session.setAttribute("answerlist",answerlist);
		
		
		
		response.sendRedirect("starttest1.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String question=request.getParameter("question");
		String answer=request.getParameter("answer");
		String qid=request.getParameter("qid");
		
		String submit=request.getParameter("submit");
		System.out.println("button value=="+submit);
		
		
		int keyid1=Integer.parseInt(qid);
		System.out.println("begining key=="+keyid1);
		
		
		
		// get map from session 
		HttpSession session = request.getSession();
		Map<Integer, String> map =(Map<Integer, String>)session.getAttribute("map");
		System.out.println(map.keySet());
	
		//here we create question id list 
		ArrayList<Integer> keyset1=new ArrayList<>(map.keySet());
       
		
		//get answerlist from session to set first answer using put method 
		Map<Integer, String> answerlist=(Map<Integer, String>)session.getAttribute("answerlist");
		answerlist.put(keyid1,answer);
		System.out.println(answerlist);
		
	
		//this session is for question number
		int qnumber=(int)session.getAttribute("qestionnumber");
		
		
		//this are the controll condition for next and previous button
		
		if(submit.equals("next"))
		{
			System.out.println("inside");
			int index=keyset1.indexOf(keyid1);
			System.out.println("index=="+index);
	        
			if(index<9)
			{	
			index=index+1;	
	    	System.out.println("index2=="+index);
	        int keyid=keyset1.get(index);
	        session.setAttribute("keyset",keyid);
			
	        
	        System.out.println("next key==="+keyid);
			
	       //this is for increase question number 
	        qnumber=qnumber+1;
	        session.setAttribute("qestionnumber", qnumber);
		
	        
	        if (keyset1.indexOf(keyid)<=9) {

				//session.setAttribute("map", map);
				response.sendRedirect("starttest1.jsp");
			} else {
	            response.sendRedirect("testEnd.jsp");
	            
			}

			}  else
			{
				 response.sendRedirect("testEnd.jsp");
			}
	        
		}
		
		if(submit.equals("prev"))
		{
			
			int index=keyset1.indexOf(keyid1);
	        
		   //this is for decrising question number by 1
			              if(qnumber>1)
			                 {	
			                   qnumber=qnumber-1;
	                           session.setAttribute("qestionnumber", qnumber);
			                  }
			                  else
			                  {
			                	  qnumber=1;
			                	  session.setAttribute("qestionnumber", qnumber);
					                 
			                  }	  
				
			
			if(index==0)
	        {
	         
	        	index=0;
	            int keyid3=keyset1.get(index);
		        session.setAttribute("keyset",keyid3);
		       
		        System.out.println("next key==="+keyid3);
		        response.sendRedirect("starttest1.jsp");	
			
	        	
	        }
			else
			{	
			index=index-1;
	        int keyid=keyset1.get(index);
	        session.setAttribute("keyset",keyid);
	       
	        System.out.println("next key==="+keyid);
	        response.sendRedirect("starttest1.jsp");	
		
			}
	            
		}
		
		
		
		
	}

}
