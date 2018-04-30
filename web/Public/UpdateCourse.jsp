<%-- 
    Document   : UpdateCourse
    Created on : 28-abr-2018, 6:18:39
    Author     : YonePC
--%>

<%@page import="org.Curso_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar curso</title>
    </head>
    <body>
        <%
            Curso_1 curso = (Curso_1) request.getAttribute("curso");
        %>
        <form action="FrontServlet" method="POST">
            <div class="container">
                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-font"></i>
                    </div>
                    <div class="col-md-1">
                        <h4>Titulo:</h4>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-magic"></i>
                    </div>
                    <div class="col-md-1">
                        <input type="text" name="titulo" required value="<%= curso.getTitulo()%>"/>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-user"></i>
                    </div>
                    <div class="col-md-1">
                        <h2>Autor:</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1"> 
                        <i class="far fa-user"></i>
                    </div>
                    <div class="col-md-1">
                        <input type="text" name="autor" required value="<%= curso.getAutor()%>"/>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-book"></i>
                    </div>
                    <div class="col-md-1">
                        <h2>Asignatura:</h2>                        
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1"><i class="fas fa-bookmark"></i></div>
                    <div class="col-md-1"><select  class="input-xlarge" name="asignatura" value="<%= curso.getAsignatura()%>">
                            <option value="Matematicas">Matematicas</option>
                            <option value="Ingles">Ingles</option>
                            <option value="Lengua">Lengua</option>
                            <option value="Literatura">Literatura</option>
                            <option value="Biologia">Biologia</option>
                            <option value="Quimica">Quimica</option>
                            <option value="Fisica">Fisica</option>
                            <option value="Programacion">Programacion</option>
                            <option value="Frances">Frances</option>
                            <option value="Chino">Chino</option>
                        </select></div>
                </div>

                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-clock"></i>
                    </div>
                    <div class="col-md-1">
                        <h2 > Duracion:</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1">
                        <i class="far fa-clock"></i>
                    </div>
                    <div class="col-md-1">
                        <input type="number" name="duracion" value="<%= curso.getDuracion()%>"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-video"></i>
                    </div>
                    <div class="col-md-4">
                        <h2>Enlace al curso en video:</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1">
                        <i class="fab fa-youtube"></i>
                    </div>
                    <div class="col-md-10">
                        <input style="width:100%" type="url" name="video" pattern="https?://.+" title="video"
                               value="<%= curso.getVideo()%>">
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-1">
                        <i class="fas fa-image"></i>
                    </div>
                    <div class="col-md-5">
                        <h2>Enlace a la imagen del curso:</h2>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-1">
                        <i class="far fa-image"></i>
                    </div>
                    <div class="col-md-10">
                        <input style="width:100%" type="url" name="imagen" pattern="https?://.+" title="imagen"
                               value="<%= curso.getImagen()%>">
                    </div>
                </div>
                <input type="hidden" name="command" value="UpdateCourseCommand">
                <input type="hidden" name="idCursoActualizado" value="<%= curso.getIdCurso()%>">
                <input type="submit" value="Actualizar curso" onclick="alert('El curso se ha actualizado');"></div>
        </div>






    </form>

</body>
</html>
