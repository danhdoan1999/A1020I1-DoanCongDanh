<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td><a href="info.jsp?id=${customer.id}">${customer.name}</a></td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
