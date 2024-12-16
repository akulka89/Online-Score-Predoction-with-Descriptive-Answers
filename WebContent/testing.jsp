<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.io.PrintWriter.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
int flage=1;
Thread thread=new Thread();

for(int i=1;i>=0;i--)
{
	
	for(int j=60;j>=0;j--)
	{	
		%>
		<h1>hiiiiiiiiiiiiii</h1>

		<% 		

		
		try {
			
		Thread.sleep(1000);
		//System.out.println(j);
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	}
	
	if(i==0)
	{		
    flage=0;
    
    response.sendRedirect("welcome.jsp");
	}
	
}


%>
 --%>
 <% 
	
	
 int count=50;
 
 if(count>0)
	{
	
/*  for(int i=60;i>0;i++)
{ 
	out.println("<h1>"+i+"</h1>");		
	response.setHeader("Refresh", "1");
}*/
out.println("<h1>"+count+"</h1>");		
	
response.setHeader("Refresh", "1");
		--count;
	}
	else
	{
		
	RequestDispatcher rs=request.getRequestDispatcher("welcome.jsp");
	rs.forward(request,response);
	}
 
 %>
</body>
</html>