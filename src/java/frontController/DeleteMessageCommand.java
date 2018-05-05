/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import jpa.MessagesFacade;
import org.Messages;

/**
 *
 * @author YonePC
 */
public class DeleteMessageCommand extends FrontCommand {

    MessagesFacade messagesFacade;

    public DeleteMessageCommand() throws NamingException {
        this.messagesFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/MessagesFacade");
    }

    @Override
    public void process(HttpServletRequest request) {
        try {
            if (request.getParameter("id") != null) {
                String idMessage = request.getParameter("id");

                Messages message = messagesFacade.find(Integer.parseInt(idMessage));
                messagesFacade.delete(message.getId());
            }
            forward("/Public/Profesor.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(DeleteMessageCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DeleteMessageCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
