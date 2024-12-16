<%@page import="com.DAOConnection.DBConnnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.algorithm.TfidfForStudent"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>    
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


</head>
<body style="background-color: skyblue">


<%


System.out.println("in jsp");

Map<Integer, String> answerlist=(Map<Integer, String>) session.getAttribute("answerlist");
 

String testdate=java.time.LocalDate.now().toString();
String testtime=java.time.LocalTime.now().toString();  
String testname=(String)session.getAttribute("tname1");
System.out.println("tname="+testname);
int id=(Integer)session.getAttribute("id");

List<Integer> marklist=TfidfForStudent.getans(answerlist);
int totalmarks=0;

for(int i=0;i<marklist.size();i++){
	totalmarks=totalmarks+marklist.get(i);
	
	
}
	
 /* marklist.stream().mapToInt(Integer::intValue).sum(); */
 int tid1=DBConnnection.gettestId(testname);
 
 

DBConnnection.addtest(tid1,id,testname,testtime,testdate,totalmarks); 

int tid=DBConnnection.gettid(); 
DBConnnection.addanswer(tid,answerlist,marklist); 


//DBConnnection.addanswer(id,testname,testtime,testdate,marks); 


%>


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
				          <li><a href="studentwelcome.jsp">Home</a></li>
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
	
        <br><br><br><br><br><br><br>
        <h1>Thank you!!!! </h1>
        <h3>Your result is Display in your DashBord Section!!</h3>


</body>

</html>