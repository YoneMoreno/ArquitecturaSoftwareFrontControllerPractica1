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
class Curso {
    String titulo,autor,asignatura,duracion,video;

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
