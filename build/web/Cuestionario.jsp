<%-- 
    Document   : Cuestionario
    Created on : 10-feb-2018, 9:36:15
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1><%= request.getParameter("pregunta1")%></h1>
        <form>
            <div style="display:flex">
                <h2><%= request.getParameter("respuestaTexto11")%></h2>
                <input type="checkbox" name="respuestaVerdad11" value="<%= request.getParameter("respuestaVerdad11")%>" />
                <h2><%= request.getParameter("respuestaTexto12")%></h2>
                <input type="checkbox" name="respuestaVerdad11" value="<%= request.getParameter("respuestaVerdad12")%>" />
                <h2><%= request.getParameter("respuestaTexto13")%></h2>
                <input type="checkbox" name="respuestaVerdad11" value="<%= request.getParameter("respuestaVerdad13")%>" />
            </div>
            <input type="reset" value="Enviar respuesta" />
        </form>
    </body>
</html>
