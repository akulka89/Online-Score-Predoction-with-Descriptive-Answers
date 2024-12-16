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
             
       	   window.location.replace("info.jsp"); 
       	   
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
