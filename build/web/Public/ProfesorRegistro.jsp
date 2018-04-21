<%-- 
    Document   : ProfesorRegistro
    Created on : 21-abr-2018, 14:27:53
    Author     : YonePC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../Header.jsp" %>
    <div class="container">
    </head>
    <body>
        <form class="form-horizontal" action="../FrontServlet" method="POST">
            <input type="hidden" name="command" value="RegisterCommand"/>
            <fieldset>
                <div id="legend">
                    <legend class="">Registrarse</legend>
                </div>
                <div class="control-group">
                    <!-- Username -->
                    <label class="control-label" for="username"><i class="fas fa-user"></i>  Nombre</label>
                    <div class="controls">
                        <input type="text" class="form-control" id="username" name="username" placeholder="" class="input-xlarge" required>
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
                    <label class="control-label" for="subject"><i class="fas fa-user-secret"></i> Asignatura</label>
                    <div class="controls">
                        <input type="text" class="form-control" id="subject" name="subject" placeholder="" class="input-xlarge" required>              
                    </div>
                </div>

                <div class="control-group">
                    <!-- E-mail -->

                    <label class="control-label" for="email"><i class="fas fa-envelope-square"></i>  E-mail</label>
                    <div class="controls">
                        <input type="text" class="form-control" id="email" name="email" placeholder="" class="input-xlarge" required>
                    </div>
                </div>

                <div class="control-group">
                    <label class="control-label" for="phone"><i class="fas fa-phone"></i>  Movil</label>
                    <div class="controls">
                        <input type="number"  class="form-control" id="phone" name="phone" placeholder="" class="input-xlarge" required>
                    </div>
                </div>

                <div class="control-group">
                    <label class="control-label" for="office"><i class="fas fa-map-marker"></i>  Despacho</label>
                    <div class="controls">
                        <input type="text" class="form-control" id="office" name="office" placeholder="" class="input-xlarge" required>
                    </div>
                </div>


                




                <div class="control-group">
                    <!-- Button -->
                    <div class="controls">
                        <button type="submit" style="margin: 1.5em"class="btn btn-success">Registrarse</button>
                    </div>
                </div>

                </body>
            </fieldset>
        </form>
</div>