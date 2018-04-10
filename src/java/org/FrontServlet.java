/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import beans.Estadisticas;
import beans.SingletonFuncionLog;
import frontController.UnknownCommand;
import frontController.FrontCommand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jpa.Curso_1Facade;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "FrontServlet", urlPatterns = {"/FrontServlet"})
public class FrontServlet extends HttpServlet {

    @EJB
    private Curso_1Facade curso_1Facade;

    SingletonFuncionLog singletonFuncionLog5;
    Estadisticas estadisticas;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            //TODO: SEPARAR la sesión en nel FrontCommand

            this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
            this.estadisticas = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/Estadisticas");

            estadisticas.nuevaVisitaFrontServlet();

            singletonFuncionLog5.funcionLog("FrontServlet", "processRequest");

            HttpSession session = request.getSession(true);

            Curso curso = getCourseFromSession(session);
            Evaluacion evaluacion = getEvaluacionFromSession(session);

            setCourseInSession(curso, session, request);

            setEvaluacionInSession(evaluacion, session, request);

            FrontCommand command = getCommand(request);
            command.init(getServletContext(), request, response);
            command.process(request);
        } catch (Exception ex) {
            singletonFuncionLog5.funcionLog("FrontServlet", "Exception ex");
            Logger.getLogger(FrontServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Evaluacion getEvaluacionFromSession(HttpSession session) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "getEvaluacionFromSession");
        Evaluacion evaluacion = (Evaluacion) session.getAttribute("evaluacion");
        return evaluacion;
    }

    private Curso getCourseFromSession(HttpSession session) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "getCourseFromSession");
        Curso curso = (Curso) session.getAttribute("curso");
        return curso;
    }

    private void setCourseInSession(Curso curso, HttpSession session, HttpServletRequest request) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "setCourseInSession");
        if (curso != null) {

            addToSession(curso, session);
        } else if (isCourseCreatedWithRequiredParams(request)) {
            curso = courseHelper(request);
            addToSession(curso, session);
        }
    }

    private void setEvaluacionInSession(Evaluacion evaluacion, HttpSession session, HttpServletRequest request) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "setEvaluacionInSession");
        if (evaluacion != null) {
            ArrayList evaluaciones = (ArrayList) session.getAttribute("evaluaciones");
            if (evaluaciones == null) {
                evaluaciones = new ArrayList();
                session.setAttribute("evaluaciones", evaluaciones);
            }
            evaluaciones.add(evaluacion);

        } else {
            if (request.getParameter("evaluacionAlumno") != null && request.getParameter("evaluacionCurso") != null) {
                evaluacion = evaluacionHelper(request);
            }
            ArrayList evaluaciones = (ArrayList) session.getAttribute("evaluaciones");
            if (evaluaciones == null) {
                evaluaciones = new ArrayList();
                session.setAttribute("evaluaciones", evaluaciones);
            }
            evaluaciones.add(evaluacion);

        }
    }

    private void addToSession(Curso curso, HttpSession session) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "addToSession");

        ArrayList cursos = (ArrayList) session.getAttribute("cursos");
        if (cursos == null) {
            cursos = new ArrayList();
            session.setAttribute("cursos", cursos);
        }
        cursos.add(curso);

    }

    private Curso courseHelper(HttpServletRequest request) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "courseHelper");
        Curso curso;
        curso = new Curso(request.getParameter("titulo"),
                request.getParameter("autor"),
                request.getParameter("asignatura"),
                request.getParameter("duracion"),
                request.getParameter("video"),
                request.getParameter("imagen"));

        Curso_1 cursoToPersist = new Curso_1();
        cursoToPersist.setTitulo(request.getParameter("titulo"));
        cursoToPersist.setAutor(request.getParameter("autor"));
        cursoToPersist.setDuracion(Integer.parseInt(request.getParameter("duracion")));
        cursoToPersist.setVideo(request.getParameter("video"));
        cursoToPersist.setImagen(request.getParameter("imagen"));
        
        curso_1Facade.create(cursoToPersist);
        
        return curso;
    }

    private Evaluacion evaluacionHelper(HttpServletRequest request) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "evaluacionHelper");
        Evaluacion evaluacion;
        evaluacion = new Evaluacion(request.getParameter("evaluacionAlumno"),
                request.getParameter("evaluacionCurso"),
                request.getParameter("evaluacion"),
                request.getParameter("evaluacionComentario"));

        return evaluacion;
    }

    private boolean isCourseCreatedWithRequiredParams(HttpServletRequest request) throws NamingException {
        singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "isCourseCreatedWithRequiredParams");
        return request.getParameter("titulo") != null && request.getParameter("autor") != null;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    private FrontCommand getCommand(HttpServletRequest req) throws Exception {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "getCommand");
        try {
            FrontCommand f = (FrontCommand) getCommandClass(req).newInstance();
            return f;
        } catch (Exception e) {
            singletonFuncionLog5.funcionLog("FrontServlet", "Exception e");

            throw new Exception(e);
        }

    }

    private Class getCommandClass(HttpServletRequest req) throws NamingException {
        this.singletonFuncionLog5 = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");
        singletonFuncionLog5.funcionLog("FrontServlet", "getCommandClass");
        Class result;
        final String command = "frontController." + (String) req.getParameter("command");
        try {
            result = Class.forName(command);

        } catch (ClassNotFoundException e) {
            singletonFuncionLog5.funcionLog("FrontServlet", "ClassNotFoundException e");

            result = UnknownCommand.class;
        }
        return result;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
