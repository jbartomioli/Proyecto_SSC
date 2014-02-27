package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoPedidos 
{

	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.Pedido> pedidos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoPedidos() 
	{
		this.pedidos = new ArrayList<negocio.Pedido>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Pedido> getPedidos() 
	{
		return pedidos;
	}


	public void setPedidos(Collection<negocio.Pedido> pedidos) 
	{
		this.pedidos = pedidos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// GUARDA EL NUEVO PEDIDO									   //
	/////////////////////////////////////////////////////////////////
	//FALTA COMPLETAR DATOS
	public void agregarPedido(negocio.Pedido pedidoNegocio)
	{
		//SE AGREGA EL ANUNCIO EN EL ARRAY
		this.pedidos.add(pedidoNegocio);
		
		//SE CREA PEDIDO TEMPORAL DE DATOS
		datos.Pedido pedidoDatos = new datos.Pedido();
		
		//SE SETEAN LOS DATOS DEL PEDIDO
		pedidoDatos.setFecha(pedidoNegocio.getFecha());
		pedidoDatos.setEstado(pedidoNegocio.getEstado());
		pedidoDatos.setTotal(pedidoNegocio.getTotal());
		
		
		{//SETEO DEL CLIENTE
			
			//SE CREA UN CLIENTE DE DATOS PARA SETEOS DE
			//DE LOS DATOS NECESARIOS
			datos.Cliente clienteDatos = new datos.Cliente();
			
			//SE SETEAN LOS DATOS
			clienteDatos.setIdCliente(pedidoNegocio.getCliente().getIdCliente());
		}
		
		{//SETEO DE LAS LINEAS DEL PEDIDO
			//SE CREA UN ARRAY DE LINEAS DE PEDIDO DE DATOS
			//PARA SETEAR EL ARRAY DEL PEDIDO DE DATOS
			Collection<datos.LineaDePedido> arrayLineasDatos = new ArrayList<datos.LineaDePedido>();
			
			//SE RECORRE CADA LINEA DE PEDIDO DE NEGOCIO
			for(negocio.LineaDePedido lineaNegocio : pedidoNegocio.getLineas())
			{
				//SE CREA UN OBJETO LINEA DE DATOS PARA DESPUES AGREGARLO 
				//AL ARRAY
				datos.LineaDePedido lineaDatos = new datos.LineaDePedido();
				
				//SE SETEAN LOS DATOS
				lineaDatos.setCantidadPedida(lineaNegocio.getCantidadPedida());
				
				//SE CREA UN PRODUCTO DE DATOS PARA SETEO
				datos.Producto productoDatos = new datos.Producto();
				productoDatos.setIdProducto(lineaNegocio.getProducto().getIdProducto());
				
				lineaDatos.setProducto(productoDatos);				
				lineaDatos.setSubTotal(lineaNegocio.getSubTotal());
				
				//SE AGREGA LA LINEA DE DATOS SETEA AL ARRAY
				arrayLineasDatos.add(lineaDatos);
			}
			
			//SE SETEA EL ARRAY DE LINEAS EN EL PEDIDO
			pedidoDatos.setLineas(arrayLineasDatos);
		}
		
		//SE CREA CATALOGO DE PEDIDOS DE DATOS PARA GUARDAR EL NUEVO PEDIDO
		datos.CatalogoPedidos ctgPedidosDatos = new datos.CatalogoPedidos();
		
		//SE GUARDA EL PEDIDO
		ctgPedidosDatos.agregarPedido(pedidoDatos);
	}
	//---------------------------------------------------------------

}
