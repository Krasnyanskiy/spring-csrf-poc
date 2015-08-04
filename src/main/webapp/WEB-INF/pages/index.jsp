<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
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
                    <a href="<c:url value="/activity/updatePage"/>">
                        <span class="glyphicon glyphicon-eye-open"
                              aria-hidden="true"></span></a>
                </li>
            </ul>
        </div>
        <div id="navbar" class="collapse navbar-collapse navbar-right">
            <ul class="nav navbar-nav">
                <c:url value="/j_spring_security_logout" var="logoutUrl"/>
                <li>
                    <div class="counter">Activity Count <span class="badge">${totalActivityCount}</span></div>
                </li>
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
        <h1>
            <a href="<c:url value="/activity"/>">Change very important data!</a>
        </h1>
    </div>
</div>
</body>
<script src="<c:url value="/static/js/jquery.min.js"/>"></script>
<script src="<c:url value="/static/js/bootstrap.min.js"/>"></script>
</html>