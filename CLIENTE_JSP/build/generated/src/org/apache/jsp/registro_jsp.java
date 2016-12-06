package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Registro Usuario</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div align=\"center\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td>Usando el Metodo GET</td>\n");
      out.write("<td>Usando el Metodo POST</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("<form action=\"ServletRegistro\" method=\"get\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td>Nombre:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"nombre\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Apellido:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"apellido\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Edad:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"edad\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Correo:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"correo\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Usuario:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"usuario\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Contraseña:</td>\n");
      out.write("<td><input type=\"password\" size=\"20\" name=\"clave\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Registrar\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("<form action=\"ServletRegistro\" method=\"post\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td>Nombre:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"nombre\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Apellido:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"apellido\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Edad:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"edad\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Correo:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"correo\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Usuario:</td>\n");
      out.write("<td><input type=\"text\" size=\"20\" name=\"usuario\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Contraseña:</td>\n");
      out.write("<td><input type=\"password\" size=\"20\" name=\"clave\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Registrar\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
