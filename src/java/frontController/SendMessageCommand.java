/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
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
public class SendMessageCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {

            try {
                MessagesFacade messagesFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/MessagesFacade");
                Profesor_1Facade profesorFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
                Profesor_1 receiver = profesorFacade.find(Integer.parseInt(request.getParameter("idReceiver")));
                Profesor_1 profesor = (Profesor_1) session.getAttribute("profesor");

                if (request.getParameter("type").equals("edit")) {
                    System.out.println("SendMessageCommand::Editar mensaje");
                    messagesFacade.update(Integer.parseInt(request.getParameter("idMessage")),
                            request.getParameter("subject"),
                            request.getParameter("message"));
                    forward("/Public/Profesor.jsp");

                } else {

                    Messages message = new Messages();
                    message.setIdReceiver(receiver);
                    message.setIdSender(profesor);
                    message.setSubject(request.getParameter("subject"));
                    message.setMessage(request.getParameter("message"));
                    message.setDate(new Date());
                    System.out.println(message);
                    messagesFacade.create(message);
                }

            } catch (NamingException ex) {
                Logger.getLogger(SendMessageCommand.class.getName()).log(Level.SEVERE, null, ex);
            }

            forward("/Public/SendMessageForm.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(SendMessageCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SendMessageCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
