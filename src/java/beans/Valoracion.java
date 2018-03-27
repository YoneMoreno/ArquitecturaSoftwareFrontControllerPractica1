/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
