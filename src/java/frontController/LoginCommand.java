package frontController;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import jpa.ProfesorFacade;
import org.Profesor;


/**
 *
 * @author YonePC
 */
@WebServlet(name = "LoginCommand", urlPatterns = {"/LoginCommand"})
public class LoginCommand extends FrontCommand {

    ProfesorFacade profesorFacade;

    public LoginCommand() {
        try {
            this.profesorFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/ProfesorFacade");
        } catch (NamingException ex) {
            Logger.getLogger(LoginCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void process(HttpServletRequest request) {
        try {
            List<Profesor> profesores = profesorFacade.findAll();
            String name = request.getParameter("username");
            String password = request.getParameter("password");

            for (Profesor profesor : profesores) {
                if (profesor.getNombre().equals(name)
                        && profesor.getContrasena().equals(password)) {
                    session.setAttribute("profesor", profesor);
                }

            }
            response.sendRedirect("/ASAPLICACIONCURSOSPRACTICA1/index.jsp");
        } catch (IOException ex) {
            Logger.getLogger(LoginCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

