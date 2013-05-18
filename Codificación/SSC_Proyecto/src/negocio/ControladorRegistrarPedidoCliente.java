package negocio;

import java.util.ArrayList;


public class ControladorRegistrarPedidoCliente 
{
	//ATRIBUTOS
	datos.CatalogoClientes cc;
	datos.CatalogoProductos cp;
	datos.CatalogoPedidos cpe;
	datos.Pedido PCTemporal;
	
	
	//CONSTRUCTOR
	public ControladorRegistrarPedidoCliente() 
	{
		this.cc = new datos.CatalogoClientes();
		this.cp = new datos.CatalogoProductos();
		this.cpe = new datos.CatalogoPedidos();
		PCTemporal = new datos.Pedido();
	}


	//GETTER & SETTER
	public datos.CatalogoClientes getCc() 
	{
		return cc;
	}


	public void setCc(datos.CatalogoClientes cc) 
	{
		this.cc = cc;
	}


	public datos.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(datos.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public datos.CatalogoPedidos getCpe() 
	{
		return cpe;
	}


	public void setCpe(datos.CatalogoPedidos cpe) 
	{
		this.cpe = cpe;
	}


	public datos.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(datos.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
	
	
	//METODOS
	
	//Metodo 3.1.1
	public ArrayList<String> buscarCliente(int idCliente)
	{
		return null;
	}
	
	
	//Metodo 3.1.2
	public ArrayList<String> buscarCliente(String apellido, String nombre)
	{
		return null;
	}
	
	
	//Metodo 3.2.1
	public ArrayList<String> seleccionarProducto(int idProdcuto, int cantidad)
	{
		return null;
	}
	
	
	//Metodo 3.2.2
	public ArrayList<String> buscarProducto(String descParcial, int cantidad)
	{
		return null;
	}
	
	
	//Metodo 3.3.1
	public ArrayList<String> pedidoCompleto()
	{
		return null;
	}
	
	
	//Metodo 3.5
	public boolean eliminarProducto(int idProducto)
	{
		return true;
	}	

	
	//Metodo 3.6.1 - 3.6.3.1
	public ArrayList<String> seleccionarProducto(int idProducto)
	{
		return null;
	}
	
	
	//Metodo 3.6.2
	public boolean modificarCantidad(int nuevaCantidad)
	{
		return true;
	}
	
	
	//Metodo 3.6.3.2
	public ArrayList<String> seleccionarNuevoProducto(String descParcial)
	{
		return null;
	}
	
	
	//Metodo 3.6.4
	public boolean ingresarCantidad(int cantidad)
	{
		return true;
	}
	
}
