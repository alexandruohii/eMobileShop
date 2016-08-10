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
                    <c:forEach items="${listTypes}" var="type">
                   <div> <a class="btn btn-default btn-sm" href="<spring:url value="/productList/${type}"/>" role="button">${type}    &raquo;</a></div>
                    </c:forEach>

                </div>
                <div class="col-md-10">
                    <table class="table table-stripped table-hover">
                        <thead>

                            <th>Photo Thumb</th>
                            <th>Product Name</th>
                            <th>Type</th>
                            <th>Price</th>
                            <th></th>

                        </thead>
                        <c:forEach items="${products}" var="product">
                            <tr>
                                <td><img src="#" alt="image"/></td>
                                <td>${product.name}</td>
                                 <td>${type}</td>
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
