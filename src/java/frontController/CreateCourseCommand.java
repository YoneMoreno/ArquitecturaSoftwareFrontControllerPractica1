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

            final String titulo = request.getParameter("titulo");
            final String autor = request.getParameter("autor");
            final String asignatura = request.getParameter("asignatura");
            final int duracion = Integer.parseInt(request.getParameter("duracion"));
            String video = request.getParameter("video");
            String imagen = request.getParameter("imagen");

            imagen = putDefaultImage(imagen);

            video = putDefaultVideo(video);

            curso_1Facade.createCourse(titulo, autor, asignatura, duracion, video, imagen);

            forward("/Public/CourseInfo.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(CreateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreateCourseCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String putDefaultVideo(String video) {
        if (video == null || video.isEmpty()) {
            video = "https://player.vimeo.com/external/194837908.sd.mp4?s=c350076905b78c67f74d7ee39fdb4fef01d12420&profile_id=164";
        }
        return video;
    }

    private String putDefaultImage(String imagen) {
        if (imagen == null || imagen.isEmpty()) {
            imagen = "http://2.bp.blogspot.com/-KRqoq8kBqzs/T2x_qB8zu5I/AAAAAAAAGR0/Mu0RWv9CbWc/s1600/libro.jpg";
        }
        return imagen;
    }

}
