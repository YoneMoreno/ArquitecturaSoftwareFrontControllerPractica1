/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.Messages;
import org.Profesor_1;

/**
 *
 * @author YonePC
 */
@Stateless
public class MessagesFacade extends AbstractFacade<Messages> {

    @PersistenceContext(unitName = "ASAPLICACIONCURSOSPRACTICA1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessagesFacade() {
        super(Messages.class);
    }

    public List<Messages> findAllById(Profesor_1 id, String type) {
        Query query = null;
        if (type.equals("received")) {
            query = em.createQuery("SELECT m FROM Messages m WHERE m.idReceiver = :idReceiver");
            query.setParameter("idReceiver", id);
        }
        if (type.equals("sent")) {
            query = em.createQuery("SELECT m FROM Messages m WHERE m.idSender = :idSender");
            query.setParameter("idSender", id);
        }
        return query.getResultList();
    }

}
