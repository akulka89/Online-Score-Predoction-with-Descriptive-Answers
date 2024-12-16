<%@page import="com.DAOConnection.DBConnnection"%>
<%@page import="java.util.List"%>
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
			<link rel="stylesheet" href="css/main3.css">
		
		
<style> 
           
         
           
           .box{   
            position: absolute;
            top: 73%;
            left: 50%;
            transform: translate(-50%,-50%);
            width: 700px;
            height:600px;    
            background: #7fffd45e;
            padding: 40px;
            box-sizing: border-box;  
               
            
               
           }
           

</style>		

		 <%
response.setHeader("Pragma", "No-cache");
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setDateHeader("Expires", -1);

      if(session.getAttribute("id")==null)
      {
    	  response.sendRedirect("index.html");
    	  return;
      }
%>

		
		</head>
			
		<body>	
		
		<%
      List<String> sname=DBConnnection.getsubject();


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
				        <a href="index.html"><img src="img/logo.png" alt="" "" /></a>
				        <h1 style="margin-left: 300px; margin-top: -30px;color: lightsalmon;" >Welcome To Exam Portal</h1>
				      </div>
				      <nav id="nav-menu-container">
				        <ul class="nav-menu">
				          <li><a href="index.html">Home</a></li>
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
			
			<!-- start banner Area -->
			<section class="banner-area relative">
				<div class="overlay overlay-bg"></div>				
				<div class="container">
					<div class="row fullscreen align-items-center justify-content-between">
						<div class="col-lg-6 col-md-6 banner-left">
						
				<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
				<br><br><br><br>
				<div style="margin-top:-100px; margin-left: 300px;height:450px " class="box">
               <h1 style="margin-top: -60px;margin-left: 150px;color:cornsilk;text-align: center;font-size:35px;color: antiquewhite; background-color: #0c0400; width: 293px;">Available Test</h1>  
               
                  <div>
               
                <form action="InfoController" method="post">
               
               
               
                  <%  
                  for(String s:sname)
                  {
                  %>
                  <table>
                  <tr>
                  <td>
                   <h3 style="background-color: aliceblue;height:40px; width:500px"><%=s%></h3>
                   </td>
                   <td>
                   <button type="submit" name="b1" value="<%=s%>" style="width:100px ;height: 40px ;border-radius: 7px;background-color:bisque;font-size: 16px;font-weight: bold;">Start Test</button>
               
                  </td>
                  
                  </tr>
                  <br><br>
                  </table>
                  
                  
                  <% }%>
                   
                   </form>
               
                   </div>
                        
                     
               
               </div>
           
						
							
						</div>
						
						</div>
					</div>
				</div>					
			</section>
			<!-- End banner Area -->

			

			
						

			
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