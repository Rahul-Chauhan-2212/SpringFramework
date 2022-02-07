<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Data</title>
</head>
<body>
	<h1 style="color: green;">${student.name}</h1>
	<hr>
	<h3>Email Id is: ${student.email}</h3>
	<h3>Date of Birth is: ${student.dob}</h3>
	<h3>Gender is: ${student.gender}</h3>
	<h3>
		The Known Languages are:
		<ul>
			<c:forEach var="item" items="${student.languages}">
				<li>${item}</li>
			</c:forEach>
		</ul>
	</h3>
	<h3>Type is: ${student.type}</h3>
	<h3>
		Address is: ${student.address.line1}, ${student.address.line2} <br>
		${student.address.city}, ${student.address.state},
		${student.address.country}, ${student.address.zipcode}
	</h3>


</body>
</html>