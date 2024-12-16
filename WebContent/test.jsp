<%@page import="com.DAOConnection.GetConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="com.DAOConnection.*"%>
<%@page import="com.model.UserRegisterModel"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="UploadProfile" method="post"
					enctype="multipart/form-data">
					<input type="file" name="file" /> <input type="submit"
						value="upload" />
				</form>

<%
int id=5;
                        UserRegisterModel obj= DBConnnection.getImg(id);
						
						
						if(obj.getBase64Image()!=null)
						{
						%>
						<img src="data:image/jpg;base64,<%=obj.getBase64Image()%>" width="240" height="300"/>
                      
						   <% }
						else
						{%>
						<img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-circle img-thumbnail" alt="avatar" style="margin-left: -30px;">
     
						 <% }%>
                        
</body>
</html>