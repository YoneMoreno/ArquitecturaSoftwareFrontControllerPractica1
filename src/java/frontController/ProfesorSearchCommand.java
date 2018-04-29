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
import jpa.Profesor_1Facade;
import org.Profesor_1;

/**
 *
 * @author YonePC
 */
public class ProfesorSearchCommand extends FrontCommand {

    @Override
    public void process(HttpServletRequest request) {
        try {
            Profesor_1Facade profesorFacade
                    = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Profesor_1Facade");
            List<Profesor_1> allProfesorsBySearch
                    = profesorFacade.findAllProfesorsBySearch(request.getParameter("search"));
            //System.out.println("Numero de profesores por search: " + allProfesorsBySearch.size());
            request.setAttribute("allProfesorsBySearch", allProfesorsBySearch);

            List<Profesor_1> allProfesors
                    = profesorFacade.findAllWithCriteria();
            request.setAttribute("allProfesors", allProfesors);

            try {
                forward("/Public/ListaProfesores.jsp");
            } catch (ServletException ex) {
                Logger.getLogger(ProfesorSearchCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProfesorSearchCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            Logger.getLogger(ProfesorSearchCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
