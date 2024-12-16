package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOConnection.DBConnnection;
import com.model.UserDetails;

/**
 * Servlet implementation class TeacherProfile
 */
@WebServlet("/TeacherProfile")
public class TeacherProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		int id=(int)session.getAttribute("id");
		
		String fname=request.getParameter("fname");                         
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String number=request.getParameter("number");
		String gender=request.getParameter("gender");
		String date=request.getParameter("date");
		
		System.out.println("firstname"+fname);
		System.out.println("last name"+lname);
		System.out.println("email"+email);
		System.out.println("number"+number);
		System.out.println("gender"+gender);
		System.out.println("date"+date);
	
		UserDetails u=new UserDetails();
		u.setFname(fname);
		u.setLname(lname);
		u.setEmail(email);
		u.setNumber(number);
		u.setGender(gender);
		u.setDate(date);
			
		System.out.println(u.getFname());
		System.out.println(u.getPA());
		int i=DBConnnection.profiledataupdate1(id,u);
		
		if(i!=0)
		{
			
			System.out.println("successfully!!!");
			response.sendRedirect("teacher_profile.jsp");
				}
		else
		{
			System.out.println("Failed...");
			
		}	
		
	}

	}


