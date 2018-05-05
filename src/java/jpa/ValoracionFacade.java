/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.Valoracion;

/**
 *
 * @author YonePC
 */
@Stateless
public class ValoracionFacade extends AbstractFacade<Valoracion> {

    @PersistenceContext(unitName = "ASAPLICACIONCURSOSPRACTICA1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ValoracionFacade() {
        super(Valoracion.class);
    }
    
}
