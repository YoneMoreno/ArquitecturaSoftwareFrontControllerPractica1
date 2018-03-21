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

/**
 *
 * @author YonePC
 */
@Stateless
public class ComentarioNota {

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    public String convierteComentarioNota(String evaluacion, String comentario) {

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
            Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR";
    }

    @PostConstruct
    public void postConstruct() {
        try {
            String text = "ConvierteComentarioNota::postConstruct::el metodo postConstruct es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PreDestroy
    public void preDestroy() {
        try {
            String text = "ConvierteComentarioNota::preDestroy::el metodo preDestroy es void!!! \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(ComentarioNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }
}
