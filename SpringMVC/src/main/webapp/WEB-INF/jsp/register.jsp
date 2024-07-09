  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="./register">
		<table>
			<tr>
				<td><form:label path="name">Name: </form:label></td>
				<td><form:input path="name"/></td>
			</tr>		
			<tr>
				<td><form:label path="email">Email: </form:label></td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><form:label path="mobile">Mobile: </form:label></td>
				<td><form:input path="mobile"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="submit"/>  </td>
			</tr>	
		</table>
	</form:form>
</body>
</html>