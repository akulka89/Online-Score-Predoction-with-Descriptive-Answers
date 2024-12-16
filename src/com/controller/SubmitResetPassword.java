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


@WebServlet("/SubmitResetPassword")
public class SubmitResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String oldpass=request.getParameter("op");
		String newpass=request.getParameter("np");
		String cnewpass=request.getParameter("cnp");
		
		HttpSession session=request.getSession();
		String email=session.getAttribute("changepassemail").toString();
		
		
		int flage=DBConnnection.checkPass(email,oldpass);
		PrintWriter out = response.getWriter();
		int flage31=0;
		if(flage!=0)
		{
			 flage31=DBConnnection.chnagepass(email,newpass);	
			
			if(flage31!=0)
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Password Update Sucessfully!!');");
				out.println("location='teacherlogin.jsp';");
				out.println("</script>");
			}	
			else
			{
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Password Updation Failed!!!');");
				out.println("location='ResetPassword.jsp';");
				out.println("</script>");
			}	
			
		}else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your Current Password Is Incorrect!!');");
			out.println("location='ResetPassword.jsp';");
			out.println("</script>");	
			
		}
		
		
	}

}
