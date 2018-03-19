<%-- 
    Document   : Encuesta
    Created on : 10-feb-2018, 10:06:01
    Author     : YonePC
--%>

<%@page import="beans.Encuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="Header.jsp" %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
    </head>
    <body>
        <%
            Encuesta encuesta = (Encuesta) request.getAttribute("encuesta");
            

        %>

        <h1><%= encuesta.getCuestion1()%></h1>
        <form >
            <div style="display:flex">
                <h4>0</h4><input type="radio" name="encuesta1" value="0"  />
                <h4>1</h4><input type="radio" name="encuesta1" value="1" />
                <h4>2</h4><input type="radio" name="encuesta1" value="2" />
                <h4>3</h4><input type="radio" name="encuesta1" value="3" />
                <h4>4</h4><input type="radio" name="encuesta1" value="4" />
                <h4>5</h4><input type="radio" name="encuesta1" value="5" />
                <h4>6</h4><input type="radio" name="encuesta1" value="6" />
                <h4>7</h4><input type="radio" name="encuesta1" value="7" />
                <h4>8</h4><input type="radio" name="encuesta1" value="8" />
                <h4>9</h4><input type="radio" name="encuesta1" value="9" />
                <h4>10</h4><input type="radio" name="encuesta1" value="10"  />
            </div>
            <input type="reset" name="Enviar encuesta" value="Enviar encuesta" />
        </form>

    </body>
    <%@include file="Footer.jsp" %>

</html>
