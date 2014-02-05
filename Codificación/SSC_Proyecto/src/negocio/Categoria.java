package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Categoria 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idCategoria;
	private String descripcion;
	private Collection<negocio.SubCategoria> subCategorias;   
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCategorias = new ArrayList<negocio.SubCategoria>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdCategoria() 
	{
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}	
	
	public Collection<SubCategoria> getSubCats() 
	{
		return subCategorias;
	}
	
	public void setSubCats(Collection<SubCategoria> subCat) 
	{
		this.subCategorias = subCat;
	}

	//---------------------------------------------------------------

	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 	OBTIENE LAS SUBCATEGORIAS DE UNA CATEGORIA ESPECIFICA      //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerSubCategorias() 
	{
		//SE CREA OBJETO CATEGORIA DE DATOS PARA OBTENER DATOS DE LA BD
		datos.Categoria categoriaDatos = new datos.Categoria();
		
		//SE OBTIENEN LAS SUBCATEGORIAS DE LA CATEGORIA SELECCIONADA
		categoriaDatos.obtenerSubCategorias(this.idCategoria);
		
		//SE RECORRE CADA SUBCATEGORIA RESULTANTE DE LA CONSULTA A 
		//LA BD PARA LUEGO SETEAR DATOS 
		for(datos.SubCategoria subcategoriaDatos: categoriaDatos.getSubCats())
		{
			//SE CREA OBJETO SUBCATEGORIA DE NEGOCIO PARA SETEOS DE DATOS
			negocio.SubCategoria subCategoriaNegocio = new negocio.SubCategoria();
			
			//SETEOS DE DATOS DE LA SUBCATEGORIA
			subCategoriaNegocio.setIdSubcategoria(subcategoriaDatos.getIdSubcategoria());
			subCategoriaNegocio.setDescripcion(subcategoriaDatos.getDescripcion());
			
			//SE AGREGA LA SUBCATEGORIA EN EL ARRAY
			this.subCategorias.add(subCategoriaNegocio);
		}
		
	}
	//---------------------------------------------------------------
}
