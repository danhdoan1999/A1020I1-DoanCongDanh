<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Products</h1>
<table border="1">
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Made in</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/products?actionUser=detail&id=${product.getId()}">${product.getNameProduct()}</a></td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getMadeBy()}</td>
            <td><a href="/products?actionUser=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?actionUser=remove&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
<p><a href="/products?actionUser=create">Create new product</a></p>
</body>
</html>
