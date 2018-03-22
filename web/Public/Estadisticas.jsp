<%-- 
    Document   : Estadisticas
    Created on : 22-mar-2018, 12:48:18
    Author     : YonePC
--%>

<%@page import="beans.Estadisticas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Estadisticas estadisticas2 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
    int numeroSesionesNuevas = estadisticas2.getCuentaNuevaSesion();
    int visitasIndex = estadisticas2.getNuevaVisitaIndex();
    int visitasUnknown = estadisticas2.getNuevaVisitaUnknown();
    int visitasEvaluacion = estadisticas2.getNuevaVisitaEvaluacion();
    int visitasEncuesta = estadisticas2.getNuevaVisitaEncuesta();
    int visitasCuestionario = estadisticas2.getNuevaVisitaCuestionario();
    int visitasVerSingletonLog = estadisticas2.getNuevaVisitaVerSingletonLog();
    int visitasRealizarEvaluacion = estadisticas2.getNuevaVisitaRealizarEvaluacion();
    int visitasProfesor = estadisticas2.getNuevaVisitaProfesor();
%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Numero de sesiones nuevas: <%= numeroSesionesNuevas%></h1>
        <h2>Numero de visitas index: <%= visitasIndex%></h2>
        <h2>Numero de visitas unknown: <%= visitasUnknown%></h2>
        <h2>Numero de visitas evaluacion <%= visitasEvaluacion%></h2>
        <h2>Numero de visitas encuesta <%= visitasEncuesta%></h2>
        <h2>Numero de visitas cuestionario <%= visitasCuestionario%></h2>
        <h2>Numero de visitas LOG <%= visitasVerSingletonLog%></h2>
        <h2>Numero de visitas Realizar Evaluacion <%= visitasRealizarEvaluacion%></h2>
        <h2>Numero de visitas Profesor <%= visitasProfesor%></h2>

    </body>
</html>
