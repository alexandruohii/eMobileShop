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


            <p class="lead">Check all ${type} available!</p>
            <a class="btn btn-default" href="<spring:url value="/product/productList/all"/>" role="button">For all phones,
                click here!</a>
            <a class="btn btn-default" href="<spring:url value="/product/productList/SmartPhone"/>" role="button">For all
                SmartPhones, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/product/productList/RegularPhone"/>" role="button">For all
                Regular Phones, click here!</a>
        </div>

        <div class="container">
            <div class="jumbotron">
                <div class="row">


                    <div class="col-md-12">
                        <table class="table table-stripped ">
                            <thead>

                            <th>Photo Thumb</th>
                            <th>Product Name</th>
                            <th>Type</th>
                            <th>Price</th>
                            <th></th>

                            </thead>
                            <c:forEach items="${products}" var="product">
                                <tr>
                                    <td width="200px"><a href="default.asp"><img
                                            src="<c:url value="/resources/images/${product.productID}.jpg" />"
                                            alt="image" style="width:90%"/></a></td>
                                    <td width="400px">${product.name}</td>
                                    <td>${product.phoneType}</td>
                                    <td>${product.price}</td>
                                    <td><a class="btn btn-default"
                                           href="<spring:url value="/product/productList/viewProduct/${product.productID}"/>"
                                           role="button">Info</a>
                                    </td>

                                </tr>
                            </c:forEach>
                        </table>


                    </div>
                </div>

            </div>


            <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
