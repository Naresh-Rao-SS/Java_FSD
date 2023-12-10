<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.example.demo.pojo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All</title>
</head>
<body>
<%List<Employee> list=(List<Employee>)request.getAttribute("list");  %>
<table border="1">
<tr><th>Employee Id</th><th>Employee Name</th><th>Employee Phono</th></tr>
<%for(Employee ss:list){ %>
<tr><td><%=ss.getEmpid()%></td><td><%=ss.getEmpname() %></td><td><%=ss.getEmpphone() %></td></tr>
<%} %>
</table>
</body>
</html>
