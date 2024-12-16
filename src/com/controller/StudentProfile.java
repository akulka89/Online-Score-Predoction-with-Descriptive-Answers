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
 * Servlet implementation class StudentProfile
 */
@WebServlet("/StudentProfile")
public class StudentProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		int id=(int)session.getAttribute("id");
		
		String fname=request.getParameter("fname");                         
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String number=request.getParameter("number");
		String gender=request.getParameter("gender");
		String date=request.getParameter("date");
		String mobile=request.getParameter("mobile");
		String city=request.getParameter("city");
		String Qualification=request.getParameter("Qualification");
		String TI=request.getParameter("TI");
		String Department=request.getParameter("Department");
		String CN=request.getParameter("CN");
		String CA=request.getParameter("CA");
		String PA=request.getParameter("PA");
		
		System.out.println("firstname"+fname);
		System.out.println("last name"+lname);
		System.out.println("email"+email);
		System.out.println("number"+number);
		System.out.println("gender"+gender);
		System.out.println("date"+date);
		System.out.println("mobile==================="+mobile);
		System.out.println("city====================="+city);
		System.out.println("email"+email);
		System.out.println("Qualification============"+Qualification);
		System.out.println("TI"+TI);
		System.out.println("CN"+CN);
		System.out.println("CA======================="+CA);
		System.out.println("PA"+PA);
		UserDetails u=new UserDetails();
		u.setFname(fname);
		u.setLname(lname);
		u.setEmail(email);
		u.setNumber(number);
		u.setGender(gender);
		u.setDate(date);
		u.setMobile(mobile);
		u.setCity(city);
		u.setQualification(Qualification);
		u.setTI(TI);
		u.setDepartment(Department);
		u.setCN(CN);
		u.setCA(CA);
		u.setPA(PA);
		
		System.out.println(u.getFname());
		System.out.println(u.getPA());
		int i=DBConnnection.profiledataupdate(id,u);
		
		if(i!=0)
		{
			
			System.out.println("successfully!!!");
			response.sendRedirect("studentprofile2.jsp");
			
		}
		else
		{
			System.out.println("Failed...");
			
		}	
		
	}

}
