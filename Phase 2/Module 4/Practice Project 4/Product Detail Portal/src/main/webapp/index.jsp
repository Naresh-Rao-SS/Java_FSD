<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Product Details Portal</title>
 <style>
        table {
            width: 400px;
        }

        table td {
            padding: 5px;
        }

        input[type="submit"] {
            padding: 5px 10px;
        }
    </style>
 
</head>
<body>
<h1>Enter Product Details</h1>
    <form action="ProductServlet" method="post">
        <table>
            <tr>
                <td><label for="name">Name of the Product</label></td>
                <td><input type="text" id="name" name="name" required></td>
            </tr>
            <tr>
                <td><label for="price">Price</label></td>
                <td><input type="number" id="price" name="price" required></td>
            </tr>
            <tr>
            	<td><label for="description">Description</label></td>
                <td><input type="text" id="description" name="description" required></td>
                
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form>

</body>
</html>
