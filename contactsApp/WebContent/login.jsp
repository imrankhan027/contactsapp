<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts Application</title>
</head>
<body>
	<div align="center">
		<h1>Sign In</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<table style="with: 100%">
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>

			</table>
			<input type="submit" value="Submit" />
            <p><a href="signUp.jsp">Sign Up</a></p>
		</form>
	</div>
</body>
</html>