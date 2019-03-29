<%-- 
    Document   : header
    Created on : Aug 13, 2018, 2:43:13 PM
    Author     : hieuk
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!-- header -->
    <div class="header" id="home">
        <div class="container">
            <ul>
                <li> <a href="<%=request.getContextPath()%>/loginController/initLogin.htm"><i class="fa fa-unlock-alt" aria-hidden="true"></i> Đăng nhập </a></li>
                <c:forEach items="${Account}" var="ac">		<li><i class="fa fa-facebook" aria-hidden="true"></i> Tài khoản : ${ac.name}</li> 
                    <li> <a href="<%=request.getContextPath()%>/loginController/logout.htm" ><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Đăng xuất </a></li>


                    <li><i class="fa fa-linkedin" aria-hidden="true"></i> <a href="">${ac.mail}</a></li>
                    </c:forEach>
            </ul>
        </div>
    </div>
    <!-- //header -->
    <div class="header-bot">
        <div class="header-bot_inner_wthreeinfo_header_mid">
            <div class="col-md-4 logo_agile">
                <h1><a href="<%=request.getContextPath()%>/productController/getAll.htm"><span>W</span>eb Phone <i class="fa fa-shopping-bag top_logo_agile_bag" aria-hidden="true"></i></a></h1>
            </div>
            <!--header-bot--> 
            <div class="col-md-4 header-middle">
                <form action="searchProduct.htm" method="get">
                    <input type="search" name="searchName" placeholder="Tìm kiếm" required="">
                    <input type="submit" value=" ">
                    <div class="clearfix"></div>
                </form>
            </div>
            <!--header-bot--> 
            <div class="col-md-4 agileits-social top_content">
                <ul class="social-nav model-3d-0 footer-social w3_agile_social">
                    <li class="share">Chia sẻ : </li>
                    <li><a href="#" class="facebook">
                            <div class="front"><i class="fa fa-facebook" aria-hidden="true"></i></div>
                            <div class="back"><i class="fa fa-facebook" aria-hidden="true"></i></div></a></li>
                    <li><a href="#" class="twitter"> 
                            <div class="front"><i class="fa fa-twitter" aria-hidden="true"></i></div>
                            <div class="back"><i class="fa fa-twitter" aria-hidden="true"></i></div></a></li>
                    <li><a href="#" class="instagram">
                            <div class="front"><i class="fa fa-instagram" aria-hidden="true"></i></div>
                            <div class="back"><i class="fa fa-instagram" aria-hidden="true"></i></div></a></li>
                    <li><a href="#" class="pinterest">
                            <div class="front"><i class="fa fa-linkedin" aria-hidden="true"></i></div>
                            <div class="back"><i class="fa fa-linkedin" aria-hidden="true"></i></div></a></li>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</html>
