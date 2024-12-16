package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/QuestionLinkedController")
public class QuestionLinkedController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			HttpSession session=request.getSession();
			String qid=request.getParameter("qid"); 
			int keyid1=Integer.parseInt(qid);
			session.setAttribute("keyset",keyid1);
			
			
	        String qestion=request.getParameter("qno");
			int qnumber=Integer.parseInt(qestion);
			session.setAttribute("qestionnumber",qnumber);
			
			
			response.sendRedirect("starttest1.jsp");
			
	}

}
