package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class ModeloModificarPrecios 
{
	//ATRIBUTOS
	private negocio.CatalogoProductos catalogoProductos;
	private negocio.CatalogoCategorias catalogoCategorias;
	private negocio.CatalogoSubCategorias catalogoSubcategorias;

	
	//GETTER & SETTERS
	public negocio.CatalogoSubCategorias getCatalogoSubcategorias() {
		return catalogoSubcategorias;
	}

	public void setCatalogoSubcategorias(CatalogoSubCategorias catalogoSubcategorias)
	{
		this.catalogoSubcategorias = catalogoSubcategorias;
	}

	public CatalogoProductos getCatalogoProductos()
	{
		return catalogoProductos;
	}

	public void setCatalogoProductos(CatalogoProductos catalogoProductos)
	{
		this.catalogoProductos = catalogoProductos;
	}

	public CatalogoCategorias getCatalogoCategorias()
	{
		return catalogoCategorias;
	}

	public void setCatalogoCategorias(CatalogoCategorias catalogoCategorias)
	{
		this.catalogoCategorias = catalogoCategorias;
	}
	/////////////////////////////////////////////////////////////////////////

	

	/**
	 * CONSTRUCTOR
	 * @throws Exception 
	 */
	public ModeloModificarPrecios() throws Exception
	{
		this.catalogoProductos = new negocio.CatalogoProductos();
		this.catalogoCategorias = new negocio.CatalogoCategorias();
		this.catalogoSubcategorias = new negocio.CatalogoSubCategorias();
	}
	/////////////////////////////////////////////////
	
	

	/**
	 * INICIALIZACION DE CATALOGOS
	 * @throws Exception
	 */
	public void inicializarCatalogos() throws Exception
	{
		this.catalogoCategorias.obtenerCategorias();
		this.catalogoSubcategorias.obtenerSubCategorias();
		this.catalogoProductos.obtenerProductos();
	}
	////////////////////////////////////////////////////
	
	

	/**
	 * SELECCIONA CATEGORIA Y DEVUELVE LOS PRODUCTOS DE LA MISMA
	 * @param idCategoria
	 * @return Collection<SubCategoria> - Subcategorias
	 * @throws Exception
	 */
	public Collection<negocio.SubCategoria> seleccionarCategoria(int idCategoria) throws Exception
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
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * DEVUELVE LOS PRODUCTOS DE LA CATEGORIA SELECCIONADA
	 * @param idCategoria
	 * @param idSubCategoria
	 * @return Collection<Productos> - Productos
	 * @throws Exception
	 */
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
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	/**
	 * ACTUALIZA EL PRECIO DEL PRODUCTO
	 * @param productoSeleccionado
	 * @param precioVigente
	 * @param precioPromocional
	 * @throws Exception
	 */
	public void actualizarPreciosProducto(Producto productoSeleccionado, float precioVigente, float precioPromocional) throws Exception
	{		
		catalogoProductos.actualizarPreciosProducto(productoSeleccionado, precioVigente, precioPromocional);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * ACTUALIZA EL PRODUCTO MODIFICADO EN LA COLECCION
	 * @param productoSeleccionado
	 * @throws Exception
	 */
	public void actualizarProducto(Producto productoSeleccionado) throws Exception
	{
		catalogoSubcategorias.actualizarProducto(productoSeleccionado);
	}
	//////////////////////////////////////////////////////////////////////////////
	
	
	
	/**
	 * BUSCA UN PRODUCTO POR SU ID
	 * @param idProducto
	 * @return
	 */
	public Producto buscarProducto(int idProducto)
	{
		negocio.Producto producto = new negocio.Producto();
		
		producto = catalogoProductos.buscarProducto(idProducto);
		
		if(producto != null)
			return producto;
		else 
			return null;
	}
	///////////////////////////////////////////////	
}
