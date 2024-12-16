<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@page import="com.DAOConnection.DBConnnection"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>   
<%@page import="java.util.List"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.awt.image.BufferedImage"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- meta character set -->
		<meta charset="UTF-8">
		<!-- Site Title -->
		<title>Exam-Tech</title>

		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/jquery-ui.css">				
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/owl.carousel.css">				
			<link rel="stylesheet" href="css/main.css">
			
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="https://code.jquery.com/jquery-3.3.1.js">
<link rel="stylesheet"
href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.csss">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.19/css/dataTables.jqueryui.min.css">
<script
src="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"></script>
<script
src="https://cdn.datatables.net/1.10.19/css/dataTables.jqueryui.min.css"></script>
<link rel="stylesheet"
href="https://cdn.datatables.net/1.10.19/js/dataTables.jqueryui.min.js">
<link rel="stylesheet"
href="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js">
<script
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" type="text/css" href="style4.css">

<script type="text/javascript">

$(document).ready(function() {
    $('#example').DataTable();
} );
</script>
<style type="text/css">

body {
  margin: 2rem;
}

th {
  background-color: white;
}
tr:nth-child(odd) {
  background-color: grey;
}
th, td {
  padding: 0.5rem;
}
td:hover {
  background-color:cadetblue;
}

.paginate_button {
  border-radius: 0 !important;
}
</style>

<style>
.button {

    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

.button2 {background-color: #008CBA;} /* Blue */
.button3 {background-color: #f44336;} /* Red */ 
.button4 {background-color: #e7e7e7; color: black;} /* Gray */ 
.button5 {background-color: #555555;} /* Black */
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href="https://code.jquery.com/jquery-3.3.1.js">
<link rel="stylesheet"
href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.csss">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.19/css/dataTables.jqueryui.min.css">
<script
src="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"></script>
<script
src="https://cdn.datatables.net/1.10.19/css/dataTables.jqueryui.min.css"></script>
<link rel="stylesheet"
href="https://cdn.datatables.net/1.10.19/js/dataTables.jqueryui.min.js">
<link rel="stylesheet"
href="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js">
<script
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/dataTables.jqueryui.min.js"></script>
<link rel="stylesheet" type="text/css" href="style4.css">

<script type="text/javascript">

$(document).ready(function() {
    $('#example').DataTable();
} );
</script>
<style type="text/css">

body {
  margin: 2rem;
}

th {
  background-color: white;
}
tr:nth-child(odd) {
  background-color: grey;
}
th, td {
  padding: 0.5rem;
}
td:hover {
  background-color: lightsalmon;
}

.paginate_button {
  border-radius: 0 !important;
}
</style>

<style>
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

.button2 {background-color: #008CBA;} /* Blue */
.button3 {background-color: #f44336;} /* Red */ 
.button4 {background-color: #e7e7e7; color: black;} /* Gray */ 
.button5 {background-color: #555555;} /* Black */
</style>

</head>
<body style="    background-color: darkslategrey;">	
			<header id="header">
				<div class="header-top">
					<div class="container">
			  		<div class="row align-items-center">
			  			<div class="col-lg-6 col-sm-6 col-6 header-top-left">
			  				<ul>
			  					
			  				</ul>			
			  			</div>
			  			<div class="col-lg-6 col-sm-6 col-6 header-top-right">
							<div class="header-social">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-dribbble"></i></a>
								<a href="#"><i class="fa fa-behance"></i></a>
							</div>
			  			</div>
			  		</div>			  					
					</div>
				</div>
				<div class="container main-menu">
					<div class="row align-items-center justify-content-between d-flex">
				      <div id="logo">
				        <a href="index.html"><img src="img/logo.png" alt="" title="" /></a>
				      </div>
				      <nav id="nav-menu-container">
				        <ul class="nav-menu">
				          <li><a href="teacherwelcome.jsp">Home</a></li>
				          <li><a href="teacherwelcome.jsp">Back</a></li>
				          <li><a href="Logout_controller">LogOut</a></li>
				          <!-- <li class="#"><a href="">Blog</a>
				            <ul>
				              <li><a href="#">Blog Home</a></li>
				              <li><a href="#">Blog Single</a></li>
				            </ul>
				          </li> -->	
				          <!-- <li class="#"><a href="">Pages</a>
				            <ul>
				            	  <li><a href="#">Elements</a></li>
						          <li class="#"><a href="">Level 2 </a>
						            <ul>
						              <li><a href="#">Item One</a></li>
						              <li><a href="#">Item Two</a></li>
						            </ul>
						          </li>					                		
				            </ul>
				          </li>					          					          		          
				          <li><a href="contact.html">Contact</a></li> -->
				        </ul>
				      </nav><!-- #nav-menu-container -->					      		  
					</div>
				</div>
			</header>
			<br><br><br><br><br>
 

<%

 int tid=(int)session.getAttribute("deletetestid"); 
 
ArrayList<ArrayList> list=DBConnnection.gettestquestion(tid);

%>

<form action="DeleteQuestionController" method="post">
<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                            <th>QuestionNo</th>
							<th>Question</th>
							<th>Answer</th>
							<th>DeleteQuestion</th>
							
            </tr>
        </thead>
        
        <tbody style="font-family: serif; font-size: 17px; color: black;">
           
            
            <%	
							
						for(int i=0;i<list.size();i++)
                         {
	                       %>
	                        <tr>
							<td><%=i+1%></td>
							<% 
							for(int j=1;j<list.get(i).size();j++)
							{
							
							%>
								
							     
								<td><%=list.get(i).get(j)%><input type="hidden" name="qno"  value="<%=list.get(i).get(0)%>"></td>
									
								
						<% 		
							}
							
						 %>	
						<td><button name="bt" value="<%=list.get(i).get(0)%>">DeleteQuestion</button></td> 
						                   
                       </tr>
            
                  <%
					 }	
					
				  %>
           
            
        </tbody>
        <tfoot>
           
        </tfoot>
    </table>
    </form>
</body>
</html>