<%-- 
    Document   : Unknown
    Created on : 10-feb-2018, 10:49:11
    Author     : YonePC
--%>

<%@page import="beans.Estadisticas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    SingletonFuncionLog singletonFuncionLog3 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog3.funcionLog("Unknown", "processRequest");
    

    
     Estadisticas estadisticasUnknown = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

     
     estadisticasUnknown.nuevaVisitaUnknown();
%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="Header.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    </head>
    <body>
        <%
            out.print("El recurso no se ha encontrado 😖");
        %>
    </body>
        <%@include file="Footer.jsp" %>
</html>
