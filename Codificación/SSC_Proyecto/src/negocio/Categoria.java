package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Categoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idCategoria;
	private String descripcion;
	private Collection<negocio.SubCategoria> subCats;   
	//private Collection<negocio.Producto> productos; 
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCats = new ArrayList<negocio.SubCategoria>();
		//this.productos = new ArrayList<negocio.Producto>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdCategoria() 
	{
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}	
	
	public Collection<SubCategoria> getSubCats() 
	{
		return subCats;
	}
	
	public void setSubCats(Collection<SubCategoria> subCat) 
	{
		this.subCats = subCat;
	}
	
//	public Collection<Producto> getProductos() 
//	{
//		return productos;
//	}
//	
//	public void setProductos(Collection<Producto> productos) 
//	{
//		this.productos = productos;
//	}
	//---------------------------------------------------------------

	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//
	public void obtenerSubCategorias() 
	{
		//se crea una instancia de cliente de datos
		datos.Categoria categoriaDatos = new datos.Categoria();
		
		//se setean las ventas del cliente de datos
		categoriaDatos.obtenerSubCategorias(this.idCategoria);
		
		//se obtiene cada venta del cliente de datos
		//para luego agregarlas al cliente de negocio
		for(datos.SubCategoria SC: categoriaDatos.getSubCats())
		{
			negocio.SubCategoria subCategoriaNegocio = new negocio.SubCategoria();
			
			//seteos
			subCategoriaNegocio.setIdSubcategoria(SC.getIdSubcategoria());
			subCategoriaNegocio.setDescripcion(SC.getDescripcion());
			
			this.subCats.add(subCategoriaNegocio);
		}
		
	}
	//---------------------------------------------------------------
}
