<%@page import = "controladores.ControladorRegistrarPedidoCliente"%>
<%@page import = "dbconnectionlib.Dbconnection"%>
<%@page import = "java.sql.Connection"%>
<%@page import = "java.sql.*" %>

<%@page language = "java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Módulo de Registro de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="scripts/jquery-1.3.2.min.js"></script>
  <link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
</head>
 
<body>
	<div id="encabezado"></div>
	<% 
	
	Connection theConnection = Dbconnection.main();
	ResultSet rs = null;
	Statement stmt = theConnection.createStatement();
	
	ControladorRegistrarPedidoCliente ctrl_pedido = (ControladorRegistrarPedidoCliente) session.getAttribute("ctrl_pedido");
	
	%>
	<div id="contenido">
		<p>Bienvenido <%= ctrl_pedido.getUsuario().getName() %> <a href="logout.jsp">Cerrar sesión</a></p>
		<h2>Confección de Pedido</h2>
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
			<table class="productos">
			  <tr>
			    <th class="label">Producto</th>
			    <th class="label">Stock</th>
			    <th class="label">Precio</th>
			    <th class="label">Check</th>
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
			  <tr>
			  	<td class="boton" colspan="4"><input type="submit" name="buscar" value="Buscar"></td>
			  </tr>
			</table>   
		</form>  
	</div>
	<div id="pie"></div>
</body>
</html> 