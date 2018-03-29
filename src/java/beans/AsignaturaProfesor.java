/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    ArrayList<Tema> lista;

    public AsignaturaProfesor() {
    }

    public AsignaturaProfesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tema> getLista() {
        return lista;
    }
    
    public void insertarTema(Tema tema){
        this.getLista().add(tema);
    }
    
}
