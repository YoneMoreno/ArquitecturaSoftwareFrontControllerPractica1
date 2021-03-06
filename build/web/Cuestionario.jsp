<%-- 
    Document   : Cuestionario
    Created on : 10-feb-2018, 9:36:15
    Author     : YonePC

This class aims to display a questionnaire. A questionnaire is a question with three possible
answers and each answer could be either true or false.

Pregunta1 is the questions being asked.

RespuestaTexto11 is the first answer proposed.
RespuestaVerdad11 is either false or true, which represents if this answer is true or not.

--%>
<%@page import="beans.SingletonFuncionLog"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="beans.Cuestionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="Header.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    </head>
    <body>

        <% Cuestionario cuestionario = (Cuestionario) request.getAttribute("cuestionario");

            SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

            singletonFuncionLog.funcionLog("Cuestionario", "processRequest");
            
            Estadisticas estadisticasCuestionario = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

            estadisticasCuestionario.nuevaVisitaCuestionario();

        %>

        <h1><%= cuestionario.getPregunta1()%></h1>
        <form>
            <div style="display:flex">
                <h2><%= cuestionario.getRespuestaTexto11()%></h2>
                <input type="checkbox" name="respuestaVerdad11" value="<%= cuestionario.getRespuestaVerdad11()%>" />
                <h2><%= cuestionario.getRespuestaTexto12()%></h2>
                <input type="checkbox" name="respuestaVerdad11" value="<%= cuestionario.getRespuestaVerdad12()%>" />
                <h2><%= cuestionario.getRespuestaTexto13()%></h2>
                <input type="checkbox" name="respuestaVerdad11" value="<%= cuestionario.getRespuestaVerdad13()%>" />
            </div>
            <input type="reset" value="Enviar respuesta" />
        </form>
    </body>
    <%@include file="Footer.jsp" %>

</html>
