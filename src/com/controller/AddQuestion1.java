package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddQuestion1")
public class AddQuestion1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String testname=request.getParameter("testname");
		
		HttpSession session=request.getSession();
		session.setAttribute("testname1", testname);	
		response.sendRedirect("addquestion.jsp");
		
	}

}
