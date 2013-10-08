package datos;

import java.util.ArrayList;
import java.util.Collection;

public class SubCategoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idSubcategoria;
	private String descripcion;
	private datos.Categoria categoria;
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.descripcion = "";
		this.categoria = new datos.Categoria();
		this.productos = new ArrayList<datos.Producto>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(int idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public datos.Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(datos.Categoria categoria) {
		this.categoria = categoria;
	}

	public Collection<datos.Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<datos.Producto> productos) {
		this.productos = productos;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 			   //
	/////////////////////////////////////////////////////////////////
	//---------------------------------------------------------------

}
