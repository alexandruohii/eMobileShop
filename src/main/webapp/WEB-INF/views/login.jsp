<%--
  Created by IntelliJ IDEA.
  User: Alx
  Date: 8/7/2016
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/fragments/header.jsp" %>


<div class="container">


    <form class="form-signin" action="<c:url value="/j_spring_security_check" />" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <c:if test="${not empty logoutMessage}">
            <div class="msg">${logoutMessage}</div>
        </c:if>

        <c:if test="${not empty error}">
            <div class="error" style="color: #ff0000;">${error}</div>
        </c:if>

        <label for="username" class="sr-only">User: </label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Username"/>
        <label for="password" class="sr-only">Password:</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password"/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>

    <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
