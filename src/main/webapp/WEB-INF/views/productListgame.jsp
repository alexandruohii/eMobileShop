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

            <h1>All products</h1>
            <p class="lead">Check all the products available!</p>
        </div>

        <div class="container"><div class="jumbotron">
            <div class="row">

                <div class="col-md-2">
                    <h4 style="color: #005EB8">Product Type</h4>
                    <a class="btn btn-default btn-sm" href="<spring:url value="/productList/${'Games'}"/>" role="button">-Games    &raquo;</a>
                    <a class="btn btn-default btn-sm" href="<spring:url value="/productList/${'Software'}"/>" role="button">-Software &raquo;</a>
                    <a class="btn btn-default btn-sm" href="<spring:url value="/productList/${'Dvd'}"/>" role="button">-DVD's     &raquo;</a>
                    <a class="btn btn-default btn-sm" href="<spring:url value="/productList/"/>" role="button">All Products&raquo;</a>


                </div>
                <div class="col-md-10">
                    <table class="table table-stripped table-hover">
                        <thead>
                        <tr class="bg-success">
                            <th>Photo Thumb</th>
                            <th>Product Name</th>
                            <th>Type</th>
                            <th>Price</th>
                            <th></th>
                        </tr>
                        </thead>
                        <c:forEach items="${gameProducts}" var="gameProduct">
                            <tr>
                                <td><img src="#" alt="image"/></td>
                                <td>${gameProduct.name}</td>
                                    <%-- <td>${product.type}</td>--%>
                                <td>${product.price}</td>
                                <td><a class="btn btn-default"
                                       href="<spring:url value="/productList/viewProduct/${product.productID}"/>" role="button">Info</a>
                                </td>

                            </tr>
                        </c:forEach>
                    </table>


                </div>
            </div>

        </div>


            <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
