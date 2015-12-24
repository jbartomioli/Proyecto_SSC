<%@page import="utilidades.Utilidades"%>
<%@page import="controladores.ControladorSeguimientoPedido"%>
<%@page import = "negocio.Pedido" %>
<%@page import = "java.text.SimpleDateFormat" %>
<%@page import = "java.text.DecimalFormat" %>
<%@page import = "java.util.Collection" %>
<%@page import = "java.util.ArrayList" %>


<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Modulo de Registro de Pedidos - Sistema de Seguimiento de Clientes</title>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" media="screen" />
</head>
 
<body>

<% ControladorSeguimientoPedido ctrl_pedido = (ControladorSeguimientoPedido) session.getAttribute("ctrl_pedido"); 
if(ctrl_pedido.getModeloTrackingPedido().getUsuario().getIdCliente() == 0)
{
	response.sendRedirect("index.jsp");
}
else
{
%>
    <div class="col-md-12">
 		<img width="100%" src="img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
	
<!-- 	<div class="col-md-3"> -->
<!-- 		<form id="logout" name="form_logout" action="pedidosCliente.jsp" method="post" class="form-horizontal">  -->
<!-- 			<div class="form-group"> -->
<!--     			<div class="col-sm-offset-2 col-sm-2"> -->
<!-- 	        		<button type="submit" class="btn btn-default" name="salir">Cerrar Sesi?n</button> -->
<!--     			</div> -->
<!--   			</div>		            -->
<!-- 		</form> -->
<!-- 	</div> -->



	
	 <div class="col-md-12">
		<h2>M&oacute;dulo de Seguimiento de Pedidos</h2>
		
		<div class="col-md-12">
			
				<h3 class="">Bienvenido/a <% out.print(ctrl_pedido.getModeloTrackingPedido().getUsuario().getName()); %></h3>
		
			
			<div class="col-md-6">
				<form id="logout" name="form_logout" action="pedidosCliente.jsp" method="post" class="form-horizontal"> 
					<button type="submit" class="btn btn-default" name="salir">Cerrar Sesi&oacute;n</button>		           
				</form>
			</div>
		</div>
		
		<div class="col-md-12">
			<h4>Listado de Pedidos</h4>	
		</div>

		<div class="table-responsive col-md-12">
		
		<% 
		Collection<Pedido> pedidos = new ArrayList<Pedido>();
		
		pedidos = ctrl_pedido.obtenerPedidos();
		
		if(pedidos.isEmpty())
		{
			out.print("<h5>No tiene pedidos a su nombre</h5>");
		}
		else
		{
		%>
			<table class="table table-striped table-hover">
				<tr>
					<th>N&uacute;mero</th>
					<th>Fecha de Solicitud</th>
					<th>Estado</th>
					<th>Monto</th>
				</tr>
			<%			
			for(negocio.Pedido pedidoActual : pedidos )
			{
				String fechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(pedidoActual.getFecha());
				String decimalFormato = new DecimalFormat("$ 0.00##").format(pedidoActual.getTotal());
				
				out.print("<tr><td>"+pedidoActual.getCodPedido()+
						"</td><td>"+fechaFormato+
						"</td><td>"+pedidoActual.getEstado()+
						"</td><td>"+decimalFormato+"</td></tr>");		
			}
			%>
			</table>
		<% 
		} 
		%>
		</div>
    </div>
<% 
} 

if( request.getParameter("salir") != null )
{
	ctrl_pedido.cerrarSesion();
	response.sendRedirect("index.jsp");
}
%>
</body>
</html> 