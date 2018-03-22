<%-- 
    Document   : Header
    Created on : 13-mar-2018, 17:11:52
    Author     : YonePC
--%>

<%@page import="beans.Estadisticas"%>
<%@page import="beans.SingletonFuncionLog"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    SingletonFuncionLog singletonFuncionLog4 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog4.funcionLog("Header", "processRequest");

    Estadisticas estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    session = request.getSession(true);
    if (session.isNew()) {
        estadisticas.cuentaNuevaSesion();
    } else {
        System.out.println("La sesion no es nueva");
    }
%>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css" integrity="sha384-v2Tw72dyUXeU3y4aM2Y0tBJQkGfplr39mxZqlTBDUZAb9BGoC40+rdFCG0m10lXk" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/fontawesome.css" integrity="sha384-q3jl8XQu1OpdLgGFvNRnPdj5VIlCvgsDQTQB6owSOHWlAurxul7f+JpUOVdAiJ5P" crossorigin="anonymous">

<!-- A grey horizontal navbar that becomes vertical on small screens -->
<!-- Grey with black text -->
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1">Inicio</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1/Public/CourseInfo.jsp">Lista de cursos</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1/Public/Profesor.jsp"><i class="fas fa-user-circle"></i></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1/Public/VerSingletonLog.jsp"><i class="fas fa-history"></i></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1/Public/Estadisticas.jsp"><i class="fas fa-signal"></i></i></a>
        </li>
    </ul>
</nav>

</html>
