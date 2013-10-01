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
	// 															   //
	/////////////////////////////////////////////////////////////////
	//FALTA
	public negocio.SubCategoria buscarSubCategoria(int idSubCategoria)
	{
		return null;
	}
	//---------------------------------------------------------------
}
