<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script> 
<!-- 
<% 
String clock = request.getParameter( "clock" ); 
if( clock == null ) clock = "180"; 
%> 
var timeout = <%=clock%>; 
function timer() 
{ 
if( --timeout > 0 ) 
{ 
document.forma.clock.value = timeout; 
window.setTimeout( "timer()", 1000 );
<% 
int timer1=0;%>

} 
else 
{

document.forma.clock.value = "Time over"; 
///disable submit-button etc 
} 
} 
//--> 
</script> 

</head>


<body>
<form action="<%=request.getRequestURL()%>" name="forma"> 
Seconds remaining: <input type="text" name="clock" value="<%=clock%>" style="border:0px solid white"> 


<% String str=request.getParameter("clock");
 System.out.println(timer1);

  
 
%>
... 
</form> 
<script> 
<!-- 
timer(); 
//--> 
</script>

<h1>hiiiiiiiiiiiiiii</h1>
<input type="text" name="va" value="vaibhav">
</body>
</html>