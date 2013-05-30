package negocio;

import java.util.Collection;

public class Categoria 
{
	//ATRIBUTOS
	private int idCategoria;
	private String descripcion;
	private Collection<negocio.SubCategoria> subCat;   // ARMAR COLECCIONES
	private Collection<negocio.Producto> producto; // ARMAR COLECCIONES
	

	//CONSTRUCTOR
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCat = null;
		this.producto = null;
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
	
	
	public Collection<SubCategoria> getSubCat() 
	{
		return subCat;
	}
	
	public void setSubCat(Collection<SubCategoria> subCat) 
	{
		this.subCat = subCat;
	}
	
	public Collection<Producto> getProducto() 
	{
		return producto;
	}
	
	public void setProducto(Collection<Producto> producto) 
	{
		this.producto = producto;
	}
	
	
	//METODOS
	//--------------------------------------------------------------------------
}
