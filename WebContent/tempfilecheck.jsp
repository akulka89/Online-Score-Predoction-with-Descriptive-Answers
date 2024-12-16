<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
File file;
int maxSize=5000*20;
int maxFactSize=5000*20;

String path="E:/vaibhavprojects/scoreprediction/WebContent/profilepic";
%>

<% 
String type=request.getContentType();
out.println(type);

if(type.indexOf("multipart/form-data")>=0)
{
out.print("it multipart data");

DiskFileItemFactory disFact=new DiskFileItemFactory();
disFact.setSizeThreshold(maxFactSize);
disFact.setRepository(new File("C:\\Temp"));

ServletFileUpload upload=new ServletFileUpload(disFact);
upload.setSizeMax(maxSize);

List lis=upload.parseRequest(request);

Iterator itr=lis.iterator();


while(itr.hasNext())
{
FileItem item=(FileItem)itr.next();



if(!item.isFormField())
{
	String str;
str=item.getName();
str="akpid"+(str.substring(str.indexOf(".")));
out.print(str);

file=new File(path,str);
item.write(file);

}
}

}

String uname=request.getParameter("uname");
int age=Integer.parseInt(request.getParameter("age"));
String cname=request.getParameter("cname");
String dname=request.getParameter("dname");
String qualification=request.getParameter("qualification");
String tintrest=request.getParameter("tintrest");
String location=request.getParameter("location");
//String profile=request.getParameter("profile");
String str = null;

out.print(uname);
out.print(age);
out.print(cname);
out.print(dname);
out.print(qualification);
out.print(tintrest);
out.print(location);


%>


</body>
</html>