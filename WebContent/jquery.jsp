<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@page import="java.util.ArrayList"%>
<%@page import="com.DAOConnection.DBConnnection"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
  background-color: lightsalmon;
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
<body>
 

<%

int id=6;
ArrayList<ArrayList> list=DBConnnection.gettestdata(id);
%>
<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                            <th>Id</th>
							<th>Test Name</th>
							<th>Test Timing</th>
							<th>Test Date</th>
							<th>Test Score</th>
							<th>View Graph</th>
							<th>View Paper</th>
            </tr>
        </thead>
        <tbody>
            <tr>
            
            <%	
							
						for(int i=0;i<list.size();i++)
                         {
	 
						for(int j=0;j<list.get(i).size();j++)
						{
							
						
							
						 %>	
						        <td align="center"><span><%=list.get(i).get(j)%></span></td>
								
								
                                                 
           
            
                  <%
					 }
						
					%>
					<td align="center"><input type="submit" name="View Graph" value="View Graph"></td>
                    <td align="center"><input type="submit" name="View Test" value="View Test"></td>
                    
					 </tr>
					<%  	
						
                         }
					
				  %>
            
    
    
    <tr>
            
           
            
        </tbody>
        <tfoot>
           
        </tfoot>
    </table>
</body>
</html>