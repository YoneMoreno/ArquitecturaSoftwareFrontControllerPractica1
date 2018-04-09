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

@Stateful
public class Profesor {

    SingletonFuncionLog singletonFuncionLog5;

    Estadisticas estadisticas;

    File file = new File("C:\\Users\\YonePC\\Desktop\\LogDelSistemaSingleton.txt");

    String nombre = "Cory", asignatura = "Javascript", valoracion = "4.7", correo = "coryHouse@gmail.com", telefono = "636404142", despacho = "S6";

    public Profesor() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

        singletonFuncionLog5.funcionLog("Profesor", "constructor");

        try {
            String text = "\n Profesor::constructor por defecto::este metodo es VOID!!!!!!!!!!! + \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Profesor(String nombre, String asignatura, String valorcion, String correo, String telefono, String despacho) {
        try {
            singletonFuncionLog5.funcionLog("Profesor", "constructor con parámetros");
            this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

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
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNombre() {
        try {
            singletonFuncionLog5.funcionLog("Profesor", "getNombre");
            estadisticas.nuevoAccesoProfesorClase();

            String text = "\n Profesor::getNombre::este metodo devuelve el nombre: " + nombre + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        singletonFuncionLog5.funcionLog("Profesor", "setNombre");

        try {
            String text = "\n Profesor::setNombre::este metodo PONE el nombre: " + nombre + "\n";
            writeLogToFile(text, file);
            this.nombre = nombre;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getAsignatura() {
        singletonFuncionLog5.funcionLog("Profesor", "getAsignatura");

        try {
            String text = "\n Profesor::getAsignatura::este metodo OBTIENE la ASIGNATURA: " + asignatura + "\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        singletonFuncionLog5.funcionLog("Profesor", "setAsignatura");

        try {
            String text = "\n Profesor::setAsignatura::este metodo PONE la ASIGNATURA: " + asignatura + " !!!\n";
            writeLogToFile(text, file);
            this.asignatura = asignatura;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getValoracion() {
        singletonFuncionLog5.funcionLog("Profesor", "getValoracion");

        try {
            String text = "\n Profesor::getValoracion::este metodo Devuelve la valoracion: " + valoracion + " !!!\n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valoracion;
    }

    public void setValorcion(String valorcion) {
        singletonFuncionLog5.funcionLog("Profesor", "setValorcion");

        try {
            String text = "\n Profesor::setValoracion::este metodo PONE la valoracion: " + valorcion + " !!!\n";
            writeLogToFile(text, file);
            this.valoracion = valorcion;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCorreo() {

        singletonFuncionLog5.funcionLog("Profesor", "getCorreo");

        try {
            String text = "\n Profesor::getCorreo::este metodo COGE el correo: " + correo + " \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return correo;
    }

    public void setCorreo(String correo) {
        singletonFuncionLog5.funcionLog("Profesor", "setCorreo");

        try {
            String text = "\n Profesor::setCorreo::este metodo PONE el correo: " + correo + " \n";
            writeLogToFile(text, file);
            this.correo = correo;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTelefono() {
        singletonFuncionLog5.funcionLog("Profesor", "getTelefono");

        try {
            String text = "\n Profesor::getTelefono::este metodo DEVUELVE el telefono: " + telefono + " \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telefono;
    }

    public void setTelefono(String telefono) {
        singletonFuncionLog5.funcionLog("Profesor", "setTelefono");

        try {
            String text = "\n Profesor::getTelefono::este metodo INTRODUCE el telefono: " + telefono + " \n";
            writeLogToFile(text, file);
            this.telefono = telefono;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDespacho() {

        try {
            String text = "\n Profesor::getTelefono::este metodo DEVUELVE el despacho: " + despacho + " \n";
            writeLogToFile(text, file);
            singletonFuncionLog5.funcionLog("Profesor", "getDespacho");

        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return despacho;
    }

    public void setDespacho(String despacho) {
        singletonFuncionLog5.funcionLog("Profesor", "setDespacho");

        try {
            String text = "\n Profesor::getTelefono::este metodo PONE, introduce, el despacho: " + despacho + " \n";
            writeLogToFile(text, file);
            this.despacho = despacho;
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PostConstruct
    public void postConstruct() {
        singletonFuncionLog5.funcionLog("Profesor", "postConstruct");

        try {
            String text = "Profesor::postConstruct::nuestro PostConstruct es void \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PrePassivate
    public void prePassivate() {

    }

    @PostActivate
    public void postActivate() {
        singletonFuncionLog5.funcionLog("Profesor", "postActivate");

        try {
            String text = "Profesor::postActivate::el metodo paraa realizar el postActivate devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Remove
    public void remove() {
        singletonFuncionLog5.funcionLog("Profesor", "remove");

        try {
            String text = "Profesor::remove::el metodo donde realizamos el remove devuelve NADA \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @PreDestroy
    public void preDestroy() {
        singletonFuncionLog5.funcionLog("Profesor", "preDestroy");

        try {
            String text = "Profesor::preDestroy::donde realizamos el PreDestroy es VOID \n";
            writeLogToFile(text, file);
        } catch (IOException ex) {
            singletonFuncionLog5.funcionLog("Profesor", "IOException ex");

            Logger.getLogger(Encuesta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void writeLogToFile(String text, File file) throws IOException {
        singletonFuncionLog5.funcionLog("Profesor", "writeLogToFile");

        BufferedWriter output = null;
        output = new BufferedWriter(new FileWriter(file, true));
        output.write(text);
        output.close();
    }

}
