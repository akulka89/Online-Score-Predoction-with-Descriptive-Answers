package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAOConnection.DBConnnection;

@WebServlet("/DeleteTestController")
public class DeleteTestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		int tid=Integer.parseInt(request.getParameter("dt"));
		
		int flage=DBConnnection.deletetest(tid);
		System.out.println(flage);
		
		
		
		if(flage!=0)
		{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('TEST DELETED SUCESSFULLY!!');");
		out.println("location='deletetest.jsp';");
		out.println("</script>");
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('TEST DELETED FAILED!!');");
			out.println("location='deletetest.jsp';");
			out.println("</script>");
		}
		
		
	}

}
