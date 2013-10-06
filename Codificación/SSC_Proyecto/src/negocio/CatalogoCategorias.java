package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CatalogoCategorias 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.Categoria> categorias;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoCategorias() 
	{
		categorias = new ArrayList<negocio.Categoria>();
		this.obtenerCategorias();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Categoria> getCategorias()
	{
		return categorias;
	}

	public void setCategorias(Collection<negocio.Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// Seteo del array de categorias a partir de la capa de datos  //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerCategorias()
	{
		//se crea un objeto catalogocategorias de datos
		datos.CatalogoCategorias ctgDatos = new datos.CatalogoCategorias();
		
		//se inicializa el array de clientes del catalogo
		categorias = new ArrayList<negocio.Categoria>();
			
		
		Iterator <datos.Categoria> it = ctgDatos.getCategorias().iterator();
		
		while(it.hasNext())
		{
			datos.Categoria datosCategoria = it.next();
			
			negocio.Categoria categoriaNegocio = new negocio.Categoria();			
			
			categoriaNegocio.setIdCategoria(datosCategoria.getIdCategoria());
			categoriaNegocio.setDescripcion(datosCategoria.getDescripcion());
			
			categorias.add(categoriaNegocio);
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Busca una categoria por su idCategoria y la devuelve        //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Categoria buscarCategoria(int idCategoria)
	{
		for(negocio.Categoria CTG: this.categorias)
		{
			if(CTG.getIdCategoria() == idCategoria)
				return CTG;
		}
		return null;
	}
	//---------------------------------------------------------------

}
