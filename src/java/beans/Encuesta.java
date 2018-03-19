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
public class Encuesta {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    String cuestion1;

    public Encuesta() {
    }

    public Encuesta(String cuestion1) {
        this.cuestion1 = cuestion1;
    }

    public String getCuestion1() {
        return cuestion1;
    }

    public void setCuestion1(String cuestion1) {
        this.cuestion1 = cuestion1;
    }

}
