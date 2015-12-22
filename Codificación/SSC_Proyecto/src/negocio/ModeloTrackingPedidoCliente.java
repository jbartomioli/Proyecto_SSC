package negocio;




public class ModeloTrackingPedidoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
//	private negocio.CatalogoClientes catalogoClientes;
//	private negocio.CatalogoPedidos catalogoPedidos;
	//---------------------------------------------------------------

	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ModeloTrackingPedidoCliente() throws Exception 
	{
//		this.catalogoClientes = new negocio.CatalogoClientes();	
//		this.catalogoPedidos = new negocio.CatalogoPedidos();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
//	public negocio.CatalogoClientes getCatalogoClientes() {
//		return catalogoClientes;
//	}
//
//
//	public void setCatalogoClientes(negocio.CatalogoClientes catalogoClientes) {
//		this.catalogoClientes = catalogoClientes;
//	}
//
//
//
//	public negocio.CatalogoPedidos getCatalogoPedidos() {
//		return catalogoPedidos;
//	}
//
//
//	public void setCatalogoPedidos(negocio.CatalogoPedidos catalogoPedidos) {
//		this.catalogoPedidos = catalogoPedidos;
//	}



	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
//	public void inicializarCatalogos() throws Exception
//	{
//		catalogoClientes.obtenerClientes();	
//	}
//	
	
	

	/**
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	public String iniciarSesion(String user, String password)
	{
		negocio.Userdetail usuarioNegocio = new negocio.Userdetail();
		
		try
		{
			usuarioNegocio.obtenerUser(user, password);
			
			if(usuarioNegocio.getName().equals(""))
				return null;
			else
				return usuarioNegocio.getName();			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	


}
