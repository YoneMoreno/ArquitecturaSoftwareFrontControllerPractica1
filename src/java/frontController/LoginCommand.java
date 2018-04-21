package frontController;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import jpa.Profesor_1Facade;
import org.Profesor_1;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "LoginCommand", urlPatterns = {"/LoginCommand"})
public class LoginCommand extends FrontCommand {

    Profesor_1Facade profesorFacade;

    public LoginCommand() {
        try {
            this.profesorFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
        } catch (NamingException ex) {
            Logger.getLogger(LoginCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void process(HttpServletRequest request) {
        try {
            List<Profesor_1> profesores = profesorFacade.findAll();
            String name = request.getParameter("username");
            String password = request.getParameter("password");

            for (Profesor_1 profesor : profesores) {
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

