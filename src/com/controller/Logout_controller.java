package com.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout_controller
 */
@WebServlet("/Logout_controller")
public class Logout_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
    public Logout_controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		RequestDispatcher rd= request.getRequestDispatcher("index.html");
		
		Cookie[] cookies = request.getCookies();
		 
	    // Delete all the cookies
	    if (cookies != null) {
	 
	    	System.out.println("yjjhjvjh");
	        for (int i = 0; i < cookies.length; i++) {
	 
	        	
	            Cookie cookie = cookies[i];
	            cookies[i].setValue(null);
	            cookies[i].setMaxAge(0);
	            response.addCookie(cookie);
	        }
	    
		}
		session.invalidate();
		response.setHeader("Cache-Control","no-cache");    
		response.setHeader("Pragma","no-cache");
		rd.forward(request, response);
	

	

}
}
