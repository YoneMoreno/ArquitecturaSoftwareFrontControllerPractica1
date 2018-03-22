package org.apache.jsp.Public;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.SingletonFuncionLog;
import javax.naming.InitialContext;

public final class RealizarEvaluacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Public/../Header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    SingletonFuncionLog singletonFuncionLog = InitialContext.doLookup("java:global/ASAPLICACIONCURSOSPRACTICA1/SingletonFuncionLog");

    singletonFuncionLog.funcionLog("Profesor", "processRequest");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.8/css/solid.css\" integrity=\"sha384-v2Tw72dyUXeU3y4aM2Y0tBJQkGfplr39mxZqlTBDUZAb9BGoC40+rdFCG0m10lXk\" crossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.8/css/fontawesome.css\" integrity=\"sha384-q3jl8XQu1OpdLgGFvNRnPdj5VIlCvgsDQTQB6owSOHWlAurxul7f+JpUOVdAiJ5P\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- A grey horizontal navbar that becomes vertical on small screens -->\n");
      out.write("<!-- Grey with black text -->\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-primary navbar-dark\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"/ASAPLICACIONCURSOSPRACTICA1\">Inicio</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"/ASAPLICACIONCURSOSPRACTICA1/Public/CourseInfo.jsp\">Lista de cursos</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"/ASAPLICACIONCURSOSPRACTICA1/Public/Profesor.jsp\"><i class=\"fas fa-user-circle\"></i></a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Realizar Evaluación</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (request.getParameter("name").toString().equals("command")) {
                if (request.getParameter("value").toString().equals("numero")) {


        
      out.write("\n");
      out.write("        <form action=\"../FrontServlet\">\n");
      out.write("            <h2>Nombre del alumno: </h2>\n");
      out.write("            <input type=\"text\" name=\"evaluacionAlumno\" required/>\n");
      out.write("            <h2>Nombre del curso: </h2>\n");
      out.write("            <input type=\"text\" name=\"evaluacionCurso\" required>\n");
      out.write("            <h2>Indique la puntuación: </h2>\n");
      out.write("            <div style=\"display: flex\">\n");
      out.write("                <h4>0</h4><input type=\"radio\" name=\"evaluacion\" value=\"0\"  />\n");
      out.write("                <h4>1</h4><input type=\"radio\" name=\"evaluacion\" value=\"1\" />\n");
      out.write("                <h4>2</h4><input type=\"radio\" name=\"evaluacion\" value=\"2\" />\n");
      out.write("                <h4>3</h4><input type=\"radio\" name=\"evaluacion\" value=\"3\" />\n");
      out.write("                <h4>4</h4><input type=\"radio\" name=\"evaluacion\" value=\"4\" />\n");
      out.write("                <h4>5</h4><input type=\"radio\" name=\"evaluacion\" value=\"5\" />\n");
      out.write("                <h4>6</h4><input type=\"radio\" name=\"evaluacion\" value=\"6\" />\n");
      out.write("                <h4>7</h4><input type=\"radio\" name=\"evaluacion\" value=\"7\" />\n");
      out.write("                <h4>8</h4><input type=\"radio\" name=\"evaluacion\" value=\"8\" />\n");
      out.write("                <h4>9</h4><input type=\"radio\" name=\"evaluacion\" value=\"9\" />\n");
      out.write("                <h4>10</h4><input type=\"radio\" name=\"evaluacion\" value=\"10\"  />\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Enviar evaluacion\">\n");
      out.write("            <input type=\"hidden\" name=\"command\" value=\"EvaluacionCommand\"/>\n");
      out.write("        </form>\n");
      out.write("        ");
  } else if (request.getParameter("value").toString().equals("letra")) {

        
      out.write("\n");
      out.write("        <form action=\"../FrontServlet\">\n");
      out.write("            <h2>Nombre del alumno: </h2>\n");
      out.write("            <input type=\"text\" name=\"evaluacionAlumno\" required/>\n");
      out.write("            <h2>Nombre del curso: </h2>\n");
      out.write("            <input type=\"text\" name=\"evaluacionCurso\" required>\n");
      out.write("            <h2>Indique la puntuación mediante una letra: </h2>\n");
      out.write("            <div style=\"display: flex\">\n");
      out.write("                <h4>A</h4><input type=\"radio\" name=\"evaluacion\" value=\"A\"  />\n");
      out.write("                <h4>B</h4><input type=\"radio\" name=\"evaluacion\" value=\"B\" />\n");
      out.write("                <h4>C</h4><input type=\"radio\" name=\"evaluacion\" value=\"C\" />\n");
      out.write("                <h4>D</h4><input type=\"radio\" name=\"evaluacion\" value=\"D\" />\n");
      out.write("                <h4>E</h4><input type=\"radio\" name=\"evaluacion\" value=\"E\" />\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" value=\"Enviar evaluacion\">\n");
      out.write("            <input type=\"hidden\" name=\"command\" value=\"EvaluacionCommand\"/>\n");
      out.write("        </form>\n");
      out.write("        ");
                } else if (request.getParameter("value").toString().equals("comentario")) {
        
      out.write("\n");
      out.write("        <form action=\"../FrontServlet\">\n");
      out.write("            <h2>Nombre del alumno: </h2>\n");
      out.write("            <input type=\"text\" name=\"evaluacionAlumno\" required/>\n");
      out.write("            <h2>Nombre del curso: </h2>\n");
      out.write("            <input type=\"text\" name=\"evaluacionCurso\" required>\n");
      out.write("            <h2>Indique la puntuación mediante una letra: </h2>\n");
      out.write("            <div style=\"display: flex\">\n");
      out.write("                <h4>Apto</h4><input type=\"radio\" name=\"evaluacion\" value=\"Apto\"  />\n");
      out.write("                <h4>No Apto</h4><input type=\"radio\" name=\"evaluacion\" value=\"NoApto\" />\n");
      out.write("            </div>\n");
      out.write("            <h2>Añada un comentario para justificar la nota: </h2>\n");
      out.write("            <textarea name=\"evaluacionComentario\"> \n");
      out.write("            </textarea>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" value=\"Enviar evaluacion\">\n");
      out.write("            <input type=\"hidden\" name=\"command\" value=\"EvaluacionCommand\"/>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
