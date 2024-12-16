package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetInfoController")
public class GetInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cid=request.getParameter("cid");
		int cid2=Integer.parseInt(cid);
		cid2=cid2+1;
		String content="";
		try {
			//content=ClobSelectMySQL.getCLOB(cid2);
			System.out.println("servlet=="+content);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		request.setAttribute("content",content);
		request.getRequestDispatcher("EcommercePlatformMaster.jsp").forward(request,response); 
		
		/*HttpSession session=request.getSession();
		session.setAttribute("content", content);
		
		response.sendRedirect("EcommercePlatformMaster.jsp");
	*/
	
	
	}	
	

}
