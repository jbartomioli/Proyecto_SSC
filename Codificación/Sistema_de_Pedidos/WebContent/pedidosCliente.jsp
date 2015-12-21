<%@page import="controladores.ControladorSeguimientoPedido"%>
<%@page import = "controladores.ControladorRegistrarPedidoCliente" %>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Módulo de Registro de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" media="screen" />
</head>
 
<body>
    <div class="col-md-12">
 		<img width="100%" src="img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
	
	 <div class="col-md-12">
		<h2>Módulo de Seguimiento de Pedidos</h2>
		<h3>Listado de Pedidos</h3>
		<div class="table-responsive col-md-6">
			<table class="table table-striped table-hover">
			<% 	ControladorSeguimientoPedido ctrl_pedido = (ControladorSeguimientoPedido) session.getAttribute("ctrl_pedido"); 
			for(negocio.Pedido pedidoActual : ctrl_pedido.obtenerPedidos(1) )
			{
				out.print("<tr><td>"+pedidoActual.getIdPedido()+"</td><td>aaaa</td></tr>");
			}
			%>
			</table>
		</div>
    </div>
</body>
</html> 