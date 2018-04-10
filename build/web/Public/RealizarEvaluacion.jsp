<%-- 
    Document   : RealizarEvaluacion
    Created on : 14-mar-2018, 10:32:00
    Author     : YonePC

    RealizarEvaluacion.jsp haas the purpose of let the teacher assess the pupils.
There are three types of assessments:

Using a number from 0 to 10.
Selecting a letter from A to E (as English modality)
Writting a commentary and choosing Pass/Not Pass.

Plase note that this RealizarEvaluacion.jsp expects two parameters in the request:

--> name=command
--> value=numero (number) or letra (letter) or comentari (commentary)
--%>

<%@page import="beans.SingletonFuncionLog"%>
<%@page import="javax.naming.InitialContext"%>
<%

    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("RealizarEvaluacion", "processRequest");

    Estadisticas estadisticasRealizarEvaluacion = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasRealizarEvaluacion.nuevaVisitaRealizarEvaluacion();
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Realizar Evaluación</title>
    </head>
    <body>
        <%            
            if (request.getParameter("name").toString().equals("command")) {
                if (request.getParameter("value").toString().equals("numero")) {


        %>
        <form action="../FrontServlet">
            <h2>Nombre del alumno: </h2>
            <input type="text" name="evaluacionAlumno" required/>
            <h2>Nombre del curso: </h2>
            <input type="text" name="evaluacionCurso" required>
            <h2>Indique la puntuación: </h2>
            <div style="display: flex">
                <h4>0</h4><input type="radio" name="evaluacion" value="0"  />
                <h4>1</h4><input type="radio" name="evaluacion" value="1" />
                <h4>2</h4><input type="radio" name="evaluacion" value="2" />
                <h4>3</h4><input type="radio" name="evaluacion" value="3" />
                <h4>4</h4><input type="radio" name="evaluacion" value="4" />
                <h4>5</h4><input type="radio" name="evaluacion" value="5" />
                <h4>6</h4><input type="radio" name="evaluacion" value="6" />
                <h4>7</h4><input type="radio" name="evaluacion" value="7" />
                <h4>8</h4><input type="radio" name="evaluacion" value="8" />
                <h4>9</h4><input type="radio" name="evaluacion" value="9" />
                <h4>10</h4><input type="radio" name="evaluacion" value="10"  />
            </div>
            <input type="submit" value="Enviar evaluacion">
            <input type="hidden" name="command" value="EvaluacionCommand"/>
        </form>
        <%  } else if (request.getParameter("value").toString().equals("letra")) {

        %>
        <form action="../FrontServlet">
            <h2>Nombre del alumno: </h2>
            <input type="text" name="evaluacionAlumno" required/>
            <h2>Nombre del curso: </h2>
            <input type="text" name="evaluacionCurso" required>
            <h2>Indique la puntuación mediante una letra: </h2>
            <div style="display: flex">
                <h4>A</h4><input type="radio" name="evaluacion" value="A"  />
                <h4>B</h4><input type="radio" name="evaluacion" value="B" />
                <h4>C</h4><input type="radio" name="evaluacion" value="C" />
                <h4>D</h4><input type="radio" name="evaluacion" value="D" />
                <h4>E</h4><input type="radio" name="evaluacion" value="E" />
            </div>
            <input type="submit" value="Enviar evaluacion">
            <input type="hidden" name="command" value="EvaluacionCommand"/>
        </form>
        <%                } else if (request.getParameter("value").toString().equals("comentario")) {
        %>
        <form action="../FrontServlet">
            <h2>Nombre del alumno: </h2>
            <input type="text" name="evaluacionAlumno" required/>
            <h2>Nombre del curso: </h2>
            <input type="text" name="evaluacionCurso" required>
            <h2>Indique la puntuación mediante una letra: </h2>
            <div style="display: flex">
                <h4>Apto</h4><input type="radio" name="evaluacion" value="Apto"  />
                <h4>No Apto</h4><input type="radio" name="evaluacion" value="NoApto" />
            </div>
            <h2>Añada un comentario para justificar la nota: </h2>
            <textarea name="evaluacionComentario"> 
            </textarea>
            <br/>
            <input type="submit" value="Enviar evaluacion">
            <input type="hidden" name="command" value="EvaluacionCommand"/>
        </form>


        <%
                }
            }
        %>
    </body>
</html>
