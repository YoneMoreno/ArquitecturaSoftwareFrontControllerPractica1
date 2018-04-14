/*


This class is a Topic.
It is made by a name and a description.


 */
package beans;

import javax.ejb.Stateful;


/**
 *
 * @author YonePC
 */
@Stateful
public class Tema {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    String nombre, descripcion;

    public Tema() {
    }

    public Tema(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
