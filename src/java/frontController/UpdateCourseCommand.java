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
            toPutCourseInfoInEditForm(request);

            toUpdateCourse(request);

            forward("/Public/UpdateCourse.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void toUpdateCourse(HttpServletRequest request1) throws IOException, NumberFormatException, ServletException {
        if (request1.getParameter("idCursoActualizado") != null) {
            Curso_1Facade cursoFacade = null;
            try {
                cursoFacade = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade");
            } catch (NamingException ex) {
                Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
//                cursoFacade.updateCourse(request.getParameter("titulo"),
//                        request.getParameter("autor"),
//                        request.getParameter("asignatura"),
//                        Integer.parseInt(request.getParameter("duracion")),
//                        request.getParameter("video"),
//                        request.getParameter("imagen"),
//                        Integer.parseInt(request.getParameter("idCursoActualizado")));
            Curso_1 curso = new Curso_1(Integer.parseInt(request1.getParameter("idCursoActualizado")), request1.getParameter("titulo"), request1.getParameter("autor"), request1.getParameter("asignatura"), Integer.parseInt(request1.getParameter("duracion")), request1.getParameter("video"), request1.getParameter("imagen"));
            cursoFacade.edit(curso);
            request1.setAttribute("curso", curso);
            forward("/Public/CourseInfo.jsp");
        }
    }

    private void toPutCourseInfoInEditForm(HttpServletRequest request1) throws NumberFormatException {
        if (request1.getParameter("id") != null) {
            try {
                Curso_1Facade cursoFacade
                        = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade");
                Curso_1 curso = (Curso_1) cursoFacade.find(Integer.parseInt(request1.getParameter("id")));
                request1.setAttribute("curso", curso);
            } catch (NamingException ex) {
                Logger.getLogger(UpdateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
