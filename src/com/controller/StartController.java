package com.controller;



import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StartController
 */
@WebServlet("/StartController")
public class StartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		
		Map<Integer, String> map = RandomQuestion.getQuestion(1);
		
		Map<Integer, String> previous=new HashMap<Integer,String>(map);
		session.setAttribute("pre", previous);
		
		
		Map<Integer, String> answerlist=new HashMap<Integer,String>();
		
		
		session.setAttribute("map", map);
		session.setAttribute("answerlist",answerlist);
		response.sendRedirect("starttest1.jsp");

	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		String qid = request.getParameter("qid");
		String ans = request.getParameter("answer");
		//System.out.println("qid1======"+qid);
		//System.out.println("answer1==="+ans);
		
		
		int qid1 = Integer.parseInt(qid);
		HttpSession session = request.getSession();
		session.setAttribute("qid",qid1);
		
		
		
		
		
		Map<Integer,String> answerlist=(Map<Integer, String>) session.getAttribute("answerlist");
		answerlist.put(qid1,ans);
		//System.out.println("answer list==="+answerlist);
		
		
		Map<Integer, String> map = (Map<Integer, String>) session.getAttribute("map");
		//System.out.println(qid + "     " + ans);
		Map.Entry<Integer, String> entry = map.entrySet().iterator().next();
		map.remove(qid1);
		
		
		if (map.size() != 0) {

			session.setAttribute("map", map);
			response.sendRedirect("starttest1.jsp");
		} else {
            response.sendRedirect("testEnd.jsp");
		}

	}

}
