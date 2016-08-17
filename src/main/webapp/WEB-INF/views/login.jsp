<%--
  Created by IntelliJ IDEA.
  User: Alx
  Date: 8/7/2016
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/fragments/header.jsp" %>

<div class="container-wrapper">

    <div class="container">


        <div class="container">

            <form class="form-signin" action="${pageContext.request.contextPath}/login" method="post">
                <h2 class="form-signin-heading">Please sign in</h2>


                <div class="form-group">
                    <label for="username">User: </label>
                    <input type="text" id="username" name="username" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control"/>
                </div>
                <p><span style="color: #ff0000">${errorLogin}</span></p>
                <input type="submit" value="submit" class="btn btn-default">

                <a href="<c:url value="/" />" class="btn btn-default">Cancel</a>


            </form>

        </div> <!-- /container -->


        <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>

        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
