package beans;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import java.io.File;
import java.io.FileWriter;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Startup;

@Startup
@Stateless
public class ConviertePuntosNota {

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    public String convertidor(int evaluacion) {

        String text = "ConviertePuntosNota::convertidor::el usuario introdujo: " + evaluacion + "\n";

        try {
            writeLogToFile(text, file);

            return evaluacion >= 5 ? "Apto" : "No apto";
        } catch (IOException ex) {
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "ERROR";
    }

    @PostConstruct
    public void postConstruct() {

        try {
            String text = "ConviertePuntosNota::postConstruct::el metodo es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        try {
            String text = "ConviertePuntosNota::preDestroy::el metodo preDestroy es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }

}
