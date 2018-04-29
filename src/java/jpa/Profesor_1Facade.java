/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import frontController.AbstractFacade;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.Profesor_1;

/**
 *
 * @author YonePC
 */
@Stateless
public class Profesor_1Facade extends AbstractFacade<Profesor_1> {

    @PersistenceContext(unitName = "ASAPLICACIONCURSOSPRACTICA1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Profesor_1Facade() {
        super(Profesor_1.class);
    }

    public List<Profesor_1> findAllWithCriteria() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Profesor_1> criteriaQuery = criteriaBuilder.createQuery(Profesor_1.class);
        Root<Profesor_1> profesorTable = criteriaQuery.from(Profesor_1.class);
        criteriaQuery.select(profesorTable);
        TypedQuery<Profesor_1> query = em.createQuery(criteriaQuery);
        List<Profesor_1> allProfesors = query.getResultList();
        return allProfesors;
    }

}
