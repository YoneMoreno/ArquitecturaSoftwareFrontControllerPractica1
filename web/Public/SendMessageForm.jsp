<%-- 
    Document   : SendMessageForm
    Created on : 02-may-2018, 22:59:12
    Author     : YonePC
--%>

<%@page import="org.Messages"%>
<%@page import="jpa.MessagesFacade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enviar mensaje</title>
    </head>
    <body>
        <%@include file="../Header.jsp" %>

        <%
            String id = request.getParameter("id");
            Messages message = null;
            if (id != null) {
                MessagesFacade messagesFacade
                        = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/MessagesFacade");
                message = messagesFacade.find(Integer.parseInt(id));
            }


        %>

        <div class="container mt-5">
            <form action="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet?command=SendMessageCommand" method="POST" >
                <div class="form-group">
                    <%                        if (message != null) {
                    %>
                    <input  class="form-control"
                            id="subject" name="subject"
                            placeholder="Escribe el asunto"ç
                            required
                            value="<%=message.getSubject()%>">
                    </input>
                    <div class="form-group">
                        <textarea rows="4"
                                  type="text" 
                                  class="form-control"
                                  id="message"
                                  name="message"
                                  aria-describedby="message"
                                  required>
                            <%=message.getMessage().trim()%>
                        </textarea>
                        <input type="hidden" name="idReceiver" value="<%= message.getIdReceiver().getIdProfesor()%>">
                        <input type="hidden" name="type" value="edit">
                        <input type="hidden" name="idMessage" value="<%=message.getId()%>">
                        <button type="submit" class="btn btn-primary btn-block">Editar</button>
                    </div>
                    <%} else {%>
                    <input  class="form-control"
                            id="subject" name="subject"
                            placeholder="Escribe el asunto"
                            required>
                    </input>
                    <div class="form-group">
                        <textarea rows="4"
                                  type="text"
                                  class="form-control"
                                  id="message" name="message"
                                  aria-describedby="message"
                                  placeholder="Escribe un mensaje"
                                  required>
                        </textarea>
                    </div>
                    <input type="hidden" name="idReceiver" value="<%= request.getParameter("idReceiver")%>">
                    <button type="submit" class="btn btn-primary btn-block">Enviar</button>
                    <%}%>
                </div>


            </form>
        </div>
    </body>
</html>
