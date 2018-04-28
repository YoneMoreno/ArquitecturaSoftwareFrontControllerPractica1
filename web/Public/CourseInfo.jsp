

<%-- 

CourseInfo.jsp aims to fetch all database's courses, make a list from them, and show them
in a table.

Please note that currently each user fetches all the courses in the database so it means they are
shared.

Eventually we will need to associate Profesor (teacher) with the Courses he has created.

The most realiable way to do this is using a Foreign Key in Profesor table to reference the Courses
which he has created

--%>

<%@page import="java.util.List"%>
<%@page import="org.Curso_1"%>
<%@page import="jpa.Curso_1Facade"%>
<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="beans.SingletonFuncionLog"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.Curso"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>


<%
    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("CourseInfo", "processRequest");

    Estadisticas estadisticasCourseInfo = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasCourseInfo.nuevaVisitaCourseInfo();

    Curso_1Facade cursoFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade");

%>

<html> 
    <head>
        <%@include file="../Header.jsp" %>
        <title>Lista de cursos</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <%-- Dropdown style, to show it on read and as a clicable dropdown--%>
        <link href="nav.css" rel="stylesheet" type="text/css"/>
        <%-- Highlight style, we put a rounded colored span behind the links in this page
            to make more contrast between links' blue color, and white background, with a dinamic
            javascript code to place a black background
        --%>
        <link href="highlight.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <form action="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet" class="form-inline">
            <input type="hidden" name="command" value="SearchCommand">
            <input class="mr-sm-2" name="search" type="search" placeholder="Escribe para buscar" aria-labels="search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Busca</button>
        </form>
        <table class="table table-striped table-hover">
            <tr>
                <th>Titulo</th>
                <th>Autor</th>
                <th>Asignatura</th>
                <th>Duracion</th>
                <th>Video</th>
                <th>Imagen</th>
            </tr>

            <%
                //We load all the courses which have been created in Database
                List<Curso_1> search = (List<Curso_1>) request.getAttribute("cursosSearch");
                List<Curso_1> cursosPersisted = cursoFacade.findAllCourses();

                Iterator i = cursosPersisted.iterator();

                int current = 0;

                while (i.hasNext()) {

                    Curso_1 cursoActual = (Curso_1) i.next();
                    if (search != null) {
                        if (search.contains(cursoActual)) {
            %>
            <tr>
                <td><%= cursoActual.getTitulo()%></td>
                <td><%= cursoActual.getAutor()%></td>
                <td><%= cursoActual.getAsignatura()%></td>
                <td><%= cursoActual.getDuracion()%></td>
                <%

                    //We look for mp4 videos and use a custom javascript UI
                    String pattern = "https://.*mp4";
                    Pattern r = Pattern.compile(pattern);
                    Matcher m = r.matcher(cursoActual.getVideo());

                    if (m.find()) {

                %>

                <td><a href="./VideoMP4.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>

                <% } else {

                    //If the video is not mp4 we suppose it is an embedded YouTube video

                %>

                <td><a href="./Video.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>

                <% }%>

                <td style="display:flex">
                    <img width="75" height="50" src="<%=cursoActual.getImagen()%>" alt="<%= cursoActual.getTitulo()%>"/>
                    <div id="container" class="dropdown">
                        <ul>
                            <li><a href="#">Evaluación</a>
                                <!-- We have a dropdown to list all the assesments modes -->
                                <ul>
                                    <li><a href="/ASAPLICACIONCURSOSPRACTICA1/Public/RealizarEvaluacion.jsp?name=command&value=numero">Mediante numero</a></li>
                                    <li><a href="/ASAPLICACIONCURSOSPRACTICA1/Public/RealizarEvaluacion.jsp?name=command&value=letra">Con letra</a></li>
                                    <li><a href="/ASAPLICACIONCURSOSPRACTICA1/Public/RealizarEvaluacion.jsp?name=command&value=comentario">Escribiendo comentario</a></li>
                                </ul>        
                            </li>  
                        </ul>
                    </div>
                </td>
                <td>
                    <a href="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet?command=DeleteCourseCommand&id=<%=cursoActual.getIdCurso()%>">
                        <i class="fas fa-trash-alt fa-3x"></i> 
                    </a>
                </td>  
                <td>
                    <a href="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet?command=UpdateCourseCommand&id=<%=cursoActual.getIdCurso()%>">
                        <i class="fas fa-pencil-alt fa-3x"></i> 
                    </a>
                </td> 


            </tr>

            <%
                        }
                    }
                    current++;

                }

            %>
        </table>



        <script src="highlighter.js" type="text/javascript"></script>
    </body> 

    <%@include file="../Footer.jsp" %>

</html>