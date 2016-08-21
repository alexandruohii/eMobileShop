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
            <h1>Add Product</h1>
            <p class="lead">Fill the below information to add a product:</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/admin/addProduct"
                   method="post" commandName="product">

        <div class="form-group">
            <label for="category">Category</label><form:errors path="phoneType" cssStyle="color: #ff0000"/>
            <label class="checkbox-inline"><form:radiobutton path="phoneType" id="category" value="SmartPhone"/>SmartPhone</label>
            <label class="checkbox-inline"><form:radiobutton path="phoneType" id="category" value="RegularPhone"/>RegularPhone</label>
        </div>

        <div class="form-group">
            <label for="name">Name</label><form:errors path="name" cssStyle="color: #ff0000"/>
            <form:input path="name" id="name" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="price">Price</label><form:errors path="price" cssStyle="color: #ff0000"/>
            <form:input path="price" id="price" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="brand">Brand</label><form:errors path="brand" cssStyle="color: #ff0000"/>
            <form:input path="brand" id="brand" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="description" id="description" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="slimSlots">SlimSlots</label><form:errors path="slimSlots" cssStyle="color: #ff0000"/>
            <label class="checkbox-inline"><form:radiobutton path="slimSlots" id="slimSlots" value="Single Sim"/>Single
                Sim</label>
            <label class="checkbox-inline"><form:radiobutton path="slimSlots" id="slimSlots" value="Dual Sim"/>Dual
                Sim</label>
        </div>

        <div class="form-group">
            <label for="touchscreen">Touchscreen</label><form:errors path="touchscreen" cssStyle="color: #ff0000"/>
            <label class="checkbox-inline"><form:radiobutton path="touchscreen" id="touchscreen" value="Da"/>Da</label>
            <label class="checkbox-inline"><form:radiobutton path="touchscreen" id="touchscreen" value="Nu"/>Nu</label>
        </div>

        <div class="form-group">
            <label for="color">Color:</label><form:errors path="color" cssStyle="color: #ff0000"/>
            <form:input path="color" id="color" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="simType">SimType:</label><form:errors path="simType" cssStyle="color: #ff0000"/>
            <label class="checkbox-inline"><form:radiobutton path="simType" id="simType" value="Full size SIM"/>Full
                size SIM</label>
            <label class="checkbox-inline"><form:radiobutton path="simType" id="simType" value="Micro SIM"/>Micro
                SIM</label>
            <label class="checkbox-inline"><form:radiobutton path="simType" id="simType" value="Nano SIM"/>Nano
                SIM</label>
        </div>

        <div class="form-group">
            <label for="otherOptions">Other options:</label>
            <form:textarea path="otherOptions" id="otherOptions" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="phoneLink">Phone Link:</label>
            <form:input path="phoneLink" id="phoneLink" class="form-Control"/>
        </div>
        <br/><br/>

        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory/all" />" class="btn btn-default">Cancel</a>

        </form:form>

<%@include file="/WEB-INF/views/fragments/footer.jsp" %>