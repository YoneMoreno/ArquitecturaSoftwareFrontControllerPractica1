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
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
public class ConviertePuntosNota {

    SingletonFuncionLog singletonFuncionLog5;

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    public String convertidor(int evaluacion) {

        singletonFuncionLog5.funcionLog("ConviertePuntosNota", "convertidor");

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

            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("ConviertePuntosNota", "postConstruct");

            try {
                String text = "ConviertePuntosNota::postConstruct::el metodo es void \n";
                writeLogToFile(text, file);
            } catch (IOException ex) {
                Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (NamingException ex) {
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        singletonFuncionLog5.funcionLog("ConviertePuntosNota", "preDestroy");
        try {
            String text = "ConviertePuntosNota::preDestroy::el metodo preDestroy es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {
        singletonFuncionLog5.funcionLog("ConviertePuntosNota", "writeLogToFile");

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }

}
