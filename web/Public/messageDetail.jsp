<%-- 
    Document   : messageDetail
    Created on : 02-may-2018, 23:59:03
    Author     : YonePC
--%>

<%@page import="org.Profesor_1"%>
<%@page import="org.Messages"%>
<%@page import="jpa.Profesor_1Facade"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="jpa.MessagesFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../Header.jsp" %>
<%
    MessagesFacade messageFacade
            = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/MessagesFacade!jpa.MessagesFacade");
    Profesor_1Facade profesorFacade
            = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");

    int id = Integer.parseInt(request.getParameter("id"));
    Messages message = messageFacade.find(id);
    Profesor_1 profesor = profesorFacade.find(message.getIdSender().getIdProfesor());
%>
<div class="container">
    <div class="row mt-5 mb-3">
        <h1><%=message.getSubject()%></h1>
    </div>
    <div class="row">
        <div class="col-md-2"><h5><%=profesor.getNombre()%></h5></div>
        <div class="col-md-2"><h5>&lt;<%=profesor.getCorreo()%>&gt;</h5></div>
    </div>
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-2"><h6><%=message.getDate()%></h6></div>
    </div>
    <div class="card card-block bg-faded  mt-5 mb-5"><%=message.getMessage()%></div>
</div>

