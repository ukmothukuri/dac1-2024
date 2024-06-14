<!DOCTYPE html>
<%@page import="java.util.Date"%>

<html>
<head>
<%
	String projectName = application.getInitParameter("projectName");
%>
<meta charset="ISO-8859-1">
<title><%=projectName%></title>
</head>
<body>
<!--  ..This is my Home Page.. -->

<%--  This is JSP Home Page  --%>
<%=new Date()%>

	<%@include file="Header.jsp" %>
	<hr>
	<%@include file="Banner.jsp" %>
	<hr>
	<%@include file="Content.jsp" %>
	<hr>
	<%@include file="Footer.jsp" %>
</body>
</html>