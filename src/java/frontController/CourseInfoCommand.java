/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.Curso;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "CourseInfoCommand", urlPatterns = {"/CourseInfoCommand"})
public class CourseInfoCommand extends FrontCommand {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    public void process(HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (session.getAttribute("cursos") != null) {
            Curso[] curso = (Curso[]) session.getAttribute("cursos");
            

            String titulo1 = curso[1].getTitulo();
            request.setAttribute("titulo1",titulo1);
            String autor1 = curso[1].getAutor();
            request.setAttribute("autor1",autor1);
            String asignatura1 = curso[1].getAsignatura();
            request.setAttribute("asignatura1",asignatura1);
            String duracion1 = curso[1].getDuracion();
            request.setAttribute("duracion1",duracion1);
            String video1 = curso[1].getVideo();
            request.setAttribute("video1",video1);
        }

        Curso curso = (Curso) session.getAttribute("curso");

        String titulo = curso.getTitulo();
        request.setAttribute("titulo",titulo);
        String autor = curso.getAutor();
        request.setAttribute("autor",autor);
        String asignatura = curso.getAsignatura();
        request.setAttribute("asignatura",asignatura);
        String duracion = curso.getDuracion();
        request.setAttribute("duracion",duracion);
        String video = curso.getVideo();
        request.setAttribute("video",video);

        try {
            forward("/CourseInfo.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
