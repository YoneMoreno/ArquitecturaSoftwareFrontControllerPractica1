<%-- 
    Document   : VerSingletonLog
    Created on : 22-mar-2018, 10:51:53
    Author     : YonePC

    VerSingletonLog is focused in getting all program's logs, and display them, as for example:
When did the user created a statefull like Profesor. So then it keeps track of
statefull, and stateless lifecycle methods as @PostConstruct.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <%            SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

            String log = singletonFuncionLog.getFuncionLog();

            Estadisticas estadisticasVerSingletonLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

            estadisticasVerSingletonLog.nuevaVisitaVerSingletonLog();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Singleton Log</title>
    </head>
    <body>

        <h1><i class="fas fa-file"></i>Logs:</h1>
        <h5><%= log%></h5>

    </body>

</html>
