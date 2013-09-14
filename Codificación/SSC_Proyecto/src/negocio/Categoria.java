package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Categoria 
{
	//ATRIBUTOS
	private int idCategoria;
	private String descripcion;
	private Collection<negocio.SubCategoria> subCats;   
	private Collection<negocio.Producto> productos; 
	

	//CONSTRUCTOR
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCats = new ArrayList<negocio.SubCategoria>();
		this.productos = new ArrayList<negocio.Producto>();
	}
	
	
	//GETTER & SETTER
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
	
	public Collection<Producto> getProductos() 
	{
		return productos;
	}
	
	public void setProductos(Collection<Producto> productos) 
	{
		this.productos = productos;
	}
	
	
	//METODOS
	//--------------------------------------------------------------------------
}
