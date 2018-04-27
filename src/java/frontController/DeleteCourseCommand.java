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
import jpa.Curso_1Facade;

/**
 *
 * @author YonePC
 */
public class DeleteCourseCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {
            Curso_1Facade cursoFacade = 
                    InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade");
            cursoFacade.deleteCourse(Integer.parseInt(request.getParameter("id")));
            try {
                forward("/Public/CourseInfo.jsp");
            } catch (ServletException ex) {
                Logger.getLogger(DeleteCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DeleteCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(DeleteCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
