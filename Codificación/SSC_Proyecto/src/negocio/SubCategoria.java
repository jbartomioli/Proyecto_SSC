package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class SubCategoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idSubcategoria;
	private String descripcion;
	private Collection<negocio.Producto> productos;
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.descripcion = "";
		this.productos = new ArrayList<negocio.Producto>();
	}
	//---------------------------------------------------------------


	
	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************	
	public int getIdSubcategoria() 
	{
		return idSubcategoria;
	}

	public void setIdSubcategoria(int idSubcategoria) 
	{
		this.idSubcategoria = idSubcategoria;
	}

	public String getDescripcion() 
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}

	public Collection<Producto> getProductos() 
	{
		return productos;
	}

	public void setProductos(Collection<Producto> productos) 
	{
		this.productos = productos;
	}
	//---------------------------------------------------------------



	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	public void obtenerProductos()
	{
		//se crea una instancia de cliente de datos
		datos.SubCategoria subcategoriaDatos = new datos.SubCategoria();
		
		//se setean las ventas del cliente de datos
		subcategoriaDatos.obtenerProductos(this.idSubcategoria);
		
		//se obtiene cada venta del cliente de datos
		//para luego agregarlas al cliente de negocio
		for(datos.Producto P: subcategoriaDatos.getProductos())
		{
			negocio.Producto productoNegocio = new negocio.Producto();
			
			//seteos
        	productoNegocio.setCodProducto(P.getCodProducto());
        	productoNegocio.setExistenciaStock(P.getExistenciaStock());
        	productoNegocio.setIdProducto(P.getIdProducto());
        	productoNegocio.setNombre(P.getNombre());		
        	
        	//
			this.productos.add(productoNegocio);
		}
		
	}
	//---------------------------------------------------------------
}

