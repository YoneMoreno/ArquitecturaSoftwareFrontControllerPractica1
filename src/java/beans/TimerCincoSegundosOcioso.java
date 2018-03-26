/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.FrontServlet;

/**
 *
 * @author YonePC
 */
@Singleton
public class TimerCincoSegundosOcioso {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Schedule(second = "*/5", minute = "*", hour = "*")
    public void imprimirMensajeCincoSegundosOcioso() {

        try {
            SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("TimerCincoSegundosOcioso::", "El usuario ha permanecido cinco segundos sin realizar actividad");

        } catch (NamingException ex) {
            Logger.getLogger(TimerCincoSegundosOcioso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
