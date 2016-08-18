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

<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide home-image" src="<c:url value="/resources/images/back1.jpg" />" alt="First slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Welcome to Le's Music Store</h1>
                    <p>Here you can browse and buy Instruments. Records and music related Accessories. Order How for Your Amazing New Kit!</p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide home-image" src="<c:url value="/resources/images/back2.jpg" />" alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Facts You Should know About Music</h1>
                    <p>Music brings jey, to all of our hearts. It's one of those, emotional arts.</p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide home-image " src="<c:url value="/resources/images/back3.jpg" />" alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>It's A Jazz Affair</h1>
                    <p>Through ups and downs, Somehow I manage to survive in life.</p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div><!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-2">


        </div>


        <div class="col-lg-4">
            <a href="<spring:url value="/product/productList/${'SmartPhone'}"/>">
                <img src="<c:url value="/resources/images/smartphones.png"/>" border="0" alt="Smartphone Image" width="300" height="225">
            </a>

            <h2 style="text-align: center">Smartphones:</h2>
            <p style="text-align: justify">So, you want to buy a new smartphones? If you're looking for the
                best smartphones, you've come to the right place. </p>

        </div>



        <div class="col-lg-4">
            <a href="<spring:url value="/product/productList/${'RegularPhone'}"/>">
                <img src="<c:url value="/resources/images/regularPhones.png"/>" border="0" alt="Regular Phones Image" width="300" height="225">
            </a>

            <h2 style="text-align: center">Regular Phones:</h2>
            <p style="text-align: justify">If you are looking for a Regular phone, look no further. We are offering wide range of phones at very competitive prices. </p>

        </div>
    </div>


    <%@ include file="/WEB-INF/views/fragments/footer.jsp" %>
