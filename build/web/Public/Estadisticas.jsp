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
    int visitasCourseInfo = estadisticas2.getNuevaVisitaCourseInfo();
    int visitasFrontServlet = estadisticas2.getNuevaVisitaFrontServlet();
    int visitasClaseEvaluacion = estadisticas2.getNuevoAccesoEvaluacion();
    int visitasClaseCurso = estadisticas2.getNuevoAccesoCurso();
    int visitasUnknownCommand = estadisticas2.getNuevoAccesoUnknownCommand();
    int visitasFrontCommand = estadisticas2.getNuevoAccesoFrontCommand();
    int visitasEvaluacionCommand = estadisticas2.getNuevoAccesoEvaluacionCommand();
    int visitasEncuestaCommand = estadisticas2.getNuevoAccesoEncuestaCommand();
    int visitasCuestionarioCommand = estadisticas2.getNuevoAccesoCuestionarioCommand();
    int visitasCourseInfoCommand = estadisticas2.getNuevoAccesoCourseInfoCommand();
    int visitasAlumnosCommand = estadisticas2.getNuevoAccesoAlumnosCommand();
    int visitasSingletonFuncionLog = estadisticas2.getNuevoAccesoSingletonFuncionLog();
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
        <h2>Numero de visitas Course Info (Lista de cursos) <%= visitasCourseInfo%></h2>
        <h2>Numero de accesos al Front Servlet <%= visitasFrontServlet%></h2>
        <h2>Numero de usos de la clase Evaluacion.java <%= visitasClaseEvaluacion%></h2>
        <h2>Numero de usos de la clase Curso.java <%= visitasClaseCurso%></h2>
        <h2>Numero de accesos al UnknownCommand <%= visitasUnknownCommand%></h2>
        <h2>¡Numero de accesos al FrontCommand! <%= visitasFrontCommand%></h2>
        <h2>¡!Numero de accesos al EvaluacionCommand¡! <%= visitasEvaluacionCommand%></h2>
        <h2>--> Numero de accesos al EncuestaCommand <%= visitasEncuestaCommand%></h2>
        <h2>Numero de accesos al CuestionarioCommand <%= visitasCuestionarioCommand%></h2>
        <h2>Numero de accesos al CourseInfoCommand <%= visitasCourseInfoCommand%></h2>
        <h2>Numero de accesos AlumnosCommand <%= visitasAlumnosCommand%></h2>
        <h2>->Numero de accesos SingletonFuncionLog (Log de clases y funciones) <%= visitasSingletonFuncionLog%></h2>

    </body>
</html>
