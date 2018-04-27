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
@Table(name = "asignatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignatura.findAll", query = "SELECT a FROM Asignatura a")
    , @NamedQuery(name = "Asignatura.findById", query = "SELECT a FROM Asignatura a WHERE a.id = :id")
    , @NamedQuery(name = "Asignatura.findByCurso", query = "SELECT a FROM Asignatura a WHERE a.curso = :curso")
    , @NamedQuery(name = "Asignatura.findByProfesor", query = "SELECT a FROM Asignatura a WHERE a.profesor = :profesor")
    , @NamedQuery(name = "Asignatura.findByNombre", query = "SELECT a FROM Asignatura a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Asignatura.findByUrlImagen", query = "SELECT a FROM Asignatura a WHERE a.urlImagen = :urlImagen")})
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "curso")
    private String curso;
    @Basic(optional = false)
    @Column(name = "profesor")
    private String profesor;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "urlImagen")
    private String urlImagen;

    public Asignatura() {
    }

    public Asignatura(Integer id) {
        this.id = id;
    }

    public Asignatura(Integer id, String curso, String profesor, String nombre, String urlImagen) {
        this.id = id;
        this.curso = curso;
        this.profesor = profesor;
        this.nombre = nombre;
        this.urlImagen = urlImagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignatura)) {
            return false;
        }
        Asignatura other = (Asignatura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Asignatura[ id=" + id + " ]";
    }
    
}
