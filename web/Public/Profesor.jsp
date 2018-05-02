<%-- 
    Document   : Profesor
    Created on : 19-mar-2018, 15:34:07
    Author     : YonePC

    Profesor.jsp shows a teacher's profile.
It is made by name, subject, pupils' assessments made to this teacher, email, phone and office

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
<%@include file="../Header.jsp" %>

<%
    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("Profesor", "processRequest");

    Estadisticas estadisticasProfesor = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

    estadisticasProfesor.nuevaVisitaProfesor();


%>

<html>


    <title>Profesor</title>

    <div class="container-fluid w3-theme-l5 w3-section">
        <div class="row">
            <div class="col-2 mt-0 mb-4 pl-4">
                <div class="list-group" id="list-tab" role="tablist">
                    <a class="list-group-item list-group-item-action active" id="list-home-list" data-toggle="list" href="#list-home" role="tab" aria-controls="profile">Mis datos</a>
                    <a class="list-group-item list-group-item-action" id="list-profile-list" data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">Editar mi perfil</a>
                    <div class="btn-group">
                        <button type="button" class="list-group-item list-group-item-action">Mensajes</button>
                        <button type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="sr-only">Toggle Dropdown</span>
                        </button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="FrontServlet?command=SeeMessagesCommand&type=received">Recibidos</a>
                            <a class="dropdown-item" href="FrontServlet?command=SeeMessagesCommand&type=sent">Enviados</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-10 mt-0 mb-4">
                <div class="tab-content" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="list-home" role="tabpanel" aria-labelledby="list-home-list">
                        <!-- Artworks -->
                        <%@ include file = "misDatosProfesor.jsp" %>
                    </div>
                    <div class="tab-pane fade" id="list-profile" role="tabpanel" aria-labelledby="list-profile-list">
                        <%@ include file = "editarMisDatosProfesor.jsp" %>
                    </div>
                </div>
            </div>
        </div>
    </div>


</html>




