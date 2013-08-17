package negocio;

import java.util.ArrayList;


public class ControladorRegistrarPedidoCliente 
{
	//ATRIBUTOS
	private negocio.CatalogoClientes cc;
	private negocio.CatalogoProductos cp;
	private negocio.CatalogoPedidos cpe;
	private negocio.Pedido PCTemporal;
	
	
	//CONSTRUCTOR
	public ControladorRegistrarPedidoCliente() 
	{
		this.cc = new negocio.CatalogoClientes();
		this.cp = new negocio.CatalogoProductos();
		this.cpe = new negocio.CatalogoPedidos();
		this.PCTemporal = new negocio.Pedido();
	}


	//GETTER & SETTER
	public negocio.CatalogoClientes getCc() 
	{
		return cc;
	}


	public void setCc(negocio.CatalogoClientes cc) 
	{
		this.cc = cc;
	}


	public negocio.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(negocio.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public negocio.CatalogoPedidos getCpe() 
	{
		return cpe;
	}


	public void setCpe(negocio.CatalogoPedidos cpe) 
	{
		this.cpe = cpe;
	}


	public negocio.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(negocio.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
	
	
	//METODOS
	//////////////////
	//Metodo 3.1.1 ///
	//////////////////
	//FALTA
	public ArrayList<String> buscarCliente(int idCliente)
	{
		negocio.Pedido PCTemporal = new negocio.Pedido();

		return null;
	}
	
	/////////////////
	//Metodo 3.1.2 //
	/////////////////
	//FALTA
	public ArrayList<String> buscarCliente(String apellido, String nombre)
	{
		
		return null;
	}
	
	/////////////////
	//Metodo 3.2.1 //
	/////////////////
	//FALTA
	public ArrayList<String> seleccionarProducto(int idProdcuto, int cantidad)
	{
		return null;
	}
	
	
	/////////////////
	//Metodo 3.2.2 //
	/////////////////
	//FALTA
	public ArrayList<String> buscarProducto(String descParcial, int cantidad)
	{
		return null;
	}
	
	/////////////////
	//Metodo 3.3.1 //
	/////////////////
	//FALTA	
	public ArrayList<String> pedidoCompleto()
	{
		return null;
	}
	
	////////////////
	// Metodo 3.5 //
	////////////////
	//FALTA
	public boolean eliminarProducto(int idProducto)
	{
		return true;
	}	

	////////////////////////////
	// Metodo 3.6.1 - 3.6.3.1 //
	////////////////////////////
	//FALTA
	public ArrayList<String> seleccionarProducto(int idProducto)
	{
		return null;
	}
	
	//////////////////
	// Metodo 3.6.2 //
	//////////////////
	//FALTA
	public boolean modificarCantidad(int nuevaCantidad)
	{
		return true;
	}
	
	////////////////////
	// Metodo 3.6.3.2 //
	////////////////////
	//FALTA
	public ArrayList<String> seleccionarNuevoProducto(String descParcial)
	{
		return null;
	}
	
	//////////////////
	// Metodo 3.6.4 //
	//////////////////
	//FALTA
	public boolean ingresarCantidad(int cantidad)
	{
		return true;
	}
	
}
