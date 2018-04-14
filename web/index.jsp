<%@page import="beans.Estadisticas"%>
<!DOCTYPE html>
<!--



This class allows users to:

Create a new course,
create a new questionnaire,
create a new survey,
see the pupils list,
see the school's subjects in a carousel,
observe social media links/icons.


-->

<%

    SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog5.funcionLog("Index", "processRequest");

    Estadisticas estadisticasIndex = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasIndex.nuevaVisitaIndex();
%>

<html>
    <head>
        <%@include file="Header.jsp" %>
        <title>CursosApp</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>       
        <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js" integrity="sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ" crossorigin="anonymous"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <h1>Bienvenido a CursosApp, elija una opción del panel para comenzar:</h1>
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
                            <input type="submit" value="Crear curso" onclick="alert('El curso se ha creado');">
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
                                ¿Es correcta?:
                            </h4>
                            <input type="checkbox" name="respuestaVerdad11" value="cierta" />
                            <h3>
                                Respuesta 2:
                            </h3>
                            <input style="width:100%" type="text" name="respuestaTexto12" value="" />
                            <h4>
                                ¿Es correcta?:
                            </h4>
                            <input type="checkbox" name="respuestaVerdad12" value="cierta" />
                            <h3>
                                Respuesta 3:
                            </h3>
                            <input style="width:100%" type="text" name="respuestaTexto13" value="" />
                            <h4>
                                ¿Es correcta?:
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
                    <h4>Asignaturas impartidas en la escuela:</h4>
                    <div id="demo" class="carousel slide" data-ride="carousel" style="width: 25%; height: 25%">
                        <!-- Indicators -->
                        <ul class="carousel-indicators">
                            <li data-target="#demo" data-slide-to="0" class="active"></li>
                            <li data-target="#demo" data-slide-to="1"></li>
                            <li data-target="#demo" data-slide-to="2"></li>
                            <li data-target="#demo" data-slide-to="3"></li>
                            <li data-target="#demo" data-slide-to="4"></li>
                            <li data-target="#demo" data-slide-to="5"></li>
                            <li data-target="#demo" data-slide-to="6"></li>
                            <li data-target="#demo" data-slide-to="7"></li>
                        </ul>

                        <!-- The slideshow -->
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <a href="FrontServlet?nombre=Software&descripcion=Mencion+Ingenieria+Software&command=AsignaturaCommand">
                                    <img src="Images/software.PNG" alt="Software"/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=Tecnologias+de+la+informacion&descripcion=Mencion+TI&command=AsignaturaCommand">
                                    <img src="Images/it.PNG" alt=""/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=Modelado+3D&descripcion=Postgrado&command=AsignaturaCommand">
                                    <img src="Images/creative.PNG" alt=""/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=ADE&descripcion=Direccion+empresas&command=AsignaturaCommand">
                                    <img src="Images/business.PNG" alt=""/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=Cientifico+datos&descripcion=Mencion+inteligencia+artificial&command=AsignaturaCommand">
                                    <img src="Images/data.PNG" alt=""/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=Ciberseguridad&descripcion=Mencion+TI&command=AsignaturaCommand">
                                    <img src="Images/cybersecurity.PNG" alt=""/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=Arquitectura&descripcion=Diseno+con+herramientas+CAD&command=AsignaturaCommand">
                                    <img src="Images/architecture.PNG" alt=""/>
                                </a>
                            </div>
                            <div class="carousel-item">
                                <a href="FrontServlet?nombre=Diseno+2D&descripcion=Con+Blender+y+Maya&command=AsignaturaCommand">
                                    <img src="Images/design.PNG" alt=""/>
                                </a>
                            </div>

                        </div>

                        <!-- Left and right controls -->
                        <a class="carousel-control-prev" href="#demo" data-slide="prev">
                            <span class="carousel-control-prev-icon"></span>
                        </a>
                        <a class="carousel-control-next" href="#demo" data-slide="next">
                            <i class="fas fa-arrow-right"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>


        <div class="container-fluid"/>
        <!-- Control the column width, and how they should appear on different devices -->
        <div class="row">
            <div class="col-7" style="margin-bottom: 3em">
                <h2>Escuela de informatica:</h2>
                <p>En esta escuela se imparten cursos de ingenieria del software,
                    y desarrollo web.
                </p>
            </div>
            <div class="col-5" style="margin-bottom: 3em">
                <h2>Redes sociales:</h2>
                <p>
                    <a href="https://es-es.facebook.com/EII.ULPGC/"><i class="fab fa-facebook-f fa-5x" size="5x"></i></a>
                    <a href="https://twitter.com/EII_ULPGC?ref_src=twsrc%5Etfw&ref_url=http%3A%2F%2Fwww.eii.ulpgc.es%2Ftb_university_ex%2F%3Fq%3Dfrontpage">
                        <i class="fab fa-twitter fa-5x"></i>
                    </a>
                    <a href="https://www.studocu.com/es/institution/universidad-de-las-palmas-de-gran-canaria/8890">
                        <i class="fas fa-university fa-5x"></i>
                    </a>
                </p>
            </div>
        </div>
    </div>
</div>
</body>
<%@include file="Footer.jsp" %>
</html>

