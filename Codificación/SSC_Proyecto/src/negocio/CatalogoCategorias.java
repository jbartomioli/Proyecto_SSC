package negocio;

import java.util.ArrayList;
import java.util.Collection;

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
	// SE OBTIENEN TODAS LA CATEGORIAS DE LA BD					   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerCategorias() throws Exception
	{
		//SE CREA OBJETO CATALOGO CATEGORIAS DE DATOS PARA RECUPERAR DATOS
		datos.CatalogoCategorias ctgDatos = new datos.CatalogoCategorias();
		
		//SE OBTIENEN TODAS LAS CATEGORIAS DE LA BD
		ctgDatos.obtenerCategorias();			
		
		//SE RECORRE CADA CATEGORIA DEL ARRAY
		for(datos.Categoria categoriaDatos : ctgDatos.getCategorias())
		{
			//SE CREA OBJETO CATEGORIA DE NEGOCIO PARA DESPUES AGREGARLO AL ARRAY
			negocio.Categoria categoriaNegocio = new negocio.Categoria();			
			
			//SE SETEA LA CATEGORIA DE NEGOCIO
			categoriaNegocio.setIdCategoria(categoriaDatos.getIdCategoria());
			categoriaNegocio.setDescripcion(categoriaDatos.getDescripcion());
			
			//SE AGREGA AL ARRAY
			categorias.add(categoriaNegocio);
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// BUSCA UNA CATEGORIA POR SU ID Y LA DEVUELVE		           //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Categoria buscarCategoria(int idCategoria)
	{
		//SE RECORRE CADA CATEGORIA DEL ARRAY
		for(negocio.Categoria categoriaNegocio: this.categorias)
		{
			//COMPARA LAS CATEGORIAS POR SU ID
			//SI SON IGUALES DEVUELVE LA CATEGORIA
			if(categoriaNegocio.getIdCategoria() == idCategoria)
				return categoriaNegocio;
		}
		//EN CASO DE NO ENCONTRARLA DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------

}
