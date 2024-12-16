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
			
		<style>
table, th, td {
 
}

::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
  color: black;
  font-family:sans-serif;
 font-size:14px;
  opacity: 1;
   /* Firefox */
}
</style>

 	

					
		</head>
		
		
		
		<body>	
		
		
			
		
		
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
				          <li><a href="userlogin.jsp">LOGIN</a></li>
				          
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
							
						<form action="UserSingUp" method="post" enctype="multipart/form-data" >
                <div style="margin-top:130px;background-color: #13121299;margin-left: 354px;height: 480px;width:433px;" align="center" >
            <br><br>
           <label style=" color: snow;font-family: serif;font-size: 16px;">Fname:</label>
            <input type="text" name="fname" required placeholder="&nbsp; enter your fname" id="fname" required="true" style=" margin-left: 20px;border-radius: 1px;"><br>
                    
             <label style="margin-top: 12px;  color: snow;font-family: serif;font-size: 16px;">Lname:</label>
             <input type="text" name="lname" required placeholder="&nbsp; enter your lname" id="lname" required="true" style="margin-left: 20px;     border-radius: 1px;"><br>
                    
              <label style="margin-top: 12px;  color: snow;font-family: serif;font-size: 16px;">Email:</label>
              <input type="email" name="email" placeholder="&nbsp; enter your email" required id="email" required="true" style="margin-left: 32px;     border-radius: 1px;"><br>
                    
               <label style="margin-top: 12px;  color: snow;font-family: serif;font-size: 16px;">Password:</label>
               <input style="border-radius: 1px; margin-left: 6px;" type="password" name="password" required placeholder="&nbsp; ente your password" id="pass1"  onkeyup='check_pass();' minlength="8"/> <br>   
                
                
                 <label style="margin-left: -8px; margin-top: 12px;  color: snow;font-family: serif;font-size: 16px;">Conf-Pass:</label>
                 <input style="border-radius: 1px; margin-left: 9px;" type="password" name="password1" required placeholder="&nbsp; ente your password" id="pass2"  onkeyup='check_pass();' minlength="8"/><br>
                    
                  <label style="margin-left: -5px; margin-top: 12px;  color: snow;font-family: serif;font-size: 16px;">Ph Number:</label>
                  <!-- <select style="margin-top:-30px; margin-left: -65px; width: 45px;" id="pnoption"><option>+91</option><option>+90</option><option>+92</option></select><br> -->
                  <input style="border-radius: 1px; " type="tel" name="number" required placeholder="&nbsp; enter your phone no" id="phone"  pattern="[1-9]{1}[0-9]{9}" /><br>
                    
           
                  <label style="margin-top: 12px; margin-left:-30px;  color: snow;font-family: serif;font-size: 16px;">Gender:</label>&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
                  <input type="radio" name="gender" value="male"><span style=" color: snow;font-family: serif;font-size: 16px;">Male</span> &nbsp; &nbsp; &nbsp; <input type="radio" name="gender" value="female"><span style=" color: snow;font-family: serif;font-size: 16px;">Female</span><br>      
                  
                  <label style=" margin-top: 15px;  color: snow;font-family: serif;font-size: 16px;">DOB:</label>
                  <input style="  border-radius: 1px; margin-left: 30px;" type="date" name="Date" placeholder="&nbsp; select our DOB" id="dob"><br>
                  
                  <label style=" margin-top: 15px; margin-left:16px;  color: snow;font-family: serif;font-size: 16px;">Profile Pic:</label>
                  <input style="border-radius: 1px; margin-left: 12px; width: 199px; " type="file" name="profile"  placeholder="&nbsp; select Your Profile Pic" id="dob"><br>          
                           
                  <input style="margin-left: 20px; margin-top: 22px;border-radius: 1px;    background-color: #0c0c0c; color: snow; font-family: sans-serif; width: 83px; height: 33px; box-shadow: 0 0 8em #f5e7e7;" type="submit" id="singup" onclick="myFunction()"value="Submit" style="width:120px;color: white;border: 2px solid #4CAF50;font-size: 15px;"><br>      
                
            
         </div>
        </form>
							
						</div>
						
						</div>
					</div>
				</div>					
			</section>
			<!-- End banner Area -->

			

			
						

			<!-- start footer Area -->		
			<footer class="footer-area section-gap">
				<div class="container">

					<div class="row">
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>About Agency</h6>
								<p>
									The world has become so fast paced that people don’t want to stand by reading a page of information, they would much rather look at a presentation and understand the message. It has come to a point 
								</p>
							</div>
						</div>
						<div class="col-lg-3 col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Navigation Links</h6>
								<div class="row">
									<div class="col">
										<ul>
											<li><a href="#">Home</a></li>
											<li><a href="#">LOGIN</a></li>
											<li><a href="#">Services</a></li>
											<li><a href="#">Portfolio</a></li>
										</ul>
									</div>
									<div class="col">
										<ul>
											<li><a href="#">Team</a></li>
											<li><a href="#">Pricing</a></li>
											<li><a href="#">Blog</a></li>
											<li><a href="#">Contact</a></li>
										</ul>
									</div>										
								</div>							
							</div>
						</div>							
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget">
								<h6>Newsletter</h6>
								<p>
									For business professionals caught between high OEM price and mediocre print and graphic output.									
								</p>								
								<div id="mc_embed_signup">
									<form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="subscription relative">
										<div class="input-group d-flex flex-row">
											<input name="EMAIL" placeholder="Email Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Email Address '" required="" type="email">
											<button class="btn bb-btn"><span class="lnr lnr-location"></span></button>		
										</div>									
										<div class="mt-10 info"></div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-lg-3  col-md-6 col-sm-6">
							<div class="single-footer-widget mail-chimp">
								<h6 class="mb-20">InstaFeed</h6>
								<ul class="instafeed d-flex flex-wrap">
									<li><img src="img/i1.jpg" alt=""></li>
									<li><img src="img/i2.jpg" alt=""></li>
									<li><img src="img/i3.jpg" alt=""></li>
									<li><img src="img/i4.jpg" alt=""></li>
									<li><img src="img/i5.jpg" alt=""></li>
									<li><img src="img/i6.jpg" alt=""></li>
									<li><img src="img/i7.jpg" alt=""></li>
									<li><img src="img/i8.jpg" alt=""></li>
								</ul>
							</div>
						</div>						
					</div>

					<div class="row footer-bottom d-flex justify-content-between align-items-center">
						<p class="col-lg-8 col-sm-12 footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
						<div class="col-lg-4 col-sm-12 footer-social">
							<a href="#"><i class="fa fa-facebook"></i></a>
							<a href="#"><i class="fa fa-twitter"></i></a>
							<a href="#"><i class="fa fa-dribbble"></i></a>
							<a href="#"><i class="fa fa-behance"></i></a>
						</div>
					</div>
				</div>
			</footer>
			<!-- End footer Area -->	

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