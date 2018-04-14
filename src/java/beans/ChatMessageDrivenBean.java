/*


This class aims to add messages to a singleton
when Queue: jmsDemo/navinDest receives a new message,
the purpose is to store incoming messages in the singleton and broadcast them as a chat.

 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author YonePC
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jmsDemo/navinDest"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})


public class ChatMessageDrivenBean implements MessageListener {
@EJB
private chatSingleton myChatSingleton;
    
    public ChatMessageDrivenBean() {
    }
    
    @Override
    public void onMessage(Message message) {
        myChatSingleton.addMessage(message);
    }
    
}
