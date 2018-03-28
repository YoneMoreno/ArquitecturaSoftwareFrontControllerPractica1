<%-- 
    Document   : Libro
    Created on : 28-mar-2018, 16:01:58
    Author     : YonePC
--%>

<%@page import="beans.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Libro</title>
    </head>
    <body>
        <% 
            Libro libro = new Libro(request.getParameter("nombre"),request.getParameter("autor"));
        %>
        <h1>Nombre: <%= libro.getNombre() %></h1>
        <h1>Autor: <%= libro.getAutor() %></h1>
    </body>
</html>
