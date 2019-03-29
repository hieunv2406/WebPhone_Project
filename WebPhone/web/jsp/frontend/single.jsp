<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
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
                                <li><a href="index.html">Home</a><i>|</i></li>
                                <li><c:out value="${singleProduct.productName}"></c:out></li>
                            </ul>
                        </div>
                    </div>
                    <!--//w3_short-->
                </div>
            </div>
            <div class="banner-bootom-w3-agileits">
                <div class="container">
                    <div class="container">
                        <div class="col-md-4 single-right-left ">
                            <div class="grid images_3_of_2">
                                <div class="flexslider">
                                    <ul class="slides">
                                        <c:forEach items="${listImg}" var="img">
                                        <li data-thumb="../jsp/frontend/temp/images/product_Images/${img.imgURL}" >
                                            <div class="thumb-image"> <img src="../jsp/frontend/temp/images/product_Images/${img.imgURL}" data-imagezoom="true" class="img-responsive"> </div>
                                        </li>
                                        </c:forEach>
                                    </ul>
                                    <div class="clearfix"></div>
                                </div>	
                            </div>
                        </div>

                        <div class="col-lg-8 single-right-left simpleCart_shelfItem">
                            <h3 class="mb-3"><c:out value="${singleProduct.title}"/> - <c:out value="${singleProduct.memory}"/> - <c:out value="${singleProduct.color}"/></h3>
                        <p class="mb-3">
                            <span class="item_price"><ftm:formatNumber type="number" maxFractionDigits="3"><c:out value="${singleProduct.price-singleProduct.discount}"/></ftm:formatNumber> VNĐ</span>
                            <del class="mx-2 font-weight-light"><ftm:formatNumber type="number" maxFractionDigits="3"><c:out value="${singleProduct.price}"/></ftm:formatNumber></del>
<!--                            <label>Free delivery</label>-->
                        </p>
                        <div class="single-infoagile">
                            <ul>
                                <li class="mb-3">
                                   Tặng: Cường lực + Ốp Lưng + Tai nghe khi mua gói BHV.
                                </li>
                                <li class="mb-3">
                                   Giảm: 100K áp dụng cho HS-SV.
                                </li>
                                <li class="mb-3">
                                    Giao hàng miễn phí: trung tâm Hà Nội.
                                </li>
                                <li class="mb-3">
                                    Tặng voucher 50K khi mua Phụ Kiện.
                                </li>
                            </ul>
                        </div>
                        <div class="product-single-w3l">
                            <p class="my-3">
                                <i class="far fa-hand-point-right mr-2"></i>
                                <label>12 Tháng </label> Bảo Hành Chính Hãng</p>
                            <ul><hr>
                                <label>Thông số kỹ thuật</label>
                                <br><br>
                                <li class="mb-1">
                                    <label class="col-md-4">Màn hình:</label> <c:out value="${productDetails.screen}"/>
                            </li><br>
                                <li class="mb-1">
                                    <label class="col-md-4">Hệ điều hành:</label> <c:out value="${productDetails.os}"/>
                                </li><br>
                                <li class="mb-1">
                                    <label class="col-md-4">CPU:</label> <c:out value="${productDetails.cpu}"/>
                                </li><br>
                                <li class="mb-1">
                                  <label class="col-md-4">Bộ nhớ trong(ROM):</label><c:out value="${productDetails.rom}"/>
                                </li><br>
                                <li class="mb-1">
                                    <label class="col-md-4">RAM:</label> <c:out value="${productDetails.ram}"/>
                                </li><br>
                                <li class="mb-1">
                                    <label class="col-md-4">CAMERA:</label> <c:out value="${productDetails.camera}"/>
                                </li><br>
                                <li class="mb-1">
                                    <label class="col-md-4">Thẻ SIM:</label> <c:out value="${productDetails.sim}"/>
                                </li><br>
                                <li class="mb-1">
                                    <label class="col-md-4">Dung lượng Pin:</label> <c:out value="${productDetails.pin}"/>
                                </li><br>
                                
                            </ul>
                        </div>
                        <div class="occasion-cart">
                            <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out">
                                <form action="<%=request.getContextPath()%>/cartController/addCart.htm?productID=${singleProduct.productID}" method="post">
                                    <fieldset>
                                        <input type="submit" name="submit" value="Mua ngay" class="button" />
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="clearfix"> </div>
                    <!-- /new_arrivals --> 
                    <div class="responsive_tabs_agileits"> 
                        <div id="horizontalTab">
                            <ul class="resp-tabs-list">
                                <li>Description</li>
                                <li>Reviews</li>
                                <li>Information</li>
                            </ul>
                            <div class="resp-tabs-container">
                                <!--/tab_one-->
                                <div class="tab1">

                                    <div class="single_page_agile_its_w3ls">
                                        <h6>Lorem ipsum dolor sit amet</h6>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>
                                        <p class="w3ls_para">Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>
                                    </div>
                                </div>
                                <!--//tab_one-->
                                <div class="tab2">

                                    <div class="single_page_agile_its_w3ls">
                                        <div class="bootstrap-tab-text-grids">
                                            <div class="bootstrap-tab-text-grid">
                                                <div class="bootstrap-tab-text-grid-left">
                                                    <img src="../jsp/frontend/temp/images/t1.jpg" alt=" " class="img-responsive">
                                                </div>
                                                <div class="bootstrap-tab-text-grid-right">
                                                    <ul>
                                                        <li><a href="#">Admin</a></li>
                                                        <li><a href="#"><i class="fa fa-reply-all" aria-hidden="true"></i> Reply</a></li>
                                                    </ul>
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget.Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis 
                                                        suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem 
                                                        vel eum iure reprehenderit.</p>
                                                </div>
                                                <div class="clearfix"> </div>
                                            </div>
                                            <div class="add-review">
                                                <h4>add a review</h4>
                                                <form action="#" method="post">
                                                    <input type="text" name="Name" required="Name">
                                                    <input type="email" name="Email" required="Email"> 
                                                    <textarea name="Message" required=""></textarea>
                                                    <input type="submit" value="SEND">
                                                </form>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                                <div class="tab3">

                                    <div class="single_page_agile_its_w3ls">
                                        <h6>Big Wing Sneakers (Navy)</h6>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>
                                        <p class="w3ls_para">Lorem ipsum dolor sit amet, consectetur adipisicing elPellentesque vehicula augue eget nisl ullamcorper, molestie blandit ipsum auctor. Mauris volutpat augue dolor.Consectetur adipisicing elit, sed do eiusmod tempor incididunt ut lab ore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco. labore et dolore magna aliqua.</p>
                                    </div>
                                </div>
                            </div>
                        </div>	
                    </div>
                    <!-- //new_arrivals --> 
                    <!--/slider_owl-->

                    <div class="w3_agile_latest_arrivals">
                        <h3 class="wthree_text_info">Sản phẩm <span>liên quan</span></h3>
                        <c:forEach items="${listNew}" var="pro">
                        <div class="col-md-3 product-men single">
                            <div class="men-pro-item simpleCart_shelfItem">
                                <div class="men-thumb-item">
                                    <img src="../jsp/frontend/temp/images/product_Images/${pro.imageURL}" alt="" class="pro-image-front" width="200" height="235">
                                    <img src="../jsp/frontend/temp/images/product_Images/${pro.imageURL}" alt="" class="pro-image-back" width="200" height="235">
                                    <div class="men-cart-pro">
                                        <div class="inner-men-cart-pro">
                                            <a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${pro.productID}" class="link-product-add-cart">Chi tiết</a>
                                        </div>
                                    </div>
                                    <span class="product-new-top">New</span>

                                </div>
                                <div class="item-info-product ">
                                    <h4><a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${pro.productID}">${pro.productName}</a></h4>
                                    <div class="info-product-price">
                                        <span class="item_price">${pro.price-pro.discount}</span>
                                        <del>${pro.price}</del>
                                    </div>
                                    <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                        <form action="<%=request.getContextPath()%>/cartController/addCart.htm?productID=${pro.productID}" method="post">
                                            <fieldset>
        
                                                <input type="submit" name="submit" value="Thêm giỏ hàng" class="button">
                                            </fieldset>
                                        </form>
                                    </div>

                                </div>
                            </div>
                        </div>
                       </c:forEach>
                        <div class="clearfix"> </div>
                        <!--//slider_owl-->
                    </div>
                </div>
            </div>
            <!--//single_page-->
            <!-- footer -->
            <jsp:include page="../frontend/home/footer.jsp"></jsp:include>
            <!-- //footer -->




    </body>
</html>
