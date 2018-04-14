/*


This class converts a commentary and a Pass/Not Pass mark into -> Pass / Not Pass in the 
school's assessment's document

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
public class ComentarioNota {

    SingletonFuncionLog singletonFuncionLog5;

    File file = new File("C:\\Users\\YonePC\\Desktop\\LogDelSistemaSingleton.txt");

    public String convierteComentarioNota(String evaluacion, String comentario) {

        singletonFuncionLog5.funcionLog("ComentarioNota", "convierteComentarioNota");

        try {
            String text = "ConvierteComentarioNota::convierteComentarioNota::el usuario introdujo la evaluacion: " + evaluacion
                    + " y el comentario: " + comentario + "\n";
            writeLogToFile(text, file);

            if (evaluacion.equals("Apto") && comentario != null && comentario.trim().length() > 5) {
                return "Apto";
            } else {
                return "No Apto";
            }
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("ComentarioNota", "IOException ex");

            Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR";
    }

    @PostConstruct
    public void postConstruct() {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("ComentarioNota", "postConstruct");
            try {
                String text = "ConvierteComentarioNota::postConstruct::el metodo postConstruct es void \n";
                writeLogToFile(text, file);
            } catch (IOException ex) {
                singletonFuncionLog5.funcionLog("ComentarioNota", "IOException ex");

                Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("ComentarioNota", "NamingException ex");

            Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PreDestroy
    public void preDestroy() {
        singletonFuncionLog5.funcionLog("ComentarioNota", "preDestroy");

        try {
            String text = "ConvierteComentarioNota::preDestroy::el metodo preDestroy es void!!! \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("ComentarioNota", "IOException ex");


            Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {
        singletonFuncionLog5.funcionLog("ComentarioNota", "writeLogToFile");

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }
}
