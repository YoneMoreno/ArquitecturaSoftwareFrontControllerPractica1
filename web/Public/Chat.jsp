
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    </body>
</html>
