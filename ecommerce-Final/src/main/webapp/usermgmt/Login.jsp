<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%=application.getInitParameter("projectName")%></title>

<%
  String errormsg = null;  
  if(request.getAttribute("errormsg") == null){
	  errormsg = "";
  } else{
	  errormsg = (String)request.getAttribute("errormsg");
  }
%>
<script>
	function validations() {
		var userPwd = document.getElementById("userpwd").value;
		if (userPwd.length >= 8 && userPwd.length <= 16) {
			document.getElementById("loginform").submit();
		} else {
			alert("Please enter the password in between 8 to 16 characters");
		}
	}
</script>
</head>
<body>
	<%@include file="../home/Header.jsp" %>
	<hr>
	<div style="text-align: center;">
	
		<p style="color:red"><%= errormsg %> </p>
		
		<form id="loginform" action="<%=request.getContextPath()%>/login" method="post">
			<label>Email:</label>
			<input type="email" id="emailid" name="emailid"
			 placeholder="Enter your username" required="required"/> <br><br>
			<label>Password:</label>
			<input type="password" id="userpwd" name="userpwd" 
			 placeholder="Enter your password" required="required"/> <br><br>
			<!-- <button id="login" type="button" onclick="validations()"> Login </button> -->
			<button id="login" type="submit"> Login </button>
		</form>		
	</div>
	<hr>	
	<%@include file="../home/Footer.jsp" %>
</body>
</html>