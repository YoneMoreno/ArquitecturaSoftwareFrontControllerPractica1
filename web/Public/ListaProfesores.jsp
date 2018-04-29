<%-- 
    Document   : ListaProfesores
    Created on : 29-abr-2018, 7:23:53
    Author     : YonePC
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de profesores</title>
    </head>
    <body>

        <form action="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet" class="form-inline">
            <input type="hidden" name="command" value="ProfesorSearchCommand">
            <input class="mr-sm-2" name="search" type="search" placeholder="Escribe para buscar"
                   aria-labels="search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Busca</button>
        </form>

        <div class="row">
            <%
                List<Profesor_1> allProfesors = (List<Profesor_1>) request.getAttribute("allProfesors");
                for (Profesor_1 profesor : allProfesors) {
            %>
            <%@include file="./TarjetaProfesor.jsp" %>
            <%}%>
        </div>
    </body>
    <%@include file="../Footer.jsp" %>
</html>
