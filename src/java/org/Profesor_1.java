/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author YonePC
 */
@Entity
@Table(name = "profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor_1.findAll", query = "SELECT p FROM Profesor_1 p")
    , @NamedQuery(name = "Profesor_1.findByIdProfesor", query = "SELECT p FROM Profesor_1 p WHERE p.idProfesor = :idProfesor")
    , @NamedQuery(name = "Profesor_1.findByNombre", query = "SELECT p FROM Profesor_1 p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Profesor_1.findByContrasena", query = "SELECT p FROM Profesor_1 p WHERE p.contrasena = :contrasena")
    , @NamedQuery(name = "Profesor_1.findByAsignatura", query = "SELECT p FROM Profesor_1 p WHERE p.asignatura = :asignatura")
    , @NamedQuery(name = "Profesor_1.findByValoracion", query = "SELECT p FROM Profesor_1 p WHERE p.valoracion = :valoracion")
    , @NamedQuery(name = "Profesor_1.findByCorreo", query = "SELECT p FROM Profesor_1 p WHERE p.correo = :correo")
    , @NamedQuery(name = "Profesor_1.findByTelefono", query = "SELECT p FROM Profesor_1 p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Profesor_1.findByDespacho", query = "SELECT p FROM Profesor_1 p WHERE p.despacho = :despacho")})
public class Profesor_1 implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReceiver")
    private Collection<Messages> messagesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSender")
    private Collection<Messages> messagesCollection1;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProfesor")
    private Integer idProfesor;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "contrasena")
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "asignatura")
    private String asignatura;
    @Basic(optional = false)
    @Column(name = "valoracion")
    private int valoracion;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "telefono")
    private int telefono;
    @Basic(optional = false)
    @Column(name = "despacho")
    private String despacho;

    public Profesor_1() {
    }

    public Profesor_1(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Profesor_1(Integer idProfesor, String nombre, String contrasena, String asignatura, int valoracion, String correo, int telefono, String despacho) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.asignatura = asignatura;
        this.valoracion = valoracion;
        this.correo = correo;
        this.telefono = telefono;
        this.despacho = despacho;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesor != null ? idProfesor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor_1)) {
            return false;
        }
        Profesor_1 other = (Profesor_1) object;
        if ((this.idProfesor == null && other.idProfesor != null) || (this.idProfesor != null && !this.idProfesor.equals(other.idProfesor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.Profesor_1[ idProfesor=" + idProfesor + " ]";
    }

    @XmlTransient
    public Collection<Messages> getMessagesCollection() {
        return messagesCollection;
    }

    public void setMessagesCollection(Collection<Messages> messagesCollection) {
        this.messagesCollection = messagesCollection;
    }

    @XmlTransient
    public Collection<Messages> getMessagesCollection1() {
        return messagesCollection1;
    }

    public void setMessagesCollection1(Collection<Messages> messagesCollection1) {
        this.messagesCollection1 = messagesCollection1;
    }
    
}
