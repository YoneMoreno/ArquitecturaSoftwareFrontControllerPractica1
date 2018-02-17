<%-- 
    Document   : Evaluacion
    Created on : 17-feb-2018, 8:47:46
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evaluacion</title>
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
            <tr>
                <td><%= request.getParameter("evaluacionAlumnno")%></td>
                <td><%= request.getParameter("evaluacionCurso")%></td>
                <td><%= request.getParameter("evaluacion")%></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
