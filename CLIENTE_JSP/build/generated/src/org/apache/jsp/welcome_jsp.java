package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <title></title>\n");
      out.write("\n");
      out.write("  <meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("  <meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("  <meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("  <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("  <meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("  \n");
      out.write("body{\n");
      out.write(" position: absolute; \n");
      out.write(" padding-left: 25%;\n");
      out.write(" padding-right: 25%; \n");
      out.write("}\n");
      out.write("#page{   \n");
      out.write(" border: thin solid black;\n");
      out.write(" width: 850px;\n");
      out.write("}\n");
      out.write("#header {\n");
      out.write(" border: thin solid #ccc;\n");
      out.write(" height: 200px;\n");
      out.write(" width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#main {\n");
      out.write(" border: thin solid #ccc;\n");
      out.write(" height: 400px;\n");
      out.write(" width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#left {\n");
      out.write(" border: thin solid #ccc;\n");
      out.write(" height: 400px;\n");
      out.write(" width: 200px;\n");
      out.write(" float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#center {\n");
      out.write(" border: thin solid #ccc;\n");
      out.write(" height: 400px;\n");
      out.write(" width: 640px;\n");
      out.write(" float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bottom {\n");
      out.write(" border: thin solid #ccc;\n");
      out.write(" height: 100px;\n");
      out.write(" width: 100%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("  <div id=\"page\">\n");
      out.write("   <div id=\"header\">\n");
      out.write("    Bienvenido\n");
      out.write("    ");
      out.print(session.getAttribute("login"));
      out.write("\n");
      out.write("    ");

     if (session.getAttribute("login") != null
       && !session.getAttribute("login").equals("")) {

     } else {
      response.sendRedirect("login.jsp");
     }
    
      out.write("\n");
      out.write("    <a href=\"logout\">Logout</a>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("   <div id=\"main\">\n");
      out.write("    <div id=\"left\">\n");
      out.write("     Pagina Left\n");
      out.write("    </div>\n");
      out.write("    <div id=\"center\">\n");
      out.write("     Pagina center\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("   <div id=\"bottom\">\n");
      out.write("    Pie de pagina\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write(" </body>\n");
      out.write("</html>");
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
