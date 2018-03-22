/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import frontController.FrontCommand;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author YonePC
 */
public class UnknownCommand extends FrontCommand {

    private SingletonFuncionLog singletonFuncionLog5;
    Estadisticas estadisticas;

    @Override
    public void process(HttpServletRequest request) {

        try {

            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
            
            estadisticas.nuevoAccesoUnknownCommand();
            
            singletonFuncionLog5.funcionLog("UnknownCommand", "process");
            try {
                forward("/Unknown.jsp");
            } catch (ServletException ex) {
                singletonFuncionLog5.funcionLog("Curso", "ServletException ex");

                Logger.getLogger(UnknownCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("Curso", "IOException ex");

                Logger.getLogger(UnknownCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("Curso", "NamingException ex");

            Logger.getLogger(UnknownCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
