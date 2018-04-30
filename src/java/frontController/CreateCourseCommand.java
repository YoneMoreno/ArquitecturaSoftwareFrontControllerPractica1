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
import jpa.Curso_1Facade;

/**
 *
 * @author YonePC
 */
public class CreateCourseCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {
            Curso_1Facade curso_1Facade = null;
            try {
                curso_1Facade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade");
            } catch (NamingException ex) {
                Logger.getLogger(CreateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
            curso_1Facade.createCourse(request.getParameter("titulo"),
                    request.getParameter("autor"),
                    request.getParameter("asignatura"),
                    Integer.parseInt(request.getParameter("duracion")),
                    request.getParameter("video"),
                    request.getParameter("imagen"));

            forward("/Public/CourseInfo.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(CreateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
