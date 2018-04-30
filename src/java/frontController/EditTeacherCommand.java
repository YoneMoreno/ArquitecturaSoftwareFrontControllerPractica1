/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
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
public class EditTeacherCommand extends FrontCommand {

    private Profesor_1Facade profesor_1Facade;

    public EditTeacherCommand() {
        try {
            this.profesor_1Facade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
        } catch (NamingException ex) {
            Logger.getLogger(EditTeacherCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void process(HttpServletRequest request) {
        try {
//Por que sale null
            int idProfesor = Integer.parseInt(request.getParameter("id"));
            Profesor_1 profesor = (Profesor_1) profesor_1Facade.find(idProfesor);
            int valoracion = profesor.getValoracion();
            Profesor_1 newProfesor = new Profesor_1(idProfesor,
                    request.getParameter("username"),
                    request.getParameter("password"),
                    request.getParameter("subject"),
                    valoracion,
                    request.getParameter("email"),
                    Integer.parseInt(request.getParameter("phone")),
                    request.getParameter("office"));
            profesor_1Facade.edit(newProfesor);
            session.setAttribute("profesor", newProfesor);
            forward("/Public/Profesor.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(EditTeacherCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EditTeacherCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
