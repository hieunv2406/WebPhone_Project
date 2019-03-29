<%-- 
    Document   : banner_single
    Created on : Aug 20, 2018, 12:22:15 PM
    Author     : hieuk
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- Menu - Banner -->
    <div class="ban-top">
        <div class="container">
            <div class="top_nav_left">
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <!--                         Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <!--                         Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse menu--shylock" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav menu__list">
                                <li class="active menu__item">
                                    <a class="menu__link" href="<%=request.getContextPath()%>/productController/getAll.htm">Home <span class="sr-only">(current)</span></a></li>
                                <li class="dropdown menu__item">
                                    <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Điện Thoại<span class="caret"></span></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="agile_inner_drop_nav_info">
                                            <div class="col-sm-6 multi-gd-img1 multi-gd-text ">
                                                <a href="mens.html"><img src="../jsp/frontend/temp/images/top2.jpg" alt=" "/></a>
                                            </div>
                                            <div class="col-sm-6 multi-gd-img">

                                                <div class="row">
                                                    <c:forEach items="${listCatalogSP}" var="smart">
                                                        <div class="col-xs-6 "style="padding: 1%">
                                                            <a href="<%=request.getContextPath()%>/productController/getProductByCatalogID.htm?catalogID=${smart.catalogID}">${smart.catalogName}</a>
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </ul>
                                </li>
                                <li class="dropdown menu__item">
                                    <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Tablet<span class="caret"></span></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="agile_inner_drop_nav_info">
                                            <div class="col-sm-6 multi-gd-img1 multi-gd-text ">
                                                <a href="mens.html"><img src="../jsp/frontend/temp/images/top1.jpg" alt=" "/></a>
                                            </div>
                                            <div class="col-sm-6 multi-gd-img">

                                                <div class="row">
                                                    <c:forEach items="${listCatalogTB}" var="tablet">
                                                        <div class="col-xs-6 "style="padding: 1%">
                                                            <a href="<%=request.getContextPath()%>/productController/getProductByCatalogID.htm?catalogID=${tablet.catalogID}">${tablet.catalogName}</a>
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </ul>
                                </li>
                                <li class="dropdown menu__item">
                                    <a href="#" class="dropdown-toggle menu__link" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Phụ kiện<span class="caret"></span></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <div class="agile_inner_drop_nav_info">
                                            <div class="col-sm-6 multi-gd-img1 multi-gd-text ">
                                                <a href="mens.html"><img src="../jsp/frontend/temp/images/top2.jpg" alt=" "/></a>
                                            </div>
                                            <div class="col-sm-6 multi-gd-img">

                                                <div class="row">
                                                    <c:forEach items="${listCatalogAC}" var="ac">
                                                        <div class="col-xs-6 " style="padding: 1%">
                                                            <a href="<%=request.getContextPath()%>/productController/getProductByCatalogID.htm?catalogID=${ac.catalogID}">${ac.catalogName}</a>
                                                        </div>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </ul>
                                </li>
                                <li class=" menu__item"><a class="menu__link" href="contact.html">Liên Hệ</a></li>
                                <li class=" menu__item"><a class="menu__link" href="about.html">Thông Tin</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>	
            </div>
            <div class="top_nav_right">
                <div class="wthreecartaits wthreecartaits2 cart cart box_1"> 
                    <form action="<%=request.getContextPath()%>/cartController/listCart.htm" method="post" class="last"> 

                        <button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
                    </form>  

                </div>

            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <!-- //banner-top -->


</html>
