<%-- 
    Document   : Biblioteca
    Created on : 28-mar-2018, 15:07:52
    Author     : YonePC
--%>

<%@page import="beans.Biblioteca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    </head>
    <body>
        <%            
            Biblioteca biblioteca = (Biblioteca) request.getAttribute("biblioteca");
        %>
        <h1>Nombre: <%= biblioteca.getNombre()%></h1>
    </body>
</html>
