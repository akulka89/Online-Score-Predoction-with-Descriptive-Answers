package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

/**
 * Servlet implementation class TimerController
 */
@WebServlet("/TimerController")
public class TimerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	int count=50;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head><body>");
		
		
		
		
		if(count>0)
		{
		
     /*  for(int i=60;i>0;i++)
       { 
		out.println("<h1>"+i+"</h1>");		
		response.setHeader("Refresh", "1");
       }*/
       out.println("<h1>"+count+"</h1>");		
		
       response.setHeader("Refresh", "1");
			--count;
		}
		else
		{
			
		RequestDispatcher rs=request.getRequestDispatcher("welcome.jsp");
		rs.forward(request,response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
