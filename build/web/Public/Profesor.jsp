<%-- 
    Document   : Profesor
    Created on : 19-mar-2018, 15:34:07
    Author     : YonePC
--%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="beans.Profesor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    Profesor profesor = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor!beans.Profesor");
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


    </body>
</html>
