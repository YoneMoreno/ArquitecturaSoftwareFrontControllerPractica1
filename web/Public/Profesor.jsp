<%-- 
    Document   : Profesor
    Created on : 19-mar-2018, 15:34:07
    Author     : YonePC
--%>

<%@page import="beans.SingletonFuncionLog"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.Curso"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="beans.Profesor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    Profesor profesor = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor!beans.Profesor");
    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("Profesor", "processRequest");

    Estadisticas estadisticasProfesor = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasProfesor.nuevaVisitaProfesor();
%>

<html>
    <%@include file="../Header.jsp" %>
    <body>
        <div class="d-flex flex-row">
            <div>
                <i class="fas fa-user-circle fa-5x"></i>
            </div>     
            <div class="container center">
                <h1 class="text-center "><%= profesor.getNombre()%><h1/>
            </div>
        </div>
        <div class="d-flex flex-row">
            <div>
                <h3>Asignatura:</h3>

            </div>     
            <div class="container text-center">
                <img class="image-center" src="../Images/CHJavascript.JPG" alt="<%= profesor.getAsignatura()%>"/>
                <h4><%= profesor.getAsignatura()%></h4>
            </div>
        </div>

        <div class="d-flex flex-row">
            <div>
                <h3>Valoracion:</h3>

            </div>     
            <div class="container center text-center">
                <img src="../Images/CHValoracion.JPG" alt="<%= profesor.getValoracion()%>"/>
                <h4><%= profesor.getValoracion()%></h4>
            </div>

        </div>

        <div class="d-flex flex-row">
            <div>
                <h3>Contacto:</h3>

            </div>     
            <div class="container center text-center">

                <h4><i class="fas fa-envelope-square"></i>Correo: <%= profesor.getCorreo()%></h4>
                <h4><i class="fas fa-phone-square"></i>Telefono: <%= profesor.getTelefono()%></h4>
                <h4><i class="fas fa-briefcase"></i>Despacho: <%= profesor.getDespacho()%></h4>
                <img src="" alt=""/>
            </div>
        </div>
        <details>
            <summary>
                Lista de cursos:
            </summary>
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
</details>




</body>
</html>
