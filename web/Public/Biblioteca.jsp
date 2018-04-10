<%-- 
    Document   : Biblioteca
    Created on : 28-mar-2018, 15:07:52
    Author     : YonePC

    Biblioteca displays a carousel which show library's images.
This JSP expects a parameter nombre which is the library's name.
Then w edisplay the library's name.
The carousel host various images. Each one has a link as:
nombre=Clean+Code&autor=Robert+C+Martin

nombre means the library's book's name, and autor is the library's author name.
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
                    <a href="Libro.jsp?nombre=Clean+Code&autor=Robert+C+Martin">
                        <img src="../Images/libroCleanCode.jpg" alt="" />
                    </a>
                </div>
                <div class="carousel-item">
                    <a href="Libro.jsp?nombre=Refactoring&autor=Joshua+Bloch">
                        <img src="../Images/libroRefactoring.png" alt=""/>
                    </a>
                </div>
                <div class="carousel-item">
                    <a href="Libro.jsp?nombre=Python&autor=OReilly">
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
