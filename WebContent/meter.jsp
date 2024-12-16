<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.DAOConnection.DBConnnection"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>      
    <meta charset="utf-8" />   
   <style>  
   meter {  
     width: 200px;  
     height: 25px;  
   }  
   </style>     
</head> 

<body>  
<%
  Double percentage=DBConnnection.profilePercentage(6);
Integer per =percentage.intValue();
  %>    
  
   <form action="MeterConttroller" method="post">
   <br/><br/>  
   <b>Profile Complited=<%=per%>%</b><br>  
   <meter  min="0" max="100" value="<%=percentage%>" ></meter>  
    </form> 
  
</body>  
</html>