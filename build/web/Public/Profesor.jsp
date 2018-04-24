<%-- 
    Document   : Profesor
    Created on : 19-mar-2018, 15:34:07
    Author     : YonePC

    Profesor.jsp shows a teacher's profile.
It is made by name, subject, pupils' assessments made to this teacher, email, phone and office

--%>

<%@page import="org.Asignatura"%>
<%@page import="jpa.AsignaturaFacade"%>
<%@page import="beans.SingletonFuncionLog"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.Curso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%
    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("Profesor", "processRequest");

    Estadisticas estadisticasProfesor = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasProfesor.nuevaVisitaProfesor();

    Profesor sesionProfesor = (Profesor) session.getAttribute("profesor");

    AsignaturaFacade asignaturaFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/AsignaturaFacade");

    String nombreAsignatura = null;
    if (sesionProfesor.getIdAsignatura() != null) {
        Asignatura asignatura = asignaturaFacade.find(sesionProfesor.getIdAsignatura().getId());
        nombreAsignatura = asignatura.getNombre();
    }
%>

<html>
    <%@include file="../Header.jsp" %>

    <title>Profesor</title>
    <body>
        <div class="container">
            <div class="row">
                <div class="col ">
                    <p class="lead">Profesor: <%= sesionProfesor.getNombre()%></p>
                    <i class="fas fa-user-circle fa-5x"></i>
                    <div class="jumbotron">
                        <p>Correo: <%= sesionProfesor.getCorreo()%></p>
                        <p>Despacho: <%= sesionProfesor.getDespacho()%></p>
                        <p>Telefono: <%= sesionProfesor.getTelefono()%></p>
                    </div>
                </div>
                <div class="col">
                    <% if (nombreAsignatura != null) {%>
                    <p class="lead">Asignatura: <%=nombreAsignatura%> </p>
                    <a href="./AsignaturaProfesor.jsp?nombre=<%=nombreAsignatura%>">
                        <img class="image-center" src="../Images/CHJavascript.JPG" alt="<%= nombreAsignatura%>"/>
                    </a>
                    <%}%>
                </div>
                <div class="col">
                    <div>
                        <h3>Valoracion:</h3>

                        <div class="container center text-center">
                            <div id="demo" class="carousel slide" data-ride="carousel" style="width: 100%; height: 100%">
                                <!-- Indicators -->
                                <ul class="carousel-indicators">
                                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                                    <li data-target="#demo" data-slide-to="1"></li>
                                    <li data-target="#demo" data-slide-to="2"></li>
                                </ul>

                                <!-- The slideshow -->
                                <div class="carousel-inner container center text-center">
                                    <div class="carousel-item active">
                                        <a href="../FrontServlet?valoracionCurso=Grado+Ingenieria+Informatica+4&valoracionAsignatura=Arquitectura+Software&valoracion=4.7&command=ValoracionCommand">
                                            <img src="../Images/CHValoracion.JPG" alt=""/>
                                        </a>
                                    </div>
                                    <div class="carousel-item">
                                        <a href="../FrontServlet?valoracionCurso=Grado+Ingenieria+Informatica+1&valoracionAsignatura=Introduccion+a+la+Programacion&valoracion=4.6&command=ValoracionCommand">
                                            <img src="../Images/valoracion2.PNG" alt=""/>
                                        </a>

                                    </div>
                                    <div class="carousel-item">
                                        <a href="../FrontServlet?valoracionCurso=Grado+Ingenieria+Informatica+2&valoracionAsignatura=Ingenieria+Software+I&valoracion=4.5&command=ValoracionCommand">
                                            <img src="../Images/valoracion3.PNG" alt=""/>
                                        </a>

                                    </div>
                                </div>
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
    </body>
</html>




