<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<h2>List Customer</h2>
  <table border="1">
    <tr>
      <th>No</th>
      <th>Name</th>
      <th>Date of Birth</th>
      <th>Address</th>
      <th>Avatar User</th>
    </tr>

    <c:forEach var="customer" items="${customerListServlet}" varStatus="loop">
      <tr>
        <td>${loop.index + 1}</td>
        <td><c:out value="${customer.nameCustomer}"/></td>
        <td><c:out value="${customer.dateBirth}"/></td>
        <td><c:out value="${customer.address}"/></td>
        <td><img src="${customer.image}" style="width: 50px;height: 50px"/></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
