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
                <%if (session.getAttribute("profesor") != null) {%>
                <h1>Bienvenido a CursosApp, elija una opción del panel para comenzar:</h1>
                <div>
                    <%@ include file="/Public/CreateCourseForm.jsp"%>
                    <%@ include file="/Public/CreateCuestionarioForm.jsp"%>
                    <%@ include file="/Public/CreateEncuestaForm.jsp"%>
                    <%}%>
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

