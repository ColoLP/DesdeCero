
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
          <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        
        <!--
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    -->
    </head>
    
        <h1>Formulario de Spring Web MVC.</h1>
        <form:form method="POST" commandName="persona">
            
            <form:errors path="*" element="div" cssClass="card-panel white-text red lighten-2"/>
            
            <p>
                <form:label path="nombre">Nombre</form:label>
                <form:input path="nombre"/>
                <form:errors cssClass="card-panel white-text red lighten-2" />
            </p>
            
            <p>
                <form:label path="correo">Correo:</form:label>
                <form:input path="correo"/>
            </p>
            
            <p>
                <form:label path="edad">Edad</form:label>
                <form:input path="edad"/>                     
            </p>
            
            <p>
                <form:label path="pais">Pais: </form:label>
                <form:select path="pais">
                    <form:option value="0">Seleccione...</form:option>
                    <form:options items="${lstPaises}"></form:options>
                </form:select>
            </p>
            
            <form:button>MandaleMecha</form:button>
             
        </form:form>
            
          
        
    
</html>
