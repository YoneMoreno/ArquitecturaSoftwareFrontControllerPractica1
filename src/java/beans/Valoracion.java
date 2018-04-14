/*


This class keeps a rating posted by a pupil to a teacher.
It is made by a course, subject and points.


 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author YonePC
 */
@Stateless
public class Valoracion {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    String curso, asignatura, valoracion;

    public Valoracion() {
    }

    public Valoracion(String curso, String asignatura, String valoracion) {
        this.curso = curso;
        this.asignatura = asignatura;
        this.valoracion = valoracion;
    }

    public String getCurso() {
        return curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getValoracion() {
        return valoracion;
    }
    
    
}
