package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.DBConnnection;
import com.model.SaveTest;

@WebServlet("/AddQuestion")
public class AddQuestion extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String question=request.getParameter("question");	
	String answer=request.getParameter("answer");
	
	HttpSession session=request.getSession();
	int testid=(int) session.getAttribute("testid");
	
	
	SaveTest s=new SaveTest();
	s.setQuestion(question);
	s.setAnswer(answer);
	s.setUid(testid);
	
	int f=DBConnnection.addQuestion(s);
	PrintWriter out=response.getWriter();
	if(f!=0)
	{
	
	out.println("<script type=\"text/javascript\">");
	out.println("alert('Question Added Sucessfully!!');");
	out.println("location='welcome3.jsp';");
	out.println("</script>");
	}
	else
	{
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Question Added Failed!!');");
		out.println("location='welcome3.jsp';");
		out.println("</script>");
	}
	
	
	//response.sendRedirect("welcome3.jsp");
	
	
	}

}
