
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="org.Curso"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
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

            <%

                if (session.getAttribute("cursos") == null) {
                    ArrayList cursos = new ArrayList();
                    session.setAttribute("cursos", cursos);
                    Curso curso = new Curso("AS", "Javier", "Gestion SW", "100h", "", "https://image.slidesharecdn.com/the-recovered-architect-140318152419-phpapp02/95/the-modern-software-architect-13-638.jpg?cb=1395216721");
                    cursos.add(curso);
                }
                if (session.getAttribute("cursos") != null) {
                    ArrayList cursos = (ArrayList) session.getAttribute("cursos");
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
                <td><a href="<%= cursoActual.getVideo()%>">Video</a></td>
                <td style="display:flex">
                    <img width="75" height="50" src="<%= cursoActual.getImagen()%>" alt="<%= cursoActual.getTitulo()%>"/>
                    <div id="container" class="dropdown">
                        <ul>
                            <li><a href="#">Evaluación</a>
                                <!-- First Tier Drop Down -->
                                <ul>
                                    <li><a href="RealizarEvaluacion.jsp?name=command&value=numero">Mediante numero</a></li>
                                    <li><a href="RealizarEvaluacion.jsp?name=command&value=letra">Con letra</a></li>
                                    <li><a href="RealizarEvaluacion.jsp?name=command&value=comentario">Escribiendo comentario</a></li>
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