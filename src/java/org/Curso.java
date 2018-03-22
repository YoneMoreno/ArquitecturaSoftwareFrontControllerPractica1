/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import beans.SingletonFuncionLog;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
public class Curso {

    SingletonFuncionLog singletonFuncionLog5;

    public void setTitulo(String titulo) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Curso", "setTitulo");
            this.titulo = titulo;
        } catch (NamingException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setAutor(String autor) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Curso", "setAutor");

            this.autor = autor;
        } catch (NamingException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setAsignatura(String asignatura) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Curso", "setAsignatura");
            this.asignatura = asignatura;
        } catch (NamingException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setDuracion(String duracion) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Curso", "setDuracion");
            this.duracion = duracion;
        } catch (NamingException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setVideo(String video) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Curso", "setVideo");
            this.video = video;
        } catch (NamingException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    String titulo, autor, asignatura, duracion, video, imagen;

    public Curso(String titulo, String autor, String asignatura, String duracion, String video, String imagen) {
        try {
            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            singletonFuncionLog5.funcionLog("Curso", "constructor");
            this.titulo = titulo;
            this.autor = autor;
            this.asignatura = asignatura;
            this.duracion = duracion;
            this.video = video;
            this.imagen = imagen;
        } catch (NamingException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getImagen() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "getImagen");
        return imagen;
    }

    public void setImagen(String imagen) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "setImagen");
        this.imagen = imagen;
    }

    public String getTitulo() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "getTitulo");
        return titulo;
    }

    public String getAutor() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "getAutor");
        return autor;
    }

    public String getAsignatura() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "getAsignatura");
        return asignatura;
    }

    public String getDuracion() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "getDuracion");
        return duracion;
    }

    public String getVideo() throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("Curso", "getVideo");
        return video;
    }

}
