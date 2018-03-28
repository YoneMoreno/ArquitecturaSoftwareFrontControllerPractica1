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
