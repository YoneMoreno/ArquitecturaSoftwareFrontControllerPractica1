/*





This class saves the logs wbhich represent where is the program's execution flow.



 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
@DependsOn("Estadisticas")
@Singleton
public class SingletonFuncionLog {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    static String log = "";

    

    public void funcionLog(String nombreClase, String nombreFuncion) {

        this.log += "\n" + nombreClase + "::" + nombreFuncion + "\n";
        System.out.println(this.log);
    }

    public static String getFuncionLog() {
        try {
            Estadisticas estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
            
            estadisticas.nuevoAccesoSingletonFuncionLog();
            return log;
        } catch (NamingException ex) {
            Logger.getLogger(SingletonFuncionLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR";
    }
}
