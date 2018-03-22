/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Singleton;
import javax.servlet.http.HttpSession;

/**
 *
 * @author YonePC
 */
@Singleton
public class Estadisticas {
    int cuenta = 0;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public int cuentaNuevaSesion(){
        System.out.println("El numero de sesiones nuevas es: " + ++cuenta);
        return cuenta;
    }
}
