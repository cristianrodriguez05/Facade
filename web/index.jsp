<%-- 
    Document   : index
    Created on : 11-may-2019, 23:10:14
    Author     : (╯°□°)╯︵ ┻━┻
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action ="Servlet" method="get">
            <label for="l2" name="prueba" value="${prueba}">Nombre    </label>
            <input type ="text" size="100" name ="c1" value ="${c1}">
            <br>
            <br>
            <label for="l2" name="prueba" value="${prueba}">Nick    </label>
            <input type ="text" size="100" name ="c2" value ="${c2}">
            <br>
            <br>
            <th><button type="submit" name="boton" value="i" >Registro</button></th>
            <th><button type="submit" name="boton" value="i1" >Actualizar</button></th>
            <th><button type="submit" name="boton" value="i2" >Eliminar</button></th>
            <br>
            <input type ="text" size="100" name ="c3" value ="${c3}">
            <th><button type="submit" name="boton" value="i3" >Consulta</button></th>
            <br>
            <br>
            <input type ="text" size="100" name ="c4" value ="${c4}">
        </form>

    </body>
</html>
