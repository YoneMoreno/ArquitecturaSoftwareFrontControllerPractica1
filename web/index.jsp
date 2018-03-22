<%@page import="beans.Estadisticas"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
    SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog5.funcionLog("Index", "processRequest");
    
    Estadisticas estadisticas =  InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    
     session = request.getSession(true);
      if (session.isNew()) {
                estadisticas.cuentaNuevaSesion();
            }else{
                System.out.println("La sesion no es nueva");
            }
%>

<html>
    <head>
        <%@include file="Header.jsp" %>
        <title>CursosApp</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1>Bienvenido a CursosApp, eliga una opci�n del panel para comenzar:</h1>
                <div>
                    <details>
                        <summary>Crear curso</summary>
                        <form action="FrontServlet" method="POST">
                            <h2 style="font-weight: 700">Titulo:</h2>
                            <input style="width:100%" type="text" name="titulo" required/>
                            <h2 style="font-weight: 700">Autor:</h2>
                            <input style="width:100%" type="text" name="autor" required/>
                            <h2 style="font-weight: 700">Asignatura:</h2>
                            <select  style="width:100%" name="asignatura">
                                <option>Matematicas</option>
                                <option>Ingles</option>
                                <option>Lengua</option>
                                <option>Literatura</option>
                                <option>Biologia</option>
                                <option>Quimica</option>
                                <option>Fisica</option>
                                <option>Programacion</option>
                                <option>Frances</option>
                                <option>Chino</option>
                            </select>
                            <h2 style="font-weight:700"> Duracion (en horas):</h2>
                            <input style="width:100%" type="number" name="duracion"/>
                            <h2 style="font-weight:700">Enlace al curso en video:</h2>
                            <input style="width:100%" type="url" name="video" pattern="https?://.+" title="video">
                            <h2 style="font-weight:700">Enlace a la imagen del curso:</h2>
                            <input style="width:100%" type="url" name="imagen" pattern="https?://.+" title="imagen">

                            <input type="hidden" name="command" value="CourseInfoCommand">
                            <input type="submit" value="Crear curso">
                        </form>
                    </details>
                    <details>
                        <summary>
                            Crear cuestionario
                        </summary>
                        <form action="FrontServlet">
                            <h2 >
                                Pregunta 1:
                            </h2>
                            <textarea style="width:100%" name="pregunta1" rows="4" cols="20">
                            </textarea>
                            <input  type="submit" value="Crear cuestionario">
                            <h3>
                                Respuesta 1:
                            </h3>
                            <input style="width:100%"  type="text" name="respuestaTexto11" value="" />
                            <h4>
                                �Es correcta?:
                            </h4>
                            <input type="checkbox" name="respuestaVerdad11" value="cierta" />
                            <h3>
                                Respuesta 2:
                            </h3>
                            <input style="width:100%" type="text" name="respuestaTexto12" value="" />
                            <h4>
                                �Es correcta?:
                            </h4>
                            <input type="checkbox" name="respuestaVerdad12" value="cierta" />
                            <h3>
                                Respuesta 3:
                            </h3>
                            <input style="width:100%" type="text" name="respuestaTexto13" value="" />
                            <h4>
                                �Es correcta?:
                            </h4>
                            <input type="hidden" name="command" value="CuestionarioCommand"/>
                            <input type="checkbox" name="respuestaVerdad13" value="cierta" />
                        </form>
                    </details>
                    <details>
                        <summary>
                            Crear encuesta
                        </summary>

                        <form action="FrontServlet">
                            <h2>
                                Cuestion 1:
                            </h2>
                            <textarea style="width:100%" name="cuestion1" rows="4" cols="20">
                            </textarea>
                            <input type="submit" value="Crear encuesta">
                            <h3>
                                Los alumnos podran votar mediante las siguientes respuestas:
                            </h3>
                            <div style="display: flex">
                                <h4>0</h4><input type="radio" name="encuesta1" value="0" disabled />
                                <h4>1</h4><input type="radio" name="encuesta1" value="1" disabled/>
                                <h4>2</h4><input type="radio" name="encuesta1" value="2" disabled/>
                                <h4>3</h4><input type="radio" name="encuesta1" value="3" disabled/>
                                <h4>4</h4><input type="radio" name="encuesta1" value="4" disabled/>
                                <h4>5</h4><input type="radio" name="encuesta1" value="5" disabled/>
                                <h4>6</h4><input type="radio" name="encuesta1" value="6" disabled/>
                                <h4>7</h4><input type="radio" name="encuesta1" value="7" disabled/>
                                <h4>8</h4><input type="radio" name="encuesta1" value="8" disabled/>
                                <h4>9</h4><input type="radio" name="encuesta1" value="9" disabled/>
                                <h4>10</h4><input type="radio" name="encuesta1" value="10" disabled />
                                <input type="hidden" name="command" value="EncuestaCommand"/>
                            </div>
                        </form>
                    </details>
                    <details>
                        <summary>Ver lista de alumnos</summary>
                        <form action="FrontServlet">
                            <input type="submit" value="Ver mis alummnos"/>
                            <input type="hidden" name="command" value="AlumnosCommand"/>
                        </form>
                    </details>
                </div>
            </div>
        </div>
    </body>
    <%@include file="Footer.jsp" %>
</html>

