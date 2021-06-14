<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email validate</h1>
<h3 style="color: red">${message}</h3>
<form action="/validate" method="post">
    <input type="text" name="email" placeholder="Input Email">
    <input type="submit" value="Check">
</form>
</body>
</html>
