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
        <div class="container">
            <div class="jumbotron">
                <div class="row">
                    <div class="col-md-5">
                        <img src="<c:url value="/resources/images/${product.productID}.jpg" />" alt="image"
                             style="width:90%"/>
                    </div>
                    <div class="col-md-5">
                        <h3>${product.name}</h3>
                        <p><strong>Type:</strong> ${product.phoneType}</p>
                        <p><strong>Brand:</strong> ${product.brand} </p>
                        <p><strong>Price:</strong> ${product.price} Lei</p>
                        <br>
                        <br>


                        <c:if test="${pageContext.request.isUserInRole('ROLE_ADMIN')}">
                            <a class="btn btn-default"
                               href="<spring:url value="/admin/productInventory/all"/>" role="button"><< Back</a>
                        </c:if>
                        <c:if test="${!pageContext.request.isUserInRole('ROLE_ADMIN')}">
                            <a class="btn btn-default"
                               href="<spring:url value="/product/productList/all"/>" role="button"><< Back</a>
                        </c:if>
                        <c:if test="${!pageContext.request.isUserInRole('ROLE_ADMIN')}">
                            <a class="btn btn-primary"
                            <c:if test="${pageContext.request.isUserInRole('ROLE_USER')}">
                                onclick="alert('${product.name} added to Cart!');"
                            </c:if> "
                            href="<spring:url
                                value="/customer/cart/add/${product.productID}"/>" role="button">Add To Cart</a>
                            <a class="btn btn-warning"
                               href="<spring:url value="/customer/cart"/>" role="button">View Cart >></a>
                        </c:if>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <h4><strong>Description</strong></h4>
                    <p style="text-align: justify">${product.description}</p>
                    <br>
                    <h4><strong>Specifications</strong></h4>
                    <br>
                    <p>CHARACTERISTICS</p>
                    <table class="table  table-hover" style="font-size: 14px; text-indent: 10px">
                        <tr>
                            <td style="width: 300px">Phone Type</td>
                            <td>${product.phoneType}</td>
                        </tr>
                        <tr>
                            <td style="width: 300px">SlimSlots</td>
                            <td>${product.slimSlots}</td>
                        </tr>
                    </table>
                    <p>GENERAL</p>
                    <table class="table  table-hover" style="font-size: 14px; text-indent: 10px">
                        <tr>
                            <td style="width: 300px">Touchscreen</td>
                            <td>${product.touchscreen}</td>
                        </tr>
                        <tr>
                            <td style="width: 300px">Color</td>
                            <td>${product.color}</td>
                        </tr>
                        <tr>
                            <td style="width: 300px">SIM Type:</td>
                            <td>${product.simType}</td>
                        </tr>
                    </table>
                    <p>OTHERS</p>
                    <table class="table  table-hover" style="font-size: 14px; text-indent: 10px">
                        <tr>
                            <td style="width: 300px">Other options:</td>
                            <td>${product.otherOptions}</td>
                        </tr>
                    </table>
                    <h3><a href="${product.phoneLink}" target="_blank"/>For full specifications, follow this link!</a>
                    </h3>
                </div>
            </div>
            <br>

            <br>

            <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
