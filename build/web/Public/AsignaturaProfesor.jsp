<%-- 
    Document   : AsignaturaProfesor
    Created on : 29-mar-2018, 14:42:33
    Author     : YonePC

    We get from parameters a teacher's subject (they are passed via GET in the URL after clicking
on an image, in Profesor.jsp, which has nombre=subjectsName). Then we display a form to create new
topics into the teacher's subject. In addition we display the List of topics.

--%>

<%@page import="java.util.Iterator"%>
<%@page import="beans.Tema"%>
<%@page import="beans.AsignaturaProfesor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignatura Profesor</title>
    </head>
    <body>

        <% 
            if (request.getParameter("nombre") != null && !request.getParameter("nombre").isEmpty()) {
                AsignaturaProfesor asignatura = new AsignaturaProfesor(request.getParameter("nombre"));
                session.setAttribute("asignaturaProfesor", asignatura);
            }
        %>

        <%
            if (session.getAttribute("asignaturaProfesor") != null) {
                AsignaturaProfesor asignaturaProfesor = (AsignaturaProfesor) session.getAttribute("asignaturaProfesor");

        %>

        <h1>Nombre de la asignatura: <%= asignaturaProfesor.getNombre()%></h1>

        <% } %>

        <form action="./AsignaturaProfesor.jsp" method="POST">
            <div class="form-group">
                <h2>Crear tema</h2>
                <label for="titulo">Titulo: </label><input class="form-control" type="text" name="titulo" required/><br>
                <label for="descripcion">Descripcion: </label><input class="form-control" type="text" name="descripcion" required/><br>
                <input type="submit" value="Crear tema" class="btn btn-primary"/><br>
            </div>
        </form>

        <%

            if (request.getParameter("titulo") != null && !request.getParameter("titulo").isEmpty()
                    && request.getParameter("descripcion") != null && !request.getParameter("descripcion").isEmpty()) {
                Tema tema = new Tema(request.getParameter("titulo"), request.getParameter("descripcion"));
                AsignaturaProfesor asignatura = (AsignaturaProfesor) session.getAttribute("asignaturaProfesor");
                asignatura.insertarTema(tema);
            }

        %>

        <div class="container">
            <table class="table table-hover">
                <thead>
                <th>Titulo</th>
                <th>Descripcion</th>
                </thead>
                <tbody>
                    <%                    AsignaturaProfesor asignaturaProfesor = (AsignaturaProfesor) session.getAttribute("asignaturaProfesor");
                        Iterator i = asignaturaProfesor.getLista().iterator();
                        while (i.hasNext()) {
                            Tema temaActual = (Tema) i.next();

                    %>
                    <tr>
                        <td><%= temaActual.getNombre()%></td>
                        <td><%= temaActual.getDescripcion()%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
