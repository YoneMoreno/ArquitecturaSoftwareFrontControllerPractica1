/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Singleton;
import javax.servlet.http.HttpSession;

/**
 *
 * @author YonePC
 */
@Singleton
public class Estadisticas {

    int cuenta = 0;
    int index = 0;
    int unknown = 0;
    int evaluacion = 0;
    int encuesta = 0;
    int cuestionario = 0;
    int verSingletonLog = 0;
    int realizarEvaluacion = 0;
    int profesor = 0;
    int courseInfo = 0;
    int frontServlet = 0;
    int evaluacionClase = 0;
    int cursoClase = 0;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void cuentaNuevaSesion() {
        System.out.println("El numero de sesiones nuevas es: " + ++cuenta);
    }

    public int getCuentaNuevaSesion() {
        return cuenta;
    }

    public void nuevaVisitaIndex() {
        ++index;
    }

    public int getNuevaVisitaIndex() {
        return index;
    }

    public void nuevaVisitaUnknown() {
        ++unknown;
    }

    public int getNuevaVisitaUnknown() {
        return unknown;
    }

    public void nuevaVisitaEvaluacion() {
        ++evaluacion;
    }

    public int getNuevaVisitaEvaluacion() {
        return evaluacion;
    }

    public void nuevaVisitaEncuesta() {
        ++encuesta;
    }

    public int getNuevaVisitaEncuesta() {
        return encuesta;
    }

    public void nuevaVisitaCuestionario() {
        ++cuestionario;
    }

    public int getNuevaVisitaCuestionario() {
        return cuestionario;
    }

    public void nuevaVisitaVerSingletonLog() {
        ++verSingletonLog;
    }

    public int getNuevaVisitaVerSingletonLog() {
        return verSingletonLog;
    }

    public void nuevaVisitaRealizarEvaluacion() {
        ++realizarEvaluacion;
    }

    public int getNuevaVisitaRealizarEvaluacion() {
        return realizarEvaluacion;
    }

    public void nuevaVisitaProfesor() {
        ++profesor;
    }

    public int getNuevaVisitaProfesor() {
        return profesor;
    }

    public void nuevaVisitaCourseInfo() {
        ++courseInfo;
    }

    public int getNuevaVisitaCourseInfo() {
        return courseInfo;
    }
    
    public void nuevaVisitaFrontServlet() {
        ++frontServlet;
    }

    public int getNuevaVisitaFrontServlet() {
        return frontServlet;
    }
    
    
    public void nuevoAccesoEvaluacion() {
        ++evaluacionClase;
    }

    public int getNuevoAccesoEvaluacion() {
        return evaluacionClase;
    }
    
    public void nuevoAccesoCurso() {
        ++cursoClase;
    }

    public int getNuevoAccesoCurso() {
        return cursoClase;
    }
}
