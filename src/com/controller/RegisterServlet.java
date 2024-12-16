package com.controller;

import java.io.IOException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.UserDetails;

import utility.SendMailBySite;


@WebServlet("/RegisterServlet")
/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		
		int code1=randomnumber.randommethod();
		HttpSession session = request.getSession();
		session.setAttribute("code1",code1);
//		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("gender");
		String date = request.getParameter("date");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
//		System.out.println("im in veri12");
		
		//System.out.println("ramdom method 1=="+code1);
		
		// Database_con.addCode(code);

		try {

			SendMailBySite.sendEmail("smtp.gmail.com", "587", "project.varification@gmail.com", "Email@123", email, code1);
			// Database_con.insertSecCode(code);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			//response.sendRedirect("Error.jsp");
			e.printStackTrace();
		}

		UserDetails usr = new UserDetails();
		usr.setFname(fname);
	    usr.setLname(lname);
	    usr.setGender(gender);
	    usr.setDate(date);
	    usr.setCity(city);
	    usr.setState(state);
		usr.setEmail(email);
		usr.setPass(pass);
		
		HttpSession session2=request.getSession();
		session2.setAttribute("usr", usr);
		
		response.sendRedirect("verify.jsp");
		}


	
		
		
		
		
		
		
	}


