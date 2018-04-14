/*


This class represents a teacher's subject.
It has a name and a list of topics.

 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author YonePC
 */
@Stateful
public class AsignaturaProfesor {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    String nombre;
    List<Tema> lista;

    public AsignaturaProfesor() {
    }

    public AsignaturaProfesor(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tema> getLista() {
        return lista;
    }
    
    public void insertarTema(Tema tema){
        this.getLista().add(tema);
    }
    
}
