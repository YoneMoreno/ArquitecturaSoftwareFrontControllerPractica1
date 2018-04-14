/*


This class models a library.
It is made by name.

 */
package beans;

import javax.ejb.Stateful;

/**
 *
 * @author YonePC
 */
@Stateful
public class Biblioteca {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    String nombre;

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
