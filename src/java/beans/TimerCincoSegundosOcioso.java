/*

This timer writes a message into SIngletonFuncionLog when the user has been inactive for
five seconds.



 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.FrontServlet;

/**
 *
 * @author YonePC
 */
@Stateless
public class TimerCincoSegundosOcioso {
    String logAnterior = "";
    String logActual = "";
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Schedule(second = "*/5", minute = "*", hour = "*")
    public void imprimirMensajeCincoSegundosOcioso() {

        try {
            SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            logActual = singletonFuncionLog5.getFuncionLog();
            if (!logActual.equals(logAnterior)) {
                System.out.println("logActual: " + logActual + " logAnterior: " + logAnterior);
                logAnterior = singletonFuncionLog5.getFuncionLog();
            } else {
                System.out.println("EN EL TIMER, el logActual y logAnterior son iguales");
                singletonFuncionLog5.funcionLog("TimerCincoSegundosOcioso::", "El usuario ha permanecido cinco segundos sin realizar actividad");
            }

        } catch (NamingException ex) {
            Logger.getLogger(TimerCincoSegundosOcioso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
