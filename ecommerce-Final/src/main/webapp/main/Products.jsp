<%@page import="com.ecommerce.pojo.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%=application.getInitParameter("projectName")%></title>
<%
String emailid = (String) session.getAttribute("email");
ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("productdetails");
%>
</head>
<body>
	<div style="float: right">
		Hi..
		<%=emailid%>
	</div>
	<br>
	<hr>
	<div style="float: right">
		<a href="<%=request.getContextPath()%>/welcome">Home</a> | <a
			href="<%=request.getContextPath()%>/products">Products</a> | <a
			href="<%=request.getContextPath()%>/logout">Logout</a>
	</div>
	<br>
	<br>
	<br>
	<center>
		<table border="1">
			<thead>
				<td>SNO</td>
				<td>Product Name</td>
				<td>Category</td>
				<td>Price</td>
				<td>Rating</td>
			</thead>
			<%
			for (Product pd : list) {
			%>
			<tr>
				<td><%=pd.getPid()%></td>
				<td><%=pd.getPname()%></td>
				<td><%=pd.getCategory()%></td>
				<td><%=pd.getPrice()%></td>
				<td><%=pd.getRating()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</center>
	<hr>
	<br>
	<%@include file="../home/Footer.jsp"%>
</body>
</html>