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
@Table(name = "biblioteca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Biblioteca.findAll", query = "SELECT b FROM Biblioteca b")
    , @NamedQuery(name = "Biblioteca.findById", query = "SELECT b FROM Biblioteca b WHERE b.id = :id")
    , @NamedQuery(name = "Biblioteca.findByNombre", query = "SELECT b FROM Biblioteca b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Biblioteca.findByUrlImagen", query = "SELECT b FROM Biblioteca b WHERE b.urlImagen = :urlImagen")})
public class Biblioteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "urlImagen")
    private String urlImagen;

    public Biblioteca() {
    }

    public Biblioteca(Integer id) {
        this.id = id;
    }

    public Biblioteca(Integer id, String nombre, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.urlImagen = urlImagen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Biblioteca)) {
            return false;
        }
        Biblioteca other = (Biblioteca) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Biblioteca[ id=" + id + " ]";
    }
    
}
