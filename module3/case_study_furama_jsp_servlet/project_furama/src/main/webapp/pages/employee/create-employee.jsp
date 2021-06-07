<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/bootstrap-4.6.0-dist/font/bootstrap-icons.css">
</head>
<body>
<jsp:include page="/layout/header.jsp"></jsp:include>
<div class="row">
    <div class="col-lg-2">
        <div class="row m-2">
            <div>
                <ul style="list-style: none;padding: 0;">
                    <li>
                        <div class="m-4">
                            <a href="/furama?action=list-employee"><button class="btn btn-outline-dark">Show all Employee</button></a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="col-lg-10">
        <h2 class="text-success m-5"><c:if test="${message != null}">
            <p>${message}</p>
        </c:if></h2>
        <form class="m-5" method="post" action="/furama?action=create-employee">
            <caption>
                <h2>Add New Employee</h2>
            </caption>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputName">Name Employee</label>
                    <input type="text" class="form-control" id="inputName" name="inputName" placeholder="Input name customer">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputBirthday">Day of birth</label>
                    <input type="date" class="form-control" id="inputBirthday" name="inputBirthday">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-5">
                    <label for="inputIdCard">ID Card</label>
                    <input type="text" class="form-control" id="inputIdCard" name="inputIdCard" placeholder="Input id Card">
                </div>
                <div class="form-group col-md-3">
                    <label for="inputSalary">Salary</label>
                    <input type="text" class="form-control" id="inputSalary" name="inputSalary" placeholder="Input salary">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputPhone">Phone Number</label>
                    <input type="text" class="form-control" id="inputPhone" name="inputPhone" placeholder="Input phone number">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputEmail">Email</label>
                    <input type="text" class="form-control" id="inputEmail" name="inputEmail" placeholder="Input Email">
                </div>
                <div class="form-group col-md-3">
                    <label for="inputAddress">Address</label>
                    <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Input address">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputPosition">Position</label>
                    <select id="inputPosition" name="inputPosition" class="form-control">
                        <option selected>Choose...</option>
                        <option value="1">le tan</option>
                        <option value="2">phuc vu</option>
                        <option value="3">chuyen vien</option>
                        <option value="4">giam sat</option>
                        <option value="5">quan li</option>
                        <option value="6">giam doc</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="inputEducation">Education Degree</label>
                    <select id="inputEducation" name="inputEducation" class="form-control">
                        <option selected>Choose...</option>
                        <option value="1">trung cap</option>
                        <option value="2">cao dang</option>
                        <option value="3">dai hoc</option>
                        <option value="4">sau dai hoc</option>
                    </select>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="inputDivision">Division</label>
                    <select id="inputDivision" name="inputDivision" class="form-control">
                        <option selected>Choose...</option>
                        <option value="1">marketing</option>
                        <option value="2">hanh chinh</option>
                        <option value="3">phuc vu</option>
                        <option value="4">quan ly</option>
                    </select>
                </div>
                <div class="form-group col-md-4">
                    <label for="inputUsername">Username</label>
                    <input type="text" class="form-control" id="inputUsername" name="inputUsername" placeholder="Input Username">
                </div>
            </div>
            <button type="submit" class="btn btn-dark">Add Employee</button>
        </form>
    </div>
</div>
<jsp:include page="/layout/footer.jsp"></jsp:include>
<script src="/assert/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="/assert/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</body>
</html>
