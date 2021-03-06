/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import jpa.MessagesFacade;
import jpa.Profesor_1Facade;
import org.Messages;
import org.Profesor_1;

/**
 *
 * @author YonePC
 */
public class SeeMessagesCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {
            MessagesFacade messagesFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/MessagesFacade");
            Profesor_1 profesor = (Profesor_1) session.getAttribute("profesor");
            List<Messages> messages = (List<Messages>) messagesFacade.findAllById(profesor,
                    request.getParameter("type"));
            request.setAttribute("messages", messages);
            try {
                forward("/Public/received.jsp");
            } catch (ServletException ex) {
                Logger.getLogger(SeeMessagesCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SeeMessagesCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(SeeMessagesCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
