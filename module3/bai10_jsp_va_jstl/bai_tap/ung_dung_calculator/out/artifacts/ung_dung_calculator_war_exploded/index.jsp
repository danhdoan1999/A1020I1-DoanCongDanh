<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<h1>Calculator</h1>
  <form method="post" action="${pageContext.request.contextPath}/calculate">
    <label for="firstNumber">First Operand :
    <input id="firstNumber" name="firstNumber">
    </label>
    <label for="operator">Operator :
    <select id="operator" name="operator">
      <option>+</option>
      <option>-</option>
      <option>*</option>
      <option>/</option>
    </select>
    </label>
    <label for="secondNumber">Second Operand :
      <input id="secondNumber" name="secondNumber">
    </label>
    <input type="submit" value="calculate">
  </form>
  <h2><c:out value="${result}"></c:out></h2>
  </body>
</html>
