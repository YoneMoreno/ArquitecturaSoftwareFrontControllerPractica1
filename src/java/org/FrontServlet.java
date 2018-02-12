/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

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

    ArrayList cursos = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession(true);
            Curso curso = (Curso) session.getAttribute("curso");
            if (curso != null) {
                cursos.add(curso);
                session.setAttribute("cursos", cursos);
            } else if (isCourseCreatedWithRequiredParams(request)) {
                curso = new Curso(request.getParameter("titulo"),
                        request.getParameter("autor"),
                        request.getParameter("asignatura"),
                        request.getParameter("duracion"),
                        request.getParameter("video"));
                cursos.add(curso);
                session.setAttribute("cursos", cursos);
            }

            FrontCommand command = getCommand(request);
            command.init(getServletContext(), request, response);
            command.process(request);
        } catch (Exception ex) {
            Logger.getLogger(FrontServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

}
