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
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
@Stateful
public class Encuesta {

    SingletonFuncionLog singletonFuncionLog5;

    File file = new File("C:\\Users\\YonePC\\Desktop\\LogDelSistemaSingleton.txt");

    String cuestion1;

    public Encuesta() {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Encuesta", "constructor por defecto");

            try {
                String text = "Encuesta::constructor por defecto de Encuesta::este metodo recibe NADA \n";
                writeLogToFile(text, file);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

                Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "NamingException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Encuesta(String cuestion1) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Encuesta", "constructor CON argumentos");

            try {
                String text = "Encuesta::constructor de Encuesta::el constructor recibio la cuestion: : " + cuestion1 + "\n";
                writeLogToFile(text, file);
                this.cuestion1 = cuestion1;
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

                Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "NamingException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCuestion1() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getCuestion1");

        try {
            String text = "Encuesta::getCuestion1::la funcion, devuelve la cuestion: " + cuestion1 + "\n";
            writeLogToFile(text, file);

        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuestion1;
    }

    public void setCuestion1(String cuestion1) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setCuestion1");

        try {
            String text = "Encuesta::setCuestion1::la funcion, PONE la cuestion: " + cuestion1 + "\n";
            writeLogToFile(text, file);

            this.cuestion1 = cuestion1;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void postConstruct() {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Encuesta", "postConstruct");

            try {
                String text = "Encuesta::postConstruct::nuestro PostConstruct es void \n";
                writeLogToFile(text, file);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

                Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "NamingException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PrePassivate
    public void prePassivate() {
        
    }

    @PostActivate
    public void postActivate() {
        singletonFuncionLog5.funcionLog("Cuestionario", "postActivate");

        try {
            String text = "Encuesta::postActivate::el metodo paraa realizar el postActivate devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Remove
    public void remove() {
        singletonFuncionLog5.funcionLog("Cuestionario", "remove");

        try {
            String text = "Encuesta::remove::el metodo donde realizamos el remove devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        singletonFuncionLog5.funcionLog("Cuestionario", "preDestroy");

        try {
            String text = "Encuesta::preDestroy::donde realizamos el PreDestroy es VOID \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("LetraNota", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {
        singletonFuncionLog5.funcionLog("Cuestionario", "writeLogToFile");

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }

}
