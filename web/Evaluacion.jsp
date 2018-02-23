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
            <tr>
                <td><%= request.getParameter("evaluacionAlumno")%></td>
                <td><%= request.getParameter("evaluacionCurso")%></td>
                <td><%= request.getParameter("evaluacion")%></td>
            </tr>
        </tbody>
    </table>
</body>
</html>
