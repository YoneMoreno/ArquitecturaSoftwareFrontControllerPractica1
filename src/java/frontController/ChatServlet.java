/*


ChatServlet receives a messages and posts it to a queue and also appends the session ID

*/



package frontController;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ChatServlet", urlPatterns = {"/ChatServlet"})
public class ChatServlet extends HttpServlet {

    @Resource(mappedName = "jmsDemo/navinDest")
    private Queue demoNavinDest;
    @Resource(mappedName = "jmsDemo/navin")
    private ConnectionFactory queue;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String mensaje = request.getParameter("mensaje");
            String getId = request.getParameter("getId");
            
            sendJMSMessageToNavinDest(mensaje, getId);
            response.sendRedirect(request.getContextPath() + "/Public/Chat.jsp");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void sendJMSMessageToNavinDest(String messageData, String getId) {
        try {
            Connection con = queue.createConnection();
            Session s = con.createSession();
            MessageProducer mp = s.createProducer(demoNavinDest);
            TextMessage tm = s.createTextMessage();
            tm.setText(messageData);
            mp.send(tm);
            TextMessage userId = s.createTextMessage();
            userId.setText(getId);
            mp.send(userId);
        } catch (JMSException ex) {
            Logger.getLogger(ChatServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
