/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

/**
 *
 * @author YonePC
 */
public class Curso {

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    String titulo, autor, asignatura, duracion, video, imagen;

    public Curso(String titulo, String autor, String asignatura, String duracion, String video, String imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.asignatura = asignatura;
        this.duracion = duracion;
        this.video = video;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
