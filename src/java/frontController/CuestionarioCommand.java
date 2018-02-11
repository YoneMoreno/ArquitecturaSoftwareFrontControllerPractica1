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

/**
 *
 * @author YonePC
 */
@WebServlet(name = "CuestionarioCommand", urlPatterns = {"/CuestionarioCommand"})
public class CuestionarioCommand extends FrontCommand {

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
        String pregunta1 = request.getParameter("pregunta1");
        String respuestaTexto11 = request.getParameter("respuestaTexto11");
        String respuestaVerdad11 = request.getParameter("respuestaVerdad11");
        String respuestaTexto12 = request.getParameter("respuestaTexto12");
        String respuestaVerdad12 = request.getParameter("respuestaVerdad12");
        String respuestaTexto13 = request.getParameter("respuestaTexto13");
        String respuestaVerdad13 = request.getParameter("respuestaVerdad13");
        request.setAttribute("cuestionario", "La pregunta1 del cuestionario es: " + pregunta1
                + " la respuesta1 es: " + respuestaTexto11
                + " es: " + respuestaVerdad11
                + " la respuesta2 es: " + respuestaTexto12
                + " es: " + respuestaVerdad12
                + " la respuesta3 es: " + respuestaTexto13
                + " es: " + respuestaVerdad13);
        try {
            forward("/Cuestionario.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
