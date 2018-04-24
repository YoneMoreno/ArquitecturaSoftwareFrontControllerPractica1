package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import jpa.ProfesorFacade;
import org.Profesor;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "RegisterCommand", urlPatterns = {"/RegisterCommand"})
public class RegisterCommand extends FrontCommand {

    ProfesorFacade profesorFacade;

    public RegisterCommand() {
        try {
            this.profesorFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/ProfesorFacade");
        } catch (NamingException ex) {
            Logger.getLogger(RegisterCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void process(HttpServletRequest request) {

        try {
            Profesor profesor = new Profesor();
            profesor.setNombre(request.getParameter("username"));
            profesor.setContrasena(request.getParameter("password"));
            profesor.setCorreo(request.getParameter("email"));
            profesor.setTelefono((request.getParameter("phone")));
            profesor.setDespacho(request.getParameter("office"));
            
            profesorFacade.create(profesor);
            
            response.sendRedirect("index.jsp");
        } catch (IOException ex) {
            Logger.getLogger(RegisterCommand.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
