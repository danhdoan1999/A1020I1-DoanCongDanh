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
                            <a href="/furama?action=list-customer"><button class="btn btn-outline-dark">Show all Customer</button></a>
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
        <form class="m-5" method="post" action="/furama?action=create-customer">
            <caption>
                <h2>Add New Customer</h2>
            </caption>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputName">Name Customer</label>
                    <input type="text" class="form-control" id="inputName" name="inputName" placeholder="Input name customer">
                    <p>
                        <c:if test='${messageName!= null}'>
                            <span style="color: red" class="message">${messageName}</span>
                        </c:if>
                    </p>
                </div>
                <div class="form-group col-md-4">
                    <label for="inputBirthday">Day of birth</label>
                    <input type="date" class="form-control" id="inputBirthday" name="inputBirthday">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="inputTypeCustomer">Type of customer</label>
                    <select id="inputTypeCustomer" class="form-control" name="inputTypeCustomer">
                        <option selected>Choose...</option>
                        <option value="1">Diamond</option>
                        <option value="2">Platinium</option>
                        <option value="3">Gold</option>
                        <option value="4">Silver</option>
                        <option value="5">member</option>
                    </select>
                </div>
                <div class="form-group col-md-5">
                    <label for="inputIdCard">ID Card</label>
                    <input type="text" class="form-control" id="inputIdCard" name="inputIdCard" placeholder="Input id Card">
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
                    <label for="inputGender">Gender</label>
                    <select id="inputGender" name="inputGender" class="form-control">
                        <option selected>Choose...</option>
                        <option value="nam">Male</option>
                        <option value="nu">Female</option>
                    </select>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputAddress">Address</label>
                    <input type="text" class="form-control" id="inputAddress" name="inputAddress" placeholder="Input address">
                </div>
            </div>
            <button type="submit" class="btn btn-dark">Add Customer</button>
        </form>
    </div>
</div>
<jsp:include page="/layout/footer.jsp"></jsp:include>


<script src="/assert/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="/assert/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</body>
</html>
