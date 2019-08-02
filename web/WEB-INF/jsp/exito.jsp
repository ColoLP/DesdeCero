<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El amiguero que trajo del modelo es:</h1>
        
        <ul>
            <!-- Chequear que sea la tagblib que figura arriba sino tira error. -->
            <li>Nombre: <c:out value="${nombre}" /></li>
            <li>Correo: <c:out value="${correo}"/></li>
            <li>Edad: <c:out value="${edad}"/></li>
        </ul>
    </body>
</html>
