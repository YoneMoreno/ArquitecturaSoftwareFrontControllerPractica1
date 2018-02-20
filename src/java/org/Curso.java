/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YonePC
 */
@XmlRootElement
public class Curso {

    @XmlElement
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @XmlElement
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @XmlElement
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @XmlElement
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @XmlElement
    public void setVideo(String video) {
        this.video = video;
    }
    String titulo, autor, asignatura, duracion, video;

    public Curso(String titulo, String autor, String asignatura, String duracion, String video) {
        this.titulo = titulo;
        this.autor = autor;
        this.asignatura = asignatura;
        this.duracion = duracion;
        this.video = video;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getVideo() {
        return video;
    }

}
