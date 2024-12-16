package com.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.DAOConnection.CreateProfileDAO;
import com.algorithm.UserIdGenrate;
import com.model.CreateProfileModel;
import com.sun.java.util.*;

@WebServlet("/CheckProfile")
@MultipartConfig(fileSizeThreshold=1024*1024,maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)

public class CheckProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		response.setContentType("text/html;charset=UTF-8");		
		Part part =request.getPart("picture");
		
		
		/*String uname=request.getParameter("uname");
		System.out.println("============="+uname);
		*/
		
		System.out.println("Part  "+part);
		
		
		
		String uname=request.getParameter("uname");
		int age=Integer.parseInt(request.getParameter("age"));
		String cname=request.getParameter("cname");
		String dname=request.getParameter("dname");
		String qualification=request.getParameter("qualification");
		String tintrest=request.getParameter("tintrest");
		String location=request.getParameter("location");
		String ExamId=UserIdGenrate.ExamIdCreate(uname);
		String str=ExamId+".jpg";
        
        CreateProfileModel objmodel=new CreateProfileModel();
		objmodel.setUname(uname);
		objmodel.setAge(age);
		objmodel.setCname(cname);
		objmodel.setDname(dname);
        objmodel.setQualification(qualification);
        objmodel.setTintrest(tintrest);
        objmodel.setLocation(location);
        objmodel.setExamID(ExamId);
        objmodel.setProfile(str);
		
        
        
        try {
			int i=CreateProfileDAO.createProfileConnection(objmodel);
			
			if(i==1)
			{
			response.sendRedirect("studentwelcome.jsp");	
			}else
			{
			response.sendRedirect("error3.jsp");	
			}
			
			
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
	
		
	String savePath ="E:\\vaibhavprojects\\scoreprediction\\scoreprediction2\\WebContent\\img\\profile";
	savePath=savePath+ExamId+".jpg";;
	System.out.println("Save Path"+savePath );
	
      File fileSaveDir = new File(savePath );
      
        part.write(savePath +File.separator);
        
        System.out.println("File Dir"+fileSaveDir);
     
        
        
        /*HttpSession session = request.getSession();
		session.getAttribute("uid");*/
		
      
        
      
        
     
   
		
		
		
	}

}
