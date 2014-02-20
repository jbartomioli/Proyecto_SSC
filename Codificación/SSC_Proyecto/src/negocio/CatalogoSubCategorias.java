package negocio;

import java.util.ArrayList;
import java.util.Collection;


public class CatalogoSubCategorias 
{

	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.SubCategoria> subcategorias;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoSubCategorias() 
	{
		this.subcategorias = new ArrayList<negocio.SubCategoria>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.SubCategoria> getSubcategorias() 
	{
		return subcategorias;
	}

	public void setSubcatgorias(Collection<negocio.SubCategoria> subcategorias) 
	{
		this.subcategorias = subcategorias;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODAS LA SUBCATEGORIAS DE LA BD					   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerSubCategorias()
	{
		//SE CREA OBJETO CATALOGO SUBCATEGORIAS DE DATOS PARA RECUPERAR DATOS DE LA BD
		datos.CatalogoSubCategorias ctgDatos = new datos.CatalogoSubCategorias();
		
		//SE OBTIENEN TODAS LAS SUBCATEGORIAS DE LA BD
		ctgDatos.obtenerSubCategorias();
			
		//SE RECORRE CADA SUBCATEGORIA DEL ARRAY
		for(datos.SubCategoria subcategoriaDatos : ctgDatos.getSubcategorias())
		{
			//SE CREA OBJETO SUBCATEGORIA DE NEGOCIO PARA DESPUES AGREGARLO AL ARRAY	
			negocio.SubCategoria subCategoriaNegocio = new negocio.SubCategoria();			
			
			//SE SETEAN LOS DATOS DE LA SUBCATEGORIA
			subCategoriaNegocio.setIdSubcategoria(subcategoriaDatos.getIdSubcategoria());
			subCategoriaNegocio.setIdcategoria(subcategoriaDatos.getIdcategoria());
			subCategoriaNegocio.setDescripcion(subcategoriaDatos.getDescripcion());
			
			//SE AGREGA LA SUBCATEGORIA AL ARRAY
			subcategorias.add(subCategoriaNegocio);
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// DEVUELVE UNA SUBCATEGORIA SEGUN EL ID SELECCIONADO          //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.SubCategoria buscarSubCategoria(int idCategoria, int idSubCategoria)
	{
		//SE RECORRE CADA SUBCATEGORIA DEL ARRAY
		for(negocio.SubCategoria subcategoriaNegocio: this.subcategorias)
		{
			//COMPARA LAS SUBCATEGORIAS POR SU ID
			//SI LA ENCUENTRA LA DEVUELVE
			if(subcategoriaNegocio.getIdSubcategoria() == idSubCategoria
					&& subcategoriaNegocio.getIdcategoria() == idCategoria)
				return subcategoriaNegocio;
		}
		//SI NO LA ENCUENTRA DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------
}
