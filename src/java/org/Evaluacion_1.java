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
@Table(name = "evaluacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluacion_1.findAll", query = "SELECT e FROM Evaluacion_1 e")
    , @NamedQuery(name = "Evaluacion_1.findById", query = "SELECT e FROM Evaluacion_1 e WHERE e.id = :id")
    , @NamedQuery(name = "Evaluacion_1.findByAlumno", query = "SELECT e FROM Evaluacion_1 e WHERE e.alumno = :alumno")
    , @NamedQuery(name = "Evaluacion_1.findByCurso", query = "SELECT e FROM Evaluacion_1 e WHERE e.curso = :curso")
    , @NamedQuery(name = "Evaluacion_1.findByNota", query = "SELECT e FROM Evaluacion_1 e WHERE e.nota = :nota")
    , @NamedQuery(name = "Evaluacion_1.findByComentario", query = "SELECT e FROM Evaluacion_1 e WHERE e.comentario = :comentario")})
public class Evaluacion_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "alumno")
    private String alumno;
    @Basic(optional = false)
    @Column(name = "curso")
    private String curso;
    @Basic(optional = false)
    @Column(name = "nota")
    private String nota;
    @Basic(optional = false)
    @Column(name = "comentario")
    private String comentario;

    public Evaluacion_1() {
    }

    public Evaluacion_1(Integer id) {
        this.id = id;
    }

    public Evaluacion_1(Integer id, String alumno, String curso, String nota, String comentario) {
        this.id = id;
        this.alumno = alumno;
        this.curso = curso;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        if (!(object instanceof Evaluacion_1)) {
            return false;
        }
        Evaluacion_1 other = (Evaluacion_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Evaluacion_1[ id=" + id + " ]";
    }
    
}
