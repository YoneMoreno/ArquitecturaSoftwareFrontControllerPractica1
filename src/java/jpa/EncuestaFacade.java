/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.Encuesta;

/**
 *
 * @author YonePC
 */
@Stateless
public class EncuestaFacade extends AbstractFacade<Encuesta> {

    @PersistenceContext(unitName = "ASAPLICACIONCURSOSPRACTICA1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EncuestaFacade() {
        super(Encuesta.class);
    }
    
}
