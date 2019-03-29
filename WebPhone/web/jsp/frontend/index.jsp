<%-- 
    Document   : Home
    Created on : Aug 10, 2018, 6:39:10 PM
    Author     : hieuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <jsp:include page = "../frontend/home/head.jsp"></jsp:include>
        
    <body class="">
        <div class="page">
        <jsp:include page = "../frontend/home/header.jsp"></jsp:include>
           <jsp:include page = "../frontend/home/menu.jsp"></jsp:include>
           <jsp:include page = "../frontend/home/banner.jsp"></jsp:include>
           <jsp:include page = "../frontend/home/listProduct.jsp"></jsp:include>
           <jsp:include page = "../frontend/home/footer.jsp"></jsp:include>
        </div>
    </body>
</html>
