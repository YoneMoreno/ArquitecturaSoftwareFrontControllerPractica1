<%-- 
    Document   : Evaluacion
    Created on : 17-feb-2018, 8:47:46
    Author     : YonePC






    This class displays a table of assessments made by the teacher to a pupil in a course.

There are thre types of assessments:

By number, from 0 to 10.
By Letter from A to E.
By commentary, and Pass/Not Pass
--%>
<%@page import="beans.SingletonFuncionLog"%>
<%@page import="beans.ComentarioNota"%>
<%@page import="beans.LetraNota"%>
<%@page import="beans.ConviertePuntosNota"%>
<%@page import="javax.ejb.EJB"%>
<%@page import="org.Evaluacion"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import ="beans.ConviertePuntosNota"%>
<%

    ConviertePuntosNota conviertePuntosNota = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/ConviertePuntosNota");
    LetraNota letraNota = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/LetraNota!beans.LetraNota");
    ComentarioNota comentarioNota = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/ComentarioNota!beans.ComentarioNota");

    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("Evaluacion", "processRequest");

    Estadisticas estadisticasEvaluacion = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasEvaluacion.nuevaVisitaEvaluacion();

%>

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
            <th>Acta</th>
        </thead>
        <tbody>
            <%                if (session.getAttribute("evaluaciones") != null) {
                    ArrayList evaluaciones = (ArrayList) session.getAttribute("evaluaciones");
                    //System.out.println(evaluaciones);
                    Iterator i = evaluaciones.iterator();
                    int current = 0;
                    while (i.hasNext()) {
                        Evaluacion evaluacionActual = (Evaluacion) i.next();
                        if (evaluacionActual == null) {
                            continue;
                        }

            %>
            <tr>
                <%                    String nota = evaluacionActual.getEvaluacion();
                    int evaluacionInt = -1;
                    String pattern = "-?\\d+";
                    if (isEvaluacionNota(nota)) {
                        evaluacionInt = Integer.parseInt(nota);
                %>
                <td><%= evaluacionActual.getEvaluacionAlumno()%></td>
                <td><%= evaluacionActual.getEvaluacionCurso()%></td>
                <td><%= evaluacionActual.getEvaluacion()%></td>
                <td><%= conviertePuntosNota.convertidor(evaluacionInt)%></td>


                <%
                } else if (isLetraNota(evaluacionActual)) {


                %>

                <td><%= evaluacionActual.getEvaluacionAlumno()%></td>
                <td><%= evaluacionActual.getEvaluacionCurso()%></td>
                <td><%= evaluacionActual.getEvaluacion()%></td>
                <td><%= letraNota.convierteLetraNota(evaluacionActual.getEvaluacion())%></td>


                <%
                } else {
                %>

                <td><%= evaluacionActual.getEvaluacionAlumno()%></td>
                <td><%= evaluacionActual.getEvaluacionCurso()%></td>
                <td><%= evaluacionActual.getEvaluacion()%></td>
                <td><%= comentarioNota.convierteComentarioNota(evaluacionActual.getEvaluacion(), evaluacionActual.getEvaluacionComentario())%></td>
                <td>   Comentario del profesor: "<%= evaluacionActual.getEvaluacionComentario()%>"</td>


                <%
                            }
                            current++;

                        }
                    }
                %>
            </tr>
        </tbody>
    </table>
</body>
<%@include file="Footer.jsp" %>

</html>


<%!
    public boolean isEvaluacionNota(String nota) {
        return nota.matches("-?\\d+");
    }

    public boolean isLetraNota(Evaluacion evaluacionActual) {
        return evaluacionActual.getEvaluacion().equals("A")
                || evaluacionActual.getEvaluacion().equals("B")
                || evaluacionActual.getEvaluacion().equals("C")
                || evaluacionActual.getEvaluacion().equals("D")
                || evaluacionActual.getEvaluacion().equals("E");
    }

%>