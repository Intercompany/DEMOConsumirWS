package modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import controlador.BeanUsuario;
import modelo.Conexion;
public class Usuario {
 
 public static boolean agregarUsuario(BeanUsuario usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    st.executeUpdate("INSERT INTO Usuario(`Nombre`,`Apellido`,`Edad`, `Correo`,`Usuario`,`Clave`) VALUES ('"+usuario.getNombre()+"','"+usuario.getApellido()+"',"+usuario.getEdad()+",'"+usuario.getCorreo()+"','"+usuario.getUsuario()+"','"+usuario.getClave()+"')");
    agregado=true;
    st.close();
   }
   c.cerrarConexion();
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  return agregado;
 }
}
