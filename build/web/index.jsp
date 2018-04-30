<%@page import="beans.Estadisticas"%>
<!DOCTYPE html>
<!--



This class allows users to:

Create a new course,
create a new questionnaire,
create a new survey,
see the pupils list,
see the school's subjects in a carousel,
observe social media links/icons.


-->

<%

    SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog5.funcionLog("Index", "processRequest");

    Estadisticas estadisticasIndex = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasIndex.nuevaVisitaIndex();


%>

<html>
    <head>
        <%@include file="Header.jsp" %>
        <title>CursosApp</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>       
        <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js" integrity="sha384-SlE991lGASHoBfWbelyBPLsUlwY1GwNDJo3jSJO04KZ33K2bwfV9YBauFfnzvynJ" crossorigin="anonymous"></script>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <%if (session.getAttribute("profesor") != null) {%>
                <h1>Bienvenido a CursosApp, elija una opción del panel para comenzar:</h1>
                <div>
                    <%@ include file="/Public/CreateCourseForm.jsp"%>
                    <%@ include file="/Public/CreateCuestionarioForm.jsp"%>
                    <%@ include file="/Public/CreateEncuestaForm.jsp"%>
                    <%}%>
                    <%@include file="/Public/CarruselAsignaturasEscuela.jsp" %>
                </div>
            </div>


            <div class="container-fluid"/>
            <!-- Control the column width, and how they should appear on different devices -->
            <div class="row">
                <%@include file="/Public/DescripcionEscuela.jsp" %>
                <%@include file="/Public/RedesSociales.jsp"%>
            </div>
        </div>
    </div>
</body>
<%@include file="Footer.jsp" %>
</html>

