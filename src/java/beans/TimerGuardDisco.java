/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
@Stateless
public class TimerGuardDisco {

    @Schedule(second = "*/6", minute = "*", hour = "*")
    private void writeLogToFile() throws IOException {
        /*
        File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\TimerGuardaDiscolog.txt");
        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(SingletonFuncionLog.getFuncionLog());
        output.close();
*/

    }
}
