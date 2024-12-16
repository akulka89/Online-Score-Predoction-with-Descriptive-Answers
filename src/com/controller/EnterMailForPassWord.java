package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.DBConnnection;

import utility.SendMailBySite;


@WebServlet("/EnterMailForPassWord")
public class EnterMailForPassWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		
		HttpSession session=request.getSession();
		session.setAttribute("changepassemail", email);

		int flage=DBConnnection.checkMailForPass(email);
		String pass=DBConnnection.returnPassForReset(email);
		PrintWriter out = response.getWriter();
		
		if(flage!=0)
		{
			
			try {

				SendMailBySite.sendEmail2("smtp.gmail.com", "587", "project.varification@gmail.com", "Email@123",email,pass);
				// Database_con.insertSecCode(code);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				//response.sendRedirect("Error.jsp");
				e.printStackTrace();
			}

			
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your Old PassWord Is Send on Your Mail!!');");
			out.println("location='ResetPassword.jsp';");
			out.println("</script>");	
			
		}else
		{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your given Email Is Not Registerd!!');");
			out.println("location='enteremail.jsp';");
			out.println("</script>");	
		}	
		
	}

}
