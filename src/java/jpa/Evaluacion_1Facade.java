/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.Evaluacion_1;

/**
 *
 * @author YonePC
 */
@Stateless
public class Evaluacion_1Facade extends AbstractFacade<Evaluacion_1> {

    @PersistenceContext(unitName = "ASAPLICACIONCURSOSPRACTICA1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Evaluacion_1Facade() {
        super(Evaluacion_1.class);
    }
    
}
