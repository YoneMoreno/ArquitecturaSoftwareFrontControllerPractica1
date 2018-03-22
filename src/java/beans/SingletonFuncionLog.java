/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Singleton;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
@Singleton
public class SingletonFuncionLog {

    Estadisticas estadisticas;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    String log = "";

    public SingletonFuncionLog() {
        try {
            this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
            estadisticas.nuevoAccesoSingletonFuncionLog();
        } catch (NamingException ex) {
            Logger.getLogger(SingletonFuncionLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void funcionLog(String nombreClase, String nombreFuncion) {
       
        log += "\n" + nombreClase + "::" + nombreFuncion + "\n";
        System.out.println(log);
    }

    public String getFuncionLog() {
        estadisticas.nuevoAccesoSingletonFuncionLog();

        return log;
    }
}
