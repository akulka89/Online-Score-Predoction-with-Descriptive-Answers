package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.DAOConnection.UserSingupConnection;
import com.model.UserRegisterModel;
import com.mysql.cj.jdbc.Blob;

import utility.SendMailBySite;


@WebServlet("/UserSingUp")
@MultipartConfig(fileSizeThreshold=1024*1024,maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)

public class UserSingUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String number=request.getParameter("number");
		String gender=request.getParameter("gender");
		String date=request.getParameter("Date");
	
		InputStream inputStream = null;
		
		// obtains the upload file part in this multipart request
        Part filePart = request.getPart("profile");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
		
		
		
		
		
		UserRegisterModel obj=new UserRegisterModel();
		obj.setImage(inputStream);
		obj.setFname(fname);
		obj.setLname(lname);
		obj.setEmail(email);
		obj.setPassword(password);
		obj.setNumber(number);
		obj.setGender(gender);
		obj.setDate(date);
		
		
		
		int flage2=UserSingupConnection.emailcheck(email);
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
		
		response.sendRedirect("verify.jsp");
		
		}		
		
	}

}
