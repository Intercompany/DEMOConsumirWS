package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("\n");
      out.write("  <title>My JSP 'index.jsp' starting page</title>\n");
      out.write("  <meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("  <meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("  <meta http-equiv=\"expires\" content=\"0\">\n");
      out.write("  <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("  <meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <style type=\"text/css\">\n");
      out.write("   body{\n");
      out.write("    font-family: Verdana;       \n");
      out.write("    padding: 25% 50% 25% 50%;\n");
      out.write("    border: thin solid #ccc;        \n");
      out.write("   }\n");
      out.write("   .login{        \n");
      out.write("    \n");
      out.write("   }\n");
      out.write("   table{\n");
      out.write("    border: thin solid #ccc; \n");
      out.write("   }\n");
      out.write("   table tr:first-child{\n");
      out.write("    background-color: blue; \n");
      out.write("    color: white; \n");
      out.write("    text-align: center;\n");
      out.write("   } \n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("  <div class=\"login\">\n");
      out.write("   <div id=\"flash\">\n");
      out.write("    ");
             
     if(session.getAttribute("login") != null && !session.getAttribute("login").equals("")){
      response.sendRedirect("welcome.jsp");
     }     
    
      out.write("\n");
      out.write("   </div>\n");
      out.write("   <form id=\"formLogin\" action=\"check\" method=\"POST\">\n");
      out.write("    <table>\n");
      out.write("     <tr>\n");
      out.write("      <td colspan=\"2\">Ingreso</td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("      <td>Login:</td>\n");
      out.write("      <td><input type=\"text\" name=\"login\" /></td>\n");
      out.write("     </tr>    \n");
      out.write("     <tr>\n");
      out.write("      <td>Password:</td>\n");
      out.write("      <td><input type=\"password\" name=\"pass\" /></td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("      <td><input type=\"button\" value=\"Ingresar\" onclick=\"validar();\"/></td>\n");
      out.write("     </tr>        \n");
      out.write("    </table>\n");
      out.write("   </form>\n");
      out.write("  </div>  \n");
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
