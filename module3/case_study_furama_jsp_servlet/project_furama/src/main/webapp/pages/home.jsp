<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-4.6.0-dist/font/bootstrap-icons.css">
</head>
<body>
<div class="container-fluid">
    <div class="row m-2">
        <div class="col-lg-12 d-flex align-items-center justify-content-between">
            <div>
                <a class="text-secondary text-decoration-none" href="#"><img style="max-width: 4rem;max-height: 4rem;border-radius:50%" src="/images/logo-web/logo.png">Furama</a>
            </div>
            <div>
                <button type="button" class="btn btn-dark">Login</button>
            </div>
        </div>
    </div>
</div>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="col-lg-1"></div>
    <div class="col-lg-10">
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Employee</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Service</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contract</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </div>
    <div class="col-lg-1"></div>
</nav>
<div class="row">
    <div class="col-lg-3">
        <div class="row">
            <div class="left-panel"></div>
        </div>
    </div>
    <div class="col-lg-9"></div>
</div>
<script src="bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</body>
</html>
