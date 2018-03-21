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
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author YonePC
 */
@Stateful
public class Encuesta {

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    String cuestion1;

    public Encuesta() {
        try {
            String text = "Encuesta::constructor por defecto de Encuesta::este metodo recibe NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Encuesta(String cuestion1) {
        try {
            String text = "Encuesta::constructor de Encuesta::el constructor recibio la cuestion: : " + cuestion1 + "\n";
            writeLogToFile(text, file);
            this.cuestion1 = cuestion1;
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCuestion1() {
        try {
            String text = "Encuesta::getCuestion1::la funcion, devuelve la cuestion: " + cuestion1 + "\n";
            writeLogToFile(text, file);

        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuestion1;
    }

    public void setCuestion1(String cuestion1) {
        try {
            String text = "Encuesta::setCuestion1::la funcion, PONE la cuestion: " + cuestion1 + "\n";
            writeLogToFile(text, file);

            this.cuestion1 = cuestion1;
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void postConstruct() {
        try {
            String text = "Encuesta::postConstruct::nuestro PostConstruct es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PrePassivate
    public void prePassivate() {
        try {
            String text = "Encuesta::prePassivate::la funcion que realiza el prePassivate es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PostActivate
    public void postActivate() {
        try {
            String text = "Encuesta::postActivate::el metodo paraa realizar el postActivate devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Remove
    public void remove() {
        try {
            String text = "Encuesta::remove::el metodo donde realizamos el remove devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        try {
            String text = "Encuesta::preDestroy::donde realizamos el PreDestroy es VOID \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }

}
