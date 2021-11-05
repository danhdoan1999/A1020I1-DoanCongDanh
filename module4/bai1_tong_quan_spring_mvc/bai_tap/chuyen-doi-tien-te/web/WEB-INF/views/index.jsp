<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/9/2021
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/transfer" method="post">
    <h1>Chuyen doi tien te</h1>
    <input type="number" name="number" placeholder="Input" >
    <button type="submit">Submit</button>
  </form>
  <p> result :  ${result}<p>
  </body>
</html>
