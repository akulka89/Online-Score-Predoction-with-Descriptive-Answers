package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class temp1
 */
@WebServlet("/temp1")
public class temp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public temp1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out=response.getWriter();
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Question Added Sucessfully!!');");
		out.println("location='welcome.jsp';");
		out.println("</script>");
		//response.sendRedirect("welcome.jsp");
		
	}

}
