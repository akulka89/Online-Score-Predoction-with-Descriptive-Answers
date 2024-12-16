package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ViewResultController
 */
@WebServlet("/ViewResultController")
public class ViewResultController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewResultController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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

		System.out.println("tid===="+tid);
		session.setAttribute("rtid", tid);
		
		if(tid!=0)
		{
			response.sendRedirect("viewtestresult2.jsp");
		}
		else
		{
			response.sendRedirect("error4.jsp");	
		}
		
		
	}

}
