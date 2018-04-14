/*


This class models how we relate Course and DB

 */
package jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.Curso_1;

/**
 *
 * @author YonePC
 */
@Stateless
public class Curso_1Facade extends AbstractFacade<Curso_1> {

    @PersistenceContext(unitName = "ASAPLICACIONCURSOSPRACTICA1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Curso_1Facade() {
        super(Curso_1.class);
    }
    
}
