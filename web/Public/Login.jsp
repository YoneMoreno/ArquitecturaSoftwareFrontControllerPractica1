<%-- 
    Document   : Login
    Created on : 21-abr-2018, 16:04:59
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
   <div class="container">
    <form class="form-horizontal" action="FrontServlet" method="POST">
        <input type="hidden" name="command" value="LoginCommand"/>
        <fieldset>
            <div id="legend">
                <legend class="">Iniciar sesión</legend>
            </div>
            <div class="control-group">
                <!-- Username -->
                <label class="control-label" for="username"><i class="fas fa-user"></i>  Nombre</label>
                <div class="controls">
                    <input type="text" class="form-control" id="username" name="username" placeholder="" class="input-xlarge" required autofocus>
                </div>
            </div>
            <div class="control-group">
                <!-- Password-->
                <label class="control-label" for="password"><i class="fas fa-key"></i>  Contraseña</label>
                <div class="controls">
                    <input type="password" class="form-control" id="password" name="password" placeholder="" class="input-xlarge" required>
                </div>
            </div>


            <div class="control-group">
                <!-- Button -->
                <div class="controls">
                    <button style="margin: 1.5em"class="btn btn-success" >Logearse</button>
                </div>
            </div>

        </fieldset>
    </form>
</div>

</html>
