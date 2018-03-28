<%-- 
    Document   : Biblioteca
    Created on : 28-mar-2018, 15:07:52
    Author     : YonePC
--%>

<%@page import="beans.Biblioteca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Biblioteca</title>
    </head>
    <body>
        <%            Biblioteca biblioteca = new Biblioteca(request.getParameter("nombre"));
        %>
        <h1>Nombre: <%= biblioteca.getNombre()%></h1>
        <div id="demo" class="carousel slide" data-ride="carousel" style="width: 100%; height: 100%">
             <!-- Indicators -->
             <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- The slideshow -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <a href="Libro?nombre=Clean+Code&autor=Robert+C+Martin">
                        <img src="../Images/libroCleanCode.jpg" alt="" />
                    </a>
                </div>
                <div class="carousel-item">
                    <a href="Libro?nombre=Refactoring&autor=Joshua+Bloch">
                        <img src="../Images/libroRefactoring.png" alt=""/>
                    </a>
                </div>
                <div class="carousel-item">
                    <a href="Libro?nombre=Python&autor=OReilly">
                        <img src="../Images/libroPython.jpg" alt=""/>
                    </a>
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next" style="margin-right: 300px">
                <i class="fas fa-arrow-right"></i>
            </a>
        </div>
    </body>
</html>
