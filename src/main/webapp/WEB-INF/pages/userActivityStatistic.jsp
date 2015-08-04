<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CSRF Demo</title>
    <link href="<c:url value="/static/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/static/css/starter-template.css"/>" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <ul class="nav navbar-nav">
                <li>
                    <a href="<c:url value="/"/>" class="navbar-brand">CSRF Demo</a>
                </li>
                <li>
                    <a href="<c:url value="/activity/update"/>"><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span></a>
                </li>
            </ul>
        </div>
        <%--<div id="navbar2" class="collapse navbar-collapse">--%>
        <%--<ul class="nav navbar-nav">--%>
        <%--<li><a href="#about">About</a></li>--%>
        <%--<li><a href="#contact">Contact</a></li>--%>
        <%--</ul>--%>
        <%--</div>--%>
        <div id="navbar" class="collapse navbar-collapse navbar-right">
            <ul class="nav navbar-nav">
                <li>
                    <div class="counter">Activity Count <span class="badge">${totalActivityCount} </span></div>
                </li>
                <c:url value="/j_spring_security_logout" var="logoutUrl"/>
                <li>
                    <form action="${logoutUrl}" method="post">
                        <input class="btn btn-success btn-block" type="submit" value="Logout"/>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>
                </li>
            </ul>
        </div>

    </div>
</nav>


<div class="container">


    <div class="starter-template">


        <div>
            <a href="<c:url value="/activity/change"/>"><span class="glyphicon glyphicon-repeat"
                                                              aria-hidden="true"> Repeat</span></a>
        </div>

        <h1>Changed content</h1>

        <div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Action</th>
                    <th>Principal</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="activity" items="${activityStatictic}" varStatus="loop">
                    <tr>
                        <td>${loop.index + 1}</td>
                        <td>${activity.actionDescription}</td>
                        <td>${activity.principal.name}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

<script src="<c:url value="/static/js/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>

</body>
</html>
