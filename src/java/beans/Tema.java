/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


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
