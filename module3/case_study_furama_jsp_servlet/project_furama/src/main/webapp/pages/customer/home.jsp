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
<jsp:include page='/layout/header.jsp'></jsp:include>
<div class="row">
    <div class="col-lg-2 bg-light">
        <div class="row m-2">
            <div>
                <ul style="list-style: none;padding: 0;">
                    <li>
                        <div class="m-4">
                            <a href="furama?action=create-customer"><button class="btn btn-outline-dark">Add new Customer</button></a>
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
                            <th scope="col">Name</th>
                            <th scope="col">Birthday</th>
                            <th scope="col">Gender</th>
                            <th scope="col">Id Card</th>
                            <th scope="col">Phone</th>
                            <th scope="col">Email</th>
                            <th scope="col">Type Customer</th>
                            <th scope="col">Address</th>
                            <th scope="col">Edit/Delete</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="customer" items="${customerList}">
                            <tr>
                                <td><c:out value="${customer.idCustomer}"/></td>
                                <td><c:out value="${customer.nameCustomer}"/></td>
                                <td><c:out value="${customer.dayOfBirth}"/></td>
                                <td><c:out value="${customer.gender}"/></td>
                                <td><c:out value="${customer.idCard}"/></td>
                                <td><c:out value="${customer.phoneNumber}"/></td>
                                <td><c:out value="${customer.email}"/></td>
                                <td><c:out value="${customer.typeOfCustomer}"/></td>
                                <td><c:out value="${customer.address}"/></td>
                                <td>
                                    <a href="/furama?action=edit-customer&id=${customer.idCustomer}" class="btn btn-outline-dark btn-sm">Edit</a>
                                    <a href="/furama?action=delete-customer&id=${customer.idCustomer}" class="btn btn-outline-dark btn-sm">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
            <div class="col-lg-1"></div>
        </div>
    </div>
</div>
<jsp:include page="/layout/footer.jsp"></jsp:include>

<script src="assert/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
<script src="assert/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
<script src="assert/jquery/jquery-3.5.1.min.js"></script>
<script src="assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function() {
        $('#tableCustomer').dataTable( {
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        } );
    } );
</script>
</body>
</html>
