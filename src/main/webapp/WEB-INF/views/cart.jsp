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
            <h3>Here is your current cart!</h3>
        </div>
        <div class="jumbotron">
            <div class="row">
                <div class="col-md-12">
                    <table class="table table-stripped  ">
                        <thead>
                        <tr>
                            <th></th>
                            <th>Product</th>
                            <th class="text-right">Qty</th>
                            <th class="text-right">Price</th>
                            <th class="text-right">Total Price</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <c:if test="${cartItems.size()<1}">
                                <td class="col-md-5"> No products in cart!</td>
                            </c:if>
                            <c:if test="${cartItems.size()>=1}">
                                <c:forEach items="${cartItems}" var="cartItem">
                                    <td class="col-md-1"><a
                                            href="<spring:url value="/product/productList/viewProduct/${cartItem.product.productID}"  /> "
                                            target="_blank"><img
                                            src="<c:url value="/resources/images/${cartItem.product.productID}.jpg" />"
                                            alt="image" style="width:100%"/></a></td>
                                    <td class="col-md-5">${cartItem.product.name}</td>
                                    <td class="col-md-1" style="text-align: right">${cartItem.quantity} Pcs</td>
                                    <td class="col-md-2" style="text-align: right">${cartItem.product.price} Lei</td>
                                    <td class="col-md-2" style="text-align: right">${cartItem.totalPrice} Lei</td>
                                    <td class="col-md-1" style="text-align: right"><a class="btn btn-danger"
                                                                                      href="<spring:url value="/customer/cart/remove/${cartItem.cartItemId}"/>"
                                                                                      role="button"><span
                                            class="glyphicon glyphicon-trash" aria-hidden="true">
                                                                                 </span>&nbspRemove</a></td>
                                </c:forEach>
                            </c:if>
                        </tr>
                        <tr>
                            <td>
                                <c:if test="${cartItems.size()<1}">
                                    <a href="#" class="btn btn-danger disabled"
                                       role="button"><span class="glyphicon glyphicon-trash"
                                                           aria-hidden="true"></span>&nbspEmpty Cart</a>
                                </c:if>
                                <c:if test="${cartItems.size()>=1}">
                                    <a class="btn btn-danger"
                                       href="<spring:url value="/customer/cart/clearCart"/>"
                                       role="button"><span class="glyphicon glyphicon-trash"
                                                           aria-hidden="true"></span>&nbspEmpty Cart</a>
                                </c:if>
                            </td>
                            <td><a class="btn btn-primary"
                                   href="<spring:url value="/product/productList/all"/>"
                                   role="button">Back to Shoppping</a></td>
                            <td></td>
                            <td style="text-align: right"><strong>Total price: </strong></td>
                            <td style="text-align: right; color: #a0162f"><strong>${totalPriceCart} Lei</strong></td>
                            <td>
                                <c:if test="${cartItems.size()<1}">
                                    <a href="#" class="btn btn-primary disabled"
                                       role="button">Checkout</a>
                                </c:if>
                                <c:if test="${cartItems.size()>=1}">
                                    <a class="btn btn-primary"
                                       href="<spring:url value="/customer/order"/>"
                                       role="button">Checkout>></a>
                                </c:if>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
