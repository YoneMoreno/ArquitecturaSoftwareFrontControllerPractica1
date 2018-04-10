<%-- 
    Document   : Valoracion
    Created on : 27-mar-2018, 16:42:16
    Author     : YonePC

   Valoracion.jsp has the aim to display the details of the assessment (rating) which the pupils
give to the teacher.
The rating's details are: course's name, subject's title and points.
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
