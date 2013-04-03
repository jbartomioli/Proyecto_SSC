package datos;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoCategorias 
{
	//ATRIBUTOS
	private Collection<datos.Categoria> categorias;

	
	//CONSTRUCTOR
	public CatalogoCategorias() 
	{
		this.categorias = new ArrayList<datos.Categoria>();
	}


	//GETTER & SETTERS
	public Collection<datos.Categoria> getCategorias() 
	{
		return categorias;
	}

	public void setCategorias(Collection<datos.Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	
	//METODOS
	//----------------------------------------------------------
}
