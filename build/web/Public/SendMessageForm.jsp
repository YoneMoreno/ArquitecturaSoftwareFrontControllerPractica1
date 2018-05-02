<%-- 
    Document   : SendMessageForm
    Created on : 02-may-2018, 22:59:12
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enviar mensaje</title>
    </head>
    <body>
        <%@include file="../Header.jsp" %>

        <div class="container mt-5">
            <form action="/ASAPLICACIONCURSOSPRACTICA1/FrontServlet?command=SendMessageCommand" method="POST" >
                <div class="form-group">
                    <input  class="form-control" id="subject" name="subject" placeholder="Escribe el asunto" required></input>
                </div>
                <div class="form-group">
                    <textarea rows="4" type="text" class="form-control" id="message" name="message" aria-describedby="message" placeholder="Escribe un mensaje" required></textarea>
                </div>

                <input type="hidden" name="idReceiver" value="<%= request.getParameter("idReceiver")%>">
                <button type="submit" class="btn btn-primary btn-block">Enviar</button>
            </form>
        </div>
    </body>
</html>
