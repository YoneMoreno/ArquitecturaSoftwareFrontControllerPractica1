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
public class ConviertePuntosNota {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public String convertidor(int evaluacion){
        return evaluacion >= 5 ? "Apto" : "No apto";
    }
}
