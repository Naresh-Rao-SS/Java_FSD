<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h1>Dude This one Displays The Name Of Employee</h1>
<%Employee ee=(Employee)request.getAttribute("emp"); %>
<h1><i><%="Welcome to "+ee.getUser() %></i></h1>
</body>
</html>
