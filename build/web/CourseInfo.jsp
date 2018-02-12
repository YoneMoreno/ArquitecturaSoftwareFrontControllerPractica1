
<%@page import="org.Curso"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<html> 
    <body> 
        <table width="100%" border=1>
            <tr>
                <th style="padding: 8px">Titulo</th>
                <th style="padding: 8px">Autor</th>
                <th style="padding: 8px">Asignatura</th>
                <th style="padding: 8px">Duracion</th>
                <th style="padding: 8px">Video</th>
            </tr>
            <tr>
                <td><%= request.getAttribute("titulo")%></td>
                <td><%= request.getAttribute("autor")%></td>
                <td><%= request.getAttribute("asignatura")%></td>
                <td><%= request.getAttribute("duracion")%></td>
                <td><a href="<%= request.getAttribute("video")%>">Video</a></td>
            </tr>

            <% if (session.getAttribute("cursos") != null) {%>
            <tr>
                <% ArrayList cursos = (ArrayList) session.getAttribute("cursos");
                    Iterator i = cursos.iterator();
                    int current = 0;
                    while (i.hasNext()) {
                        Curso cursoActual = (Curso) i.next();
                %>
                <td><%= request.getAttribute("titulo" + current)%></td>
                <td><%= request.getAttribute("autor" + current)%></td>
                <td><%= request.getAttribute("asignatura" + current)%></td>
                <td><%= request.getAttribute("duracion" + current)%></td>
                <td><a href="<%= request.getAttribute("video" + current)%>">Video</a></td>
                <%
                    current++;
                %>
            <br/>
            <p>current: <%= current%></p>
            <%
                }
            %>
        </tr>
        <br/>
        <% }%>
    </table>
</body> 
</html>