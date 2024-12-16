package com.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.UserSingupConnection;
import com.model.UserRegisterModel;

import utility.SendMailBySite;

@WebServlet("/TeacherSingUp")
public class TeacherSingUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("inside servlet");
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String number=request.getParameter("number");
		String gender=request.getParameter("gender");
		String date=request.getParameter("Date");
		
		
		UserRegisterModel obj=new UserRegisterModel();
		obj.setFname(fname);
		obj.setLname(lname);
		obj.setEmail(email);
		obj.setPassword(password);
		obj.setNumber(number);
		obj.setGender(gender);
		obj.setDate(date);
		
		
		int flage2=UserSingupConnection.emailCheckForTeacher(email);
		System.out.println("inside servlet==="+flage2);
		System.out.println("inside servlet==="+email);
		
		if(flage2==0)
		{
			response.sendRedirect("error2.jsp");
		
		}
		else
		{	
		
		int code1=randomnumber.randommethod();
		System.out.println("otp==="+code1);
		HttpSession session = request.getSession();
		session.setAttribute("code1",code1);
		
		try {

			SendMailBySite.sendEmail("smtp.gmail.com", "587", "project.varification@gmail.com", "Email@123", email, code1);
			// Database_con.insertSecCode(code);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			//response.sendRedirect("Error.jsp");
			e.printStackTrace();
		}
		
		
		HttpSession session2=request.getSession();
		session2.setAttribute("usr", obj);
		
		response.sendRedirect("verify2.jsp");
		
		}		
		
	}	
		
		
	

}
