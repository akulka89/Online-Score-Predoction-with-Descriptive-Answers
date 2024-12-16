package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.DBConnnection;
import com.DAOConnection.UserLoginConnection;

@WebServlet("/TeacherLogin")
public class TeacherLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		HttpSession session=request.getSession();
		
		
		
		int flage=UserLoginConnection.userVerify(email,password);
		String uname=DBConnnection.getTestInfo(flage); 
		 
		if(flage!=0)
		{
		    session.setAttribute("id",flage);
		    session.setAttribute("uname",uname);
		    //System.out.println(uname);
		    response.sendRedirect("teacherwelcome.jsp");
		    
		    /*String examid=UserLoginConnection.profileCreated(flage);
		    
		    if(examid.equals("NULL"))
		    {
			response.sendRedirect("createprofile.jsp");
		    }*/
		  
		} 
		else
		    {
			response.sendRedirect("error.jsp");
		    	
		    }	
		
		
		
		
	}	
		
	}


