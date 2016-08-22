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
            <h3>Order confirmation</h3>

        </div>
        <div class="container">
            <div class="well col-md-8 col-md-offset-2">
                <h3>Order confirmation</h3>
                <div class="row">
                    <form:form action="${pageContext.request.contextPath}/customer/order/confirmation"
                               method="post" commandName="customer">
                    <div class="col-md-6 ">
                        <strong>${customer.name}</strong> <br>
                        ${customer.email}<br>
                        ${customer.phone}
                    </div>
                    <div class="col-md-6">
                        <strong>Order Date: </strong> ${orderDate}<br>
                       <strong>Estimated shipping date: </strong>${shippingDate}

                    </div>
                </div>
                <br>
                <div class="row">
                    <div class="col-md-6">
                        <strong>Billing Address</strong><br>
                        ${customer.billingAddress.street},
                        ${customer.billingAddress.streetNumber}<br>
                        ${customer.billingAddress.city},
                        ${customer.billingAddress.country}<br>
                        ${customer.billingAddress.country}<br>
                    </div>
                    <div class="col-md-6">
                        <strong>Shipping Address</strong><br>
                        ${customer.shippingAddress.street},
                        ${customer.shippingAddress.streetNumber}<br>
                        ${customer.shippingAddress.city},
                        ${customer.shippingAddress.country}<br>
                        ${customer.shippingAddress.country}<br>
                    </div>
                </div>
                <div class="row">
                    <table class="table table-hover">
                        <thead>
                        <br>
                        <tr>
                            <td>Product</td>
                            <td class="text-right">Qty</td>
                            <td class="text-right">Price</td>
                            <td class="text-right">Total</td>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="cartItem" items="${customer.cart.cartItems}">
                            <tr>
                                <td class="col-md-7">${cartItem.product.name}</td>
                                <td class="col-md-1" style="text-align: right">${cartItem.quantity}</td>
                                <td class="col-md-2" style="text-align: right">${cartItem.product.price}</td>
                                <td class="col-md-2" style="text-align: right">${cartItem.totalPrice}</td>
                            </tr>
                        </c:forEach>

                        <tr>
                            <td></td>
                            <td></td>
                            <td class="text-right">
                                <h4><strong>Total cost:</strong></h4>
                            </td>
                            <td class="text-center text-danger">
                                <h4><strong> ${customer.cart.cartPrice} Lei</strong></h4>
                            </td>
                        </tr>

                        </tbody>
                    </table>
                </div>
                <div align="right">
                <a href="<c:url value="/customer/order" />" class="btn btn-default">Back</a>
                    <input type="submit" value="submit" class="btn btn-default">
                <a href="<c:url value="/customer/cart" />" class="btn btn-default">Cancel</a>
                    </form:form>
            </div>
        </div>
    </div>

    <br>

    <br>

    <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
