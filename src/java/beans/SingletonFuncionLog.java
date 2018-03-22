/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Singleton;

/**
 *
 * @author YonePC
 */
@Singleton
public class SingletonFuncionLog {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    String log = "";

    public void funcionLog(String nombreClase, String nombreFuncion) {
        log += "\n" + nombreClase + "::" + nombreFuncion + "\n";
        System.out.println(log);
    }
    
    public String getFuncionLog(){
        return log;
    }
}
