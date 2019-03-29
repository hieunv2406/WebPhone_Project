<%-- 
    Document   : ShoppingCart
    Created on : Aug 19, 2018, 11:29:14 PM
    Author     : hieuk
--%>





<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>


    <jsp:include page="../frontend/home/head.jsp"></jsp:include>
        <head>
            <link href="../jsp/frontend/cart/cartCss.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>
        <jsp:include page="../frontend/home/header.jsp"></jsp:include>
        <jsp:include page="../frontend/home/menu.jsp"></jsp:include>
            <!--/single_page-->
            <!-- /banner_bottom_agile_info -->
            <div class="page-head_agile_info_w3l">

                <div class="container">
                    <!--			<h3>Giỏ <span>Hàng </span></h3>-->
                    <br><br>
                    <!--/w3_short-->
                    <div class="services-breadcrumb">
                        <div class="agile_inner_breadcrumb">

                            <ul class="w3_short">
                                <li><a href="<%=request.getContextPath()%>/productController/getAll.htm">Trang chủ</a><i>|</i></li>
                                <li>Giỏ hàng</li>
                            </ul>
                        </div>
                    </div>
                    <!--//w3_short-->
                </div>
            </div>

        <br><br>
        <h2 class="text-center">Giỏ Hàng</h2>
        <div class="container"> 
            <form action="updateCart.htm" method="post" >
            <table id="cart" class="table table-hover table-condensed"> 
                <thead> 
                    <tr> 
                        <th style="width:50%">Tên sản phẩm</th> 
                        <th style="width:10%">Giá</th> 
                        <th style="width:8%">Số lượng</th> 
                        <th style="width:22%" class="text-center">Thành tiền</th> 
                        <th style="width:10%">Tác vụ</th> 
                    </tr> 
                </thead> 
                <tbody>
                    <c:forEach items="${listCart}" var="cart">
                    <tr> 
                        <td data-th="Product"> 
                            <div class="row"> 
                                <div class="col-sm-2 hidden-xs"><a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${cart.product.productID}"><img src="../jsp/frontend/temp/images/product_Images/${cart.product.imageURL}" alt="${cart.product.productName}" class="img-responsive" width="100"></a></div> 
                                <div class="col-sm-10"> 
                                    <a href="<%=request.getContextPath()%>/productController/getProductByID.htm?productID=${cart.product.productID}"><h4 class="nomargin">${cart.product.productName}</h4></a>
                                    <p>${cart.product.productDescription}</p> 
                                </div> 
                            </div> 
                        </td> 
                        <td data-th="Price"><ftm:formatNumber type="number" maxFractionDigits="3" value="${cart.product.price-cart.product.discount}"/> vnđ</td> 
                        <td data-th="Quantity"><input class="form-control text-center" value="${cart.quantity}" type="number" name="quantity"></td>
                        <td data-th="Subtotal" class="text-center"><ftm:formatNumber type="number" maxFractionDigits="3" value="${(cart.product.price-cart.product.discount)*cart.quantity}"/> vnđ</td> 
                        <td class="actions" >
<!--                            <button class="btn btn-danger btn-sm">-->
                                <a href="<%=request.getContextPath()%>/cartController/removeCart.htm?productID=${cart.product.productID}" onclick="return confirm('Bạn muốn xóa sản phẩm này ?')">Xóa<i class="fa fa-trash-o"></i></a>
                            <!--</button>-->
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
                <tfoot> 
                    <tr class="visible-xs"> 
                        <td class="text-center"><strong>Tổng tiền:<ftm:formatNumber type="number" maxFractionDigits="3" value="${totalAmount}"/> vnđ</strong>
                        </td> 
                    </tr> 
                    <tr> 
                        <td><a href="<%=request.getContextPath()%>/productController/getAll.htm" class="btn btn-warning"><i class="fa fa-angle-left"></i> Tiếp tục mua hàng</a>
                        </td> 
                        <td colspan="2" class=""><button class="btn btn-info btn-sm" type="submit"><i class="fa fa-edit" style="font-size: 16px"> Cập nhật giỏ</i></button></td> 
                        <td class="hidden-xs text-center"><strong>Tổng tiền: <ftm:formatNumber type="number" maxFractionDigits="3" value="${totalAmount}"/> vnđ</strong>
                        </td> 
                        <td><a href="#" class="btn btn-success btn-block">Thanh toán <i class="fa fa-angle-right"></i></a>
                        </td> 
                    </tr> 
                </tfoot> 
            </table>
                        </form>
        </div>
        <!--//single_page-->
        <jsp:include page="../frontend/home/footer.jsp"></jsp:include>       
    </body>
</html>
