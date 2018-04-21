package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import jpa.Profesor_1Facade;
import org.Profesor_1;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "RegisterCommand", urlPatterns = {"/RegisterCommand"})
public class RegisterCommand extends FrontCommand {

    Profesor_1Facade profesor_1Facade;

    public RegisterCommand() {
        try {
            this.profesor_1Facade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
        } catch (NamingException ex) {
            Logger.getLogger(RegisterCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void process(HttpServletRequest request) {

        try {
            Profesor_1 profesor = new Profesor_1();
            profesor.setNombre(request.getParameter("username"));
            profesor.setContrasena(request.getParameter("password"));
            profesor.setAsignatura(request.getParameter("subject"));
            profesor.setValoracion(0);
            profesor.setCorreo(request.getParameter("email"));
            profesor.setTelefono(Integer.parseInt(request.getParameter("phone")));
            profesor.setDespacho(request.getParameter("office"));
            
            profesor_1Facade.create(profesor);
            
            response.sendRedirect("index.jsp");
        } catch (IOException ex) {
            Logger.getLogger(RegisterCommand.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
