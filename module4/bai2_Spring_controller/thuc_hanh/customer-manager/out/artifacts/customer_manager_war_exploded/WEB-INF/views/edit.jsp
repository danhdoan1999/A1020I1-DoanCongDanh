<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/list">Back to list</a>.
<form action="/edit/${info.id}" method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Id</td>
                <td>${info.id}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${info.name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${info.email}"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" value="${info.address}"></td>
            </tr>
        </table>
    </fieldset>
    <button type="submit">Update</button>
</form>
</body>
</html>
