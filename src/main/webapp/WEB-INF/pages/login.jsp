<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CSRF Demo</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"/>
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
</head>
<body>

<c:url value="/login" var="loginUrl"/>

<div class="container">
    <div class="row" style="padding-top: 150px">
        <div class="col-md-4 col-md-offset-4">

            <div class="panel panel-default">

                <div class="panel-heading"><h3 class="panel-title">Please sign in</h3></div>

                <div class="panel-body">

                    <c:if test="${not empty error}">
                        <div class="error">${error}</div>
                        <br>
                    </c:if>
                    <c:if test="${not empty message}">
                        <div class="msg">${message}</div>
                        <br>
                    </c:if>


                    <form accept-charset="UTF-8" role="form" action="${loginUrl}" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="Username" name="username" type="text"/>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" name="password" type="password"
                                       value=""/>
                            </div>
                            <input class="btn btn-lg btn-success btn-block" type="submit" value="Login"/>
                        </fieldset>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
