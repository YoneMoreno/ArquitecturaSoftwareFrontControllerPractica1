/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author YonePC
 */
public class Evaluacion {

    SingletonFuncionLog singletonFuncionLog5;

    Estadisticas estadisticas;

    String evaluacionAlumno, evaluacionCurso, evaluacion, evaluacionComentario;

    public Evaluacion(String evaluacionAlumno, String evaluacionCurso, String evaluacion, String evaluacionComentario) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");
        
        estadisticas.nuevoAccesoEvaluacion();

        singletonFuncionLog5.funcionLog("Evaluacion", "constructor");
        this.evaluacionAlumno = evaluacionAlumno;
        this.evaluacionCurso = evaluacionCurso;
        this.evaluacion = evaluacion;
        this.evaluacionComentario = evaluacionComentario;
    }

    public String getEvaluacionAlumno() {
        singletonFuncionLog5.funcionLog("Evaluacion", "getEvaluacionAlumno");
        return evaluacionAlumno;
    }

    public void setEvaluacionAlumno(String evaluacionAlumno) {
        singletonFuncionLog5.funcionLog("Evaluacion", "setEvaluacionAlumno");
        this.evaluacionAlumno = evaluacionAlumno;
    }

    public String getEvaluacionCurso() {
        singletonFuncionLog5.funcionLog("Evaluacion", "getEvaluacionCurso");
        return evaluacionCurso;
    }

    public void setEvaluacionCurso(String evaluacionCurso) {
        singletonFuncionLog5.funcionLog("Evaluacion", "setEvaluacionCurso");
        this.evaluacionCurso = evaluacionCurso;
    }

    public String getEvaluacion() {
        singletonFuncionLog5.funcionLog("Evaluacion", "getEvaluacion");
        if(evaluacion == null) return "0";
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        singletonFuncionLog5.funcionLog("Evaluacion", "setEvaluacion");
        this.evaluacion = evaluacion;
    }

    public String getEvaluacionComentario() {
        singletonFuncionLog5.funcionLog("Evaluacion", "getEvaluacionComentario");
        return evaluacionComentario;
    }

    public void setEvaluacionComentario(String evaluacionComentario) {
        singletonFuncionLog5.funcionLog("Evaluacion", "setEvaluacionComentario");
        this.evaluacionComentario = evaluacionComentario;
    }

}
