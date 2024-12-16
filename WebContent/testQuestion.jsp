<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.controller.RandomQuestion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//List<String> list=RandomQuestion.getQuestion();
Map<Integer, String> list=(Map<Integer, String>)session.getAttribute("map");
Map<Integer, String> map1=(Map<Integer, String>)session.getAttribute("map");
Map.Entry<Integer,String> entry=list.entrySet().iterator().next();


int cnt=1;
%>
<% for(Entry<Integer,String> e1:map1.entrySet())
{%>
<a href="CheckAnswer?qid=<%=e1.getKey()%>"><%=e1.getKey()+"  " %></a>
<%}%>
<form action="StartController" method="post">
<input type="hidden" value="<%=entry.getKey()%>" name="qid">
<input type="text" value="<%=entry.getValue() %>" name="question">
<input type="text" name="answer">
<input type="submit" value="Next->" >
</form>
<form action="PreviousQuestionController">
<input type="hidden" name="qid" value="<%=session.getAttribute("qid")%>">
<input type="submit" value="Previous">

</form>
</body>
</html>