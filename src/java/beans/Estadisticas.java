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
    int index = 0;
    int unknown = 0;
    int evaluacion = 0;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void cuentaNuevaSesion() {
        System.out.println("El numero de sesiones nuevas es: " + ++cuenta);
    }

    public int getCuentaNuevaSesion() {
        return cuenta;
    }

    public void nuevaVisitaIndex() {
        ++index;
    }

    public int getNuevaVisitaIndex() {
        return index;
    }

    public void nuevaVisitaUnknown() {
        ++unknown;
    }

    public int getNuevaVisitaUnknown() {
        return unknown;
    }

    public void nuevaVisitaEvaluacion() {
        ++evaluacion;
    }

    public int getNuevaVisitaEvaluacion() {
        return evaluacion;
    }

}
