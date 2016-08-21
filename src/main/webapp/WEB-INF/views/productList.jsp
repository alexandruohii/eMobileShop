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
            <p class="lead">Find below our current stock!</p>
            <a class="btn btn-default" href="<spring:url value="/product/productList/all"/>" role="button">For all
                phones, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/product/productList/SmartPhone"/>" role="button">For
                all SmartPhones, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/product/productList/RegularPhone"/>" role="button">For
                all Regular Phones, click here!</a>
        </div>
        <div class="jumbotron">
            <div class="row">
                <div class="col-md-12">
                    <table class="table table-stripped ">
                        <thead>
                        <tr>
                            <th>Photo</th>
                            <th>Product Name</th>
                            <th>Type</th>
                            <th class="text-right">Price</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${products}" var="product">
                            <tr>
                                <td class="col-md-2"><a
                                        href="<spring:url value="/product/productList/viewProduct/${product.productID}"  /> "><img
                                        src="<c:url value="/resources/images/${product.productID}.jpg" />"
                                        alt="No Photo" style="width:80%"/></a></td>
                                <td class="col-md-5">${product.name}</td>
                                <td class="col-md-2">${product.phoneType}</td>
                                <td class="col-md-1" style="text-align: right">${product.price}</td>
                                <td class="col-md-2" style="text-align: right"><a class="btn btn-default"
                                                                                  href="<spring:url value="/product/productList/viewProduct/${product.productID}"/>"
                                                                                  role="button">Info</a></td>

                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>


        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
