package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimerController2
 */
@WebServlet("/TimerController2")
public class TimerController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head><body>");
		
		
		
		
		Thread thread=new Thread();
		
		for(int i=2;i>=0;i--)
		{
			
			for(int j=60;j>=0;j--)
			{	
			try {
				
				out.println("<h1>"+j+"</h1>");		
				Thread.sleep(1000);
				System.out.println(j);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			}
			
			
		}
		
		out.println("</body></head>");
		
		
		
	}
		
			

}
