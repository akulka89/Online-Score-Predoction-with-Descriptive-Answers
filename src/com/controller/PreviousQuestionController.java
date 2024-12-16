package com.controller;



import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PreviousQuestionController")
public class PreviousQuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	/*	HttpSession session = request.getSession();
		session.setAttribute("qid",qid1);*/
		
		
		/*int qid = Integer.parseInt(request.getParameter("qid"));
		HttpSession session = request.getSession();
		
		
		System.out.println("vaiiiiiiiiiii");
		
		Map<Integer, String> map = (Map<Integer, String>) session.getAttribute("previous");
		
		System.out.println("data==========================="+map);*/
		
		
		/*Map.Entry<Integer, String> entry = map.entrySet().iterator().next(); 
		int qid1=entry.getKey();
		
		
		String question=entry.getValue();
		Map<Integer, String> map1 = (Map<Integer, String>) session.getAttribute("map");
		map1.put(qid1,question);
		session.setAttribute("map",map1);*/
		response.sendRedirect("starttest1.jsp");
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Map<Integer, String> previous=(Map<Integer, String>)session.getAttribute("pre");
		
		System.out.println("vaiiiiiii");
		System.out.println();
		
		System.out.println();
		System.out.println();
		
		System.out.println("mainnnnnnnnnnnnnnnnnnn======"+previous);
		
		response.sendRedirect("starttest1.jsp");
		
	}

}
