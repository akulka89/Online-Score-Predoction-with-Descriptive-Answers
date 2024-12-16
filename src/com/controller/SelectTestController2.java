package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SelectTestController2")
public class SelectTestController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   String testname=request.getParameter("tname");
		
		HttpSession session=request.getSession();
		ArrayList<ArrayList> list=(ArrayList<ArrayList>)session.getAttribute("testnamelist");
		
		int tid = 0;
		
		for(int i=0;i<list.size();i++)
		{
			
			 if(list.get(i).get(1).equals(testname))
			 {
				 tid=(int) list.get(i).get(0);
				 
			 } 
			
		}	
		
		session.setAttribute("deletetestid", tid);
		
		if(tid!=0)
		{
			response.sendRedirect("deletequestion2.jsp");
		}
		else
		{
			response.sendRedirect("error4.jsp");	
		}	
		
	}
		
		
	

}
