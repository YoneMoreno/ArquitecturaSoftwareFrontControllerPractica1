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
@Table(name = "cuestionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuestionario.findAll", query = "SELECT c FROM Cuestionario c")
    , @NamedQuery(name = "Cuestionario.findById", query = "SELECT c FROM Cuestionario c WHERE c.id = :id")
    , @NamedQuery(name = "Cuestionario.findByPregunta", query = "SELECT c FROM Cuestionario c WHERE c.pregunta = :pregunta")
    , @NamedQuery(name = "Cuestionario.findByRespuesta1", query = "SELECT c FROM Cuestionario c WHERE c.respuesta1 = :respuesta1")
    , @NamedQuery(name = "Cuestionario.findByRespuestaVerdad1", query = "SELECT c FROM Cuestionario c WHERE c.respuestaVerdad1 = :respuestaVerdad1")
    , @NamedQuery(name = "Cuestionario.findByRespuesta2", query = "SELECT c FROM Cuestionario c WHERE c.respuesta2 = :respuesta2")
    , @NamedQuery(name = "Cuestionario.findByRespuestaVerdad2", query = "SELECT c FROM Cuestionario c WHERE c.respuestaVerdad2 = :respuestaVerdad2")
    , @NamedQuery(name = "Cuestionario.findByRespuesta3", query = "SELECT c FROM Cuestionario c WHERE c.respuesta3 = :respuesta3")
    , @NamedQuery(name = "Cuestionario.findByRespuestaVerdad3", query = "SELECT c FROM Cuestionario c WHERE c.respuestaVerdad3 = :respuestaVerdad3")})
public class Cuestionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "pregunta")
    private String pregunta;
    @Basic(optional = false)
    @Column(name = "respuesta1")
    private String respuesta1;
    @Basic(optional = false)
    @Column(name = "respuestaVerdad1")
    private boolean respuestaVerdad1;
    @Basic(optional = false)
    @Column(name = "respuesta2")
    private String respuesta2;
    @Basic(optional = false)
    @Column(name = "respuestaVerdad2")
    private boolean respuestaVerdad2;
    @Basic(optional = false)
    @Column(name = "respuesta3")
    private String respuesta3;
    @Basic(optional = false)
    @Column(name = "respuestaVerdad3")
    private boolean respuestaVerdad3;

    public Cuestionario() {
    }

    public Cuestionario(Integer id) {
        this.id = id;
    }

    public Cuestionario(Integer id, String pregunta, String respuesta1, boolean respuestaVerdad1, String respuesta2, boolean respuestaVerdad2, String respuesta3, boolean respuestaVerdad3) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuestaVerdad1 = respuestaVerdad1;
        this.respuesta2 = respuesta2;
        this.respuestaVerdad2 = respuestaVerdad2;
        this.respuesta3 = respuesta3;
        this.respuestaVerdad3 = respuestaVerdad3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public boolean getRespuestaVerdad1() {
        return respuestaVerdad1;
    }

    public void setRespuestaVerdad1(boolean respuestaVerdad1) {
        this.respuestaVerdad1 = respuestaVerdad1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public boolean getRespuestaVerdad2() {
        return respuestaVerdad2;
    }

    public void setRespuestaVerdad2(boolean respuestaVerdad2) {
        this.respuestaVerdad2 = respuestaVerdad2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public boolean getRespuestaVerdad3() {
        return respuestaVerdad3;
    }

    public void setRespuestaVerdad3(boolean respuestaVerdad3) {
        this.respuestaVerdad3 = respuestaVerdad3;
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
        if (!(object instanceof Cuestionario)) {
            return false;
        }
        Cuestionario other = (Cuestionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Cuestionario[ id=" + id + " ]";
    }
    
}
