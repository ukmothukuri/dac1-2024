<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%=application.getInitParameter("projectName")%></title>

<%
	String emailid = (String)session.getAttribute("email");
%>
</head>
<body>
	<div style="float:right">
		Hi.. <%=emailid%>
	</div>	
	<br>
	<hr>
	<div style="float:right">
		<a href="<%=request.getContextPath()%>/welcome">Home</a> | 
		<a href="<%=request.getContextPath()%>/products">Products</a> |
		<a href="<%=request.getContextPath()%>/logout">Logout</a>
	</div>
	<br><br><br>
	<hr>
	<%@include file="../home/Footer.jsp" %>
</body>
</html>