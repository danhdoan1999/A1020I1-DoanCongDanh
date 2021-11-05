<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/9/2021
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Customer list</h1>
  <table>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
    </tr>
    <c:forEach items="${customerList}" var="customer">
      <tr>
        <td>${customer.id}</td>
        <td><a href="/info/${customer.id}">${customer.name}</a></td>
        <td>${customer.email}</td>
        <td>${customer.address}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
