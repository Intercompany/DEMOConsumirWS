package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>LOGIN</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("    <form action=\"check.java\" method=\"POST\">\n");
      out.write("    <table>\n");
      out.write("     <tr>\n");
      out.write("      <td colspan=\"2\">Ingreso</td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("      <td>Usuario:</td>\n");
      out.write("      <td><input type=\"text\" name=\"1user\" /></td>\n");
      out.write("     </tr>    \n");
      out.write("     <tr>\n");
      out.write("      <td>Password:</td>\n");
      out.write("      <td><input type=\"password\" name=\"1pass\" /></td>\n");
      out.write("     </tr>\n");
      out.write("     <tr>\n");
      out.write("      <td><input type=\"submit\" value=\"Ingresar\"/></td>\n");
      out.write("     </tr>        \n");
      out.write("    </table>\n");
      out.write("   </form>\n");
      out.write("    \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

        
    try {
        
	WebService.WebServicePrueba1 service = new WebService.WebServicePrueba1();
	WebService.WebServicePrueba1Soap port = service.getWebServicePrueba1Soap();
	 // TODO initialize WS operation arguments here
	java.lang.String user = request.getParameter("1user");
	java.lang.String pass = request.getParameter("1pass");
	// TODO process result here
	java.lang.String result = port.validar(user, pass);
        out.println(result);
        if(result != "" || result != null)
        {
        response.sendRedirect("pagina2.jsp");
        }    
    } catch (Exception ex) {
	
    }
    

    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
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
