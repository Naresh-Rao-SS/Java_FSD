<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Information</title>
 <style>
        table {
            width: 400px;
            border-collapse: collapse;
        }

        table td {
            padding: 5px;
            border: 1px solid #ccc;
        }
    </style>
</head>
<body>
<h1>Product Details</h1>
 <table>
        <tr>
            <td><strong>Name</strong></td>
            <td>${product.name}</td>
        </tr>
        <tr>
            <td><strong>Description</strong></td>
            <td>${product.description}</td>
        </tr>
        <tr>
            <td><strong>Price (INR)</strong></td>
            <td>${product.price}</td>
        </tr>
    </table>
</body>
</html>
