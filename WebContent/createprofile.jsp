<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>



<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table, th, td {
    border: 1px solid black;
    padding: 3px;
    color: white;
}


table {
    border-spacing: 15px;
    margin-left: 50px;
}
</style>

</head>
<body style="padding: 0px;margin: opx;">

<div style="background-color:blue;height: 80px;width: 1350px;">

</br>
</br>
<a href="userlogin.jsp" style="color: white; margin-left: 1200px;">LOGOUT</a>
</div>
<div style="height: 540px;width: 1350px; background-image: url('assets/images/createp14.jpg'); "></br>



<div style="background-color:#0c0c0c75; width: 500px;height: 530px; margin-left: 400px; margin-top: -20px;">

<h1 style="margin-left: 160px; color: white; margin-top: 10px;">PROFILE</h1>
<hr>

<form action="CheckProfile" method="post" enctype="multipart/form-data">

<table>
 <tr>
 <td>
  UserName:
 </td>
 <td>
  <input type="text" name="uname" style="width: 200px; height: 20px; border-radius:8px;">
 </td>
 </tr>
 
 <tr>
 <td>
  Age:
 </td>
 <td>
  <input type="text" name="age" style="width: 200px; height: 20px; border-radius:8px;">
 </td>
 </tr>
 
 
 <tr>
 <td>
  Collage Name:
 </td>
 <td>
  <input type="text" name="cname" style="width: 200px; height: 20px; border-radius:8px;">
 </td>
 </tr>
 
 
 <tr>
 <td>
  Department:
 </td>
 <td>
   <select name="dname" style="width: 200px; height: 20px; border-radius:8px;">
  <option value="Comp">Comp</option>
  <option value="IT">IT</option>
  <option value="ENTC">ENTC</option>
  <option value="MECH">MECH</option>
  <option value="CIVIL">CIVIL</option>
  <option value="Electrical">Electrical</option>
  
</select>
 </td>
 </tr>
 
 
 
 
 <tr>
 <td>
  qualification:
 </td>
 <td>
 <select  name="qualification" style="width: 200px; height: 20px; border-radius:8px;">
  <option value="12TH">12TH</option>
  <option value="10TH">10TH</option>
  <option value="DEPLOMA">DEPLOMA</option>
  <option value="BE/BTECH">BE/BTECH</option>
  <option value="ME/MTECH">ME/MTECH</option>
  <option value="PG">PG</option>
  <option value="BSC">BSC</option>
  <option value="MCA">MCA</option>
  <option value="MSC">MSC</option>
  
</select>
  
 </td>
 </tr>

<tr>
 <td>
  Technical Intrest:
 </td>
 <td>
   <select  name="tintrest" style="width: 200px; height: 20px; border-radius:8px;">
  <option value="C">C</option>
  <option value="C++">C++</option>
  <option value="JAVA">JAVA</option>
  <option value="PAYTHON">PAYTHON</option>
  <option value="SKALA">SKALA</option>
  <option value="PHP">PHP</option>
  <option value="MYSQL">MYSQL</option>
  <option value="ORACLE">ORACLE</option>
  <option value=">NET">.NET</option>
  
</select>
 </td>
 </tr>
 
 <tr>
 <td>
  Location:
 </td>
 <td>
   <select name="location" style="width: 200px; height: 20px; border-radius:8px;">
  <option value="PUNE">Pune</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Nashik">Nashik</option>
  <option value="Akola">Akola</option>
  <option value="Amravti">Amravti</option>
  <option value="Nagpur">Nagpur</option>
  <option value="Kolhapur">Kolhapur</option>
  <option value="AhmadNagar">AhmadNagar</option>
  <option value="Hydrabad">Hydrabad</option>
  
</select>
 </td>
 </tr>
 
 
 <tr>
 <td>
  Profile Pic:
 </td>
 <td>
  <input type="file" name="picture" style="width: 200px; height: 20px; border-radius:8px;">  
 </td>
 </tr>
 
 
 <tr>
 <td>
  <input type="submit" value="Save" style="width: 80px; height: 35px; border-radius:8px; background-color: black; color: white; margin-left: 10px;">
 </td>
 <td>
  <input type="submit" value="Edite" style="width: 80px; height: 35px; border-radius:8px; background-color: black; color: white; margin-left: 30px;">  
 </td>
 </tr>
 

</table>
</form>
</div>

</div>

</body>
</html>