<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/bootstrap-4.6.0-dist/font/bootstrap-icons.css">
    <style>
    .image-bg{
    background: url("http://banvoucher.com/wp-content/uploads/2019/06/thanh-ly-phong-flamingo-cat-ba-3.jpg") no-repeat center center fixed;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
    width: 100%;
    height: 35rem;
    }
    .bg-warning{
    font-family: "Times New Roman",Times,Serif;
    }
    .introduce {
    position: relative;
    top: 6rem;
    }
    img{
    max-width: 100%;
    max-height: 100%;
    }
    .product{
    position: absolute;
    top: 70%;
    }
    .banner{
    width: 100%;
    height: 45rem;
    }
    </style>
</head>
<body>
    <jsp:include page="/layout/header.jsp"></jsp:include>
    <div class="image-bg">
    <div class="container-fluid">
    <div class="row h-auto">
    <div class="col-lg-4">
    <div class="row">
    <div class="col-lg-3"></div>
    <div class="col-lg-9">
    <div class="row introduce">
    <p class="lead pl-2 pr-2" style="background-color: #ffda00; font-size: medium">SEE WHAT'S NEW</p>
    <div>
    <p class="display-4" style="font-size: 2.5rem">Feel the moment</p>
    <p class="lead" style="font-size: 1.6rem">Live and enjoy your life in the best way , eat the food you like , go to the places where you feel at peace</p>
    </div>
    </div>
    </div>
    </div>
    </div>
    <div class="col-lg-8"></div>
    </div>
    </div>
    </div>
    <section class="container-fluid">
    <div class="row p-lg-5">
    <div class="col-lg-12">
    <div class="embed-responsive embed-responsive-21by9">
    <iframe src="https://www.youtube.com/embed/PgvSSl4jm1U" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </div>
    </div>
    </div>
    </section>
    <jsp:include page="/layout/footer.jsp"></jsp:include>
    <script src="/assert/bootstrap-4.6.0-dist/js/jquery-3.6.0.min.js"></script>
    <script src="/assert/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
</body>
</html>
