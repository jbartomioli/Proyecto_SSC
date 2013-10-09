package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
		this.obtenerSubCategorias();
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
	//	//
	/////////////////////////////////////////////////////////////////
	public void obtenerSubCategorias()
	{
		//
		datos.CatalogoSubCategorias ctgDatos = new datos.CatalogoSubCategorias();
		
		//
		subcategorias = new ArrayList<negocio.SubCategoria>();
			
		Iterator <datos.SubCategoria> it = ctgDatos.getSubcategorias().iterator();
		
		while(it.hasNext())
		{
			datos.SubCategoria datosSubCategoria = it.next();
			
			negocio.SubCategoria subCategoriaNegocio = new negocio.SubCategoria();			
			
			subCategoriaNegocio.setIdSubcategoria(datosSubCategoria.getIdSubcategoria());
			subCategoriaNegocio.setDescripcion(datosSubCategoria.getDescripcion());
			//
			
			subcategorias.add(subCategoriaNegocio);
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Devuelve la subcategoria correspondiente al id seleccionado //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.SubCategoria buscarSubCategoria(int idSubCategoria)
	{
		for(negocio.SubCategoria SCTG: this.subcategorias)
		{
			if(SCTG.getIdSubcategoria() == idSubCategoria)
				return SCTG;
		}
		return null;
	}
	//---------------------------------------------------------------
}
