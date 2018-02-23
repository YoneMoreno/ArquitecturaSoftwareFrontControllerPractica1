
<%@page import="org.Curso"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<html> 
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">

    </head>
    <body> 
        <table width="100%" border=1>
            <tr>
                <th style="padding: 8px">Titulo</th>
                <th style="padding: 8px">Autor</th>
                <th style="padding: 8px">Asignatura</th>
                <th style="padding: 8px">Duracion</th>
                <th style="padding: 8px">Video</th>
            </tr>

            <% if (session.getAttribute("cursos") != null) {%>
            <% ArrayList cursos = (ArrayList) session.getAttribute("cursos");
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
            </tr>

            <%
                    current++;

                }
            %>
            <br/>
            <% }%>
        </table>
    </body> 
</html>