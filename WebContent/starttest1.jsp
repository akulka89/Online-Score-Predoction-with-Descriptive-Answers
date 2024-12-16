<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.controller.RandomQuestion"%>
    
    
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



<script type="text/javascript">
var timeoutHandle;
function countdown(minutes,stat) {
    var seconds = 60;
    var mins = minutes;
	 
	if(getCookie("minutes")&&getCookie("seconds")&&stat)
	{
		 var seconds = getCookie("seconds");
    	 var mins = getCookie("minutes");
	}
	 
    function tick() {
		
        var counter = document.getElementById("timer");
		setCookie("minutes",mins,10)
		setCookie("seconds",seconds,10)
        var current_minutes = mins-1
        seconds--;
        counter.value = 
		current_minutes.toString() + ":" + (seconds < 10 ? "0" : "") + String(seconds);
		//save the time in cookie
		
		
		
        if( seconds > 0 ) {
            timeoutHandle=setTimeout(tick, 1000);
        } else {
             
            if(mins > 1){
                 
               // countdown(mins-1);   never reach “00″ issue solved:Contributed by Victor Streithorst    
               setTimeout(function () { countdown(parseInt(mins)-1,false); }, 1000);
             
                 
               
            }
            
            if(mins==1)
       	 {
       	   
       	   setCookie("minutes","",10);
      		   setCookie("seconds","",10);
             
       	   window.location.replace("testEnd.jsp"); 
       	   
       	 }
        }
    }
    tick();
}
function setCookie(cname,cvalue,exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname+"="+cvalue+"; "+expires;
}
 function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') c = c.substring(1);
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}


</script>


</head>




<body style="background-color: #0b3242;">

		<% 

Map<Integer, String> map =(Map<Integer, String>)session.getAttribute("map");

//this ArrayList is for question link		
ArrayList<Integer> questionids=new ArrayList<>(map.keySet());

		
//Map.Entry<Integer, String> entry = map.entrySet().iterator().next();

int keyid=(int)session.getAttribute("keyset");
Map<Integer, String> answerlist=(Map<Integer, String>)session.getAttribute("answerlist");


int qnumber=(int)session.getAttribute("qestionnumber");


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
				          <li><a href="studentwelcome.jsp">HOME</a></li>
				          <li><a href="studentwelcome.jsp">BACK</a></li>
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
			
		<div style="background-color: white;height: 99px; width: 1327px; margin-top: 126px; margin-left: 10px;">
		<br>
		<div style="background-color: lightblue;height: 58px; width: 252px; margin-left: 26px;">
		<span style="margin-left: 66px; font-family: sans-serif; font-size: 18px; color: black;">Time:</span>
		<input type="text" id="timer" disabled="disabled" style="font-family: sans-serif; font-size: 18px; color: black; width: 71px; text-align: center; margin-top: 15px; margin-left: 16px;">
		</div>
		</div>
	          	
	
          <br><br><br><br> <br><br>
        
        <div style="background-color: white; height: 600px; width: 900px; margin-left: 10px; margin-top: -111px" align="left">   
		<form action="VaibhavquestionNext" method="post">
		
	
			<input type="hidden" value="<%=keyid%>" name="qid">

			<%-- This is for Question 
			
			<textarea rows="4" cols="50" name="answer" disabled="disabled"  value="Q<%=i%>. <%=entry.getValue()%>
			 style="width: 500px; height: 70px; margin-left: 430px; font-size: 20px; color: black; background-color: pink; margin-top: 30px;">
              </textarea></br> --%>
			
              <!-- his is for Question -->
			<input type="text" value="Q<%=qnumber%>.<%=map.get(keyid)%>" name="question" disabled="disabled" style="width: 843px; height: 70px; margin-left: 30px; font-size: 20px; color: white; background-color: black; margin-top: 30px;"></br>
			
			

			<!-- This is for Answer -->
			<textarea rows="4" cols="50" name="answer" style="width: 839px; height: 350px; margin-left: 30px; background: darkslategray;color: white;  ">
             <%=answerlist.get(keyid)%></textarea>
              
          
           

			<!-- This is for Next Button -->
			<input type="submit" value="next" name="submit" style="width: 100px; height: 40px; position: relative; transition: .5s ease; top: 16px; left: 708px; right: -300px; border-radius: 7px; background-color: lightblue; font-weight: bold; font-size: 16px;">
		    </form>
		
</div>




		<form action="VaibhavquestionNext" method="post">
		
			<input type="hidden" value="<%=keyid%>" name="qid">
			<input type="hidden" name="question" value="<%=map.get(keyid)%>">
            <input type="hidden" name="answer" value="<%=answerlist.get(keyid)%>">

			<input type="submit" value="prev" name="submit"  style="width: 100px; height: 40px; position: relative; transition: .5s ease; top: -134px; left: 95px; right: -300px; border-radius: 7px; background-color: lightblue; font-weight: bold; font-size: 16px;">
	
	
	</form>
	
	
	<div style="background-color: white; height: 598px; width: 410px; margin-left: 926px; margin-top: -639px;;" align="left">
	
	<br>
	<div style="background-color: skyblue;width: 288px;height: 427px; margin-left: 63px;">
	<br>
	
	<div>
	<form action="QuestionLinkedController" method="post">
    <input type="hidden" value="<%=1%>" name="qno">
    <input type="hidden" value="<%=questionids.get(0)%>" name="qid">
	<input type="submit" value="1" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px; margin-left: 18px;">
	</form>
	
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=2%>" name="qno">
	<input type="hidden" value="<%=questionids.get(1)%>" name="qid">
	<input type="submit" value="2" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px; margin-top: -30px; margin-left: 114px;">
	</form>
	
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=3%>" name="qno">
	<input type="hidden" value="<%=questionids.get(2)%>" name="qid">
	<input type="submit" value="3" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px; margin-top: -31px; margin-left: 212px;">
	</form>
	</div>
	
	<div>
	 <form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=4%>" name="qno">
	<input type="hidden" value="<%=questionids.get(3)%>" name="qid">
	<input type="submit" value="4" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px;     margin-top: 41px; margin-left: 20px;">
	</form>
	
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=5%>" name="qno">
	<input type="hidden" value="<%=questionids.get(4)%>" name="qid">
	<input type="submit" value="5" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px;    margin-top: -31px; margin-left: 116px; ">
	</form>
	
	
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=6%>" name="qno">
	<input type="hidden" value="<%=questionids.get(5)%>" name="qid">
	<input type="submit" value="6" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px;     margin-top: -30px; margin-left: 214px;">
	</form>
	</div>	
	
	<div>
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=7%>" name="qno">
	<input type="hidden" value="<%=questionids.get(6)%>" name="qid">
	<input type="submit" value="7" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px; margin-top: 45px; margin-left: 21px;">
	</form>
	
	
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=8%>" name="qno">
	<input type="hidden" value="<%=questionids.get(7)%>" name="qid">
	<input type="submit" value="8" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px; margin-top: -30px; margin-left: 117px;">
	</form>
	
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=9%>" name="qno">
	<input type="hidden" value="<%=questionids.get(8)%>" name="qid">
	<input type="submit" value="9" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px;margin-top: -30px; margin-left: 217px;">
	</form>
	</div>
	
	<div>
	<form action="QuestionLinkedController" method="post">
	<input type="hidden" value="<%=10%>" name="qno">
	<input type="hidden" value="<%=questionids.get(9)%>" name="qid">
	<input type="submit" value="10" style="background-color: black; color: white; width: 50px; height: 30px; border-radius:7px; margin-top: 54px;
    margin-left: 118px;">
	</form>
	</div>
	</div>
			
	</div>		

 
 
 
 
 
 
 
 			
			<!-- <div style="width: 1140px;height: 80px;background-color: white; margin-top: 120px; margin-left: 112px;">
			
			</div>
			<div style="width: 300px;height: 1000px;background-color: white; margin-left: 112px; margin-top: 10px;">
			
			</div>
			
			<div style="width: 828px;height: 1000px;background-color: white; margin-left: 423px; margin-top: -1001px;">
			
			</div>
			 -->
			 
		<script type="text/javascript">countdown(60,true)</script>	 
			 
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