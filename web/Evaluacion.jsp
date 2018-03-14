<%-- 
    Document   : Evaluacion
    Created on : 17-feb-2018, 8:47:46
    Author     : YonePC
--%>
<%@page import="org.Evaluacion"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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
        <h1>Evaluacion:</h1>
        <table>
            <thead>
            <th>Alumno</th>
            <th>Curso</th>
            <th>Puntuacion</th>
        </thead>
        <tbody>
            <%
                if (session.getAttribute("evaluaciones") != null) {
                    ArrayList evaluaciones = (ArrayList) session.getAttribute("evaluaciones");
                    Iterator i = evaluaciones.iterator();
                    int current = 0;
                    while (i.hasNext()) {
                        Evaluacion evaluacionActual = (Evaluacion) i.next();

            %>
            <tr>
                <td><%= evaluacionActual.getEvaluacionAlumno()%></td>
                <td><%= evaluacionActual.getEvaluacionCurso()%></td>
                <td><%= evaluacionActual.getEvaluacion()%></td>
            </tr>
        </tbody>
        <%
                    current++;

                }
            }
        %>
    </table>
</body>
<%@include file="Footer.jsp" %>

</html>
