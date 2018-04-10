/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
