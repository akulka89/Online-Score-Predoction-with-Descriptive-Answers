<!DOCTYPE html>
<%@page import="com.itextpdf.text.List"%>
<%@page import="com.controller.ClobSelectMySQL"%>
<%@page import="com.DAOConnection.DBConnnection"%>
<%@page import="java.util.ArrayList"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>Ecommerce Platform Admin</title>
<link rel="icon" type="image/png" href="jsp/images/techhub.png" />

<!-- Bootstrap CSS CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Our Custom CSS -->
<link href="css2/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="css2/style4.css" rel="stylesheet" type="text/css" media="all"/>

</head>
<body style="background-color: skyblue;">

<%
ArrayList<String> heading=DBConnnection.getheading();


%>
<br><br>
    <div style="background-color: black; width: 1150px; height: 80px; margin-left: 100px; ">
    <br>
    <a style="color: snow;    margin-left: 1021px; padding: 29px; font-family: serif; font-size: 16px;" href="studentwelcome.jsp">BACK</a>
   
    </div>
	<div class="wrapper" style="margin-top: 20px; margin-left: 100px;">
		<!-- Sidebar Holder -->
		<nav id="sidebar">
			<div class="sidebar-header">
				<h3>Study Portal</h3>
				<strong></strong>
			</div>

           <% 
               for(int i=0;i<heading.size();i++)
               {
               
            	   ArrayList<String> Chiledheading=DBConnnection.getchiledheading(i+1);
               
            	   %>

			<!--  Start of Menus -->
			
			<ul class="list-unstyled components">

				<!--  Enquiry Master -->

               

				<li class="active"><a href="#<%=i%>"data-toggle="collapse" aria-expanded="false"> 
				<i class="glyphicon glyphicon-briefcase"> </i> <%=heading.get(i)%>
				</a> <!--  Sub Menus for Enquiry Master -->
					<ul class="collapse list-unstyled" id="<%=i%>">
						
					<% 
					
					
						for(int j=0;j<Chiledheading.size();j++)
						{	
							%>
						
						<li><ul>
								<li><a href="EcommercePlatformMaster.jsp?cid=<%=j%>"><%=Chiledheading.get(j)%></a></li>
							</ul></li>

						<!-- <li><ul>
								<li><a href="#">Platform</a></li>
							</ul></li>
							
							<li><ul>
								<li><a href="#">Stand Alon</a></li>
							</ul></li>
							
							
							<li><ul>
								<li><a href="viewamazone.jsp">JVM</a></li>
							</ul></li> -->
							<% }%>
							
					</ul> <!--  End of Enquiry Master --></li>
                 <% }%>
                 
               
              <%--  <% for(int j=0;j<3;j++)
               {
               %>
				<li><a href="#<%=j%>" data-toggle="collapse"aria-expanded="false"> <i class="glyphicon glyphicon-briefcase"></i>Select Flipkart Master
				</a>
					<ul class="collapse list-unstyled" id="<%=j%>">

						<li><ul>
								<li><a href="#">Add Details</a></li>
							</ul></li>
						<li><ul>
								<li><a href="#">Update Details</a></li>
							</ul></li>
						<li><ul>
								<li><a href="#">Delete Details</a></li>
							</ul></li>

						<li><ul>
								<li><a href="#">View Details</a></li>
							</ul></li>

						</ul></li>
				<% 
               }
				%>		
 --%>							
				<!-- <li class="active"><a href="#Deals"
					data-toggle="collapse" aria-expanded="false"> <i
						class="glyphicon glyphicon-briefcase"> </i> Add Today Deals
				</a>  Sub Menus for Enquiry Master
					<ul class="collapse list-unstyled" id="Deals">
						<li><ul>
								<li><a href="#">Add Deals</a></li>
							</ul></li>

						<li><ul>
								<li><a href="#">Update Deals</a></li>
							</ul></li>
							
							<li><ul>
								<li><a href="#">Delete Deals</a></li>
							</ul></li>
							
							
							<li><ul>
								<li><a href="#">View Deals</a></li>
							</ul></li>
							
							
					</ul>  End of Enquiry Master</li> -->
						
                        </ul>
                        </li>
			</ul>
		</nav>

		<!-- Page Content Holder -->

		<div id="content">

			<nav class="navbar navbar-default">

				<div class="navbar-header">
					<button type="button" id="sidebarCollapse"
						class="btn btn-info navbar-btn">
						<i class="glyphicon glyphicon-align-left"></i>

					</button>
			</nav>

		</div>
		<div style="background-color:white;height: 2000px;width: 1240px; margin-left: -10px;">
		<% 
		
		int id=0;
		 try{
			 id=Integer.parseInt(request.getParameter("cid"));		     
	    	}catch(NumberFormatException ex){ 	
	    		
	    	}
       	  id=id+1;
       	  System.out.println("content id===="+id);
	       ArrayList<String> ab=ClobSelectMySQL.getCLOB(id);
		%>
		<h3 style="background-color: #0080805e;text-align: center;height: 39px; font-family: serif;color: black;"><span style="margin-top: 7px;">Introduction To Java</span></h3>
		<br>
		
		<%for(String str:ab)
		{	
			%>
		
		<p style="color: #0c0c0c; text-align: left; font-family: serif;font-size: 18px;"><%=str%></p>
		<% } %>
		<br>
		<h3 style="background-color: #0080805e;text-align: center;height: 39px; font-family: serif;color: black;"><span style="margin-top: 7px;">Example:</span></h3>
		<br>
		<p style="color: #0c0c0c; text-align: center; font-family: serif;font-size: 18px;">No Found</p>
		<br>
		<h3 style="background-color: #0080805e;text-align: center;height: 39px; font-family: serif;color: black;"><span style="margin-top: 7px;">Related Video:</span></h3>
		<br>
		<p style="color: #0c0c0c; text-align: center; font-family: serif;font-size: 18px;">No Found</p>
		<br>
		
		
		
		
		</div>
		

		<!-- <div class="button">
			<button type="button" class="btn btn-info active"
				style="float: right;">Log Out</button>
		</div>
 -->
		<!-- logout button-->

		<!--end-->

		<!-- jQuery CDN -->
		<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
		<!-- Bootstrap Js CDN -->
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

		<script type="text/javascript">
			$(document).ready(function() {
				$('#sidebarCollapse').on('click', function() {
					$('#sidebar').toggleClass('active');
				});
			});
		</script>
</body>
</html>