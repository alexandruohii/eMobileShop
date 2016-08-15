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
            <a class="btn btn-default" href="<spring:url value="/admin/productInventory/all"/>" role="button">For all products, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/admin/productInventory/SmartPhone"/>" role="button">For all SmartPhones, click here!</a>
            <a class="btn btn-default" href="<spring:url value="/admin/productInventory/RegularPhone"/>" role="button">For all Regular Phones, click here!</a>
        </div>

        <div class="container"><div class="jumbotron">
            <div class="row">


                <div class="col-md-12">
                    <a class="btn btn-primary"
                       href="<spring:url value="/admin/addProduct"/>" role="button">Add Product</a>
                    <table class="table table-stripped " >
                        <thead>

                        <th>Photo Thumb</th>
                        <th>Product Name</th>
                        <th>Type</th>
                        <th>Price</th>
                        <th></th>

                        </thead>
                        <c:forEach items="${products}" var="product">
                            <tr>
                                <td width="150px"><a href="default.asp"><img src="<c:url value="/resources/images/${product.productID}.jpg" />" alt="image" style="width:90%"/></a></td>
                                <td width="400px" >${product.name}</td>
                                <td>${product.phoneType}</td>
                                <td>${product.price}</td>
                                <td><a class="btn btn-default"
                                       href="<spring:url value="/productList/viewProduct/${product.productID}"/>" role="button">Info product</a></br>
                                    <a class="btn btn-warning"
                                       href="<spring:url value="/admin/editProduct/${product.productID}"/>" role="button">Edit product</a></br>
                                    <a class="btn btn-danger"
                                       href="<spring:url value="/admin/removeProduct/${product.productID}"/>" role="button">Del. product</a>
                                </td>


                            </tr>
                        </c:forEach>
                    </table>


                </div>
            </div>

        </div>


            <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
