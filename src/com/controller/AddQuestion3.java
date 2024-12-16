package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAOConnection.DBConnnection;


@WebServlet("/AddQuestion3")
public class AddQuestion3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String question=request.getParameter("question");	
		String answer=request.getParameter("answer");
		
	    int tid=Integer.parseInt(request.getParameter("bt"));
	
	    int flage=DBConnnection.addQuestion2(tid,question,answer);
	    
	    
	    PrintWriter out=response.getWriter();
		if(flage!=0)
		{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Question Added Sucessfully!!');");
		out.println("location='addquestion.jsp';");
		out.println("</script>");
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Question Added Failed!!');");
			out.println("location='addquestion.jsp';");
			out.println("</script>");
		}
		
	    
	}

}
