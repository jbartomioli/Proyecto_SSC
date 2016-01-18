package negocio;

import java.util.ArrayList;
import java.util.Collection;

/**
 * CLASE MODELO: SEGUIMIENTO DE PEDIDOS
 * 
 * @author Javier Bartomioli - Rodrigo Naredo
 * @version 1.01.20160118
 *
 */
public class ModeloTrackingPedidoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.Userdetail usuario;
	private negocio.Cliente cliente;
	private negocio.CatalogoClientes catalogoClientes;
	//---------------------------------------------------------------

	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ModeloTrackingPedidoCliente()
	{
		this.usuario = new negocio.Userdetail();
		this.cliente = new negocio.Cliente();
		this.catalogoClientes = new negocio.CatalogoClientes();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.CatalogoClientes getCatalogoClientes()
	{
		return catalogoClientes;
	}


	public void setCatalogoClientes(negocio.CatalogoClientes catalogoClientes) 
	{
		this.catalogoClientes = catalogoClientes;
	}

	public negocio.Userdetail getUsuario() 
	{
		return usuario;
	}


	public void setUsuario(negocio.Userdetail usuario)
	{
		this.usuario = usuario;
	}

	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	/**
	 * INICIALIZA CATALGOS DEL MODELO
	 * @throws Exception
	 */
	public void inicializarCatalogos() throws Exception
	{
		catalogoClientes.obtenerClientes();	
	}
	
	

	/**
	 * INICIA LA SESION EN EL SERVIDOR
	 * @param user
	 * @param password
	 * @return
	 */
	public boolean iniciarSesion(String user, String password)
	{
		negocio.Userdetail usuarioNegocio = new negocio.Userdetail();
		
		try
		{
			usuarioNegocio.obtenerUser(user, password);
			
			if(usuarioNegocio.getName().equals(""))
				return false;
			else
			{
				this.usuario = new Userdetail();
				this.cliente = new negocio.Cliente();
				
				this.usuario.setName(usuarioNegocio.getName());
				this.usuario.setUsername(usuarioNegocio.getUsername());
				this.usuario.setPassword(usuarioNegocio.getPassword());
				this.usuario.setIdCliente(usuarioNegocio.getIdCliente());
				
				this.cliente = catalogoClientes.buscarCliente(usuarioNegocio.getIdCliente());
								
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * RECUPERA LOS PEDIDOS DEL CLIENTE Y LOS DEVUELVE AL CONTROLADOR
	 * @return
	 * @throws Exception
	 */
	public Collection<negocio.Pedido> obtenerPedidos() throws Exception
	{
		if(this.cliente.getPedidos().isEmpty())
		{
			this.cliente.obtenerPedidos();
		}
		
		return cliente.getPedidos();
	}
	///////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * BUSCA UN PEDIDO EN BASE A SU CODIGO
	 * @param codPedido
	 * @return
	 */
	public Collection<Pedido> buscarPedidos(String codPedido) 
	{
		Collection<Pedido> pedidos = new ArrayList<Pedido>();
		
		for(Pedido pedidoActual : this.cliente.getPedidos())
		{
			if(pedidoActual.getCodPedido().contains(codPedido))
				pedidos.add(pedidoActual);
		}
		
		return pedidos;
	}
	////////////////////////////////////////////////////////////
}
