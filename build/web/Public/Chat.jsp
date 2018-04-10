

<%-- 

    Chat.jsp shows an input field to write mesages.
Then it sends the message to ChatServlet to be processed.
In addition, it shows current messages and the session ID of the emitter, both in one line.
Please note that we are supposing that the queue always has messages in even indexes,
and session IDs in odd indexes.

So for example, message is at List's index 0, the session ID is at List's index 1:

message at index 0 = 'Hello, how is this course going?'
session ID at index 1 = 9ef9ed9ggggg

--%>

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
            <input type="hidden" name="getId" value=<%= session.getId()%>/>
            <input type="submit" value="Enviar"/>
        </form>
            
            <div class="row">


        <%            List<Message> messages = myChatSingleton.getMessage();
            if (myChatSingleton.getMessage().size() > 0) {
                Iterator i = messages.iterator();
                while (i.hasNext()) {
                    Message currentMessage = (Message) i.next();

        %>

        
            <div class="col-md-6 text-center">
                <div class="float-md-left">
                    <%= currentMessage.getBody(String.class)%>
                </div>
            </div>

            <%
                if (i.hasNext()) {
                    Message currentID = (Message) i.next();
            %>
            <div class="col-md-6 text-center">
                <div class="float-md-right">
                    <%= currentID.getBody(String.class)%>
                </div>
            </div>
            <%
                        }
                    }
                }
            %>
    </body>
</html>
