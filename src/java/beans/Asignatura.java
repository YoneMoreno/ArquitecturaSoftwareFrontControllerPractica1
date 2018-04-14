/*


This class holds a school's subject. It is being shown in index.jsp' carousel.

 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author YonePC
 */
@Stateless
public class Asignatura {

  String nombre, descripcion, imagen;


    public Asignatura() {
    }

    public Asignatura(String nombre, String descripcion, String imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }
    
}
