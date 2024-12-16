package com.controller;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.DAOConnection.DBConnnection;
import com.DAOConnection.GetConnection;
import com.model.UserRegisterModel;

@WebServlet("/UploadProfile")
@MultipartConfig(fileSizeThreshold=1024*1024,maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)

public class UploadProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=1;
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
		
		
		DBConnnection.uploadImage(obj, id);
		response.sendRedirect("studentprofile2.jsp");
		
		
		
		/*int id=1;
		if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        //item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                       InputStream is= item.getInputStream();
                       
                       GetConnection.uploadImage(is, id);
                    }
                }
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
        }else{
            request.setAttribute("message",
                                 "Sorry this Servlet only handles file upload request");
        }
        request.getRequestDispatcher("test.jsp").forward(request, response);
*/    }
  	
	


    }


