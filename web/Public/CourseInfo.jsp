
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

%>

<html> 
    <head>
        <%@include file="../Header.jsp" %>
        <title>Lista de cursos</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link href="nav.css" rel="stylesheet" type="text/css"/>
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

            <%                if (session.getAttribute("cursos") == null) {
                    ArrayList cursos = new ArrayList();
                    session.setAttribute("cursos", cursos);
                }
                if (session.getAttribute("cursos") != null) {
                    ArrayList cursos = (ArrayList) session.getAttribute("cursos");
                    if (cursos.size() == 0) {
                        Curso curso = new Curso("AS", "Javier", "Gestion SW", "100h", "https://www.youtube.com/embed/xulqPJdBt5E", "https://image.slidesharecdn.com/the-recovered-architect-140318152419-phpapp02/95/the-modern-software-architect-13-638.jpg?cb=1395216721");
                        Curso curso2 = new Curso("MDA", "Agustin", "Gestion SW", "100h", "https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164", "https://www.codejobs.biz/public/images/blog/original/a6cd96ce30b459e.png");
                        cursos.add(curso);
                        cursos.add(curso2);
                    }
                    Iterator i = cursos.iterator();
                    int current = 0;
                    while (i.hasNext()) {
                        Curso cursoActual = (Curso) i.next();

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
                    if(m.find()){  
                %>
                <td><a href="./VideoMP4.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>
                <% } else { %>
                <td><a href="./Video.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>
                <% } %>
                <td style="display:flex">
                    <img width="75" height="50" src="<%= cursoActual.getImagen()%>" alt="<%= cursoActual.getTitulo()%>"/>
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
                }
            %>
        </table>


    </body> 

    <%@include file="../Footer.jsp" %>

</html>