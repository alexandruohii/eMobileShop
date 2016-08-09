<%--
  Created by IntelliJ IDEA.
  User: Alx
  Date: 8/7/2016
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/fragments/header.jsp" %>

<div class="container-wrapper">

    <div class="container">
        <div class="page-header">

            <h1>Product Detail</h1>
            <p class="lead">Here are the details of the product!</p>
        </div>
        <div class="container">

            <div class="row">

                <div class="col-md-5">
                    <img src="#" alt="image" style="width: 100%; height: 300px;"/>
                </div>
                <div class="col-md-5">
                    <h3>${product.name}</h3>
                    <p>${product.type}</p>
                    <p>${product.brand}</p>
                    <p>${product.price}</p>


                </div>
            </div>


            <div class="row">
                <div></div>
                <div class="col-md-8">
                    <p></p>
                    <p>${product.description}</p>
                </div>

            </div>

        </div>


        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
