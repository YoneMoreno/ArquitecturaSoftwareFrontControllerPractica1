/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
