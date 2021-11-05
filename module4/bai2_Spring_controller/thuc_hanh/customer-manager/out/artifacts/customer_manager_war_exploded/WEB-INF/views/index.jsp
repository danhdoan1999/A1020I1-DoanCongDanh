<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h1>List Customer</h1>
    <table border="1">
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
      <c:forEach var="customer" items="${listCustomer}">
        <tr>
          <td>${customer.id}</td>
          <td><a href="/customerInfo/${customer.id}">${customer.name}</a></td>
          <td>${customer.email}</td>
          <td>${customer.address}</td>
          <td><a href="/edit-form/${customer.id}">Edit</a></td>
          <td><a href="">Delete</a></td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
