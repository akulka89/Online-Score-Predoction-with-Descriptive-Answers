<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
 
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/jquery-ui.css">				
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/owl.carousel.css">				
			
			

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
  background-color: lightsalmon;
}

.paginate_button {
  border-radius: 0 !important;
}
</style>



</head>
<body>	
			



<form action="DeleteQuestionController" method="post">
<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                            <th>QuestionNo</th>
							<th>Question</th>
							<th>Answer</th>
							<th>DeleteQuestion</th>
							
            </tr>
        </thead>
        
        <tbody style="font-family: serif; font-size: 17px; color: black;">
           
         <tr><td>String</td><td>String is class or datatype?</td><td>Vaibhav</td><td>Vaibhav</td></tr>
         <tr><td>Integer</td><td>Integer is class or datatype?</td><td>Vaibhav</td><td>Vaibhav</td></tr>
         <tr><td>Float</td><td>Float is class or datatype?</td><td>Vaibhav</td><td>Vaibhav</td></tr>
         <tr><td>Double</td><td>Double is class or datatype?</td><td>Vaibhav</td><td>Vaibhav</td></tr>  
           
            
      
            
        </tbody>
        <tfoot>
           
        </tfoot>
    </table>
    </form>
</body>
</html>