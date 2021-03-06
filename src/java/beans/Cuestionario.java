/*


The class hosts a questionnaire made by a question and three possible answers,
each one with its true or false value.


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
public class Cuestionario {

    SingletonFuncionLog singletonFuncionLog5;

    File file = new File("C:\\Users\\YonePC\\Desktop\\LogDelSistemaSingleton.txt");

    String pregunta1, respuestaTexto11, respuestaVerdad11, respuestaTexto12, respuestaVerdad12,
            respuestaTexto13, respuestaVerdad13;

    public Cuestionario() {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Cuestionario", "constructor por defecto");

            try {
                String text = "\n Cuestionario::constructor por defecto::este metodo es VOID + \n";
                writeLogToFile(text, file);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

                Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "NamingException ex");
            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cuestionario(String pregunta1, String respuestaTexto11, String respuestaVerdad11, String respuestaTexto12, String respuestaVerdad12, String respuestaTexto13, String respuestaVerdad13) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Cuestionario", "constructor CON parametros");

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
                singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

                Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "NamingException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getPregunta1() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getPregunta1");

        try {
            String text = "Cuestionario::getPregunta1::este metodo devuelve la pregunta1: " + pregunta1 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setPregunta1");

        try {
            String text = "Cuestionario::setPregunta1::este metodo PONE la pregunta1: " + pregunta1 + "\n";
            writeLogToFile(text, file);
            this.pregunta1 = pregunta1;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaTexto11() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getRespuestaTexto11");

        try {
            String text = "Cuestionario::getRespuestaTexto11::este metodo OBTIENE la respuesta al texto 11: " + respuestaTexto11 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaTexto11;
    }

    public void setRespuestaTexto11(String respuestaTexto11) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setRespuestaTexto11");

        try {
            String text = "Cuestionario::setRespuestaTexto11::esta funcoon PONE la respuesta al texto 11: " + respuestaTexto11 + "\n";
            writeLogToFile(text, file);
            this.respuestaTexto11 = respuestaTexto11;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaVerdad11() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getRespuestaVerdad11");

        try {
            String text = "Cuestionario::getRespuestaTexto11::este metodo COGE el booleano de verdad para respuesta 11: " + respuestaVerdad11 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaVerdad11;
    }

    public void setRespuestaVerdad11(String respuestaVerdad11) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setRespuestaVerdad11");

        try {
            String text = "Cuestionario::setRespuestaVerdad11::esta FUNCION, pone la respuesta al boolean de verdad 11 " + respuestaVerdad11 + "\n";
            writeLogToFile(text, file);
            this.respuestaVerdad11 = respuestaVerdad11;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaTexto12() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getRespuestaTexto12");

        try {
            String text = "Cuestionario::getRespuestaTexto12::esta funcoon DEVUELVE la respuesta al texto 12: " + respuestaTexto12 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaTexto12;
    }

    public void setRespuestaTexto12(String respuestaTexto12) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setRespuestaTexto12");

        try {
            String text = "Cuestionario::setRespuestaTexto12::esta funcion PONE la respuesta al texto 12: " + respuestaTexto12 + "\n";
            writeLogToFile(text, file);
            this.respuestaTexto12 = respuestaTexto12;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaVerdad12() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getRespuestaVerdad12");

        try {
            String text = "Cuestionario::getRespuestaVerdad12::esta FUNCIONCITA Obtiene la respuesta al valor boolean de la respuesta 12: " + respuestaVerdad12 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaVerdad12;
    }

    public void setRespuestaVerdad12(String respuestaVerdad12) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setRespuestaVerdad12");

        try {
            String text = "Cuestionario::setRespuestaVerdad12::esta funcion, PONE la respuesta al valor boolean de la respuesta 12: " + respuestaVerdad12 + "\n";
            writeLogToFile(text, file);
            this.respuestaVerdad12 = respuestaVerdad12;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaTexto13() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getRespuestaTexto13");

        try {
            String text = "Cuestionario::getRespuestaTexto13::nuestra funcioncita, OBTIENE, la respuesta de texto 13: " + respuestaTexto13 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaTexto13;
    }

    public void setRespuestaTexto13(String respuestaTexto13) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setRespuestaTexto13");

        try {
            String text = "Cuestionario::setRespuestaTexto13::nuestra funcioncita, PONE, la respuesta de texto 13: " + respuestaTexto13 + "\n";
            writeLogToFile(text, file);
            this.respuestaTexto13 = respuestaTexto13;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getRespuestaVerdad13() {
        singletonFuncionLog5.funcionLog("Cuestionario", "getRespuestaVerdad13");

        try {
            String text = "Cuestionario::getRespuestaVerdad13::nuestro metodo, COGE, la el valor boolean de la respuesta 13: " + respuestaVerdad13 + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuestaVerdad13;

    }

    public void setRespuestaVerdad13(String respuestaVerdad13) {
        singletonFuncionLog5.funcionLog("Cuestionario", "setRespuestaVerdad13");
        try {
            String text = "Cuestionario::getRespuestaVerdad13::nuestro metodo, PONE, el valor boolean para la repuesta 13: " + respuestaVerdad13 + "\n";
            writeLogToFile(text, file);
            this.respuestaVerdad13 = respuestaVerdad13;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void postConstruct() {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Cuestionario", "postConstruct");
            try {
                String text = "Cuestionario::postConstruct::nuestro PostConstruct es void \n";
                writeLogToFile(text, file);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

                Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "NamingException ex");

            Logger.getLogger(Cuestionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PrePassivate
    public void prePassivate() {
        

    }

    @PostActivate
    public void postActivate() {
        singletonFuncionLog5.funcionLog("Cuestionario", "postActivate");

        try {
            String text = "Cuestionario::postActivate::el metodo paraa realizar el postActivate devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Remove
    public void remove() {
        singletonFuncionLog5.funcionLog("Cuestionario", "remove");

        try {
            String text = "Cuestionario::remove::el metodo donde realizamos el remove devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        singletonFuncionLog5.funcionLog("Cuestionario", "preDestroy");

        try {
            String text = "Cuestionario::preDestroy::donde realizamos el PreDestroy es VOID \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Cuestionario", "IOException ex");

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
