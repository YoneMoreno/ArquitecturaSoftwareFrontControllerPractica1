/*



This class creates a book,
it is composed by name and author.


 */
package beans;

import javax.ejb.Stateful;

/**
 *
 * @author YonePC
 */
@Stateful
public class Libro {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    String nombre, autor;

    public Libro() {
    }

    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }
    
    
}
