<%@page import = "controladores.ControladorSeguimientoPedido" %>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page session="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Módulo de Seguimiento de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" media="screen" />
</head>
 
<body>
    <div class="col-md-12">
 		<img width="100%" src="img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
  
  
  	<div class="col-md-12">  	
		<div class="form-group">
			<h2>Módulo de Seguimiento de Pedidos</h2>
		  	<%
		  		boolean resultadoLogin = true;
		  		if( request.getParameter("ingresar") != null )
			  	{
			
		  			ControladorSeguimientoPedido ctrl_pedido = new ControladorSeguimientoPedido();
					  
				    String usuario = request.getParameter("usuario");
				    String password = request.getParameter("password");
				           
				    if(resultadoLogin = ctrl_pedido.iniciarSesion(usuario, password))
				    {
				    	session.setAttribute("ctrl_pedido", ctrl_pedido);
				    	response.sendRedirect("pedidosCliente.jsp");
				    }
				    else
					    {
					    %>
					    	<%@include file="html_content/formulario_login.html" %>
					    <%
					    	out.print("<div class=\"alert alert-danger\" role=\"alert\"><p>Usuario y/o contraseña no válido/s</p></div>");
					    }
			  	}
			  	else
			  	{
		   %>
			<%@include file="html_content/formulario_login.html" %>
		   <%
		 }
		   %>
	    </div>
	</div>
</body>
</html> 