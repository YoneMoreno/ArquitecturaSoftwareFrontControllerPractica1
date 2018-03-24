/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author YonePC
 */
@Startup
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
    int unknownCommand = 0;
    int frontCommand = 0;
    int evaluacionCommand = 0;
    int encuestaCommand = 0;
    int cuestionarioCommand = 0;
    int courseInfoCommand = 0;
    int alumnosCommand = 0;
    int singletonFuncionLog = 0;
    int profesorClase = 0;
    int estadisticasClase = 0;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void cuentaNuevaSesion() {
        nuevoAccesoEstadisticas();
        System.out.println("El numero de sesiones nuevas es: " + ++cuenta);
    }

    public int getCuentaNuevaSesion() {
        nuevoAccesoEstadisticas();
        return cuenta;
    }

    public void nuevaVisitaIndex() {
        nuevoAccesoEstadisticas();
        ++index;
    }

    public int getNuevaVisitaIndex() {
        nuevoAccesoEstadisticas();
        return index;
    }

    public void nuevaVisitaUnknown() {
        nuevoAccesoEstadisticas();
        ++unknown;
    }

    public int getNuevaVisitaUnknown() {
        nuevoAccesoEstadisticas();
        return unknown;
    }

    public void nuevaVisitaEvaluacion() {
        nuevoAccesoEstadisticas();
        ++evaluacion;
    }

    public int getNuevaVisitaEvaluacion() {
        nuevoAccesoEstadisticas();
        return evaluacion;
    }

    public void nuevaVisitaEncuesta() {
        nuevoAccesoEstadisticas();
        ++encuesta;
    }

    public int getNuevaVisitaEncuesta() {
        nuevoAccesoEstadisticas();
        return encuesta;
    }

    public void nuevaVisitaCuestionario() {
        nuevoAccesoEstadisticas();
        ++cuestionario;
    }

    public int getNuevaVisitaCuestionario() {
        nuevoAccesoEstadisticas();
        return cuestionario;
    }

    public void nuevaVisitaVerSingletonLog() {
        nuevoAccesoEstadisticas();
        ++verSingletonLog;
    }

    public int getNuevaVisitaVerSingletonLog() {
        nuevoAccesoEstadisticas();
        return verSingletonLog;
    }

    public void nuevaVisitaRealizarEvaluacion() {
        nuevoAccesoEstadisticas();
        ++realizarEvaluacion;
    }

    public int getNuevaVisitaRealizarEvaluacion() {
        nuevoAccesoEstadisticas();
        return realizarEvaluacion;
    }

    public void nuevaVisitaProfesor() {
        nuevoAccesoEstadisticas();
        ++profesor;
    }

    public int getNuevaVisitaProfesor() {
        nuevoAccesoEstadisticas();
        return profesor;
    }

    public void nuevaVisitaCourseInfo() {
        nuevoAccesoEstadisticas();
        ++courseInfo;
    }

    public int getNuevaVisitaCourseInfo() {
        nuevoAccesoEstadisticas();
        return courseInfo;
    }

    public void nuevaVisitaFrontServlet() {
        nuevoAccesoEstadisticas();
        ++frontServlet;
    }

    public int getNuevaVisitaFrontServlet() {
        nuevoAccesoEstadisticas();
        return frontServlet;
    }

    public void nuevoAccesoEvaluacion() {
        nuevoAccesoEstadisticas();
        ++evaluacionClase;
    }

    public int getNuevoAccesoEvaluacion() {
        nuevoAccesoEstadisticas();
        return evaluacionClase;
    }

    public void nuevoAccesoCurso() {
        nuevoAccesoEstadisticas();
        ++cursoClase;
    }

    public int getNuevoAccesoCurso() {
        nuevoAccesoEstadisticas();
        return cursoClase;
    }

    public void nuevoAccesoUnknownCommand() {
        nuevoAccesoEstadisticas();
        ++unknownCommand;
    }

    public int getNuevoAccesoUnknownCommand() {
        nuevoAccesoEstadisticas();
        return unknownCommand;
    }

    public void nuevoAccesoFrontCommand() {
        nuevoAccesoEstadisticas();
        ++frontCommand;
    }

    public int getNuevoAccesoFrontCommand() {
        nuevoAccesoEstadisticas();
        return frontCommand;
    }

    public void nuevoAccesoEvaluacionCommand() {
        nuevoAccesoEstadisticas();
        ++evaluacionCommand;
    }

    public int getNuevoAccesoEvaluacionCommand() {
        nuevoAccesoEstadisticas();
        return evaluacionCommand;
    }

    public void nuevoAccesoEncuestaCommand() {
        nuevoAccesoEstadisticas();
        ++encuestaCommand;
    }

    public int getNuevoAccesoEncuestaCommand() {
        nuevoAccesoEstadisticas();
        return encuestaCommand;
    }

    public void nuevoAccesoCuestionarioCommand() {
        nuevoAccesoEstadisticas();
        ++cuestionarioCommand;
    }

    public int getNuevoAccesoCuestionarioCommand() {
        nuevoAccesoEstadisticas();
        return cuestionarioCommand;
    }

    public void nuevoAccesoCourseInfoCommand() {
        nuevoAccesoEstadisticas();
        ++courseInfoCommand;
    }

    public int getNuevoAccesoCourseInfoCommand() {
        nuevoAccesoEstadisticas();
        return courseInfoCommand;
    }

    public void nuevoAccesoAlumnosCommand() {
        nuevoAccesoEstadisticas();
        ++alumnosCommand;
    }

    public int getNuevoAccesoAlumnosCommand() {
        nuevoAccesoEstadisticas();
        return alumnosCommand;
    }

    public void nuevoAccesoSingletonFuncionLog() {
        nuevoAccesoEstadisticas();
        ++singletonFuncionLog;
    }

    public int getNuevoAccesoSingletonFuncionLog() {
        nuevoAccesoEstadisticas();
        return singletonFuncionLog;
    }

    public void nuevoAccesoProfesorClase() {
        nuevoAccesoEstadisticas();
        ++profesorClase;
    }

    public int getNuevoAccesoProfesorClase() {
        nuevoAccesoEstadisticas();
        return profesorClase;
    }

    public void nuevoAccesoEstadisticas() {
        ++estadisticasClase;
    }

    public int getNuevoAccesoEstadisticas() {
        return estadisticasClase;
    }
}
