package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class ControladorModificarPrecios 
{
	
	private negocio.CatalogoProductos catalogoProductos;
	private negocio.CatalogoCategorias catalogoCategorias;
	private negocio.CatalogoSubCategorias catalogoSubcategorias;

	
	
	public negocio.CatalogoSubCategorias getCatalogoSubcategorias() {
		return catalogoSubcategorias;
	}


	public void setCatalogoSubcategorias(
			negocio.CatalogoSubCategorias catalogoSubcategorias) {
		this.catalogoSubcategorias = catalogoSubcategorias;
	}


	public negocio.CatalogoProductos getCatalogoProductos() {
		return catalogoProductos;
	}


	public void setCatalogoProductos(negocio.CatalogoProductos catalogoProductos) {
		this.catalogoProductos = catalogoProductos;
	}


	public negocio.CatalogoCategorias getCatalogoCategorias() {
		return catalogoCategorias;
	}


	public void setCatalogoCategorias(negocio.CatalogoCategorias catalogoCategorias) {
		this.catalogoCategorias = catalogoCategorias;
	}



	public ControladorModificarPrecios() 
	{
		this.catalogoProductos = new negocio.CatalogoProductos();
		this.catalogoCategorias = new negocio.CatalogoCategorias();
		this.catalogoSubcategorias = new negocio.CatalogoSubCategorias();
	}

	
	//---------------------------------------------------------
	public void inicializarCatalogos() throws Exception
	{
		this.catalogoCategorias.obtenerCategorias();
		this.catalogoSubcategorias.obtenerSubCategorias();
		this.catalogoProductos.obtenerProductos();
	}
		
	

	public Collection<negocio.SubCategoria> seleccionarCategoria(int idCategoria) 
	{
		//instancia para almacenar la categoria actual seleccionada
		negocio.Categoria categoriaActual = new negocio.Categoria();
		
		//se almacena la categoria buscada 
		categoriaActual = catalogoCategorias.buscarCategoria(idCategoria);
		
		//se crea arreglo de subcategorias
		Collection<negocio.SubCategoria> subCats = new ArrayList<negocio.SubCategoria>();
		
		//se obtienen las subcategorias de la categoria actual
		if (categoriaActual.getSubCats().isEmpty())
				categoriaActual.obtenerSubCategorias();
		
		subCats = categoriaActual.getSubCats();
		
		return subCats;	
	}
	//---------------------------------------------------------------

	
	
	public Collection<negocio.Producto> seleccionarSubcategoria(int idCategoria, int idSubCategoria) throws Exception 
	{
		negocio.SubCategoria subCatActual = new negocio.SubCategoria();
		
		subCatActual = catalogoSubcategorias.buscarSubCategoria(idCategoria,idSubCategoria);
				
		Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
		
		if(subCatActual.getProductos().isEmpty())
			subCatActual.obtenerProductos();

		productos = subCatActual.getProductos();
		
		return productos;
	}
	//---------------------------------------------------------------
	
}
