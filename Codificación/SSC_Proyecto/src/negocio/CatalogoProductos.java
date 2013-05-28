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
	
	//Busca producto por id
	public negocio.Producto buscarProducto(int idProducto)
	{
		return null;
	}
	//*************************************************************

	//Busca producto por descripcion parcial
	public negocio.Producto buscarProducto(String descParcial)
	{
		return null;
	}
	//*************************************************************
	
	//Actualiza la cantidad de productos en stock
	public void actualizarStock(negocio.Producto P, int cantidad)
	{
		for(negocio.Producto PA: this.productos)
		{
			if (PA.getIdProducto() == P.getIdProducto())
			{
				int stock = 0;
				int nuevoStock = 0;
				
				stock = PA.getExistenciaStock();
				
				nuevoStock = stock - cantidad;
				
				PA.setExistenciaStock(nuevoStock);
				
				//Guardar en BD
			}
		}
	}
	//*************************************************************
	
	//Actualizar precio promocional de un producto
	public void actualizarPrecioPromProducto(negocio.Producto productoModificar,float nuevoPrecio)
	{
		productoModificar.setPrecioPromocional(nuevoPrecio);
	}

}