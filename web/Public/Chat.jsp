
<%@page import="java.util.Iterator"%>
<%@page import="javax.jms.Message"%>
<%@page import="java.util.List"%>
<%@page import="beans.chatSingleton"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    chatSingleton myChatSingleton = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/chatSingleton");

%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chat</title>
    </head>
    <body>
        <form action="../ChatServlet">
            Escribe tu mensaje: <input type="text" name="mensaje"/>
            <input type="submit" value="Enviar"/>
        </form>


        <%            List<Message> messages = myChatSingleton.getMessage();
            if (myChatSingleton.getMessage().size() > 0) {
                Iterator i = messages.iterator();
                while (i.hasNext()) {
                    Message currentMessage = (Message) i.next();

        %>

        <div>
            <%= currentMessage.getBody(String.class)%>
        </div>
        <%
                }
            }
        %>
    </body>
</html>
