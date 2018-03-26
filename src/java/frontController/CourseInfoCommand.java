/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontController;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "CourseInfoCommand", urlPatterns = {"/CourseInfoCommand"})
public class CourseInfoCommand extends FrontCommand {

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
            
            estadisticas.nuevoAccesoCourseInfoCommand();
            
            singletonFuncionLog5.funcionLog("CourseInfoCommand", "processRequest");
        } catch (NamingException ex) {
            Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
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

            SingletonFuncionLog singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

            singletonFuncionLog5.funcionLog("CourseInfoCommand", "process");
            try {
                forward("/Public/CourseInfo.jsp");
            } catch (ServletException ex) {
                singletonFuncionLog5.funcionLog("CourseInfoCommand", "ServletException ex");

                Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("CourseInfoCommand", "IOException ex");

                Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("CourseInfoCommand", "NamingException ex");

            Logger.getLogger(CourseInfoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
