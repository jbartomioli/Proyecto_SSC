package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoProductos 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection <negocio.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoProductos() 
	{
		this.productos = new ArrayList<negocio.Producto>();
		this.obtenerProductos();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Producto> getProductos() 
	{
		return productos;
	}

	public void setProductos(Collection<negocio.Producto> productos) 
	{
		this.productos = productos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	//	//
	/////////////////////////////////////////////////////////////////
	public void obtenerProductos()
	{
		datos.CatalogoProductos ctgDatos = new datos.CatalogoProductos();				
			
		for(datos.Producto productoDato: ctgDatos.getProductos())
		{
			negocio.Producto productoNegocio = new negocio.Producto();
			
			productoNegocio.setCodProducto(productoDato.getCodProducto());
			productoNegocio.setExistenciaStock(productoDato.getExistenciaStock());
			productoNegocio.setIdProducto(productoDato.getIdProducto());
			productoNegocio.setNombre(productoDato.getNombre());
			//productoNegocio.setPrecio(productoDato.getPrecio);
			//productoNegocio.setPrecioPromocional();
			//productoNegocio.setSubCategoria(productoDato.getSubcategoria());
			
			productos.add(productoNegocio);
		}

	}
	//---------------------------------------------------------------
	
	
	
	
	/////////////////////////////////////////////////////////////////
	//Busca producto por id										   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Producto buscarProducto(int idProducto)
	{
		for(negocio.Producto P: this.getProductos())
		{
			if(P.getIdProducto() == idProducto)
				return P;
		}
		return null;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	// Busca producto por descripcion parcial 					   //
	/////////////////////////////////////////////////////////////////
	//VER TEMA DESCRIPCION PARCIAL
	public negocio.Producto buscarProducto(String descParcial)
	{
		for(negocio.Producto P: this.getProductos())
		{
			if(P.getNombre().equals(descParcial))
				return P;
		}
		return null;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//Actualiza la cantidad de productos en stock				   //
	/////////////////////////////////////////////////////////////////
	//FALTA CAPA DATOS
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
	//---------------------------------------------------------------


	/////////////////////////////////////////////////////////////////
	//Actualizar precio promocional de un producto				   //
	/////////////////////////////////////////////////////////////////
	//VA EN EL CATALOGO???
	public void actualizarPrecioPromProducto(negocio.Producto productoModificar,float nuevoPrecio)
	{
		for(negocio.Producto P : this.productos)
		{
			if(P.getIdProducto()==productoModificar.getIdProducto())
				P.setPrecioPromocional(nuevoPrecio);
		}
	}
	//---------------------------------------------------------------

}