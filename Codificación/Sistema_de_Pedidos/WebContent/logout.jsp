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
	<h2>Saliendo del Sistema</h2>
	<%
		ControladorRegistrarPedidoCliente ctrl_pedido = (ControladorRegistrarPedidoCliente) session.getAttribute("ctrl_pedido");
	
		session.invalidate();
		out.print(ctrl_pedido.cerrarSesion());
		out.print("<a href=\"index.jsp\">Volver a Inicio</a>");
	%>
	</div>
	
	<div id="pie"></div>
</body>
</html> 