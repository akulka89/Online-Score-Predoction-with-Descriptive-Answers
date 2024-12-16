<%@page import="java.util.Locale.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.DAOConnection.DBConnnection"%>
	<!DOCTYPE html>
	<html lang="zxx" class="no-js">
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
				          <li><a href="index.html">Home</a></li>
				          <li><a href="studentwelcome.jsp">Back</a></li>
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
			</header><!-- #header -->
			
<%

int id=(Integer)session.getAttribute("id");
//int tid=(int)session.getAttribute("tid");

ArrayList<ArrayList> list=DBConnnection.gettestdata(id);
%>	
			<br><br><br><br><br>
			
			
		  <table id="example" class="display" style="width:88%; margin-left: 80px;     background-color: black;color: snow; font-family: serif; font-size: 17px;">
        <thead style="color: black; font-family: serif; font-size: 18px;">
            <tr style="text-align: center;">
                             <th>Id</th>
							<th>Test Name</th>
							<th>Test Timing</th>
							<th>Test Date</th>
							<th>Test Score</th>
							<th>View Graph</th>
							<!-- <th>View Paper</th> -->
            </tr>
        </thead>
        <tbody>
            <tr style="background-color: slategray;">
            
            <%	
                      int tid=0;
							
						for(int i=0;i<list.size();i++)
                         {
	 
						for(int j=0;j<list.get(i).size();j++)
						{
							try
							{
							 tid=Integer.parseInt(list.get(i).get(j).toString());
							 System.out.println("dashboard jsp tid==="+tid);
							}
							catch(NumberFormatException e)
							{
								e.printStackTrace();
								
							}
							
						 %>	
						        <td align="center"><span><%=list.get(i).get(j)%></span></td>
					
					               
                  <%
					 }
						
					%>
					
					
					
						<%-- <form action="piechart2.jsp">
					<td align="center">
					<button type="submit" name="t_score" value="<%=tid%>">View Graph</button>
					<!-- <input type="submit" name="View Graph" value="View Graph"> --></td>
                    </form> --%>
					
					
				 <!-- correct===	<form action="Graphchart.jsp">  
				 <button type="submit" name="ViewGraph" value="<%-- <%=list.get(i).get(0)%> --%>">View Graph</button> --%>
					<button type="submit" name="t_score" value="<%-- <%=tid%> --%>">View Graph</button>
					
                    </form> -->
				
				<form action="piechart2.jsp">
				
					<td align="center">
				<%-- 	<button type="submit" name="ViewGraph" value="<%=list.get(i).get(0)%>">View Graph</button> --%>
					<button type="submit" name="t_score" value="<%=tid%>">View Graph</button>
					<!-- <input type="submit" name="View Graph" value="View Graph"> --></td>
                    </form> 
                <%--     <form action="ViewTestContoller" method="post"> 
                    <td align="center">
                    <Button type="submit" name="tid" value=<%=list.get(i).get(0)%>>View Test</Button></td>
                    </form> --%>
					 </tr>
					<%  	
						
                         }
					
				  %>
            
    
    
    <tr>
            
           
            
        </tbody>
        <tfoot>
           
        </tfoot>
    </table>
		 
		
								
				
		
			

			
						

			
			<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="js/popper.min.js"></script>
			<script src="js/vendor/bootstrap.min.js"></script>			
			<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA"></script>		
 			<script src="js/jquery-ui.js"></script>					
  			<script src="js/easing.min.js"></script>			
			<script src="js/hoverIntent.js"></script>
			<script src="js/superfish.min.js"></script>	
			<script src="js/jquery.ajaxchimp.min.js"></script>
			<script src="js/jquery.magnific-popup.min.js"></script>						
			<script src="js/jquery.nice-select.min.js"></script>					
			<script src="js/owl.carousel.min.js"></script>							
			<script src="js/mail-script.js"></script>	
			<script src="js/main.js"></script>	
		</body>
	</html>