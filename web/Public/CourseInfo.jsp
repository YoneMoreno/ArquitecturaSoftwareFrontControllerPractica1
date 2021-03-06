

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
    if (request.getParameter("numberOfCoursesToDisplay") != null) {
        session.setAttribute("numberOfCoursesToDisplay", Integer.parseInt(request.getParameter("numberOfCoursesToDisplay")));
    }
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
        <div class="container">
            <form action="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet" class="form-inline">
                <div class="row mt-5">
                    <div class="col-md-6">
                        <input type="hidden" name="command" value="SearchCommand">
                        <h6 for="search">Buscar cursos por titulo</h6>
                            <input  name="search" type="search" placeholder="Escribe" aria-labels="search"
                                    value="<%=request.getParameter("search") != null ? request.getParameter("search") : ""%>">
                            <div class="col-md-3">
                                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar
                                </button>
                            </div>
                    </div>
                    <div class="col-md-6">
                        <h6>Numero maximo de cursos a mostrar</h6>
                        <input type="number" min="1" max="5" name="numberOfCoursesToDisplay"  placeholder="Numero maximo" value="<%=request.getParameter("numberOfCoursesToDisplay") != null ? request.getParameter("numberOfCoursesToDisplay") : "3"%>"/>
                        <a href="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet?command=SearchCommand&search=<%= request.getParameter("search") != null ? request.getParameter("search") : ""%>&numberOfCoursesToDisplay=<%= (int) session.getAttribute("numberOfCoursesToDisplay") - 1 >= 1 ? (int) session.getAttribute("numberOfCoursesToDisplay") - 1 : 1%>">
                            <i class="fas fa-caret-left fa-2x"></i></a>
                        <a href="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet?command=SearchCommand&search=<%= request.getParameter("search") != null ? request.getParameter("search") : ""%>&numberOfCoursesToDisplay=<%= (int) session.getAttribute("numberOfCoursesToDisplay") + 1%>">
                            <i class="fas fa-caret-right fa-2x"></i></a>
                        <div class="col-md-3">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Filtrar
                            </button>
                        </div>
                    </div>
                </div>
            </form>        
        </div>

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
            <%@include file="./tableRow.jsp" %>

            <%
                    }
                }
                if (search == null) {
            %>
            <%@include file="./tableRow.jsp"%>

            <%
                    }
                    current++;

                }

            %>
        </table>



        <script src="highlighter.js" type="text/javascript"></script>
    </body> 

    <%@include file="../Footer.jsp" %>

</html>