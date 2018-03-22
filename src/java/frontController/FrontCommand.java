/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YonePC
 */
public abstract class FrontCommand {

    protected ServletContext context;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    SingletonFuncionLog singletonFuncionLog5;
    Estadisticas estadisticas;

    public void init(ServletContext context, HttpServletRequest request, HttpServletResponse response) throws NamingException {
        singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
        
        estadisticas.nuevoAccesoFrontCommand();

        singletonFuncionLog5.funcionLog("FrontCommand", "init");
        this.context = context;
        this.request = request;
        this.response = response;
    }

    abstract public void process(HttpServletRequest request);

    public void forward(String target) throws ServletException, IOException {
        try {
            singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

            singletonFuncionLog5.funcionLog("FrontCommand", "forward");
            RequestDispatcher dp = context.getRequestDispatcher(target);
            dp.forward(request, response);
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("FrontCommand", "NamingException ex");

            Logger.getLogger(FrontCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
