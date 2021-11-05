<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="assert/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="assert/bootstrap-4.6.0-dist/font/bootstrap-icons.css">
    <link rel="stylesheet" href="assert/datatables/css/dataTables.bootstrap4.min.css" />
</head>
<body>
<div class="row">
    <div class="col-lg-2 bg-light">
        <div class="row m-2">
            <div>
                <ul style="list-style: none;padding: 0;">
                    <li>
                        <div class="m-4">
                            <a href="tcomplex?action=create"><button class="btn btn-outline-dark">Add new building</button></a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="col-lg-10">
        <div class="row m-3">
            <table id="tableCustomer" class="table table-striped table-bordered m-3" style="width: 100%">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Trang thai</th>
                    <th scope="col">Dien tich</th>
                    <th scope="col">So tang</th>
                    <th scope="col">Loai mat bang</th>
                    <th scope="col">Gia tien</th>
                    <th scope="col">Ngay bat dau</th>
                    <th scope="col">ngay ket thuc</th>
                    <th scope="col">Edit/Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="building" items="${buildingList}">
                    <tr>
                        <td><c:out value="${building.idMB}"/></td>
                        <td><c:out value="${building.status}"/></td>
                        <td><c:out value="${building.acreage}"/></td>
                        <td><c:out value="${building.floor}"/></td>
                        <td><c:out value="${building.typeBuilding}"/></td>
                        <td><c:out value="${building.cost}"/></td>
                        <td><c:out value="${building.dayBegin}"/></td>
                        <td><c:out value="${building.dayEnd}"/></td>
                        <td>
                            <a href="tcomplex?action=edit-building&id=${building.idMB}" class="btn btn-outline-dark btn-sm">Edit</a>
                            <a href="tcomplex?action=delete-building&id=${building.idMB}" class="btn btn-outline-dark btn-sm">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div class="col-lg-1"></div>
        </div>
    </div>
</div>
<script src="assert/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="assert/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</body>
</html>
