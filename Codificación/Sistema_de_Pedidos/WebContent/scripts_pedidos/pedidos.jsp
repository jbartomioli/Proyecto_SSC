<%@page import = "controladores.ControladorSeguimientoPedido" %>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page session="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>M&oacute;dulo de Seguimiento de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/js/pagination.js"></script>
  <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/img/favicon.png" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" media="screen" />
  
  <script type="text/javascript">
	function mostrarOcultarTablas(id)
	{
		mostrado=0;
		elem = document.getElementById(id);
	
		if(elem.style.display=='inline-table')
			mostrado=1;
			elem.style.display='none';
			
		if(mostrado!=1)
			elem.style.display='inline-table';
	}
	</script>
</head>

<body>
    <div class="col-md-12 col-xs-12">
 		<img width="100%" src="${pageContext.request.contextPath}/img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
  
  	<div class="col-md-12 col-xs-12">  	
		<div class="form-group">
			<h2>Módulo de Seguimiento de Pedidos</h2>
<% 
	try
	{
		ControladorSeguimientoPedido ctrl_pedido = (ControladorSeguimientoPedido) session.getAttribute("ctrl_pedido");
%>
	<div class="row">			
		<h4 class="col-md-4 col-xs-2">Bienvenido/a <% out.print(ctrl_pedido.getModeloTrackingPedido().getUsuario().getName()); %></h4>

		<div class="col-md-2 col-xs-4">
			<form id="logout" name="form_logout" action="${pageContext.request.contextPath}/scripts_sesion/logout.jsp" method="post" class="form-horizontal"> 
				<button type="submit" class="btn btn-primary" name="salir">Cerrar Sesi&oacute;n</button>		           
			</form>
		</div>
		
		<div class="col-md-5 col-xs-5">
			<%@include file="../html_content/formulario_buscar.html" %>
		</div>
			 			
		<div class="col-md-12 col-xs-12">
			<h4>Listado de Pedidos</h4>	
		</div>
	</div>
			 		
	<div class="table-responsive col-md-12 col-sx-12">
	<%
		out.print(ctrl_pedido.obtenerPedidos());
	%>
	</div>
			 		
	<div class="col-md-12 col-xs-12 text-center">
      		<ul class="pagination" id="myPager"></ul>
   	</div>
<%
	}
	catch(NullPointerException npe)
	{
		response.sendRedirect("../index.jsp");
	}
%>
	    </div>
	</div>
</body>
</html> 