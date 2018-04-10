<%-- 
    Document   : Footer
    Created on : 13-mar-2018, 17:59:25
    Author     : YonePC
--%>

<%@page import="beans.SingletonFuncionLog"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    SingletonFuncionLog singletonFuncionLog2 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog2.funcionLog("Footer", "processRequest");
%>

<!DOCTYPE html>
<html>
    <footer class="fixed-bottom footer bg-dark">
        <div class="container">
            <span class="text-white">
                Servicio técnico: tecnico@gmail.es
            </span>
        </div>
    </footer>
</html>
