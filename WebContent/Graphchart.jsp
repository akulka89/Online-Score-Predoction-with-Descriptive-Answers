<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.DAOConnection.DBConnnection"%>
<%@page import="java.util.ArrayList.*"%>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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



<% 

int id=Integer.parseInt(request.getParameter("ViewGraph"));

ArrayList<Integer> markslist=DBConnnection.getchartcontent(id);
int total=0;
for(int i=0;i<markslist.size();i++)
{
	total=total+markslist.get(i);
	
	
}

if(total!=0)
{
//System.out.println("total=="+total);

double percentage1=(total*100)/50;
//System.out.println("percentage=="+percentage1);
double percentage2=100-percentage1;
double totalper=0.0;

//this is for 1 marks

int avg1=markslist.get(0);

double avgp1=(percentage1*avg1)/total;
totalper=totalper+avgp1;
		

//this is for 2 marks
int avg2=markslist.get(1);
int a2=(markslist.get(1))/2;
double avgp2=(percentage1*avg2)/total;

totalper=totalper+avgp2;
		
//this is for 3 marks
int avg3=markslist.get(2);
int a3=markslist.get(2)/3;
double avgp3=(percentage1*avg3)/total;
totalper=totalper+avgp3;


//this is for 4 marks		
int avg4=markslist.get(3);
int a4=markslist.get(3)/4;		
double avgp4=(percentage1*avg4)/total;		
totalper=totalper+avgp4;


//this is for 5 marks		
int avg5=markslist.get(4);
int a5=markslist.get(4)/5;
double avgp5=(percentage1*avg5)/total;		

totalper=totalper+avgp5;

//System.out.println("total percentage=="+totalper);

%>



<script>


window.onload = function() {

var chart = new CanvasJS.Chart("chartContainer", {
	theme: "light2", // "light1", "light2", "dark1", "dark2"
	exportEnabled: true,
	animationEnabled: true,
	title: {
		text: ""
	},
	data: [{
		type: "pie",
		startAngle: 25,
		toolTipContent: "<b>{label}</b>: {y}%",
		showInLegend: "true",
		legendText: "{label}",
		indexLabelFontSize: 16,
		indexLabel: "{label} - ({y})%",
		dataPoints: [
			{ y: <%=percentage2%>, label: "wrong answer %"+<%=percentage2%> },
			{ y: <%=avgp1%>, label: "1 Marks in "+ <%=avg1%> +" Question="+<%=avg1%>},
			{ y: <%=avgp2%>, label: "2 Marks in "+<%=a2%>+" Question="+<%=avg2%>},
			{ y: <%=avgp3%>, label: "3 Marks in "+<%=a3%>+ " Question="+<%=avg3%> },
			{ y: <%=avgp4%>, label: "4 Marks in "+<%=a4%>+" Question="+<%=avg4%> },
			{ y: <%=avgp5%>, label: "5 Marks in "+<%=a5%>+" Question="+<%=avg5%> },

		]
	}]
});
chart.render();

}
</script>
<% }
else
{
%>

<script>


window.onload = function() {

var chart = new CanvasJS.Chart("chartContainer", {
	theme: "light2", // "light1", "light2", "dark1", "dark2"
	exportEnabled: true,
	animationEnabled: true,
	title: {
		text: ""
	},
	data: [{
		type: "pie",
		startAngle: 25,
		toolTipContent: "<b>{label}</b>: {y}%",
		showInLegend: "true",
		legendText: "{label}",
		indexLabelFontSize: 16,
		indexLabel: "{label} - ({y})%",
		dataPoints: [
			{ y: <%=100%>, label: "wrong answer %"+<%=100%> },

		]
	}]
});
chart.render();

}
</script>




<%} %>
</head>




<body style="background-color: teal;">


		


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
				          <li><a href="studentwelcome.jsp">HOME</a></li>
				          <li><a href="dashbord.jsp">BACK</a></li>
				          <li><a href="Logout_controller">LOGOUT</a></li>
				          
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
			
			<br><br><br><br><br><br><br>
			<div>
			<h2><span style="margin-left: 469px; background-color:#00000063; color: snow; font-family: sans-serif; font-size: 32px;">TEST SCORE IN GRAPH-CHART</span></h2>
			</div>
			<br><br><br>
			<div id="chartContainer" style="color:black; height: 500px; width: 1133px; margin-left: 106px; margin-top: -46px;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
		
		
			 
		 
			 
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