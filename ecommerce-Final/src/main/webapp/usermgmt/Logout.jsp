<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%=application.getInitParameter("projectName")%></title>
</head>
<body>	
	<div style="top: 25%">
		<h2>Successfully you are loggedout.</h2>
		<br>
		<h5><a href="<%=request.getContextPath()%>">
		Click here</a> to visit again.</h5>	
	</div>
</body>
</html>