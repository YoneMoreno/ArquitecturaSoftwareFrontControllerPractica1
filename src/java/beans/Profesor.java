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

@Stateful
public class Profesor {

    File file = new File("C:\\Users\\YonePC\\Videos\\ASAPLICACIONCURSOSPRACTICA1\\src\\java\\beans\\log.txt");

    String nombre = "Cory", asignatura = "Javascript", valoracion = "4.7", correo = "coryHouse@gmail.com", telefono = "636404142", despacho = "S6";

    public Profesor() {
        try {
            String text = "\n Profesor::constructor por defecto::este metodo es VOID!!!!!!!!!!! + \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Profesor(String nombre, String asignatura, String valorcion, String correo, String telefono, String despacho) {
        try {
            String text = "\n Profesor::constructor::este metodo es emplea los siguientes parametros:"
                    + nombre + asignatura + valorcion + correo + telefono + despacho + "\n";
            writeLogToFile(text, file);
            this.nombre = nombre;
            this.asignatura = asignatura;
            this.valoracion = valorcion;
            this.correo = correo;
            this.telefono = telefono;
            this.despacho = despacho;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombre() {
        try {
            String text = "\n Profesor::getNombre::este metodo devuelve el nombre: " + nombre + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            String text = "\n Profesor::setNombre::este metodo PONE el nombre: " + nombre + "\n";
            writeLogToFile(text, file);
            this.nombre = nombre;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getAsignatura() {
        try {
            String text = "\n Profesor::getAsignatura::este metodo OBTIENE la ASIGNATURA: " + asignatura + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        try {
            String text = "\n Profesor::setAsignatura::este metodo PONE la ASIGNATURA: " + asignatura + " !!!\n";
            writeLogToFile(text, file);
            this.asignatura = asignatura;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getValoracion() {
        try {
            String text = "\n Profesor::getValoracion::este metodo Devuelve la valoracion: " + valoracion + " !!!\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valoracion;
    }

    public void setValorcion(String valorcion) {
        try {
            String text = "\n Profesor::setValoracion::este metodo PONE la valoracion: " + valorcion + " !!!\n";
            writeLogToFile(text, file);
            this.valoracion = valorcion;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCorreo() {
        try {
            String text = "\n Profesor::getCorreo::este metodo COGE el correo: " + correo + " \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return correo;
    }

    public void setCorreo(String correo) {
        try {
            String text = "\n Profesor::setCorreo::este metodo PONE el correo: " + correo + " \n";
            writeLogToFile(text, file);
            this.correo = correo;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTelefono() {
        try {
            String text = "\n Profesor::getTelefono::este metodo DEVUELVE el telefono: " + telefono + " \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telefono;
    }

    public void setTelefono(String telefono) {
        try {
            String text = "\n Profesor::getTelefono::este metodo INTRODUCE el telefono: " + telefono + " \n";
            writeLogToFile(text, file);
            this.telefono = telefono;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDespacho() {
        try {
            String text = "\n Profesor::getTelefono::este metodo DEVUELVE el despacho: " + despacho + " \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return despacho;
    }

    public void setDespacho(String despacho) {
        try {
            String text = "\n Profesor::getTelefono::este metodo PONE, introduce, el despacho: " + despacho + " \n";
            writeLogToFile(text, file);
            this.despacho = despacho;
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void postConstruct() {
        try {
            String text = "Profesor::postConstruct::nuestro PostConstruct es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PrePassivate
    public void prePassivate() {
        try {
            String text = "Profesor::prePassivate::la funcion que realiza el prePassivate es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PostActivate
    public void postActivate() {
        try {
            String text = "Profesor::postActivate::el metodo paraa realizar el postActivate devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Remove
    public void remove() {
        try {
            String text = "Profesor::remove::el metodo donde realizamos el remove devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        try {
            String text = "Profesor::preDestroy::donde realizamos el PreDestroy es VOID \n";
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
