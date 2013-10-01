package negocio;

import java.util.Collection;

public class SubCategoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idSubcategoria;
	private String descripcion;
	private Collection<negocio.Producto> producto;
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.descripcion = "";
		this.producto = null;
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
		return producto;
	}

	public void setProducto(Collection<Producto> producto) 
	{
		this.producto = producto;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	
	//---------------------------------------------------------------
}

