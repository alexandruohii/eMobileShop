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
        <div class="page-header">

            <h1>You have been registered successfully! Now you can login!</h1>

            <br><br>


                <p style="text-align: center"><a href="<spring:url value="/login" />" class="btn btn-default">SignIn</a></p>




        </div>




        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>





<%@include file="/WEB-INF/views/fragments/footer.jsp" %>