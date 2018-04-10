/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YonePC
 */
@Entity
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso_1.findAll", query = "SELECT c FROM Curso_1 c")
    , @NamedQuery(name = "Curso_1.findByIdCurso", query = "SELECT c FROM Curso_1 c WHERE c.idCurso = :idCurso")
    , @NamedQuery(name = "Curso_1.findByTitulo", query = "SELECT c FROM Curso_1 c WHERE c.titulo = :titulo")
    , @NamedQuery(name = "Curso_1.findByAutor", query = "SELECT c FROM Curso_1 c WHERE c.autor = :autor")
    , @NamedQuery(name = "Curso_1.findByDuracion", query = "SELECT c FROM Curso_1 c WHERE c.duracion = :duracion")
    , @NamedQuery(name = "Curso_1.findByVideo", query = "SELECT c FROM Curso_1 c WHERE c.video = :video")
    , @NamedQuery(name = "Curso_1.findByImagen", query = "SELECT c FROM Curso_1 c WHERE c.imagen = :imagen")})
public class Curso_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCurso")
    private Integer idCurso;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "autor")
    private String autor;
    @Basic(optional = false)
    @Column(name = "duracion")
    private int duracion;
    @Basic(optional = false)
    @Column(name = "video")
    private String video;
    @Basic(optional = false)
    @Column(name = "imagen")
    private String imagen;

    public Curso_1() {
    }

    public Curso_1(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Curso_1(Integer idCurso, String titulo, String autor, int duracion, String video, String imagen) {
        this.idCurso = idCurso;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.video = video;
        this.imagen = imagen;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso_1)) {
            return false;
        }
        Curso_1 other = (Curso_1) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Curso_1[ idCurso=" + idCurso + " ]";
    }
    
}
