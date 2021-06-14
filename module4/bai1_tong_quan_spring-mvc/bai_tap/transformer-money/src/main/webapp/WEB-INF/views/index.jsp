
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/result">
    <input type="number" name="number" placeholder="Dollars to VND">
    <input type="submit" value="transfer">
</form>
<h2>Result : ${resultTransfer} VND</h2>
</body>
</html>
