<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test="${requestScope['message'] != null}">
        <span>${requestScope["message"]}</span>
    </c:if>
</p>
<form action="/products?actionUser=edit" method="post">
    <table>
        <tr>
            <th>Name: </th>
            <td><input type="text" name="name" id="name" value="${product.getNameProduct()}"></td>
        </tr>
        <tr>
            <th>Price: </th>
            <td><input type="text" name="price" id="price" value="${product.getPriceProduct()}"></td>
        </tr>
        <tr>
            <th>Name: </th>
            <td><input type="text" name="description" id="description" value="${product.getDescription()}"></td>
        </tr>
        <tr>
            <th>Name: </th>
            <td><input type="text" name="madeBy" id="madeBy" value="${product.getMadeBy()}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="edit"></td>
        </tr>
    </table>
</form>
<h3><a href="/products">Back to product list</a></h3>
</body>
</html>
