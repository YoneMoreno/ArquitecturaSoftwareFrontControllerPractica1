/*



This command's logic defines how XML transformation is done using
XSLT rules to reach a HTML output.

 */
package frontController;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import java.io.File;
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
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "AlumnosCommand", urlPatterns = {"/AlumnosCommand"})
public class AlumnosCommand extends FrontCommand {

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

            SingletonFuncionLog singletonFuncionLog5 = null;
            try {
                singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
                this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

                estadisticas.nuevoAccesoAlumnosCommand();

            } catch (NamingException ex) {
                singletonFuncionLog5.funcionLog("AlumnosCommand", "NamingException ex");

                Logger.getLogger(AlumnosCommand.class.getName()).log(Level.SEVERE, null, ex);
            }

            singletonFuncionLog5.funcionLog("AlumnosCommand", "process()");

            TransformerFactory factory = TransformerFactory.newInstance();
            StreamSource xsl = new StreamSource(new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\frontController\\Alumnos.xsl"));
            Transformer newTransformer = factory.newTransformer(xsl);

            StreamSource xml = new StreamSource(new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\frontController\\Alumnos.xml"));
            PrintWriter writer = response.getWriter();
            Result result = new StreamResult(writer);
            newTransformer.transform(xml, result);
            writer.println(writer.toString());

        } catch (IOException ioe) {
            singletonFuncionLog5.funcionLog("AlumnosCommand", "IOException ioe");
            ioe.printStackTrace();
        } catch (TransformerException te) {
            singletonFuncionLog5.funcionLog("AlumnosCommand", "TransformerException te");

            te.printStackTrace();

        }
    }

}
