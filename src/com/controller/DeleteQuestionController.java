package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAOConnection.DBConnnection;


@WebServlet("/DeleteQuestionController")
public class DeleteQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int qno=Integer.parseInt(request.getParameter("bt"));
		
		int flage=DBConnnection.deletetestquestion(qno);
		
		PrintWriter out=response.getWriter();
		
		if(flage!=0)
		{
		
		out.println("<script type=\"text/javascript\">");
		out.println("alert('DELETE QUESTION SUCESSFULLY!!');");
		out.println("location='deletequestion2.jsp';");
		out.println("</script>");
		}
		else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('DELETE QUESTION FAILED!!');");
			out.println("location='deletequestion2.jsp';");
			out.println("</script>");
		}
		
		
	}

}
