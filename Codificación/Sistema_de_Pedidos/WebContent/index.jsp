<%@page import = "controladores.ControladorSeguimientoPedido" %>

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
    <div class="col-md-12">
 		<img width="100%" src="img/imgInicioInf.png" alt="" class="img-rounded img-responsive">
    </div>
  
  	<div class="col-md-12">  	
		<div class="form-group">
			<h2>M�dulo de Seguimiento de Pedidos</h2>
		  	<%
	
		  	if(request.getParameter("ingresar") != null)
			{
		  		ControladorSeguimientoPedido ctrl_pedido = new ControladorSeguimientoPedido();
		  			
				String usuario = request.getParameter("usuario");
				String password = request.getParameter("password");
												
				if(ctrl_pedido.iniciarSesion(usuario, password))
				{
			    	%>
			 		<div class="row">			
			 			<h4 class="col-md-4 col-xs-4">Bienvenido/a <% out.print(ctrl_pedido.getModeloTrackingPedido().getUsuario().getName()); %></h4>

			 			<div class="col-md-2 col-xs-2">
			 				<form id="logout" name="form_logout" action="index.jsp" method="post" class="form-horizontal"> 
			 					<button type="submit" class="btn btn-primary" name="salir">Cerrar Sesi&oacute;n</button>		           
			 				</form>
			 			</div>
			 			
			 			<div class="col-md-12">
			 				<h4>Listado de Pedidos</h4>	
			 			</div>
			 		</div>
			 		


			 		<div class="table-responsive col-md-12">
			 		<%
			 			out.print(ctrl_pedido.obtenerPedidos());
			 		%>
			 		</div>
			 		
			 		<div class="col-md-12 text-center">
			       		<ul class="pagination" id="myPager"></ul>
			      	</div>
					<%
				 	if( request.getParameter("salir") != null )
				 	{
				 		session.setAttribute("ctrl_pedido", null);
				 	}
				}
				else
				{
				 %>
					<%@include file="html_content/formulario_login.html" %>
				 <%
				 	out.print("<div class=\"alert alert-danger\" role=\"alert\"><p>Usuario y/o contrase�a no v�lido/s</p></div>");
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