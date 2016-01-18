package controladores;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import negocio.ModeloTrackingPedidoCliente;
import negocio.Pedido;
import negocio.Userdetail;

/**
 * CONTROLADOR SEGUIMIENTO DE PEDIDOS
 * 
 * @author Javier Bartomioli - Rodrigo Naredo
 * @version 1.01.20160118
 * 
 */
public class ControladorSeguimientoPedido
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.ModeloTrackingPedidoCliente modeloTrackingPedido; 

		
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorSeguimientoPedido() throws Exception 
	{
		this.modeloTrackingPedido = new negocio.ModeloTrackingPedidoCliente();
		this.modeloTrackingPedido.inicializarCatalogos();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.ModeloTrackingPedidoCliente getModeloTrackingPedido()
	{
		return modeloTrackingPedido;
	}


	public void setModeloTrackingPedido(negocio.ModeloTrackingPedidoCliente modeloTrackingPedido)
	{
		this.modeloTrackingPedido = modeloTrackingPedido;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	/**
	 * INICIA LA SESION EN EL SERVIDOR
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean iniciarSesion(String user, String password)
	{
		return modeloTrackingPedido.iniciarSesion(user, password);
	}
	//////////////////////////////////////////////////////////


	
	/**
	 * RECUPERA LOS PEDIDOS DEL CLIENTE
	 * @return
	 */
	public String obtenerPedidos()
	{
		
		Collection<negocio.Pedido> pedidos = new ArrayList<negocio.Pedido>();
		
		String salidaStringHTML = "";
		
		try 
		{
			pedidos = modeloTrackingPedido.obtenerPedidos();
			
			salidaStringHTML += "<div class=\"row\">";
			salidaStringHTML += "<div class=\"table-responsive\">";
			salidaStringHTML += "<table class=\"table table-striped table-hover\" >";
			salidaStringHTML += "<thead>";
			salidaStringHTML += "<tr>";
			salidaStringHTML += "<th>N&uacute;mero</th>";
			salidaStringHTML += "<th>Fecha de Solicitud</th>";
			salidaStringHTML += "<th>Estado</th>";
			salidaStringHTML += "<th>Monto</th>";
			salidaStringHTML += "</tr>";
			salidaStringHTML += "</thead>";
			salidaStringHTML += "<tbody id=\"myTable\">";
			
			for(negocio.Pedido pedidoActual : pedidos )
			{
				String fechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(pedidoActual.getFecha());
				String decimalFormato = new DecimalFormat("$ 0.00##").format(pedidoActual.getTotal());

				salidaStringHTML += "<tr><td><a href=\"javascript:mostrarOcultarTablas(\'"+pedidoActual.getCodPedido()+"\')\" >"+pedidoActual.getCodPedido()+"</a>";
				salidaStringHTML += "</td><td>"+fechaFormato;
				salidaStringHTML += "</td><td>"+pedidoActual.getEstado();
				salidaStringHTML += "</td><td>"+decimalFormato+"</td></tr>";
				
				if(pedidoActual.getLineas().isEmpty())
				{
					pedidoActual.obtenerLineasDePedido();
				}
				
				salidaStringHTML += "<tr><td colspan=\"4\">";
				
				salidaStringHTML += "<table class=\"table table-condensedd table-bordered table-hover\" style=\"display:none;\" id=\""+pedidoActual.getCodPedido()+"\">";
				salidaStringHTML += "<thead>";
				salidaStringHTML += "<tr>";
				salidaStringHTML += "<th>Cod.</th>";
				salidaStringHTML += "<th>Producto</th>";
				salidaStringHTML += "<th>Cant. Pedida</th>";
				salidaStringHTML += "</tr>";
				salidaStringHTML += "</thead>";


				salidaStringHTML += "<tbody>";
				for(negocio.LineaDePedido lineaActual : pedidoActual.getLineas())
				{
					salidaStringHTML += "<tr>";
					salidaStringHTML += "<td>"+lineaActual.getProducto().getCodProducto()+"</td>";
					salidaStringHTML += "<td>"+lineaActual.getProducto().getNombre()+"</td>";
					salidaStringHTML += "<td>"+lineaActual.getCantidadPedida()+"</td>";
					salidaStringHTML += "</tr>";
				}
				salidaStringHTML +="</tbody>";

				
				salidaStringHTML +="</table>";
				salidaStringHTML +="</td></tr>";

			}
			salidaStringHTML +="</tbody>";
			
			salidaStringHTML += "</table>";
			salidaStringHTML += "</div>";

			salidaStringHTML += "</div>";
		} 
		catch (NullPointerException npe) 
		{
			salidaStringHTML = "<p class=\"bg-warning\">No tiene pedidos registrados a su nombre</p>";
		}
		catch(Exception e) 
		{
			salidaStringHTML = "<p class=\"bg-warning\">Se ha producido un error al recuperar la información de sus pedidos</p>";
		}
	return salidaStringHTML;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * BUSCA UN PEDIDO SEGUN SU COD PEDIDO
	 * @param codPedido
	 * @return
	 */
	public String buscarPedidos(String codPedido)
	{
		Collection<Pedido> pedidos = new ArrayList<Pedido>();
		String salidaStringHTML = "";
		
		
		try
		{
			pedidos = this.modeloTrackingPedido.buscarPedidos(codPedido.toUpperCase());
			
			if(pedidos.size()>0)
			{
				salidaStringHTML += "<div class=\"row\">";
				salidaStringHTML += "<div class=\"table-responsive\">";
				salidaStringHTML += "<table class=\"table table-striped table-hover\" >";
				salidaStringHTML += "<thead>";
				salidaStringHTML += "<tr>";
				salidaStringHTML += "<th>N&uacute;mero</th>";
				salidaStringHTML += "<th>Fecha de Solicitud</th>";
				salidaStringHTML += "<th>Estado</th>";
				salidaStringHTML += "<th>Monto</th>";
				salidaStringHTML += "</tr>";
				salidaStringHTML += "</thead>";
				salidaStringHTML += "<tbody id=\"myTable\">";
				
				for(negocio.Pedido pedidoActual : pedidos )
				{
					String fechaFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(pedidoActual.getFecha());
					String decimalFormato = new DecimalFormat("$ 0.00##").format(pedidoActual.getTotal());
		
					salidaStringHTML += "<tr><td><a href=\"javascript:mostrarOcultarTablas(\'"+pedidoActual.getCodPedido()+"\')\" >"+pedidoActual.getCodPedido()+"</a>";
					salidaStringHTML += "</td><td>"+fechaFormato;
					salidaStringHTML += "</td><td>"+pedidoActual.getEstado();
					salidaStringHTML += "</td><td>"+decimalFormato+"</td></tr>";
					
					if(pedidoActual.getLineas().isEmpty())
					{
						pedidoActual.obtenerLineasDePedido();
					}
					
					salidaStringHTML += "<tr><td colspan=\"4\">";
					
					salidaStringHTML += "<table class=\"table table-condensedd table-bordered table-hover\" style=\"display:none;\" id=\""+pedidoActual.getCodPedido()+"\">";
					salidaStringHTML += "<thead>";
					salidaStringHTML += "<tr>";
					salidaStringHTML += "<th>Cod.</th>";
					salidaStringHTML += "<th>Producto</th>";
					salidaStringHTML += "<th>Cant. Pedida</th>";
					salidaStringHTML += "</tr>";
					salidaStringHTML += "</thead>";
		
		
					salidaStringHTML += "<tbody>";
					for(negocio.LineaDePedido lineaActual : pedidoActual.getLineas())
					{
						salidaStringHTML += "<tr>";
						salidaStringHTML += "<td>"+lineaActual.getProducto().getCodProducto()+"</td>";
						salidaStringHTML += "<td>"+lineaActual.getProducto().getNombre()+"</td>";
						salidaStringHTML += "<td>"+lineaActual.getCantidadPedida()+"</td>";
						salidaStringHTML += "</tr>";
					}
					salidaStringHTML +="</tbody>";
		
					
					salidaStringHTML +="</table>";
					salidaStringHTML +="</td></tr>";
		
				}
				salidaStringHTML +="</tbody>";
				
				salidaStringHTML += "</table>";
				salidaStringHTML += "</div>";
		
				salidaStringHTML += "</div>";
			}
			else
			{
				salidaStringHTML = "<div class=\"alert alert-danger\" role=\"alert\"><p>No se han encontrado resultados</p></div>";
			}
		}
		catch (NullPointerException npe) 
		{
			salidaStringHTML = "<p class=\"bg-warning\">No tiene pedidos registrados a su nombre</p>";
		}
		catch(Exception e) 
		{
			salidaStringHTML = "<p class=\"bg-warning\">Se ha producido un error al recuperar la información de sus pedidos</p>";
		}
		
		return salidaStringHTML;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
