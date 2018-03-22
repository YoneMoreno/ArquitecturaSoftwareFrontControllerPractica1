<%-- 
    Document   : Estadisticas
    Created on : 22-mar-2018, 12:48:18
    Author     : YonePC
--%>

<%@page import="beans.Estadisticas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    Estadisticas estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
    int numeroSesionesNuevas = estadisticas.getCuentaNuevaSesion();
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
    </body>
</html>
