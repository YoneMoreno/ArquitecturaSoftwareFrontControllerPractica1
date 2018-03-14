/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import frontController.UnknownCommand;
import frontController.FrontCommand;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author YonePC
 */
@WebServlet(name = "FrontServlet", urlPatterns = {"/FrontServlet"})
public class FrontServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //TODO: SEPARAR la sesión en nel FrontCommand
            HttpSession session = request.getSession(true);
            Curso curso = getCourseFromSession(session);
            Cuestionario cuestionario = getCuestionarioFromSession(session);
            Evaluacion evaluacion = getEvaluacionFromSession(session);

            setCourseInSession(curso, session, request);

            setCuestionarioInSession(request, session);

            setEvaluacionInSession(evaluacion, session, request);

            FrontCommand command = getCommand(request);
            command.init(getServletContext(), request, response);
            command.process(request);
        } catch (Exception ex) {
            Logger.getLogger(FrontServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Cuestionario getCuestionarioFromSession(HttpSession session) {
        Cuestionario cuestionario = (Cuestionario) session.getAttribute("cuestionario");
        return cuestionario;
    }

    private Evaluacion getEvaluacionFromSession(HttpSession session) {
        Evaluacion evaluacion = (Evaluacion) session.getAttribute("evaluacion");
        return evaluacion;
    }

    private Curso getCourseFromSession(HttpSession session) {
        Curso curso = (Curso) session.getAttribute("curso");
        return curso;
    }

    private void setCuestionarioInSession(HttpServletRequest request, HttpSession session) {
        Cuestionario cuestionario;
        cuestionario = cuestionarioHelper(request);
        session.setAttribute("cuestionario", cuestionario);
    }

    private void setCourseInSession(Curso curso, HttpSession session, HttpServletRequest request) {
        if (curso != null) {

            addToSession(curso, session);
        } else if (isCourseCreatedWithRequiredParams(request)) {
            curso = courseHelper(request);
            addToSession(curso, session);
        }
    }

    private void setEvaluacionInSession(Evaluacion evaluacion, HttpSession session, HttpServletRequest request) {
        if (evaluacion != null) {
            ArrayList evaluaciones = (ArrayList) session.getAttribute("evaluaciones");
            if (evaluaciones == null) {
                evaluaciones = new ArrayList();
                session.setAttribute("evaluaciones", evaluaciones);
            }
            evaluaciones.add(evaluacion);

        } else {
            evaluacion = evaluacionHelper(request);
            ArrayList evaluaciones = (ArrayList) session.getAttribute("evaluaciones");
            if (evaluaciones == null) {
                evaluaciones = new ArrayList();
                session.setAttribute("evaluaciones", evaluaciones);
            }
            evaluaciones.add(evaluacion);

        }
    }

    private void addToSession(Curso curso, HttpSession session) {
        ArrayList cursos = (ArrayList) session.getAttribute("cursos");
        if (cursos == null) {
            cursos = new ArrayList();
            session.setAttribute("cursos", cursos);
        }
        cursos.add(curso);

    }

    private Curso courseHelper(HttpServletRequest request) {
        Curso curso;
        curso = new Curso(request.getParameter("titulo"),
                request.getParameter("autor"),
                request.getParameter("asignatura"),
                request.getParameter("duracion"),
                request.getParameter("video"),
                request.getParameter("imagen"));
        return curso;
    }

    private Evaluacion evaluacionHelper(HttpServletRequest request) {
        Evaluacion evaluacion;
        evaluacion = new Evaluacion(request.getParameter("evaluacionAlumno"),
                request.getParameter("evaluacionCurso"),
                request.getParameter("evaluacion"),
                request.getParameter("evaluacionComentario"));
        return evaluacion;
    }

    private static boolean isCourseCreatedWithRequiredParams(HttpServletRequest request) {
        return request.getParameter("titulo") != null && request.getParameter("autor") != null;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    private FrontCommand getCommand(HttpServletRequest req) throws Exception {
        try {
            FrontCommand f = (FrontCommand) getCommandClass(req).newInstance();
            return f;
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

    private Class getCommandClass(HttpServletRequest req) {
        Class result;
        final String command = "frontController." + (String) req.getParameter("command");
        try {
            result = Class.forName(command);

        } catch (ClassNotFoundException e) {
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

    private Cuestionario cuestionarioHelper(HttpServletRequest request) {
        Cuestionario cuestionario;
        cuestionario = new Cuestionario(request.getParameter("pregunta1"), request.getParameter("respuestaTexto11"),
                request.getParameter("respuestaVerdad11"),
                request.getParameter("respuestaTexto12"),
                request.getParameter("respuestaVerdad12"),
                request.getParameter("respuestaTexto13"),
                request.getParameter("respuestaVerdad13"));
        return cuestionario;
    }

}
