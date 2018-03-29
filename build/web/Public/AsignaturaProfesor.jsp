<%-- 
    Document   : AsignaturaProfesor
    Created on : 29-mar-2018, 14:42:33
    Author     : YonePC
--%>

<%@page import="beans.AsignaturaProfesor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignatura Profesor</title>
    </head>
    <body>

        <%            ;
            if (request.getParameter("nombre") != null && !request.getParameter("nombre").isEmpty()) {
                AsignaturaProfesor asignatura = new AsignaturaProfesor(request.getParameter("nombre"));

        %>

        <h1>Nombre: <%= asignatura.getNombre()%></h1>
        <%  }%>
    </body>
</html>
