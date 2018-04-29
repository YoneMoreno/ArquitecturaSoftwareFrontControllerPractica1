package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author YonePC
 */
public class ListarProfesoresCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {
            forward("/Public/ListaProfesores.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(ListarProfesoresCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListarProfesoresCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
