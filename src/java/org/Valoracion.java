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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author YonePC
 */
@Entity
@Table(name = "valoracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valoracion.findAll", query = "SELECT v FROM Valoracion v")
    , @NamedQuery(name = "Valoracion.findById", query = "SELECT v FROM Valoracion v WHERE v.id = :id")
    , @NamedQuery(name = "Valoracion.findByValoracionNumerica", query = "SELECT v FROM Valoracion v WHERE v.valoracionNumerica = :valoracionNumerica")})
public class Valoracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "valoracionNumerica")
    private int valoracionNumerica;
    @JoinColumn(name = "idAsignatura", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Asignatura idAsignatura;
    @JoinColumn(name = "idProfesor", referencedColumnName = "idProfesor")
    @ManyToOne(optional = false)
    private Profesor_1 idProfesor;
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @ManyToOne(optional = false)
    private Curso_1 idCurso;

    public Valoracion() {
    }

    public Valoracion(Integer id) {
        this.id = id;
    }

    public Valoracion(Integer id, int valoracionNumerica) {
        this.id = id;
        this.valoracionNumerica = valoracionNumerica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getValoracionNumerica() {
        return valoracionNumerica;
    }

    public void setValoracionNumerica(int valoracionNumerica) {
        this.valoracionNumerica = valoracionNumerica;
    }

    public Asignatura getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Asignatura idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Profesor_1 getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Profesor_1 idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Curso_1 getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso_1 idCurso) {
        this.idCurso = idCurso;
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
        if (!(object instanceof Valoracion)) {
            return false;
        }
        Valoracion other = (Valoracion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Valoracion[ id=" + id + " ]";
    }
    
}
