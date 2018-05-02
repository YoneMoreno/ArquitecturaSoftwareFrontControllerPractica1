<%-- 
    Document   : received
    Created on : 02-may-2018, 23:45:02
    Author     : YonePC
--%>

<%@page import="org.Messages"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../Header.jsp" %>
<div class="container">
    <table class="table table-hover mt-5">
        <thead>
            <tr>
                <th>Enviado por</th>
                <th>Asunto</th>
                <th>Fecha</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Messages> messages = (List<Messages>) request.getAttribute("messages");
                Profesor_1Facade profesorFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
                for (Messages message : messages) {
                    Profesor_1 sender = profesorFacade.find(message.getIdSender().getIdProfesor());

            %>

            <tr>
                <td><%= sender.getCorreo()%></td>
                <td><%= message.getSubject()%></td>
                <td><%= message.getDate()%></td>
                <td><a href="Public/messageDetail.jsp?id=<%=message.getId()%>"><i class="fas fa-eye"></i></a></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</div>
