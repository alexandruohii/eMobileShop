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
            <h1>Register</h1>


            <p class="lead">Fill the below information :<br>
            <ul>(The fields marked with * are mandatory)</ul>
            </p>

        </div>

        <form:form action="${pageContext.request.contextPath}/register/"
                   method="post" commandName="customer">


        <div class="form-group">
            <label for="name">Full Name</label>
            <form:input path="name" id="name" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="username">Username *</label><form:errors path="username" cssStyle="color: #ff0000"/>
            <span style="color: #ff0000">${msjUsername}</span>
            <form:input path="username" id="username" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label><form:errors path="password" cssStyle="color: #ff0000"/>
            <form:input path="password" id="password" class="form-Control"/>
        </div>



        <div class="form-group">
            <label for="email">E-mail</label><form:errors path="email" cssStyle="color: #ff0000"/>
            <span style="color: #ff0000">${msjEmail}</span>
            <form:input path="email" id="email" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="phone">Phone</label>
            <form:input path="phone" id="phone" class="form-Control"/>
        </div>


        <h3>Billing Address</h3>

        <div class="form-group">
            <label for="billingStreet">Street</label><form:errors path="billingAddress.street" cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.street" id="billingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingStreetNumber">Street Number</label><form:errors path="billingAddress.streetNumber" cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.streetNumber" id="billingStreetNumber" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCity">City</label><form:errors path="billingAddress.city" cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.city" id="billingCity" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="billingCounty">County</label><form:errors path="billingAddress.county" cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.county" id="billingCounty" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCountry">Country</label><form:errors path="billingAddress.country" cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.country" id="billingCountry" class="form-Control"/>
        </div>




        <br/><br/>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/" />" class="btn btn-default">Cancel</a>

        </form:form>

<%@include file="/WEB-INF/views/fragments/footer.jsp" %>