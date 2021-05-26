<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <th>Name: </th>
        <td>${product.getNameProduct()}</td>
    </tr>
    <tr>
        <th>Price: </th>
        <td>${product.getPriceProduct()}</td>
    </tr>
    <tr>
        <th>Description: </th>
        <td>${product.getDescription()}</td>
    </tr>
    <tr>
        <th>Made in: </th>
        <td>${product.getMadeBy()}</td>
    </tr>
</table>
</body>
</html>
