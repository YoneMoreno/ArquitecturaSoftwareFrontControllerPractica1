package frontController;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import jpa.Profesor_1Facade;
import org.Profesor_1;

/**
 *
 * @author YonePC
 */
public class ListarProfesoresCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {

            try {
                Profesor_1Facade profesorFacade
                        = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
                List<Profesor_1> allProfesors = profesorFacade.findAllWithCriteria();
                request.setAttribute("allProfesors", allProfesors);
                //System.out.println("AllProfesors number is: " + allProfesors.size());

            } catch (NamingException ex) {
                Logger.getLogger(ListarProfesoresCommand.class.getName()).log(Level.SEVERE, null, ex);
            }

            forward("/Public/ListaProfesores.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(ListarProfesoresCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListarProfesoresCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
