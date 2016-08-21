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
            <h1>Please check the bellow information!</h1>

        </div>
        <form:form action="${pageContext.request.contextPath}/customer/order"
                   method="post" commandName="customer">

            <form:hidden path="idCustomer" value="${customer.idCustomer}"/>

        <div class="form-group">
            <label for="phone">Phone</label><form:errors path="phone" cssStyle="color: #ff0000"/>
            <form:input path="phone" id="phone" class="form-Control"/>
        </div>


        <h3>Billing Address</h3>
            <form:hidden path="billingAddress.billingId" value="${customer.billingAddress.billingId}"/>
        <div class="form-group">
            <label for="billingStreet">Street</label><form:errors path="billingAddress.street"
                                                                  cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.street" id="billingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingStreetNumber">Street Number</label><form:errors path="billingAddress.streetNumber"
                                                                               cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.streetNumber" id="billingStreetNumber" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCity">City</label><form:errors path="billingAddress.city" cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.city" id="billingCity" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="billingCounty">County</label><form:errors path="billingAddress.county"
                                                                  cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.county" id="billingCounty" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingCountry">Country</label><form:errors path="billingAddress.country"
                                                                    cssStyle="color: #ff0000"/>
            <form:input path="billingAddress.country" id="billingCountry" class="form-Control"/>
        </div>

        <h3>Shipping Address</h3>
            <form:hidden path="shippingAddress.shippingAddressId"
                         value="${customer.shippingAddress.shippingAddressId}"/>
        <div class="form-group">
            <label for="street">Street</label><form:errors path="shippingAddress.street" cssStyle="color: #ff0000"/>
            <form:input path="shippingAddress.street" id="street" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="streetNumber">Street Number</label><form:errors path="shippingAddress.streetNumber"
                                                                        cssStyle="color: #ff0000"/>
            <form:input path="shippingAddress.streetNumber" id="streetNumber" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="city">City</label><form:errors path="shippingAddress.city" cssStyle="color: #ff0000"/>
            <form:input path="shippingAddress.city" id="city" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="county">County</label><form:errors path="shippingAddress.county" cssStyle="color: #ff0000"/>
            <form:input path="shippingAddress.county" id="county" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="country">Country</label><form:errors path="shippingAddress.country" cssStyle="color: #ff0000"/>
            <form:input path="shippingAddress.country" id="country" class="form-Control"/>
        </div>

        <br/><br/>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/customer/cart" />" class="btn btn-default">Cancel</a>

        </form:form>

<%@include file="/WEB-INF/views/fragments/footer.jsp" %>