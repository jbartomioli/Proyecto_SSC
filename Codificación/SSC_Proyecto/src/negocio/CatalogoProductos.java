package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoProductos 
{
	//ATRIBUTOS
	private Collection <negocio.Producto> productos;
	
	
	//CONSTRUCTOR
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<negocio.Producto>();
	}


	//GETTER & SETTER
	public Collection<negocio.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<negocio.Producto> productos) 
	{
		this.productos = productos;
	}


	//METODOS
	//-------------------------------------------------------------
	public negocio.Producto buscarProducto(int idProducto)
	{
		return null;
	}

}