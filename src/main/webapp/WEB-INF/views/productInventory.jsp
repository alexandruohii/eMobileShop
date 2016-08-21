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
            <p class="lead">Here you can insert, delete or update products!</p>
            <a class="btn btn-default" href="<spring:url value="/admin/productInventory/all"/>" role="button">For all
                products, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/admin/productInventory/SmartPhone"/>" role="button">For
                all SmartPhones, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/admin/productInventory/RegularPhone"/>" role="button">For
                all Regular Phones, click here!</a>
        </div>
        <div class="jumbotron">
            <div class="row">
                <div class="col-md-12">
                    <a class="btn btn-primary"
                       href="<spring:url value="/admin/addProduct"/>" role="button">Add Product</a>
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
                                                                                  role="button">Info product</a></br>
                                    <a class="btn btn-warning"
                                       href="<spring:url value="/admin/editProduct/${product.productID}"/>"
                                       role="button">Edit product</a></br>
                                    <a class="btn btn-danger"
                                       href="<spring:url value="/admin/removeProduct/${product.productID}"/>"
                                       role="button">Del. product</a></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>


        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
