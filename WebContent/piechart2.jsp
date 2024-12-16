<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

<%
int t=Integer.parseInt(request.getParameter("t_score"));
out.print("t_marks=="+t);
//int i=10; %>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">

google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
	//var i=2;
	 var i1=<%=t%>;
	var j1=50-<%=t %>; 

	/* 	var i1=2;
		var j1=3;
	 */	
		

   var data = google.visualization.arrayToDataTable([
    ['Task', 'Hours per Day'],
    ['Correct',     i1],
    ['Incorrect',   j1],
   
   
  ]); 
 /*  var array=google.array[];
  String key="AA";
  int val=10;
  array.add(key,val); */

  var options = {
    title: '  '
  };

  var chart = new google.visualization.PieChart(document.getElementById('piechart'));

  chart.draw(data, options);
}

</script>
</head>


<body>
<h1 align="center" style="margin-left: -123px; color: white;">Test Score</h1>
<br><br>
           <div id="piechart" style="width: 900px; height: 500px; margin-left: 180px;"></div>
</body>
</html>