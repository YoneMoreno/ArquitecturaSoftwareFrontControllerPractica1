
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
        <link href="nav.css" rel="stylesheet" type="text/css"/>
        <link href="highlight.css" rel="stylesheet" type="text/css"/>
    </head>
    <body> 
        <table width="100%" border=1>
            <tr>
                <th style="padding: 8px">Titulo</th>
                <th style="padding: 8px">Autor</th>
                <th style="padding: 8px">Asignatura</th>
                <th style="padding: 8px">Duracion</th>
                <th style="padding: 8px">Video</th>
                <th style="padding: 8px">Imagen</th>
            </tr>

            <%                
                
                
                List<Curso_1> cursosPersisted = cursoFacade.findAll();

                Iterator i = cursosPersisted.iterator();
                int current = 0;
                while (i.hasNext()) {
                    Curso_1 cursoActual = (Curso_1) i.next();

            %>
            <tr>
                <td><%= cursoActual.getTitulo()%></td>
                <td><%= cursoActual.getAutor()%></td>
                <td><%= cursoActual.getAsignatura()%></td>
                <td><%= cursoActual.getDuracion()%></td>
                <%
                    String pattern = "https://.*mp4";
                    Pattern r = Pattern.compile(pattern);
                    Matcher m = r.matcher(cursoActual.getVideo());
                    if (m.find()) {
                %>
                <td><a href="./VideoMP4.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>
                <% } else {%>
                <td><a href="./Video.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>
                <% }%>
                <td style="display:flex">
                    <img width="75" height="50" src="<%=cursoActual.getImagen()%>" alt="<%= cursoActual.getTitulo()%>"/>
                    <div id="container" class="dropdown">
                        <ul>
                            <li><a href="#">Evaluación</a>
                                <!-- First Tier Drop Down -->
                                <ul>
                                    <li><a href="/ASAPLICACIONCURSOSPRACTICA1/Public/RealizarEvaluacion.jsp?name=command&value=numero">Mediante numero</a></li>
                                    <li><a href="/ASAPLICACIONCURSOSPRACTICA1/Public/RealizarEvaluacion.jsp?name=command&value=letra">Con letra</a></li>
                                    <li><a href="/ASAPLICACIONCURSOSPRACTICA1/Public/RealizarEvaluacion.jsp?name=command&value=comentario">Escribiendo comentario</a></li>
                                </ul>        
                            </li>  
                        </ul>
                    </div>
                </td>

            </tr>

            <%
                    current++;

                }

            %>
        </table>

        <script src="highlighter.js" type="text/javascript"></script>
    </body> 

    <%@include file="../Footer.jsp" %>

</html>