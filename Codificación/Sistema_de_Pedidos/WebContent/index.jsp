<%@page import = "controladores.ControladorSeguimientoPedido" %>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<% //@page session="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>M&oacute;dulo de Seguimiento de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/pagination.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" media="screen" />
</head>



<body>
    <div class="col-md-12 col-xs-12">
 		<img width="100%" src="img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
  
  	<div class="col-md-12 col-xs-12">  	
		<div class="form-group">
			<h2>Módulo de Seguimiento de Pedidos</h2>
		  	<%
	
		  	if(request.getParameter("ingresar") != null)
			{
		  		ControladorSeguimientoPedido ctrl_pedido = new ControladorSeguimientoPedido();
		  			
				String usuario = request.getParameter("usuario");
				String password = request.getParameter("password");
												
				if(ctrl_pedido.iniciarSesion(usuario, password))
				{
					session.setAttribute("ctrl_pedido", ctrl_pedido);
			    	response.sendRedirect("scripts_pedidos/pedidos.jsp");
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