<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Data</title>
</head>
<body>
	<h1 style="color:green;">${msg}</h1>
	<hr>
	<h1>Submitted form data is:</h1>
	<h3>Email Id is: ${user.email}</h3>
	<h3>Password is: ${user.password}</h3>
	<h3>Checkbox is: ${user.check}</h3>
</body>
</html>