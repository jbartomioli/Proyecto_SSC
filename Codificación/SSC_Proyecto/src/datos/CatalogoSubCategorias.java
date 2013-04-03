package datos;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoSubCategorias 
{
	//ATRIBUTOS
	private Collection<datos.SubCategoria> subcategorias;

	
	//CONSTRUCTOR
	public CatalogoSubCategorias() 
	{
		this.subcategorias = new ArrayList<datos.SubCategoria>();
	}


	//GETTERS & SETTERS
	public Collection<datos.SubCategoria> getSubcategorias() 
	{
		return subcategorias;
	}


	public void setSubcatgorias(Collection<datos.SubCategoria> subcategorias) 
	{
		this.subcategorias = subcategorias;
	}
	
	
	//METODOS
	//----------------------------------------------------------
	
	
}
