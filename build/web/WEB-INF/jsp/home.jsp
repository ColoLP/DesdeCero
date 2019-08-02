<%-- 
    Document   : home
    Created on : 01/04/2019, 12:00:20
    Author     : Lucas Galetti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Ejemplo de Spring</title>
        <!-- Menos prolijo
        <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css"/>
        Mas prolijo-->
        <link href="<c:url value="/resources/css/style.css"></c:url>" rel="stylesheet" />
        <script src="<c:url value="/resources/js/funciones.js"></c:url>"></script>
        
    </head>
    <body>
        <h1>Aca iria el login o el home del control de Stock</h1>
        <ul>
            <li class="clase">Id devuelto = <c:out value="${id}" /></li>
            <li>Id2 Devuelto = ${id2}</li>
            
        </ul>
           
            <a href="javascript:void(0)" onclick="aloha()" />Hace click Amiguero
            <img src="<c:url value="/resources/img/logo.png"></c:url>"/>
    </body>
</html>
