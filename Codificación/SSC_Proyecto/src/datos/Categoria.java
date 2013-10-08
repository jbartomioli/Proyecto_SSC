package datos;

import java.util.ArrayList;
import java.util.Collection;


public class Categoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idCategoria;
	private String descripcion;
	private Collection<datos.SubCategoria> subCategorias;
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCategorias = new ArrayList<datos.SubCategoria>();
		this.productos = new ArrayList<datos.Producto>();
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
	
	public Collection<datos.SubCategoria> getSubCat() 
	{
		return subCategorias;
	}
	
	public void setSubCat(Collection<datos.SubCategoria> subCat) 
	{
		this.subCategorias = subCat;
	}
	
	public Collection<datos.Producto> getProducto() 
	{
		return productos;
	}
	
	public void setProducto(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	//   //
	/////////////////////////////////////////////////////////////////
	
}
