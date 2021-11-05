<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/bootstrap-4.6.0-dist/font/bootstrap-icons.css">

</head>
<body>
<div class="row">
    <div class="col-lg-2">
        <div class="row m-2">
            <div>
                <ul style="list-style: none;padding: 0;">
                    <li>
                        <div class="m-4">
                            <a href="/tcomplex?action=tcomplex"><button class="btn btn-outline-dark">Show all Customer</button></a>
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
        <form class="m-5" method="post" action="/tcomplex?action=create-building">
            <caption>
                <h2>Add New Building</h2>
            </caption>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputId">Ma mat bang</label>
                    <input type="text" class="form-control" id="inputId" name="inputName" placeholder="Input Id">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputStatus">Trang thai</label>
                    <input type="text" class="form-control" id="inputStatus" name="inputStatus">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="inputAcreage">Dien tich</label>
                    <input type="text" class="form-control" id="inputAcreage" name="inputAcreage">
                </div>
            </div>

            <div class="form-row">
                <div class="form-group col-md-3">
                    <label for="inputFloor">Number Foor</label>
                    <select id="inputFloor" name="inputFloor" class="form-control">
                        <option selected>Choose...</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                        <option value="13">13</option>
                        <option value="14">14</option>
                        <option value="15">15</option>
                    </select>
                </div>
                <div class="form-group col-md-3">
                    <label for="inputType">Loai van phong</label>
                    <select id="inputType" name="inputType" class="form-control">
                        <option selected>Choose...</option>
                        <option value="van phong chia se">van phong chia se</option>
                        <option value="van phong tron goi">van phong tron goi</option>
                    </select>
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputCost">Gia van phong</label>
                    <input type="text" class="form-control" id="inputCost" name="inputCost" placeholder="Input cost">
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputDayBegin">Ngay bat dau</label>
                    <input type="date" class="form-control" id="inputDayBegin" name="inputDayBegin">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputDayEnd">Ngay ket thuc</label>
                    <input type="date" class="form-control" id="inputDayEnd" name="inputDayEnd">
                </div>
            </div>
            <button type="submit" class="btn btn-dark">Add Building</button>
        </form>
    </div>
</div>

<script src="/assert/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="/assert/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>

</body>
</html>
