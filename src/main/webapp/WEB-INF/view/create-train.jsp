<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить поезд</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>const myContextPath = "${pageContext.request.contextPath}"</script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/create-train.js"></script>
    <sec:csrfMetaTags />
</head>
<body>
<%@ include file="nav.jsp"%>

<div class="col-4 mr-5 offset-4 mt-5">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title text-center">Добавить поезд</h5>
            <p class="card-text">
                <input id ="availableSeats" class="form-control mb-2" placeholder="Количество мест" type="text">
                <input id ="trainQuantity" class="form-control mb-2" placeholder="Количество поездов" type="text">

            </p>
            <input id="myButtonTrain" class="btn btn-info rounded-0" type="button" value="Добавить" style="width: 24mm">
            <span id="createSuccessConnection" class="font-weight-light text-info"><small id="successTextConnection"></small></span>
        </div>
    </div>
</div>



<%--<div class="container col-md-12 offset-4">--%>
<%--    <div>--%>
<%--        <div class="row mt-4">--%>
<%--            <h5 class="text-center font-weight-light pt-4 col-4" style="color:white;">Добавить поезд</h5>--%>
<%--        </div>--%>
<%--        <div class="row mt-2">--%>
<%--            <input id ="availableSeats" class="form-control col-2 mr-2" placeholder="Количество мест" type="text">--%>
<%--            <input id ="trainQuantity" class="form-control col-2 mr-2" placeholder="Количество поездов" type="text">--%>
<%--            <input id="myButtonTrain" class="btn btn-info rounded-0" type="button" value="Добавить" style="width: 24mm">--%>
<%--        </div>--%>
<%--        <div class="row">--%>
<%--            <div  >--%>

<%--                <span id="createSuccessConnection" class="font-weight-light text-info"><small id="successTextConnection"></small></span>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--    </div>--%>
<%--</div>--%>

</body>
</html>
