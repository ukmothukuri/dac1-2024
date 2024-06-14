<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%=application.getInitParameter("projectName")%></title>
<script>
	function validations(){
		
		var usename = document.getElementById("username").value;
		var emailid = document.getElementById("emailid").value;
		var mobile = document.getElementById("mobile").value;
		var userpwd = document.getElementById("userpwd").value;
		var confirmpwd = document.getElementById("confirmpwd").value;
		
		if(usename.length >= 2 && usename.length <=20){
			if(emailid.length >= 6){
				if(mobile.length === 10){
					if(userpwd.length >=8 && userpwd.length <= 16){
						if(userpwd === confirmpwd){
							document.getElementById("registerform").submit();
						}
						else{
							alert("Password and confirm password should be the same");	
						}						
					}
					else{
						alert("Please enter the password between 8 to 16 characters");
					}
				}else{
					alert("Please enter a valid mobile number");
				}
			}
			else{
				alert("Please enter a valid email");
			}			
		}
		else{
			alert("Please enter the username between 2 to 20 characters.");
		}
	}

</script>
</head>
<body>
	<%@include file="../home/Header.jsp" %>
	<hr>
	<div style="text-align: center;">
		<form id="registerform" action="./Register" method="post">
			<label>UserName:</label>
			<input type="text" id="username" name="username" required="required"
			placeholder="Enter your username"/> <br><br>
			<label>Email:</label>
			<input type="email" id="emailid" name="emailid" required="required"
			 placeholder="Enter your Email"/> <br><br>
			<label>Mobile:</label>
			<input type="text" id="mobile" name="mobile" required="required"
			 placeholder="Enter your mobile"/> <br><br>
			
			<label>Password:</label>
			<input type="password" id="userpwd" name="userpwd" required="required"
			 placeholder="Enter your password"/> <br><br>
			<label>Confirm Password:</label>
			<input type="password" id="confirmpwd" required="required"
			 placeholder="Enter your password"/> <br><br>
			
			<button id="register" type="button" onclick="validations()"> Register </button>
		</form>		
	</div>
	<hr>
	<%@include file="../home/Footer.jsp" %>
</body>
</html>