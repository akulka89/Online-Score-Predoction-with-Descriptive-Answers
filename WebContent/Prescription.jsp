<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.awt.image.BufferedImage"%>
<%@ page import="javax.imageio.ImageIO"%>
<%@ page import="java.io.*"%>
<%@ page import="javax.servlet.http.HttpSession, javax.servlet.ServletException, javax.servlet.annotation.WebServlet, javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse"%>



<!DOCTYPE html>
<html lang="zxx">

<head>
	<title>Disease Detection System</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<!--<meta name="keywords" content="Be Clinic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />-->
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!--// Meta tag Keywords -->

	<!-- Custom-Files -->
	<link rel="stylesheet" href="css/bootstrap1.css">
	<!-- Bootstrap-Core-CSS -->
	<link href="css/css_slider1.css" type="text/css" rel="stylesheet" media="all">
	<!-- banner slider -->
	<link rel="stylesheet" href="css/style1.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link href="css/font-awesome.min1.css" rel="stylesheet">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //Custom-Files --> 

	<!-- Web-Fonts -->
	<link href="//fonts.googleapis.com/css?family=Quicksand:300,400,500,700" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Mukta:200,300,400,500,600,700,800&amp;subset=devanagari,latin-ext" rel="stylesheet">
	<!-- //Web-Fonts -->
</head>
<%
 

 
int uid=1;
System.out.println("UserId : " +uid);
/* Register u = DataAccessLayer.getDetails1(uid); */

%> 
<body>
	<!-- main -->
	<div id="home">
		<!-- top header -->
		<header>
			<div class="top-bar py-3">
				<div class="container">
					<div class="row">
						<div class="col-xl-5 col-lg-6 col-md-8 top-social-agile text-lg-left text-center">
							
						</div>
						<div class="col-xl-7 col-lg-6 col-md-4 top-social-agile text-md-right text-center mt-md-0 mt-2">
							<div class="row">
								<div class="offset-xl-6 offset-lg-4">
								</div>
								<div class="col-xl-3 col-lg-4 col-6 top-w3layouts p-md-0 text-right">
									<!-- login -->
									<a href="login1.jsp" class="login-button-2 text-uppercase text-bl">
<!-- 										<span class="fa fa-sign-in mr-2"></span>Login</a>
 -->									<!-- //login -->
								</div>
								<div class="col-xl-3 col-lg-4 col-6 header-w3layouts text-md-right text-left">
									<!-- register -->
									<a href="register1.jsp" class="login-button-2 text-uppercase text-bl">
<!-- 										<span class="fa fa-pencil-square-o mr-2"></span>Register</a>
 -->									<!-- //register -->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</header>
		<!-- //top header -->
	

		<!-- second header -->
		<div class="main-top">
			<div class="container">
				<div class="header d-md-flex justify-content-between align-items-center py-3">
					<!-- logo -->
					<div id="logo">
						<h1>
							<a href="index2.jsp">
								<span class="fa fa-user-md mr-2"></span>
								<span class="logo-sp"></span>Breast Cancer Detection 
							</a>
						</h1>
					</div>
					<!-- //logo -->
					<!-- nav -->
					<div class="nav_w3ls">
						<nav>
							<label for="drop" class="toggle"></label>
							<input type="checkbox" id="drop" />
							<ul class="menu">
								<li><a href="index2.jsp"  class="active"></a></li>
<!-- 								<li class="mx-lg-4 mx-md-3 my-md-0 my-2"><a href="uploadImage.jsp">Upload Image</a></li>
 -->						      
								<li class="mx-lg-4 mx-md-3 my-md-0 my-2">
									<!-- First Tier Drop Down -->
									<label for="drop-2" class="toggle toogle-2"><span class="fa fa-angle-down" aria-hidden="true"></span>
									</label>
									<a href="#"><span class="fa fa-angle-down" aria-hidden="true"></span></a>
									<input type="checkbox" id="drop-2" />
									<!-- <ul>
										<li><a href="#symptoms.jsp" class="drop-text"></a></li>
										<li><a href="#precautionMeasure.jsp" class="drop-text"> </a></li>
										<li><a href="#remidies.jsp" class="drop-text"></a></li>
										<li><a href="#report.jsp" class="drop-text"></a></li>
                                    </ul> -->
								</li>
<!-- 								<li class="mx-lg-4 mx-md-3 my-md-0 my-2"><a href="contact1.jsp"> </a></li>
 -->							</ul>
						</nav>
					</div>
					<!-- //nav -->
				</div>
			</div>
		</div>
		<!-- //second header -->

		<!-- banner -->
		<div class="banner_w3lspvt">
			<div class="csslider infinity" id="slider1">
				<input type="radio" name="slides" checked="checked" id="slides_1" />
				<input type="radio" name="slides" id="slides_2" />
				<input type="radio" name="slides" id="slides_3" />
				<ul class="banner_slide_bg">
					<li class="banner-top1">
						<div class="container">
							<div class="banner-info_agile_w3ls text-center mx-auto">
								<h3 class="text-wh font-weight-bold"><h1 align="center" style="margin-top: -30%;
    margin-left: 230px;"><%-- <%=u.getFname()%>  --%>Analysis Report</h1></h3>
								<!-- <a href="about1.jsp" class="btn button-w3ls mt-5">Read More</a> -->
							
	<form action="ReportDownload" method="post">
				<table border="2"style="margin-top: 20%; width: 100%; border-spacing: 10px 20px;background-color: white;"
					border="0" cellspacing="5" height="2">



					<tr style="font-size: 20px">
						<td><b>Disease Name:</b></td>
						<td><%="A"%> </td> 
					</tr>

					<tr style="font-size: 20px">
						<td><b>Symptom:</b></td>
						<td><%="ABC"%></td>
					</tr>

					<tr style="font-size: 20px">
						<td><b>Remedies:</b></td>
						<td><%="PQR"%></td>
					</tr>

				</table>
				<input type="submit" class="btn button-w3ls mt-5" value="Generate And Download Report"  >
				</td>

					
			</form>
							</div>
						</div>
					</li>
				</ul>
				<div class="navigation">
					
				</div>
			</div>
		</div>
		<!-- //banner -->
	</div>
	<!-- //main -->

	<!-- copyright -->
	<div class="copy-w3pvt">
		<div class="container py-3">
			<div class="row">
				<div class="col-lg-7 w3ls_footer_grid1_left text-lg-left text-center">
					<p>
						<a href="http://w3layouts.com/"></a>
					</p>
				</div>
				<div class="col-lg-5 w3ls_footer_grid_left1_pos text-lg-right text-center mt-lg-0 mt-2">
				</div>
			</div>
		</div>
	</div>
	<!-- //copyright -->
	<!-- //footer bottom -->
	<!-- move top icon -->
	<a href="#home" class="move-top text-center"></a>
	<!-- //move top icon -->

</body>

</html>