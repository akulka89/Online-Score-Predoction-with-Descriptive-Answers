package com.controller;
import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;




/**
 * Servlet implementation class CreateProfile
 */
@WebServlet("/CreateProfile")
@MultipartConfig(fileSizeThreshold=1024*1024,maxFileSize=1024*1024*5,maxRequestSize=1024*1024*5*5)

public class CreateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

		response.setContentType("text/html;charset=UTF-8");
		
		Part part =request.getPart("picture");
		
		
		
		
		
	String savePath ="E:\\vaibhavprojects\\scoreprediction2\\WebContent\\img\\profile";
	
	
	 File fileSaveDir = new File(savePath );
	 
     part.write(savePath +File.separator);
     
     System.out.println("File Dir"+fileSaveDir);
        
        
        /*HttpSession session = request.getSession();
		session.getAttribute("uid");*/
		
        
        
     
      
	}

		
		
		
		/*String uname=request.getParameter("uname");
		int age=Integer.parseInt(request.getParameter("age"));
		String cname=request.getParameter("cname");
		String dname=request.getParameter("dname");
		String qualification=request.getParameter("qualification");
		String tintrest=request.getParameter("tintrest");
		String location=request.getParameter("location");
		//String profile=request.getParameter("profile");
		String str = "vaibhav";
		
         
	
		//String profile=request.getParameter("profile");
		
		//file uploading code
		
		File file;
		int maxSize=5000*200;
		int maxFactSize=5000*200;

		String path="E:/vaibhavprojects/scoreprediction/WebContent/profilepic";
		
		String type=request.getContentType();
		

		if(type.indexOf("multipart/form-data")>=0)
		{
		

		DiskFileItemFactory disFact=new DiskFileItemFactory();
		disFact.setSizeThreshold(maxFactSize);
		disFact.setRepository(new File("C:\\Temp"));

		ServletFileUpload upload=new ServletFileUpload(disFact);
		upload.setSizeMax(maxSize);

		List lis = null;
		try {
			lis = upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Iterator itr=lis.iterator(); 


		while(itr.hasNext())
		{
		FileItem item=(FileItem)itr.next();



		if(!item.isFormField())
		{
			
		str=item.getName();
		str="akpid"+(str.substring(str.indexOf(".")));
		

		file=new File(path,str);
		
			item.write(file);
		

		}
		}

		}
		
		//
		
		
		
		    System.out.println(uname);
	        System.out.println(age);
	        System.out.println(cname);
	        System.out.println(dname);
	        System.out.println(qualification);
	        System.out.println(tintrest);
	       
	        System.out.println(str);
	        System.out.println(location);
	        
	        
		String ExamId=UserIdGenrate.ExamIdCreate(uname);
		
		
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
        
        
        */
		
		
		
		
		
		
		
		
		
		
	

}
