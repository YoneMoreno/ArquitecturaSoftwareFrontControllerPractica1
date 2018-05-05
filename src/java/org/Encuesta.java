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
@Table(name = "encuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encuesta.findAll", query = "SELECT e FROM Encuesta e")
    , @NamedQuery(name = "Encuesta.findById", query = "SELECT e FROM Encuesta e WHERE e.id = :id")
    , @NamedQuery(name = "Encuesta.findByCuestion", query = "SELECT e FROM Encuesta e WHERE e.cuestion = :cuestion")
    , @NamedQuery(name = "Encuesta.findByPuntuacion", query = "SELECT e FROM Encuesta e WHERE e.puntuacion = :puntuacion")})
public class Encuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cuestion")
    private String cuestion;
    @Basic(optional = false)
    @Column(name = "puntuacion")
    private int puntuacion;

    public Encuesta() {
    }

    public Encuesta(Integer id) {
        this.id = id;
    }

    public Encuesta(Integer id, String cuestion, int puntuacion) {
        this.id = id;
        this.cuestion = cuestion;
        this.puntuacion = puntuacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuestion() {
        return cuestion;
    }

    public void setCuestion(String cuestion) {
        this.cuestion = cuestion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
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
        if (!(object instanceof Encuesta)) {
            return false;
        }
        Encuesta other = (Encuesta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Encuesta[ id=" + id + " ]";
    }
    
}
