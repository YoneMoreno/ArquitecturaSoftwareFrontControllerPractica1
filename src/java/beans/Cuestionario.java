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
public class Cuestionario {

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    String pregunta1, respuestaTexto11, respuestaVerdad11, respuestaTexto12, respuestaVerdad12,
            respuestaTexto13, respuestaVerdad13;

    public Cuestionario() {
        try {
            String text = "\n Cuestionario::constructor por defecto::este metodo es VOID + \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cuestionario(String pregunta1, String respuestaTexto11, String respuestaVerdad11, String respuestaTexto12, String respuestaVerdad12, String respuestaTexto13, String respuestaVerdad13) {
        try {
            String text = "\n Cuestionario::constructor::este metodo es crea el cuestionario con: "
                    + pregunta1 + respuestaTexto11 + respuestaVerdad11 + respuestaTexto12 + respuestaVerdad12
                    + respuestaTexto13 + respuestaVerdad13
                    + "\n";
            writeLogToFile(text, file);
            this.pregunta1 = pregunta1;
            this.respuestaTexto11 = respuestaTexto11;
            this.respuestaVerdad11 = respuestaVerdad11;
            this.respuestaTexto12 = respuestaTexto12;
            this.respuestaVerdad12 = respuestaVerdad12;
            this.respuestaTexto13 = respuestaTexto13;
            this.respuestaVerdad13 = respuestaVerdad13;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPregunta1() {
        try {
            String text = "Cuestionario::getPregunta1::este metodo devuelve la pregunta1: " + pregunta1 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        try {
            String text = "Cuestionario::setPregunta1::este metodo PONE la pregunta1: " + pregunta1 + "\n";
            writeLogToFile(text, file);
            this.pregunta1 = pregunta1;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaTexto11() {
        try {
            String text = "Cuestionario::getRespuestaTexto11::este metodo OBTIENE la respuesta al texto 11: " + respuestaTexto11 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaTexto11;
    }

    public void setRespuestaTexto11(String respuestaTexto11) {
        try {
            String text = "Cuestionario::setRespuestaTexto11::esta funcoon PONE la respuesta al texto 11: " + respuestaTexto11 + "\n";
            writeLogToFile(text, file);
            this.respuestaTexto11 = respuestaTexto11;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaVerdad11() {
        try {
            String text = "Cuestionario::getRespuestaTexto11::este metodo COGE el booleano de verdad para respuesta 11: " + respuestaVerdad11 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaVerdad11;
    }

    public void setRespuestaVerdad11(String respuestaVerdad11) {
        try {
            String text = "Cuestionario::setRespuestaVerdad11::esta FUNCION, pone la respuesta al boolean de verdad 11 " + respuestaVerdad11 + "\n";
            writeLogToFile(text, file);
            this.respuestaVerdad11 = respuestaVerdad11;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaTexto12() {
        try {
            String text = "Cuestionario::getRespuestaTexto12::esta funcoon DEVUELVE la respuesta al texto 12: " + respuestaTexto12 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaTexto12;
    }

    public void setRespuestaTexto12(String respuestaTexto12) {
        try {
            String text = "Cuestionario::setRespuestaTexto12::esta funcion PONE la respuesta al texto 12: " + respuestaTexto12 + "\n";
            writeLogToFile(text, file);
            this.respuestaTexto12 = respuestaTexto12;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaVerdad12() {
        try {
            String text = "Cuestionario::getRespuestaVerdad12::esta FUNCIONCITA Obtiene la respuesta al valor boolean de la respuesta 12: " + respuestaVerdad12 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaVerdad12;
    }

    public void setRespuestaVerdad12(String respuestaVerdad12) {
        try {
            String text = "Cuestionario::setRespuestaVerdad12::esta funcion, PONE la respuesta al valor boolean de la respuesta 12: " + respuestaVerdad12 + "\n";
            writeLogToFile(text, file);
            this.respuestaVerdad12 = respuestaVerdad12;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaTexto13() {
        try {
            String text = "Cuestionario::getRespuestaTexto13::nuestra funcioncita, OBTIENE, la respuesta de texto 13: " + respuestaTexto13 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaTexto13;
    }

    public void setRespuestaTexto13(String respuestaTexto13) {
        try {
            String text = "Cuestionario::setRespuestaTexto13::nuestra funcioncita, PONE, la respuesta de texto 13: " + respuestaTexto13 + "\n";
            writeLogToFile(text, file);
            this.respuestaTexto13 = respuestaTexto13;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaVerdad13() {
        try {
            String text = "Cuestionario::getRespuestaVerdad13::nuestro metodo, COGE, la el valor boolean de la respuesta 13: " + respuestaVerdad13 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaVerdad13;

    }

    public void setRespuestaVerdad13(String respuestaVerdad13) {
        try {
            String text = "Cuestionario::getRespuestaVerdad13::nuestro metodo, PONE, el valor boolean para la repuesta 13: " + respuestaVerdad13 + "\n";
            writeLogToFile(text, file);
            this.respuestaVerdad13 = respuestaVerdad13;
        } catch (IOException ex) {
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void postConstruct() {
        try {
            String text = "Cuestionario::postConstruct::nuestro PostConstruct es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PrePassivate
    public void prePassivate() {
        try {
            String text = "Cuestionario::prePassivate::la funcion que realiza el prePassivate es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PostActivate
    public void postActivate() {
        try {
            String text = "Cuestionario::postActivate::el metodo paraa realizar el postActivate devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Remove
    public void remove() {
        try {
            String text = "Cuestionario::remove::el metodo donde realizamos el remove devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        try {
            String text = "Cuestionario::preDestroy::donde realizamos el PreDestroy es VOID \n";
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
