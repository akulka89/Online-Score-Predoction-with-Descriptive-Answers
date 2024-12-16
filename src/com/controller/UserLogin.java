package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.UserLoginConnection;
import com.model.UserLoginModel;


@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println(email);
		HttpSession session=request.getSession();
		
		
		
		int flage=UserLoginConnection.userVerify2(email,password);
		
		if(flage!=0)
		{
		    session.setAttribute("id",flage);   	
		     response.sendRedirect("studentwelcome.jsp");	
		    	
		    
		}
		else
		{
		 response.sendRedirect("error.jsp");	
		}	
		
	}

}
