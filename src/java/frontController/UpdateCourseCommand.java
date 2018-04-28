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
import org.Curso_1;

/**
 *
 * @author YonePC
 */
public class UpdateCourseCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {
            if(request.getParameter("id")!=null){
                try {
                    Curso_1Facade cursoFacade = 
                            InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade");
                    Curso_1 curso = (Curso_1) cursoFacade.find(Integer.parseInt(request.getParameter("id")));
                    request.setAttribute("curso",curso);
                } catch (NamingException ex) {
                    Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            forward("/Public/UpdateCourse.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
