<%-- 
    Document   : index
    Created on : 06/12/2016, 11:18:04 AM
    Author     : Xerorules
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html>
    <head>
        
        <title>LOGIN</title>
    </head>
    <body>
    
    <form action="index.jsp" method="POST">
    <table>
     <tr>
      <td colspan="2">Ingreso</td>
     </tr>
     <tr>
      <td>Usuario:</td>
      <td><input type="text" name="1user" /></td>
     </tr>    
     <tr>
      <td>Password:</td>
      <td><input type="password" name="1pass" /></td>
     </tr>
     <tr>
      <td><input type="submit" value="Ingresar"/></td>
     </tr>        
    </table>
   </form>
    
    <%-- start web service invocation --%><hr/>
    <%
        
    try {
        
	WebService.WebServicePrueba1 service = new WebService.WebServicePrueba1();
	WebService.WebServicePrueba1Soap port = service.getWebServicePrueba1Soap();
	 // TODO initialize WS operation arguments here
	java.lang.String user = request.getParameter("1user");
	java.lang.String pass = request.getParameter("1pass");
	// TODO process result here
	java.lang.String result = port.validar(user, pass);
        out.println(result);
           
    } catch (Exception ex) {
	
    }
    

    %>
    <%-- end web service invocation --%><hr/>
    
    
    </body>
    
    
</html>
