<%-- 
    Document   : UpdateCourse
    Created on : 28-abr-2018, 6:18:39
    Author     : YonePC
--%>

<%@page import="org.Curso_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar curso</title>
    </head>
    <body>
        <%
            if (request.getAttribute("curso") != null) {
                Curso_1 curso = (Curso_1) request.getAttribute("curso");

        %>
        <form action="FrontServlet" method="POST">
            <h2 style="font-weight: 700">Titulo:</h2>
            <input style="width:100%" type="text" name="titulo" required value="<%= curso.getTitulo()%>"/>
            <h2 style="font-weight: 700">Autor:</h2>
            <input style="width:100%" type="text" name="autor" required value="<%= curso.getAutor()%>"/>
            <h2 style="font-weight: 700">Asignatura:</h2>
            <select  style="width:100%" name="asignatura" value="<%= curso.getAsignatura()%>">
                <option value="Matematicas">Matematicas</option>
                <option value="Ingles">Ingles</option>
                <option value="Lengua">Lengua</option>
                <option value="Literatura">Literatura</option>
                <option value="Biologia">Biologia</option>
                <option value="Quimica">Quimica</option>
                <option value="Fisica">Fisica</option>
                <option value="Programacion">Programacion</option>
                <option value="Frances">Frances</option>
                <option value="Chino">Chino</option>
            </select>
            <h2 style="font-weight:700"> Duracion (en horas):</h2>
            <input style="width:100%" type="number" name="duracion" value="<%= curso.getDuracion()%>"/>
            <h2 style="font-weight:700">Enlace al curso en video:</h2>
            <input style="width:100%" type="url" name="video" pattern="https?://.+" title="video"
                   value="<%= curso.getVideo()%>">
            <h2 style="font-weight:700">Enlace a la imagen del curso:</h2>
            <input style="width:100%" type="url" name="imagen" pattern="https?://.+" title="imagen"
                   value="<%= curso.getImagen()%>">

            <input type="hidden" name="command" value="CourseInfoCommand">
            <input type="submit" value="Crear curso" onclick="alert('El curso se ha creado');">
        </form>
        <%}%>
    </body>
</html>
