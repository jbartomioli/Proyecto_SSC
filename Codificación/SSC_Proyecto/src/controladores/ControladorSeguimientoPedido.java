package controladores;

import java.util.Collection;

import negocio.ModeloTrackingPedidoCliente;


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
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean iniciarSesion(String user, String password)
	{
		return modeloTrackingPedido.iniciarSesion(user, password);
	}
	



	public Collection<negocio.Pedido> obtenerPedidos()
	{
		return modeloTrackingPedido.obtenerPedidos();
	}
	
	public void cerrarSesion()
	{
		modeloTrackingPedido.cerrarSesion();
		modeloTrackingPedido = new ModeloTrackingPedidoCliente();
		
//		if(modeloTrackingPedido.equals(null))
//		{
//			return true;
//		}
		
	}

}
