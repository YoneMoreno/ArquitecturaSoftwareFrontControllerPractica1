<%-- 
    Document   : Asignatura
    Created on : 27-mar-2018, 15:34:04
    Author     : YonePC

    We get a school's subject and print its name and description
--%>

<%@page import="beans.Asignatura"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    Asignatura asignatura = (Asignatura) request.getAttribute("asignatura");

%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignatura</title>
    </head>
    <body>
        <h1>Nombre: <%= asignatura.getNombre()%></h1>
        <h1>Descripción: <%= asignatura.getDescripcion()%></h1>

    </body>
</html>
