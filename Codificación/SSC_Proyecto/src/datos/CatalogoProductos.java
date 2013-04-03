package datos;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoProductos 
{
	//ATRIBUTOS
	private Collection <datos.Producto> productos;
	
	
	//CONSTRUCTOR
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<datos.Producto>();
	}


	//GETTER & SETTER
	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}
}
