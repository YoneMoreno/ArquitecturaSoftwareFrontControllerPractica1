/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "LogoutCommand", urlPatterns = {"/LogoutCommand"})
public class LogoutCommand extends FrontCommand {

  
    @Override
    public void process(HttpServletRequest request) {
        try {
            session.invalidate();
            forward("/index.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(LogoutCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogoutCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
