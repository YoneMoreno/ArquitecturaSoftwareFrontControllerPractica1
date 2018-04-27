/*


This class models how we relate Course and DB

 */
package jpa;

import java.util.List;
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
    
    public List<Curso_1> findAllCourses(){
        return em.createQuery("SELECT c FROM Curso_1 c")
                .getResultList();
    }
    
}
