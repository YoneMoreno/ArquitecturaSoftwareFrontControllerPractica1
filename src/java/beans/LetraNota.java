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
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
@Stateless
public class LetraNota {

    SingletonFuncionLog singletonFuncionLog5;

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    public String convierteLetraNota(String letra) {

        try {
            singletonFuncionLog5.funcionLog("LetraNota", "convierteLetraNota");

            String text = "LetraNota::convierteLetraNota::el usuario introdujo la LETRA: " + letra + "\n";
            writeLogToFile(text, file);

            return letra.equals("F") ? "No apto" : letra.equals("E") ? "No apto" : "Apto";
        } catch (IOException ex) {
            Logger.getLogger(LetraNota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR";
    }

    @PostConstruct
    public void postConstruct() {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("LetraNota", "postConstruct");

            String text = "LetraNota::postConstruct:: nuestro metodo PostConstruct es void!!!!!!!! \n";
            writeLogToFile(text, file);
        } catch (IOException | NamingException ex) {
            Logger.getLogger(LetraNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        try {
            singletonFuncionLog5.funcionLog("LetraNota", "preDestroy");
            String text = "LetraNota::preDestroy:: el metodo PreDestroy es void!!!!!!!!!!! \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(LetraNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {
        singletonFuncionLog5.funcionLog("LetraNota", "writeLogToFile");

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }
}
