<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/9/2021
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="/translate" method="post">
      <table>
        <tr>
          <h1>Simple Dictionary</h1>
        </tr>
        <tr>
          <input type="text" name="input" placeholder="Input Your Search ...">
        </tr>
        <tr>
          <input type="submit" value="Submit">
        </tr>
      </table>
    </form>
    <h2>Result : ${result}</h2>
  </body>
</html>
