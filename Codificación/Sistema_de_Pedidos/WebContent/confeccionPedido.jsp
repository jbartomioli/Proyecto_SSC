<%@page import="controladores.ControladorRegistrarPedidoCliente"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "dbconnectionlib.Dbconnection"%>
<%@ page import = "java.sql.Connection"%>
<%@page import ="java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Módulo de Registro de Pedidos - Sistema de Seguimiento de Clientes</title>
  <link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
</head>
 
<body>
	<img alt="Imágen encabezado" src="img/imgInicioSup.jpg">
	<% 
	
	Connection theConnection = Dbconnection.main();
	ResultSet rs = null;
	Statement stmt = theConnection.createStatement();
	
	%>
	<p>Bienvenido <%=request.getParameter("password") %> <a href="logout.jsp">Cerrar sesión</a></p>
	<h2>Pedido</h2>
	<form name="form1" method="post" action="servlet/PrintResultsServlet">
		<select name="comboCategoria">  
			<option>Seleccionar Categoría</option>
			<%
			rs = stmt.executeQuery("select descripcion from categorias");
			while(rs.next())
			{
				out.write("<option value=" + rs.getString("descripcion") + ">" + rs.getString("descripcion") + "</option>");
			}
			%>
		</select>  
 
		<br />
		<br />
		<select name="comboSubCategoria">  
			<option>Seleccionar Subcategoría</option>
			<%
				rs = stmt.executeQuery("select descripcion from subcategorias");
				while(rs.next())
				{
					out.write("<option value=" + rs.getString("descripcion") + ">" + rs.getString("descripcion") + "</option>");
	    
				}
			%>
		</select>   
		<br />
		<br />
		<table width="50%" border="1" align="left">
		  <tr>
		    <th>Producto</th>
		    <th>Stock</th>
		    <th>Precio</th>
		    <th>Check</th>
		  </tr>
		  <tr>
		    <td>Contenido</td>
		    <td>Contenido</td>
		    <td>Contenido</td>
		    <td>Contenido</td>
		  </tr>
		  <tr>
		    <td>Contenido</td>
		    <td>Contenido</td>
		    <td>Contenido</td>
		    <td>Contenido</td>
		  </tr>
		</table>
		<br />
		<br />
		<br />
		<br />   
		<p align="center">  
			<input type="submit" name="Submit" value="Buscar">  
		</p>          
	</form>  
	<img alt="Imágen pie" src="img/imgInicioInf.jpg">
</body>
</html> 