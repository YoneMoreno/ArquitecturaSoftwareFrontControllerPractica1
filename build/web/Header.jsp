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
        System.out.println("La sesion nueva, tine ID: " + session.getId());
        estadisticas.cuentaNuevaSesion();
    } else {
        System.out.println("La sesion no es nueva, y su ID es: " + session.getId());
    }

    int accesos;
    if (session.getAttribute("accesos") == null) {
        accesos = 0;
    } else {
        accesos = (Integer) session.getAttribute("accesos");
        accesos++;
    }
    session.setAttribute("accesos", accesos);

%>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">      

    <!-- Icons -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js" integrity="sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ" crossorigin="anonymous"></script>

    <!-- Optional JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>


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
        <li class="nav-item">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1/Public/Bibliotecas.jsp"><i class="fas fa-book"></i></i></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ASAPLICACIONCURSOSPRACTICA1/Public/Chat.jsp"><i class="fas fa-comments"></i></a>
        </li>
    </ul>
</nav>

</head>

