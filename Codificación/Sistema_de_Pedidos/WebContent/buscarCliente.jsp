<%@page import = "controladores.ControladorRegistrarPedidoCliente" %>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Módulo de Registro de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="scripts/jquery-1.3.2.min.js"></script>
  <link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
</head>
 
<body>
 	<div id="encabezado"></div>
	
	<div id="contenido">
		<h2>Módulo de Registro de Pedidos</h2>
		<form action="buscarCliente.jsp" method="post">
			<table>
				<tr>
					<th colspan="2">Búsqueda del Cliente</th>
				</tr>
				<tr>
		            <td class="labels">Número:</td>
		            <td class="campos"><input name="nro_cliente" type="text" /></td> 
				</tr>
				<tr>
		            <td class="labels">Nombre y Apellido:</td>
		            <td class="campos"><input name="nomape_cliente" type="text" /></td> 
				</tr>
				<tr>
					<td colspan="2"><input name="buscar" type="submit" value="Buscar" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<%
		if(request.getParameter("buscar") != null)
		{
			ControladorRegistrarPedidoCliente ctrl_pedido = (ControladorRegistrarPedidoCliente) session.getAttribute("ctrl_pedido");
			
			String nro_cliente = request.getParameter("nro_cliente");
			String nomape_cliente = request.getParameter("nomape_cliente");
			
			out.print(ctrl_pedido.buscarCliente(nro_cliente, nomape_cliente));
			%>
			<form action="confeccionPedido.jsp">
				<input type="submit" value="Confeccionar Pedido" />
			</form>
			<%
		}
		%>
    </div>
	<div id="pie"></div>
</body>
</html> 