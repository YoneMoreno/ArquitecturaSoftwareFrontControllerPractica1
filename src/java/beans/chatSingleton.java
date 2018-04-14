/*



This class structures how data is recorder in our chat.
There is a list of messages


 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.jms.Message;

/**
 *
 * @author YonePC
 */
@Singleton
@LocalBean
public class chatSingleton {

    private List<Message> message;

    @PostConstruct
    void postConstruct() {
        message = new ArrayList<>();
    }

    public void addMessage(Message msg) {
        message.add(msg);
    }

    public List<Message> getMessage() {
        return message;
    }
}
