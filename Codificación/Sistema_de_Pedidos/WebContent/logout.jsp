<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page session="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>M&oacute;dulo de Seguimiento de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <script type="text/javascript" src="js/pagination.js"></script>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" media="screen" />
<body>
<body>
<% session.setAttribute("ctrl_pedido", null); %>

    <div class="col-md-12 col-sx-12">
 		<img width="100%" src="img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
  
  	<div class="col-md-12 col-sx-12">  	
		<div class="form-group">
			<h2>Módulo de Seguimiento de Pedidos</h2>
			<%@include file="html_content/formulario_login.html" %>
			<div class="alert alert-success" role="alert">
				<p>Sesión finalizada con éxito</p>
			</div>
	    </div>
	</div>
</body>
</html> 