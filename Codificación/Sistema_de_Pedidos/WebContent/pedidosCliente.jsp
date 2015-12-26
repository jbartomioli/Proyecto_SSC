<%@page import="negocio.LineaDePedido"%>
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
  <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="js/bootstrap.js"></script>
  <script type="text/javascript" src="js/pagination.js"></script>
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" media="screen" />
  
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
		
		<div class="row">
			
				<h4 class="col-md-4 col-xs-4">Bienvenido/a <% out.print(ctrl_pedido.getModeloTrackingPedido().getUsuario().getName()); %></h4>
		
			
			<div class="col-md-2 col-xs-2">
				<form id="logout" name="form_logout" action="pedidosCliente.jsp" method="post" class="form-horizontal"> 
					<button type="submit" class="btn btn-primary" name="salir">Cerrar Sesi&oacute;n</button>		           
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
			out.print("<p class=\"bg-warning\">No tiene pedidos registrados a su nombre</p>");
		}
		else
		{
		%>

	<div class="row">
      <div class="table-responsive">
			<table class="table table-striped table-hover" height="20">
				<thead>
					<tr>
						<th>N&uacute;mero</th>
						<th>Fecha de Solicitud</th>
						<th>Estado</th>
						<th>Monto</th>
					</tr>
				</thead>
			<%			
			out.print("<tbody id=\"myTable\">");

			for(negocio.Pedido pedidoActual : pedidos )
			{
				String fechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(pedidoActual.getFecha());
				String decimalFormato = new DecimalFormat("$ 0.00##").format(pedidoActual.getTotal());

				out.print("<tr><td><a href=\"javascript:mostrarOcultarTablas(\'"+pedidoActual.getCodPedido()+"\')\" >"+pedidoActual.getCodPedido()+"</a>"+
						"</td><td>"+fechaFormato+
						"</td><td>"+pedidoActual.getEstado()+
						"</td><td>"+decimalFormato+"</td></tr>");
				
				if(pedidoActual.getLineas().isEmpty())
					pedidoActual.obtenerLineasDePedido();
				
				out.print("<tr><td colspan=\"4\">");
				
				out.print("<table class=\"table table-condensedd table-bordered table-hover\" style=\"display:none;\" id=\""+pedidoActual.getCodPedido()+"\">");
				out.print("<thead>");
				out.print("<tr>");
				out.print("<th>Cod.</th>");
				out.print("<th>Producto</th>");
				out.print("<th>Cant. Pedida</th>");
				out.print("</tr>");
				out.print("</thead>");


				out.print("<tbody>");
				for(LineaDePedido PA : pedidoActual.getLineas())
				{
					out.print("<tr>");
					out.println("<td>"+PA.getProducto().getCodProducto()+"</td>");
					out.println("<td>"+PA.getProducto().getNombre()+"</td>");
					out.println("<td>"+PA.getCantidadPedida()+"</td>");
					out.print("</tr>");
				}
				out.print("</tbody>");

				
				out.print("</table>");
				out.print("</td></tr>");

			}
			out.print("</tbody>");
			%>
			</table>
			</div>
			<div class="col-md-12 text-center">
      			<ul class="pagination" id="myPager"></ul>
     		</div>
     		</div>
     		</div>
		<% 
		} 
		%>
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