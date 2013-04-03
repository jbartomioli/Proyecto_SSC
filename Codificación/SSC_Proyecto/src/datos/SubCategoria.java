package datos;

import java.util.ArrayList;
import java.util.Collection;

public class SubCategoria 
{
	//ATRIBUTOS
	int idSubcategoria;
	int idCategoria;
	String descripcion;
	private Collection<datos.Producto> productos;
	
	
	//CONSTRUCTOR
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.idCategoria = 0;
		this.descripcion = "";
		this.productos = new ArrayList<datos.Producto>();
	}


	//GETTER & SETTERS
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


	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}


	public int getIdCategoria() 
	{
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}
	
	//METODOS
	//----------------------------------------------------------
	

}
