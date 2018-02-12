
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
            <% if (request.getParameter("cursos") != null)%>
            <tr>
                <td><%= request.getAttribute("titulo1")%></td>
                <td><%= request.getAttribute("autor1")%></td>
                <td><%= request.getAttribute("asignatura1")%></td>
                <td><%= request.getAttribute("duracion1")%></td>
                <td><a href="<%= request.getAttribute("video1")%>">Video</a></td>
            </tr>
        </table>
    </body> 
</html>