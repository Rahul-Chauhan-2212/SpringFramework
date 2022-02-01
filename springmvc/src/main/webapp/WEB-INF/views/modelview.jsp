<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model and View Example</title>
</head>
<body>
  <% String name=(String)request.getAttribute("name"); %>
  <% Integer age=(Integer)request.getAttribute("age"); %>
  <h1>My Name is <%=name %>.</h1>
  <h2>I am <%=age %> years old.</h2>
</body>
</html>