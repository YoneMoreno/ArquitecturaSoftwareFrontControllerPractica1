<%-- 
    Document   : Header
    Created on : 13-mar-2018, 17:11:52
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<!-- A grey horizontal navbar that becomes vertical on small screens -->
<!-- Grey with black text -->
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1">Inicio</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="Public/CourseInfo.jsp">Lista de cursos</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="FrontServlet?command=AlumnosCommand">Lista de alumnos</a>
        </li>
    </ul>
</nav>

</html>
