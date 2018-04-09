<%-- 
    Document   : Bibliotecas
    Created on : 28-mar-2018, 14:45:08
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="highlight.css" rel="stylesheet" type="text/css"/>
        <title>Bibliotecas</title>
    </head>
    <body>
        <div id="demo" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- The slideshow -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <a href="Biblioteca.jsp?nombre=Biblioteca+General&command=BibliotecaCommand">
                        <img src="../Images/generalBiblioteca.jpg" alt="Biblioteca General" width="100%" height="100%"/>
                    </a>
                </div>
                <div class="carousel-item">
                    <a href="Biblioteca.jsp?nombre=Biblioteca+Informatica&command=BibliotecaCommand">
                        <img src="../Images/informaticBiblioteca.jpg" alt="" width="100%" height="100%"/>
                    </a>
                </div>
                <div class="carousel-item">
                    <a href="Biblioteca.jsp?nombre=Biblioteca+Arquitectura&command=BibliotecaCommand">
                        <img src="../Images/arquitecturaBiblioteca.jpg" alt="" width="100%" height="100%"/>
                    </a>
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <i class="fas fa-arrow-right"></i>
            </a>
        </div>
        <script>
            const triggers = document.querySelectorAll('a');
            //console.log(triggers);
            const highlight = document.createElement('span');
            highlight.classList.add('highlight');
            document.body.appendChild(highlight);

            function highlightLink() {
                const linkCoords = this.getBoundingClientRect();
                //console.log(linkCoords);
                const coords = {
                    width: linkCoords.width,
                    height: linkCoords.height,
                    top: linkCoords.top + window.scrollY,
                    left: linkCoords.left + window.scrollX
                };
                console.log(coords.width);

                highlight.style.width = coords.width + 'px';
                console.log(highlight.style.width);
                highlight.style.height = coords.height + 'px';
                highlight.style.transform = 'translate(' + coords.left + 'px,' + coords.top + 'px)';

            }

            triggers.forEach(a => a.addEventListener('mouseenter', highlightLink));

        </script>
    </body>
</html>
