package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.DBConnnection;
import com.model.SaveTest;
import com.model.UserRegisterModel;


@WebServlet("/CreateTest")
public class CreateTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String test=request.getParameter("test");
		HttpSession session=request.getSession();
		int id2=(int) session.getAttribute("id");

		System.out.println("id*========"+id2);
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);  
      // 	String date="11-6-92";
	    
	    
      //	String time="5.43.56";
       	
	    
	   Calendar cal = Calendar.getInstance();
	   SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time=sdf.format(cal.getTime());
        System.out.println(time);
      	
		SaveTest s=new SaveTest();
		s.setUid(id2);
		s.setTname(test);
		s.setDate(strDate);
		//s.setDate(date);
		//s.setDate(date);
		s.setTime(time);
		
		int i=DBConnnection.createTest(s);
		//int j=DBConnnection.saveTest(s);  
		int testid=DBConnnection.getTesttId();
	
		session.setAttribute("testid",testid);
		
		if(i!=0)
		{
		System.out.println("sucessfull");
		response.sendRedirect("welcome3.jsp");
		}
		else
		{	
		System.out.println("fail");	
		response.sendRedirect("error2.jsp");
		}
			
	}
}

