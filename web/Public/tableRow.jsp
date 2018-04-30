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

    <td><a href="Public/VideoMP4.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>

    <% } else {

        //If the video is not mp4 we suppose it is an embedded YouTube video

    %>

    <td><a href="Public/Video.jsp?video=<%=cursoActual.getVideo()%>">Video</a></td>

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