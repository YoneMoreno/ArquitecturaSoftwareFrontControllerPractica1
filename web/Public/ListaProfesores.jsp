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
