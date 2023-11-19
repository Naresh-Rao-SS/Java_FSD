<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
</head>
<body>
<form action="validate.jsp">
username:<input type="text" name="uname">
password:<input type="password" name="pswd">
<button>submit</button>
</form>
<p>----------------------------------------</p>
<%=application.getInitParameter("url") %>
<%=config.getInitParameter("password") %>
</body>
</html>