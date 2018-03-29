<%-- 
    Document   : AsignaturaProfesor
    Created on : 29-mar-2018, 14:42:33
    Author     : YonePC
--%>

<%@page import="beans.Tema"%>
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
                session.setAttribute("asignaturaProfesor", asignatura);
            }
        %>

        <% 
            if(session.getAttribute("asignaturaProfesor") != null){
                AsignaturaProfesor asignaturaProfesor = (AsignaturaProfesor) session.getAttribute("asignaturaProfesor");
            
        %>
       
                <h1>Nombre de la asignatura: <%= asignaturaProfesor.getNombre() %></h1>
                
                <% } %>

        <form action="./AsignaturaProfesor.jsp" method="GET">
            <h2>Crear tema</h2>
            <label for="titulo">Titulo: </label><input type="text" name="titulo"/><br>
            <label for="descripcion">Descripcion: </label><input type="text" name="descripcion"/><br>
            <input type="submit" value="Crear tema"/><br>
        </form>
        
        <% 
            
        if(request.getParameter("titulo") != null && !request.getParameter("titulo").isEmpty()
                && request.getParameter("descripcion") != null && !request.getParameter("descripcion").isEmpty()){
            Tema tema = new Tema(request.getParameter("titulo"),request.getParameter("descripcion"));
            
        
        %>
        
        <h3>Nombre del tema: <%= tema.getNombre() %></h3>
        
        <% } %>
    </body>
</html>
