<%-- 
    Document   : Valoracion
    Created on : 27-mar-2018, 16:42:16
    Author     : YonePC
--%>

<%@page import="beans.Valoracion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    Valoracion valoracion = (Valoracion) request.getAttribute("valoracion");
%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Valoraciones</title>
    </head>
    <body>
        <h1>Curso: <%= valoracion.getCurso() %></h1>
        <h2>Asignatura: <%= valoracion.getAsignatura() %></h2>
        <h3>Valoracion: <%= valoracion.getValoracion() %></h3>
    </body>
</html>
