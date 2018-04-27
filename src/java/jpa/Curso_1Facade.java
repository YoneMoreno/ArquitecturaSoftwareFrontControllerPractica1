/*


This class models how we relate Course and DB

 */
package jpa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
        return em.createQuery(selectCoursesStatement)
                .getResultList();
    }
    private static final String selectCoursesStatement = "SELECT c FROM Curso_1 c";
    
    public void createCourse(String titulo, String autor, String asignatura,
            int duracion, String video, String imagen){
         Query create = em.createNativeQuery(insertCourseStatement);
         
         create.setParameter(1, titulo);
         create.setParameter(2, autor);
         create.setParameter(3, asignatura);
         create.setParameter(4, duracion);
         create.setParameter(5, video);
         create.setParameter(6, imagen);
         create.executeUpdate();
    }
    private static final String insertCourseStatement = "INSERT INTO curso (idCurso, titulo, autor, asignatura, duracion,"
            + " video, imagen) VALUES (NULL, ?, ?,"
            + " ?, ?, ?, ?)";
    
}
