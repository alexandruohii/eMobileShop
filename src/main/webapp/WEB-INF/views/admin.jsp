<%--
  Created by IntelliJ IDEA.
  User: Alx
  Date: 8/7/2016
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="/WEB-INF/views/fragments/header.jsp" %>

<div class="container-wrapper">

    <div class="container">

        <div class="page-header">

            <h1>Administrator Page</h1>
            <p class="lead">Administrator page!</p>
        </div>

<h3>

    <a href="<c:url value="/admin/productInventory/all"/>">Product Inventory</a>

</h3>

        <p> Here you can view or modify  the product</p>

            <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
