package vista;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import controlador.BeanUsuario;
public class ServletRegistro extends HttpServlet {
 private static final long serialVersionUID = 1L;
    public ServletRegistro() {
    }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String nombre=request.getParameter("nombre");
  String apellido=request.getParameter("apellido");
  String edad=request.getParameter("edad");
  String correo=request.getParameter("correo");
  String usuario=request.getParameter("usuario");
  String clave=request.getParameter("clave");
  if(!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !edad.equalsIgnoreCase("") && !correo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !clave.equalsIgnoreCase("")){
   BeanUsuario busuario=new BeanUsuario(nombre, apellido, edad, correo, usuario, clave);
   boolean sw=Usuario.agregarUsuario(busuario);
   if(sw){
    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
   }
  }
 }
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String nombre=request.getParameter("nombre");
  String apellido=request.getParameter("apellido");
  String edad=request.getParameter("edad");
  String correo=request.getParameter("correo");
  String usuario=request.getParameter("usuario");
  String clave=request.getParameter("clave");
  if(!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !edad.equalsIgnoreCase("") && !correo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !clave.equalsIgnoreCase("")){
   BeanUsuario busuario=new BeanUsuario(nombre, apellido, edad, correo, usuario, clave);
   boolean sw=Usuario.agregarUsuario(busuario);
   if(sw){
    request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
   }else{
    PrintWriter out=response.getWriter();
    out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
   }
  }
 }
}