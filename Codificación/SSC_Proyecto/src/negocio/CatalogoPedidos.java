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
	public void agregarPedido(negocio.Pedido pedidoTemporal)
	{
		//SE AGREGA EL ANUNCIO EN EL ARRAY
		this.pedidos.add(pedidoTemporal);
		
		//SE CREA PEDIDO TEMPORAL DE DATOS
		datos.Pedido pedidoTempDatos = new datos.Pedido();
		
		//SE SETEAN LOS DATOS DEL PEDIDO
		pedidoTempDatos.setFecha(pedidoTemporal.getFecha());
		pedidoTempDatos.setEstado(pedidoTemporal.getEstado());
		pedidoTempDatos.setTotal(pedidoTemporal.getTotal());
		
		
		//SETEO DEL CLIENTE
		//SETEO DE LAS LINEAS DEL PEDIDO
		
		//SE CREA CATALOGO DE PEDIDOS DE DATOS PARA GUARDAR EL NUEVO PEDIDO
		datos.CatalogoPedidos ctgPedidosDatos = new datos.CatalogoPedidos();
		
		//SE GUARDA EL PEDIDO
		ctgPedidosDatos.agregarPedido(pedidoTempDatos);
	}
	//---------------------------------------------------------------

}
