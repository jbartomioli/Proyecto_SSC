package negocio;

import java.util.Collection;




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
	public negocio.CatalogoClientes getCatalogoClientes() {
		return catalogoClientes;
	}


	public void setCatalogoClientes(negocio.CatalogoClientes catalogoClientes) {
		this.catalogoClientes = catalogoClientes;
	}

	public negocio.Userdetail getUsuario() {
		return usuario;
	}


	public void setUsuario(negocio.Userdetail usuario) {
		this.usuario = usuario;
	}

	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	public void inicializarCatalogos() throws Exception
	{
		catalogoClientes.obtenerClientes();	
	}
	
	
	

	/**
	 * 
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
	
	
	
	public Collection<negocio.Pedido> obtenerPedidos()
	{
		
		//negocio.Cliente clienteActual = new negocio.Cliente();
//		this.cliente.setIdCliente(idCliente);
		
		try 
		{
			if(this.cliente.getPedidos().isEmpty())
			{
				this.cliente.obtenerPedidos();
			}
			
			return cliente.getPedidos();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}


		
		/**
		 * 
		 */
		public void cerrarSesion()
		{
			this.usuario = new Userdetail();
			this.cliente = new Cliente(); 
			
//			return "<h2>Salida exitosa</h2>";
		}
		
}
