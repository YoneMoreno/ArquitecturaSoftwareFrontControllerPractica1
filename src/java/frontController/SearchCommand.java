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
import jpa.Curso_1Facade;
import org.Curso_1;

/**
 *
 * @author YonePC
 */
public class SearchCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {

        final String search = request.getParameter("search");
        if (search != null) {
            try {

                final String cursoFacadeJNDI = "java:global/ASAPLICACIONCURSOSPRACTICA1/Curso_1Facade";

                Curso_1Facade cursoFacade
                        = InitialContext.
                                doLookup(cursoFacadeJNDI);

                final String contains = "%";

                List<Curso_1> cursosSearch
                        = cursoFacade
                                .findAllCourseWhichContain(contains + search + contains);
                request.setAttribute("cursosSearch", cursosSearch);
                try {
                    forward("/Public/CourseInfo.jsp");
                } catch (ServletException ex) {
                    Logger.getLogger(SearchCommand.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SearchCommand.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NamingException ex) {
                Logger.getLogger(SearchCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
