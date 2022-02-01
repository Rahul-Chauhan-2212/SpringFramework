<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model and View Example</title>
</head>
<body>
  <!--% String name=(String)request.getAttribute("name"); %-->
  <!--% Integer age=(Integer)request.getAttribute("age"); %-->
  <h1>My Name is <!--%=name %-->${name}.</h1>
  <h2>I am <!--%=age %-->${age} years old.</h2>
  <hr> 
  <c:forEach var="item" items="${tech}">
  <h3>${item}</h3>
  </c:forEach>
</body>
</html>