<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <jsp:include page="../frontend/home/head.jsp"></jsp:include>
        <body>
        <jsp:include page="../frontend/home/header.jsp"></jsp:include>
        <jsp:include page="../frontend/home/menu.jsp"></jsp:include>
            <!--/single_page-->
            <!-- /banner_bottom_agile_info -->
            <div class="page-head_agile_info_w3l">

                <div class="container">
                    <h3>Single <span>Page </span></h3>
                    <!--/w3_short-->
                    <div class="services-breadcrumb">
                        <div class="agile_inner_breadcrumb">

                            <ul class="w3_short">
                                <li><a href="<%=request.getContextPath()%>/productController/getAll.htm">Home</a><i>|</i></li>
                            <li>Single Page</li>
                        </ul>
                    </div>
                </div>
                <!--//w3_short-->
            </div>
        </div>

        <!-- banner-bootom-w3-agileits -->
        <div class="banner-bootom-w3-agileits">
            <div class="container">

                <!--/slider_owl-->

                <div class="w3_agile_latest_arrivals">
                    <h1 class="wthree_text_info">Danh Sách Sản Phẩm</h1>		
                    <div>
                        <div class="container">

                            <c:forEach items="${listProductBC}" var="procat">
                                <div class="contentPage">
                                    <div class="col-md-3 product-men">
                                        <div class="men-pro-item simpleCart_shelfItem">
                                            <div class="men-thumb-item">
                                                <img src="../jsp/frontend/temp/images/product_Images/${procat.imageURL}" alt="" class="pro-image-front" width="200" height="235">
                                                <img src="../jsp/frontend/temp/images/product_Images/${procat.imageURL}" alt="" class="pro-image-back" width="200" height="235">
                                                <div class="men-cart-pro">
                                                    <div class="inner-men-cart-pro">
                                                        <a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${pro.productID}" class="link-product-add-cart">Chi Tiết</a>
                                                    </div>
                                                </div>
                                                <span class="product-new-top">Hot</span>

                                            </div>
                                            <div class="item-info-product ">
                                                <h4><a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${procat.productID}">${procat.productName}</a></h4>
                                                <div class="info-product-price">
                                                    <span class="item_price"> <ftm:formatNumber type="number" maxFractionDigits="3" value="${procat.price-procat.discount}"/></span>

                                                    <del><ftm:formatNumber type="number" maxFractionDigits="3" value="${procat.price}"/></del>
                                                </div>
                                                <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                                    <form action="<%=request.getContextPath()%>/cartController/addCart.htm?productID=${procat.productID}" method="post">
                                                        <fieldset>
                                                            <input type="submit" name="submit" value="Thêm Giỏ Hàng" class="button"/>
                                                        </fieldset>
                                                    </form>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <div class="clearfix"></div>

                            <!-- Hiên thị nút bấm -->
                            <ul id="pagination"></ul>
                        </div>

                    </div>	
                </div>
            </div>
        </div>
        <!--//single_page-->
        <jsp:include page="../frontend/home/footer.jsp"></jsp:include>
    </body>
</html>
