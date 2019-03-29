<%-- 
    Document   : productNew
    Created on : Aug 13, 2018, 3:08:38 PM
    Author     : hieuk
--%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- /Bán Chạy --> 
<div class="new_arrivals_agile_w3ls_info"> 
    <div class="container">
        <h3 class="wthree_text_info">Sản Phẩm Mới Nhất</h3>		
        <div>
            <div class="container">

                <c:forEach items="${listNew}" var="new">
                    <div class="col-md-3 product-men">
                        <div class="men-pro-item simpleCart_shelfItem">
                            <div class="men-thumb-item">
                                <img src="../jsp/frontend/temp/images/product_Images/${new.imageURL}" alt="" class="pro-image-front" width="200" height="235">
                                <img src="../jsp/frontend/temp/images/product_Images/${new.imageURL}" alt="" class="pro-image-back" width="200" height="235">
                                <div class="men-cart-pro">
                                    <div class="inner-men-cart-pro">
                                        <a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${new.productID}" class="link-product-add-cart">Chi Tiết</a>
                                    </div>
                                </div>
                                <span class="product-new-top">New</span>

                            </div>
                            <div class="item-info-product ">
                                <h4><a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${new.productID}">${new.productName}</a></h4>
                                <div class="info-product-price">
                                    <span class="item_price"><ftm:formatNumber type="number" maxFractionDigits="3" value="${new.price-new.discount}"/></span>

                                    <del><ftm:formatNumber type="number" maxFractionDigits="3" value="${new.price}"/></del>
                                </div>
                                <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                    <form action="<%=request.getContextPath()%>/cartController/addCart.htm?productID=${new.productID}" method="post">
                                        <fieldset>
                                            <input type="submit" name="submit" value="Thêm Giỏ Hàng" class="button"/>
                                        </fieldset>
                                    </form>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="clearfix"></div>
            </div>

        </div>	
        <br><br>

        <h3 class="wthree_text_info">Sản Phẩm Giảm Giá Lớn</h3>		
        <div>
            <div class="container">

                <c:forEach items="${listSale}" var="sale">
                    <div class="col-md-3 product-men">
                        <div class="men-pro-item simpleCart_shelfItem">
                            <div class="men-thumb-item">
                                <img src="../jsp/frontend/temp/images/product_Images/${sale.imageURL}" alt="" class="pro-image-front" width="200" height="235">
                                <img src="../jsp/frontend/temp/images/product_Images/${sale.imageURL}" alt="" class="pro-image-back" width="200" height="235">
                                <div class="men-cart-pro">
                                    <div class="inner-men-cart-pro">
                                        <a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${sale.productID}" class="link-product-add-cart">Chi Tiết</a>
                                    </div>
                                </div>
                                <span class="product-new-top">sale</span>

                            </div>
                            <div class="item-info-product ">
                                <h4><a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${sale.productID}">${sale.productName}</a></h4>
                                <div class="info-product-price">
                                    <span class="item_price"><ftm:formatNumber type="number" maxFractionDigits="3" value="${sale.price-sale.discount}"/></span>
                                    <del><ftm:formatNumber type="number" maxFractionDigits="3" value="${sale.price}"/></del>
                                </div>
                                <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                    <form action="<%=request.getContextPath()%>/cartController/addCart.htm?productID=${sale.productID}" method="post">
                                        <fieldset>
                                            <input type="submit" name="submit" value="Thêm Giỏ Hàng" class="button"/>
                                        </fieldset>
                                    </form>
                                </div>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="clearfix"></div>
            </div>

        </div>	
        <br><br>

        <h1 class="wthree_text_info">Danh Sách Sản Phẩm</h1>		
        <div>
            <div class="container">

                <c:forEach items="${listProduct}" var="pro">
                    <div class="contentPage">
                        <div class="col-md-3 product-men">
                            <div class="men-pro-item simpleCart_shelfItem">
                                <div class="men-thumb-item">
                                    <img src="../jsp/frontend/temp/images/product_Images/${pro.imageURL}" alt="" class="pro-image-front" width="200" height="235">
                                    <img src="../jsp/frontend/temp/images/product_Images/${pro.imageURL}" alt="" class="pro-image-back" width="200" height="235">
                                    <div class="men-cart-pro">
                                        <div class="inner-men-cart-pro">
                                            <a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${pro.productID}" class="link-product-add-cart">Chi Tiết</a>
                                        </div>
                                    </div>
                                    <span class="product-new-top">Hot</span>

                                </div>
                                <div class="item-info-product ">
                                    <h4><a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${pro.productID}">${pro.productName}</a></h4>
                                    <div class="info-product-price">
                                        <span class="item_price"> <ftm:formatNumber type="number" maxFractionDigits="3" value="${pro.price-pro.discount}"/></span>

                                        <del><ftm:formatNumber type="number" maxFractionDigits="3" value="${pro.price}"/></del>
                                    </div>
                                    <div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
                                        <form action="<%=request.getContextPath()%>/cartController/addCart.htm?productID=${pro.productID}" method="post">
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
<!-- //Bán chạy --> 
<!--/grids-->
<div class="agile_last_double_sectionw3ls">
    <div class="col-md-6 multi-gd-img multi-gd-text ">
        <a href="#" style="height: 350px; width: 635px"><img src="../jsp/frontend/temp/images/bot_1.jpg" alt=" " ><h4>Flat <span>5%</span> offer</h4></a>

    </div>
    <div class="col-md-6 multi-gd-img multi-gd-text ">
        <a href="#" style="height: 350px; width: 550px"><img src="../jsp/frontend/temp/images/bot_2.jpg" alt=" "><h4>Flat <span>5%</span> offer</h4></a>
    </div>
    <div class="clearfix"></div>
</div>							
<!--/grids-->

