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
                        <th></th>

                        <th><h4>Here you can see the cart items!</h4></th>

                        </thead>
                        <c:forEach items="${cartItems}" var="cartItem">
                            <tr>
                                <td class="col-lg-2"><a
                                        href="<spring:url value="/product/productList/viewProduct/${cartItem.product.productID}"  /> "
                                        target="_blank"><img
                                        src="<c:url value="/resources/images/${cartItem.product.productID}.jpg" />"
                                        alt="image" style="width:90%"/></a></td>
                                <td class="col-lg-4">${cartItem.product.name}</td>
                                <td class="col-lg-2" align="right">${cartItem.quantity} Pcs</td>
                                <td class="col-lg-2" align="right">${cartItem.totalPrice} Lei</td>
                                <td class="col-lg-2" align="right">
                                    <a class="btn btn-danger"
                                       href="<spring:url value="/customer/cart/remove/${cartItem.cartItemId}"/>"
                                       role="button"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbspRemove&nbsp</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                    <table>
                        <tr>
                            <td width="40px"></td>
                            <td width="660px"><a class="btn btn-danger"
                                                 href="<spring:url value="/customer/cart/clearCart"/>"
                                                 role="button"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbspEmpty Cart</a></td>
                            </td>
                            <td class="col-lg-2" align="right"><strong>Total price: </strong><br>${totalPriceCart} Lei
                            </td>
                            <td class="col-lg-2" align="right"><strong>Total price: </strong><br>${totalPriceCart} Lei
                            </td>
                            <td class="col-lg-2" align="right"><a class="btn btn-primary"
                                                                  href="<spring:url value="#"/>"
                                                                  role="button">Checkout</a></td>

                        </tr>

                    </table>


                </div>
            </div>

        </div>


        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
