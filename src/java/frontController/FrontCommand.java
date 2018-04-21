/*




FrontCommand abstracts a central point where we can handle context, request and response.


 */
package frontController;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author YonePC
 */
public abstract class FrontCommand extends HttpServlet {

    protected ServletContext context;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    SingletonFuncionLog singletonFuncionLog5;
    Estadisticas estadisticasFrontCommand;

    public void init(ServletContext context, HttpServletRequest request, HttpServletResponse response, HttpSession session) throws NamingException {
        singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        this.estadisticasFrontCommand = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

        estadisticasFrontCommand.nuevoAccesoFrontCommand();

        singletonFuncionLog5.funcionLog("FrontCommand", "init");
        this.context = context;
        this.request = request;
        this.response = response;
        this.session = session;
    }

    abstract public void process(HttpServletRequest request);

    public void forward(String target) throws ServletException, IOException {
        try {
            singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

            singletonFuncionLog5.funcionLog("FrontCommand", "forward");
            RequestDispatcher dp = context.getRequestDispatcher(target);
            dp.forward(request, response);
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("FrontCommand", "NamingException ex");

            Logger.getLogger(FrontCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
