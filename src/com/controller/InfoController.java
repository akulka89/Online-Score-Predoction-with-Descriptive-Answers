package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InfoController
 */
@WebServlet("/InfoController")
public class InfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     //String str=request.getParameter("b1");
     String value=request.getParameter("ViewGraph");
     
     int tid=Integer.parseInt(value);
     
     HttpSession session=request.getSession();
     session.setAttribute("tid", tid);
     
     
	
     response.sendRedirect("info.jsp");
	}

}
