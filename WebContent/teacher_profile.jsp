<!DOCTYPE html>

<%@page import="com.DAOConnection.DBConnnection"%>
<%@page import="com.model.UserDetails"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="com.model.UserRegisterModel"%>
<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
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
			<link rel="stylesheet" href="css/main6.css">
			
			<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">	
			
	<style>

::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
  color: black;
  font-family:sans-serif;
 font-size:14px;
  opacity: 1;
   /* Firefox */
}


   meter {  
     width: 220px;  
     height: 25px;  
   }  

</style>	
			
</head>


<body style="background-color: skyblue">
<!-- <script>
function myFunction() {   
document.getElementById('first_name').readOnly = true;
document.getElementById('last_name').readOnly = true;
document.getElementById('phone').readOnly = true;
document.getElementById('mobile').readOnly = true;
document.getElementById('email').readOnly = true;
document.getElementById('dob').readOnly = true;
document.getElementById('location').readOnly = true;
document.getElementById('gender').readOnly = true;

}

</script>

 <script>
    function mysaveFunction() {   
    document.getElementById('first_name').disabled = true;
    document.getElementById('last_name').disabled = true;
    document.getElementById('phone').disabled = true;
    document.getElementById('mobile').disabled = true;
    document.getElementById('email').disabled = true;
    document.getElementById('dob').disabled = true;
    document.getElementById('location').disabled = true;
    document.getElementById('gender').disabled = true;
    
    }
    </script>	
 -->
<%// int id=15;
int id=(int)session.getAttribute("id");
UserDetails s=DBConnnection.getprofileinfo_teacher(id);
  /* int id2=(int)session.getAttribute("id");
  UserDetails s=DBConnnection.getprofileinfo(id2); */
						
  Double percentage=DBConnnection.profilePercentage(id);
  Integer per =percentage.intValue();												%> 
  
  

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
				          <li style="margin-left: 720px;"><a href="teacherwelcome.jsp">Back</a></li>
				          <li><a href="Logout_controller"><i class="fa fa-sign-out"></i>&nbsp;&nbsp;Logout</a></li>
				          
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
<br>
<br><br><br><br>
<hr>



<%-- <div class="container bootstrap snippet">
    <div class="row">
  		<div class="col-sm-10" style="margin-left:-10px;">
  		<h1 style="font-family: serif; font-size: 40px; color: initial;"><%=s.getFname()+" "+s.getLname()%></h1></div>
    	  </div>
    <div class="row">
  		<div class="col-sm-3"><!--left col-->
  		<input type="hidden" name="id" value="<%=id %>">
           <%

                        UserRegisterModel obj= DBConnnection.getImg(id);
						
					
						if(obj.getBase64Image()!=null)
						{
						%>
		<form action="Teacher_Upload_Profile" method="post"
					enctype="multipart/form-data">
		
		<div class="text-center">
        <img src="data:image/jpg;base64,<%=obj.getBase64Image()%>" class="avatar img-circle img-thumbnail" alt="avatar" style="margin-left: -30px;">
        <h6 style="width: 193px;background-color: #ffa500ba; height: 18px;">Upload a different photo...</h6>
        <input type="file"  name="profile"  style="color: black;font-family: serif;font-size: 14px;" class="text-center center-block file-upload">
        <input type="submit" style="width: 90px;color: black;font-family: serif;font-size: 14px;margin-left: 24px;" value="Upload">
        </div></hr><br>
      </form>
						<img src="data:image/jpg;base64,<%=obj.getBase64Image()%>" width="240" height="300"/>
                      
						   <% }
						else
						{%>
		<form action="Teacher_Upload_Profile" method="post"
					enctype="multipart/form-data">
						
		<div class="text-center">
        <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-circle img-thumbnail" alt="avatar" style="margin-left: -30px;">
        <h6 style="width: 193px;background-color: #ffa500ba; height: 18px;">Upload a different photo...</h6>
        <input type="file" name="profile" style="color: black;font-family: serif;font-size: 14px;" class="text-center center-block file-upload">
        <input type="submit" style="width: 90px;color: black;font-family: serif;font-size: 14px;margin-left: 24px;" value="Upload">
       
        </div></hr><br>
      </form>
						 <% }%>    
             
         
               
          <div class="panel panel-default">
            <div class="panel-heading"><span style="font-family: sans-serif; font-size: 16px; color: black">Profile Complited:<%=per%>%</span><i class="fa fa-link fa-1x"></i></div>
            <div class="panel-body"><meter  min="0" max="100" value="<%=percentage%>" ></meter></div>
          </div>
          
          
          <ul class="list-group">
            <li class="list-group-item text-muted">Activity <i class="fa fa-dashboard fa-1x"></i></li>
            <li class="list-group-item text-right"><span class="pull-left"><strong>Shares</strong></span> 125</li>
            <li class="list-group-item text-right"><span class="pull-left"><strong>Profile created</strong></span> 13</li>
            <li class="list-group-item text-right"><span class="pull-left"><strong>Last Login Date</strong></span> 37</li>
            <li class="list-group-item text-right"><span class="pull-left"><strong>Time spend</strong></span> 78</li>
          </ul> 
               
          <div class="panel panel-default">
            <div class="panel-heading">Social Media</div>
            <div class="panel-body">
            	<i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i> <i class="fa fa-twitter fa-2x"></i> <i class="fa fa-pinterest fa-2x"></i> <i class="fa fa-google-plus fa-2x"></i>
            </div>
          </div>
          
        </div><!--/col-3-->
 --%>    	<div class="col-sm-9">
            <ul class="nav nav-tabs">
                <li class="active"><a style="font-family: serif; font-size: 18px; color:black" data-toggle="tab" href="#home">Teacher Profile:</a></li>
                
                
              </ul>
              
              
              
  

              
        <div class="tab-content">
            <div class="tab-pane active" id="home">
                <hr>
                  <form  action="TeacherProfile" method="post" >
                      <div class="form-group">
                          
                          <div class="col-xs-6">
                              <label><h4>First name:</h4></label>
                              <input type="text" class="form-control" name="fname" style="font-family: serif; font-size: 15px; color: snow; background-color: #000000a1;"  value="<%=s.getFname()%>" placeholder="first name"  disabled>
                          </div>
                      </div>
                      <div class="form-group">
                          
                          <div class="col-xs-6">
                            <label for="last_name"><h4>Last name:</h4></label>
                              <input type="text" class="form-control" name="lname" style="font-family: serif; font-size: 15px; color: snow; background-color: #000000a1;"  value="<%=s.getLname()%>" placeholder="last name" title="enter your last name if any.">
                          </div>
                      </div>
          
                      <div class="form-group">
                          
                          <div class="col-xs-6">
                              <label for="phone"><h4>Phone:</h4></label>
                              <input type="text" class="form-control" name="number" style="font-family: serif; font-size: 15px; color: snow; background-color: #000000a1;" value="<%=s.getNumber()%>" id="phone" placeholder="enter phone" title="enter your phone number if any.">
                          </div>
                      </div>
          
                     
                      <div class="form-group">
                          
                          <div class="col-xs-6">
                              <label for="email"><h4>Email:</h4></label>
                              <input type="text" class="form-control" name="email" style="font-family: serif; font-size: 15px; color: snow; background-color: #000000a1;" value="<%=s.getEmail()%>" id="email" placeholder="you@email.com" title="enter your email.">
                          </div>
                      </div>
                                           <div class="form-group">
                          
                          <div class="col-xs-6">
                              <label for="password"><h4>Gender:</h4></label>
                              <input type="text" class="form-control" name="gender" style="font-family: serif; font-size: 15px; color: snow; background-color: #000000a1;" value="<%=s.getGender()%>" id="gender" placeholder=" your Gender" title="enter your password.">
                          </div>
                      </div>
                      <div class="form-group">
                          
                          <div class="col-xs-6">
                            <label for="password2"><h4>DOB</h4></label>
                              <input type="text" class="form-control" name="date" style="font-family: serif; font-size: 15px; color: snow; background-color: #000000a1;" value="<%=s.getDate()%>" id="dob" placeholder="Date of birth" title="enter your password2.">
                          </div>
                      </div>
                  
                     
                      
                      
                      
                      <div class="form-group">
                           <div class="col-xs-12">
                                <br>
                              	<!-- <button class="btn btn-lg btn-success" type="submit" name='edit' onclick="function()"><i class="glyphicon glyphicon-repeat"></i> Edit</button>
                               	<button class="btn btn-lg" type="submit" name='save' ><i class="glyphicon glyphicon-ok-sign"></i> Save</button> -->
                               	<input type="submit" value="save" style="width: 87px;height: 41px;background-color: white; font-family: sans-serif; font-size: 18px;color: black;border-radius: 16px; margin-top: 10px">
                                 </div>
                      </div>
                      
                      
                  
                      
              	</form>
              	<div>
              	    	<input  type="button" name='edit' value='edit' style="width: 87px; height: 41px;     background-color: white;     font-family: sans-serif;font-size: 18px; border-radius: 16px;color: black;border: 1px solid #ddd; margin-left: 170px; margin-top: -60px;">
                   </div>        
              
              <hr>
              
             </div><!--/tab-pane-->
             
            
               
              </div><!--/tab-pane-->
          </div><!--/tab-content-->

        </div><!--/col-9-->
    </div><!--/row-->
    
    
    	<script src="js/vendor/jquery-2.2.4.min.js"></script>
			<script src="js/popper.min.js"></script>
			<script src="js/vendor/bootstrap.min.js"></script>			
					
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
			
			
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>
        
     $(document).ready(function(){

         $("form input[type=text],form input[type=checkbox]").prop("disabled",true);

         $("input[name=edit]").on("click",function(){

                 $("input[type=text],input[type=checkbox],select").removeAttr("disabled");
         })

         $("input[name=save]").on("click",function(){

             $("input[type=text],input[type=checkbox],select").prop("disabled",true);
         })


     })
    </script>
</body>
 </html>                                                     