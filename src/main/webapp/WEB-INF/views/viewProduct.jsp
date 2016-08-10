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

            <h1>Product Detail</h1>
            <p class="lead">Here are the details of the product!</p>
        </div>
        <div class="container"><div class="jumbotron">

            <div class="row">

                <div class="col-md-5">
                    <img src="#" alt="image" style="width: 100%; height: 300px;"/>
                </div>
                <div class="col-md-5">
                 <h4>Title: ${product.name}</h4>
                    <p>Type: ${product.type}</p>
                    <p>Brand: ${product.brand} lala</p>
                    <p>Price: ${product.price} Lei</p>


                </div>
            </div>


            <div class="row">
                <div></div>
                <div class="col-md-8">
                    <p></p>
                    <p></p>
                    <h4>Description</h4>
                    <p style="text-justify: auto">${product.description}</p>
                </div>

            </div>

        </div>


        <%@include file="/WEB-INF/views/fragments/footer.jsp" %>
