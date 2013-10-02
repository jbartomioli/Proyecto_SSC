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
