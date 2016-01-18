<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import = "controladores.ControladorSeguimientoPedido" %>

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
	
			<div class="col-md-3 col-xs-4">
					<form id="logout" name="form_logout" action="${pageContext.request.contextPath}/scripts_sesion/logout.jsp" method="post" class="form-horizontal"> 
					<p>
						<button type="submit" class="btn btn-primary" name="salir">Cerrar Sesi&oacute;n</button>
						<a class="btn btn-success" href="pedidos.jsp" role="button" style="padding-left:5px;">Todos los Pedidos</a>	
					</p>
					</form>
			</div>

			<div class="col-md-5 col-xs-5">
				<%@include file="/html_content/formulario_buscar.html" %>
			</div>
				 			
			<div class="col-md-12 col-xs-12">
				<h4>Resultado de la Búsqueda</h4>	
			</div>
		</div>
			 		
		<%
		if(request.getParameter("buscar") != null)
		{  				
			String buscar = request.getParameter("buscar");
			 					
			if(!buscar.equals(""))
			{
			%>
				<div class="table-responsive col-md-12 col-sx-12">
			<%
				out.print(ctrl_pedido.buscarPedidos(buscar));
			%> 
				</div>
			<%
			}
			else
			{
			 	out.print("<div class=\"alert alert-danger\" role=\"alert\"><p>Debe ingresar un número de pedido</p></div>");
			}
		}
		%>
				
		<div class="col-md-12 col-xs-12 text-center">
	      		<ul class="pagination" id="myPager"></ul>
	   	</div>
   	
   	</div>
		<%
	}
	catch(NullPointerException npe)
	{
		response.sendRedirect("../index.jsp");
	}
	%>
	</div>
</body>
</html>