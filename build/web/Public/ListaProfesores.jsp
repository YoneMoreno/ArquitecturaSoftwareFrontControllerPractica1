<%-- 
    Document   : ListaProfesores
    Created on : 29-abr-2018, 7:23:53
    Author     : YonePC
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de profesores</title>
    </head>
    <body>




        <div class="container">
            <div class="row">
                <p>Pagina</p>
            </div>
            <div class="row">
                <form action="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet" class="form-inline">
                    <input type="hidden" name="command" value="ProfesorSearchCommand">
                    <input class="mr-sm-2" name="pagina" type="number" min="1" 
                           value="<%=request.getParameter("pagina") != null ? request.getParameter("pagina") : "1"%>" placeholder="Numero pagina"
                           aria-labels="pagina">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Busca</button>
            </div>
            <div class="row">


                <%
                    if (request.getAttribute("profesorByPage") != null) {
                        List<Profesor_1> profesorByPage = (List<Profesor_1>) request.getAttribute("profesorByPage");
                        for (Profesor_1 profesor : profesorByPage) {
                %>
                <%@include file="./TarjetaProfesor.jsp" %>
                <%    }
                    }
                %>
            </div>
        </div>



        <div class="container">
            <div class="row">
                <p>Profesores por busqueda</p>
            </div>
            <div class="row">
                <input class="mr-sm-2" name="search" type="search" placeholder="Escribe para buscar"
                       aria-labels="search"
                       value="<%=request.getParameter("search") != null ? request.getParameter("search") : ""%>">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Busca</button>
                </form>
            </div>
            <div class="row">

                <%
                    List<Profesor_1> allProfesors = (List<Profesor_1>) request.getAttribute("allProfesors");
                    List<Profesor_1> allProfesorsBySearch = (List<Profesor_1>) request.getAttribute("allProfesorsBySearch");
                    //System.out.println("Numero de profesores encontrados en ListaProfesores.jsp: " + allProfesorsBySearch.size());
                    for (Profesor_1 profesor : allProfesors) {
                        if (allProfesorsBySearch != null) {
                            if (allProfesorsBySearch.contains(profesor)) {
                %>
                <%@include file="./TarjetaProfesor.jsp" %>
                <%          }

                } else if (allProfesorsBySearch
                        == null) {
                %>
                <%@include file="./TarjetaProfesor.jsp" %>


                <%
                        }
                    }
                %>
            </div>
        </div>
    </body>
    <%@include file="../Footer.jsp" %>
</html>
