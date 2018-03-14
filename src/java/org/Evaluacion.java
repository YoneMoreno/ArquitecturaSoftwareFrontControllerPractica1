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
public class Evaluacion {

 String evaluacionAlumno, evaluacionCurso, evaluacion;

    public String getEvaluacionAlumno() {
        return evaluacionAlumno;
    }

    public void setEvaluacionAlumno(String evaluacionAlumno) {
        this.evaluacionAlumno = evaluacionAlumno;
    }

    public String getEvaluacionCurso() {
        return evaluacionCurso;
    }

    public void setEvaluacionCurso(String evaluacionCurso) {
        this.evaluacionCurso = evaluacionCurso;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Evaluacion(String evaluacionAlumno, String evaluacionCurso, String evaluacion) {
        this.evaluacionAlumno = evaluacionAlumno;
        this.evaluacionCurso = evaluacionCurso;
        this.evaluacion = evaluacion;
    }
    
}
