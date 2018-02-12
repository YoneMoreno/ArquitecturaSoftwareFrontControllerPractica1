
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
                <td><%= request.getParameter("titulo")%></td>
                <td><%= request.getParameter("autor")%></td>
                <td><%= request.getParameter("asignatura")%></td>
                <td><%= request.getParameter("duracion")%></td>
                <td><a href="<%= request.getParameter("video")%>">Video</a></td>
            </tr>
            <% if (request.getParameter("cursos") != null)%>
            <tr>
                <td><%= request.getParameter("titulo")%></td>
                <td><%= request.getParameter("autor")%></td>
                <td><%= request.getParameter("asignatura")%></td>
                <td><%= request.getParameter("duracion")%></td>
                <td><a href="<%= request.getParameter("video")%>">Video</a></td>
            </tr>
        </table>
    </body> 
</html>