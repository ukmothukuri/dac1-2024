<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%=application.getInitParameter("projectName")%></title>
</head>
<body>
	<div style="text-align:center;padding:50px">
		<h2>Your session was expired.</h2>
		<h5><a href="<%=request.getContextPath()%>/usermgmt/Login.jsp">
		Click here</a> to login again.</h5>		
	</div>
</body>
</html>