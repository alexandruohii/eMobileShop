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


        <div class="container">
            <div class="jumbotron">
                <div class="row">


                    <div class="col-md-12">
                        <table class="table table-stripped ">
                            <thead>
                            <th>Product Name</th>
                            <th>Quantity</th>
                            <th>Price</th>
                            <th></th>
                            </thead>
                            <c:forEach items="${cartItems}" var="cartItem">
                                <tr>
                                    <td width="150px"><a
                                            href="<spring:url value="/product/productList/viewProduct/${cartItem.product.productID}"  /> "
                                            target="_blank"><img
                                            src="<c:url value="/resources/images/${cartItem.product.productID}.jpg" />"
                                            alt="image" style="width:90%"/></a></td>
                                    <td width="400px">${cartItem.product.name}</td>
                                    <td>${cartItem.quantity}</td>
                                    <td>${cartItem.totalPrice}</td>
                                    <td>
                                        <a class="btn btn-danger"
                                           href="<spring:url value="/customer/cart/remove/${cartItem.cartItemId}"/>"
                                           role="button">Remove product</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                        <table>
                            <tr>
                                <td width="400px"></td>
                                <td width="400px">Total price:</td>


                            </tr>

                        </table>


                    </div>
                </div>

            </div>


            <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
