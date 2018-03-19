/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateful;


@Stateful
public class Profesor {

    String nombre = "Cory", asignatura = "Javascript", valoracion = "4.7", correo = "coryHouse@gmail.com", telefono = "636404142", despacho = "S6";

    public Profesor() {
    }

    public Profesor(String nombre, String asignatura, String valorcion, String correo, String telefono, String despacho) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.valoracion = valorcion;
        this.correo = correo;
        this.telefono = telefono;
        this.despacho = despacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValorcion(String valorcion) {
        this.valoracion = valorcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

}
