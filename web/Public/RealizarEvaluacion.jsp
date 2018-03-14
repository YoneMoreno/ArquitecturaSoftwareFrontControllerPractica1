<%-- 
    Document   : RealizarEvaluacion
    Created on : 14-mar-2018, 10:32:00
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Realizar Evaluación</title>
    </head>
    <body>
        <form action="FrontServlet">
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
            <h2>Añada un comentario para justificar la nota: </h2>
            <textarea name="evaluacionComentario"> 
            </textarea>
            <br/>
            <input type="submit" value="Enviar evaluacion">
            <input type="hidden" name="command" value="EvaluacionCommand"/>
        </form>
    </body>
</html>
