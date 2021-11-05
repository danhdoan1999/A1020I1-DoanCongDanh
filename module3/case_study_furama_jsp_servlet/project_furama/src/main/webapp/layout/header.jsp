<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26/5/2021
  Time: 7:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <header class="container-fluid">
    <div class="row m-2">
    <div class="col-lg-12 d-flex align-items-center justify-content-between">
    <div>
    <a class="text-secondary text-decoration-none" href="/furama"><img style="max-width: 4rem;max-height: 4rem;border-radius:50%" src="/assert/images/logo-web/logo1.png">Furama</a>
    </div>
    <div>
    <button type="button" class="btn btn-dark">Login</button>
    </div>
    </div>
    </div>
    </header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="col-lg-1"></div>
    <div class="col-lg-10">
    <div class="collapse navbar-collapse">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
    <li class="nav-item">
    <a class="nav-link" href="/furama?action=list-employee">Employee</a>
    </li>
    <li class="nav-item">
    <a class="nav-link" href="/furama?action=list-customer">Customer</a>
    </li>
    <li class="nav-item">
    <a class="nav-link" href="#">Service</a>
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
