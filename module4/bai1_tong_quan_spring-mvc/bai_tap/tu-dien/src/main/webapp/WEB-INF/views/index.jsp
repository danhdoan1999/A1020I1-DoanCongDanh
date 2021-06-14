
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/dictionary" method="get">
<input type="text" name="word" placeholder="Input your word ">
<input type="submit" value="submit">
</form>
<h2>${result}</h2>
</body>
</html>
