
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/discount">
    <input type="text" placeholder="Product Description" name="description">
    <input type="text" placeholder="List Price" name="price">
    <input type="text" placeholder="Discount Percent" name="discount">
    <button type="submit">Calculate Discount</button>
  </form>
  </body>
</html>
