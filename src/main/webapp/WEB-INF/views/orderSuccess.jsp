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

        </div>
        <div class="jumbotron">
            <div class="row">
                <div class="col-md-12">
                   <h3>Thank you for your order!  Your order has been placed successfully!</h3>
                    <br><br>
                    <p style="text-align: center"><a href="<spring:url value="/" />" class="btn btn-default">Main Page</a></p>

                </div>
            </div>

        </div>


        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
