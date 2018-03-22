/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import beans.Cuestionario;
import beans.Estadisticas;
import beans.SingletonFuncionLog;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
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

    Estadisticas estadisticas;

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
        try {
            response.setContentType("text/html;charset=UTF-8");

            SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
            
            estadisticas.nuevoAccesoCuestionarioCommand();

            singletonFuncionLog5.funcionLog("CuestionarioCommand", "processRequest");
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("CuestionarioCommand", "NamingException ex");

            Logger.getLogger(CuestionarioCommand.class.getName()).log(Level.SEVERE, null, ex);
        }

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

        try {

            String pregunta1 = request.getParameter("pregunta1");
            String respuestaTexto11 = request.getParameter("respuestaTexto11");
            String respuestaVerdad11 = request.getParameter("respuestaVerdad11");
            String respuestaTexto12 = request.getParameter("respuestaTexto12");
            String respuestaVerdad12 = request.getParameter("respuestaVerdad12");
            String respuestaTexto13 = request.getParameter("respuestaTexto13");
            String respuestaVerdad13 = request.getParameter("respuestaVerdad13");

            Cuestionario instanciaCuestionario = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Cuestionario!beans.Cuestionario");

            instanciaCuestionario.setPregunta1(pregunta1);

            instanciaCuestionario.setRespuestaTexto11(respuestaTexto11);
            instanciaCuestionario.setRespuestaVerdad11(respuestaVerdad11);
            instanciaCuestionario.setRespuestaTexto12(respuestaTexto12);
            instanciaCuestionario.setRespuestaVerdad12(respuestaVerdad12);
            instanciaCuestionario.setRespuestaTexto13(respuestaTexto13);
            instanciaCuestionario.setRespuestaVerdad13(respuestaVerdad13);

            request.setAttribute("cuestionario", instanciaCuestionario);
            try {
                forward("/Cuestionario.jsp");
            } catch (ServletException ex) {
                singletonFuncionLog5.funcionLog("CuestionarioCommand", "ServletException ex");

                Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("CuestionarioCommand", "IOException ex");

                Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("CuestionarioCommand", "NamingException ex");

            Logger.getLogger(CuestionarioCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
