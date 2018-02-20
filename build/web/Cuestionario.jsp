<%-- 
    Document   : Cuestionario
    Created on : 10-feb-2018, 9:36:15
    Author     : YonePC
--%>
<%@page import="org.Cuestionario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <% Cuestionario cuestionario = (Cuestionario) session.getAttribute("cuestionario");%>

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
</html>
