<%-- 
    Document   : insertData
    Created on : Sep 21, 2018, 7:06:52 PM
    Author     : hieuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <f:form action="insert.htm" commandName="newData">
            <table>
                <tr>
                    <td>Ca ID</td>
                    <td><f:input path="catalogID"/></td>
                </tr>
                <tr>
                    <td>Ca Name</td>
                    <td><f:input path="catalogName"/></td>
                </tr>
                <tr>
                    <td>Ca parentID</td>
                    <td><f:input path="parentID"/></td>
                </tr>
                <tr>
                    <td>Ca priority</td>
                    <td><f:input path="catalogPriority"/></td>
                </tr>
                <tr>
                    <td>Ca status</td>
                    <td><f:input path="catalogStatus"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Them"/></td>
                </tr>
            </table>
        </f:form>
    </body>
</html>
