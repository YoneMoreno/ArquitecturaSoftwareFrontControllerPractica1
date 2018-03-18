/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import java.io.File;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author YonePC
 */
@Stateless
public class ConviertePuntosNota {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public String convertidor(int evaluacion) {

        try {

            List<String> lines = Arrays.asList("ConviertePuntosNota::convertidor::el usuario introdujo: " + evaluacion);
            Path file = Paths.get("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\ConviertePuntosNota.log.txt");
            Files.write(file, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

            return evaluacion >= 5 ? "Apto" : "No apto";

        } catch (IOException ex) {
            Logger.getLogger(ConviertePuntosNota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ERROR";
    }
}
