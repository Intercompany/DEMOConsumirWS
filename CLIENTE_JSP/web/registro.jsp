<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Usuario</title>
</head>
<body>
<div align="center">
<table>
<tr>
<td>Usando el Metodo GET</td>
<td>Usando el Metodo POST</td>
</tr>
<tr>
<td>
<form action="ServletRegistro" method="get">
<table>
<tr>
<td>Nombre:</td>
<td><input type="text" size="20" name="nombre"></td>
</tr>
<tr>
<td>Apellido:</td>
<td><input type="text" size="20" name="apellido"></td>
</tr>
<tr>
<td>Edad:</td>
<td><input type="text" size="20" name="edad"></td>
</tr>
<tr>
<td>Correo:</td>
<td><input type="text" size="20" name="correo"></td>
</tr>
<tr>
<td>Usuario:</td>
<td><input type="text" size="20" name="usuario"></td>
</tr>
<tr>
<td>Contraseña:</td>
<td><input type="password" size="20" name="clave"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Registrar"></td>
</tr>
</table>
</form>
</td>
<td>
<form action="ServletRegistro" method="post">
<table>
<tr>
<td>Nombre:</td>
<td><input type="text" size="20" name="nombre"></td>
</tr>
<tr>
<td>Apellido:</td>
<td><input type="text" size="20" name="apellido"></td>
</tr>
<tr>
<td>Edad:</td>
<td><input type="text" size="20" name="edad"></td>
</tr>
<tr>
<td>Correo:</td>
<td><input type="text" size="20" name="correo"></td>
</tr>
<tr>
<td>Usuario:</td>
<td><input type="text" size="20" name="usuario"></td>
</tr>
<tr>
<td>Contraseña:</td>
<td><input type="password" size="20" name="clave"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Registrar"></td>
</tr>
</table>
</form>
</td>
</tr>
</table>
</div>
</body>
</html>
