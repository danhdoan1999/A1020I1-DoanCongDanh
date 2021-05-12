<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/5/2021
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new product</h1>
<h3>
    <c:if test="${requestScope['message'] != null}">
        <span>${requestScope["message"]}</span>
    </c:if>
</h3>
<form action="/products?actionUser=create" method="post">
    <table>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="nameProduct" id="nameProduct"></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="text" name="priceProduct" id="priceProduct"></td>
        </tr>
        <tr>
            <td>Description: </td>
            <td><input type="text" name="description" id="description"></td>
        </tr>
        <tr>
            <td>Made in: </td>
            <td><input type="text" name="madeBy" id="madeBy"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create"></td>
        </tr>
    </table>
    <p><a href="/products">Back to product list</a></p>
</form>
</body>
</html>
