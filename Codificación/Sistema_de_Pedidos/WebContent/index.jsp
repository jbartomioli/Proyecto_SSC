<%@page import ="java.sql.*" %>
<%@page import ="java.io.IOException" %>
<%@page import = "dbconnectionlib.Dbconnection"%>
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
	  	<%
	  		if( request.getParameter("ingresar") != null )
		  	{
		
				ControladorRegistrarPedidoCliente ctrl_pedido = new ControladorRegistrarPedidoCliente();
				  
			    String usuario = request.getParameter("usuario");
			    String password = request.getParameter("password");
			           
			    if(ctrl_pedido.iniciarSesion(usuario, password))
			    {
			    	session.setAttribute("ctrl_pedido", ctrl_pedido);
			    	response.sendRedirect("confeccionPedido.jsp");
			    }
			    else
			    {
			    	response.sendError(403, "Acceso denegado");
			    }
		  	}
		  	else
		  	{
	   %>
		<form id="login" name="form_login" action="index.jsp" method="post">
	    	<table>
	        	<tr>
	            	<td class="labels">Usuario:</td>
	                <td class="campos"><input name="usuario" size=15 type="text" /></td> 
	            </tr>
	            <tr>
	               	<td class="labels">Password:</td>
	               	<td class="campos"><input name="password" type="password" size=15 type="text" /></td> 
	            </tr>
	            <tr>
	            	<td class="boton" colspan="2"><input name="ingresar" type="submit" value="Ingresar" /></td>
	            </tr>
			</table>
		</form>
	   <% 
	 }
	   %>
    </div>
	<div id="pie"></div>
</body>
</html> 