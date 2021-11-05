<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/list">Back to list</a>.
<fieldset>
    <legend>Customer information</legend>
    <table>
        <tr>
            <td>Id</td>
            <td>${info.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${info.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${info.email}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${info.address}</td>
        </tr>
    </table>
</fieldset>
</body>
</html>