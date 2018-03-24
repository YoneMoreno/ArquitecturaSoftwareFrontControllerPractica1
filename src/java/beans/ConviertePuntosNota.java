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
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Stateless
public class ConviertePuntosNota {

    SingletonFuncionLog singletonFuncionLog5;

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    public String convertidor(int evaluacion) {

        singletonFuncionLog5.funcionLog("ConviertePuntosNota", "convertidor");

        String text = "ConviertePuntosNota::convertidor::el usuario introdujo: " + evaluacion + "\n";

        writeLogToFile(text, file);
        return evaluacion >= 5 ? "Apto" : "No apto";

    }

    @PostConstruct
    public void postConstruct() {

        try {

            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("ConviertePuntosNota", "postConstruct");

            String text = "ConviertePuntosNota::postConstruct::el metodo es void \n";
            writeLogToFile(text, file);

        } catch (NamingException ex) {
            singletonFuncionLog5.funcionLog("ConviertePuntosNota", "NamingException ex");

            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        singletonFuncionLog5.funcionLog("ConviertePuntosNota", "preDestroy");
        String text = "ConviertePuntosNota::preDestroy::el metodo preDestroy es void \n";
        writeLogToFile(text, file);

    }

    private void writeLogToFile(String text, File file) {
        try {
            if (file == null) {
                file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");
            }
            singletonFuncionLog5.funcionLog("ConviertePuntosNota", "writeLogToFile");

            BufferedWriter output = null;
            output = new BufferedWriter(new FileWriter(file, true));
            output.write(text);
            output.close();
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("ConviertePuntosNota", "writeLogToFile: IOException ex");
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
