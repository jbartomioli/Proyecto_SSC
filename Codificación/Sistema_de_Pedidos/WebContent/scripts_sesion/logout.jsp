<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page session="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta name="viewport" content="width=360, initial-scale=0.75">
  <title>M&oacute;dulo de Seguimiento de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/pagination.js"></script>
  <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/img/favicon.png" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" media="screen" />
<body>
<body>
<% session.setAttribute("ctrl_pedido", null); %>

    <div class="col-md-12 col-sx-12">
 		<img width="100%" src="${pageContext.request.contextPath}/img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
  
  	<div class="col-md-12 col-sx-12">  	
		<div class="form-group">
			<h2>Módulo de Seguimiento de Pedidos</h2>
			<%@include file="../html_content/formulario_login.html" %>
			<div class="alert alert-success" role="alert">
				<p>Sesión finalizada con éxito</p>
			</div>
	    </div>
	</div>
</body>
</html> 