package datos;

import java.util.ArrayList;
import java.util.Collection;

public class Categoria 
{
	//ATRIBUTOS
	int idCategoria;
	private Collection<datos.SubCategoria> subCats;
	private Collection<datos.Producto> productos;
	
	
	//CONSTRUCTOR
	public Categoria() 
	{
		this.idCategoria = 0;
		this.subCats = new ArrayList<datos.SubCategoria>();
		this.productos = new ArrayList<datos.Producto>();
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
	
	public Collection<datos.SubCategoria> getSubCats() 
	{
		return subCats;
	}
	
	public void setSubCats(Collection<datos.SubCategoria> subCats) 
	{
		this.subCats = subCats;
	}
	
	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}
	
	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}
}
