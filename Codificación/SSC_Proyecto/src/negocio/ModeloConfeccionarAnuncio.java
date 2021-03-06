package negocio;

import java.util.ArrayList;
import java.util.Collection;


public class ModeloConfeccionarAnuncio
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.CatalogoCategorias catalogoCategorias;
	private negocio.CatalogoSubCategorias catalogoSubCategorias;
	private negocio.CatalogoProductos catalogoProductos;
	private negocio.CatalogoAnuncios catalogoAnuncios;
	private negocio.CatalogoClientes catalogoClientes;
	private Collection<negocio.Producto> productos;
	private Collection<negocio.SubCategoria> subCategorias;
	private negocio.Producto productoActual;
	private Collection<negocio.Cliente> arrClientesInteresados;
	private Collection<negocio.Producto> arrProductosPublicacion;
	private negocio.Anuncio anuncioActual;
	private negocio.Producto productoModificar;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ModeloConfeccionarAnuncio() 
	{
		this.catalogoCategorias = new negocio.CatalogoCategorias();
		this.catalogoSubCategorias = new negocio.CatalogoSubCategorias();
		this.catalogoProductos = new negocio.CatalogoProductos();
		this.catalogoAnuncios = new negocio.CatalogoAnuncios();		
		this.catalogoClientes = new negocio.CatalogoClientes();		
		this.productos = new ArrayList<negocio.Producto>();
		this.subCategorias = new ArrayList<negocio.SubCategoria>();
		this.productoActual = new negocio.Producto();
		this.arrClientesInteresados = new ArrayList<negocio.Cliente>();
		this.arrProductosPublicacion = new ArrayList<negocio.Producto>();
		this.anuncioActual = new negocio.Anuncio();
		this.productoModificar = new negocio.Producto();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.CatalogoCategorias getCatalogoCategorias() {
		return catalogoCategorias;
	}


	public void setCatalogoCategorias(negocio.CatalogoCategorias catalogoCategorias) {
		this.catalogoCategorias = catalogoCategorias;
	}


	public negocio.CatalogoSubCategorias getCatalogoSubCategorias() {
		return catalogoSubCategorias;
	}


	public void setCatalogoSubCategorias(
			negocio.CatalogoSubCategorias catalogoSubCategorias) {
		this.catalogoSubCategorias = catalogoSubCategorias;
	}


	public negocio.CatalogoProductos getCatalogoPrecios() {
		return catalogoProductos;
	}


	public void setCatalogoPrecios(negocio.CatalogoProductos catalogoPrecios) {
		this.catalogoProductos = catalogoPrecios;
	}


	public negocio.CatalogoAnuncios getCatalogoAnuncios() {
		return catalogoAnuncios;
	}


	public void setCatalogoAnuncios(negocio.CatalogoAnuncios catalogoAnuncios) {
		this.catalogoAnuncios = catalogoAnuncios;
	}


	public negocio.CatalogoClientes getCatalogoClientes() {
		return catalogoClientes;
	}


	public void setCatalogoClientes(negocio.CatalogoClientes catalogoClientes) {
		this.catalogoClientes = catalogoClientes;
	}


	public Collection<negocio.Producto> getProductos() {
		return productos;
	}


	public void setProductos(Collection<negocio.Producto> productos) {
		this.productos = productos;
	}


	public Collection<negocio.SubCategoria> getSubCategorias() {
		return subCategorias;
	}


	public void setSubCategorias(Collection<negocio.SubCategoria> subCategorias) {
		this.subCategorias = subCategorias;
	}


	public negocio.Producto getProductoActual() {
		return productoActual;
	}


	public void setProductoActual(negocio.Producto productoActual) {
		this.productoActual = productoActual;
	}


	public Collection<negocio.Cliente> getArrClientesInteresados() {
		return arrClientesInteresados;
	}


	public void setArrClientesInteresados(
			Collection<negocio.Cliente> arrClientesInteresados) {
		this.arrClientesInteresados = arrClientesInteresados;
	}


	public Collection<negocio.Producto> getArrProductosPublicacion() {
		return arrProductosPublicacion;
	}


	public void setArrProductosPublicacion(
			Collection<negocio.Producto> arrProductosPublicación) {
		this.arrProductosPublicacion = arrProductosPublicación;
	}


	public negocio.Anuncio getAnuncioActual() {
		return anuncioActual;
	}


	public void setAnuncioActual(negocio.Anuncio anuncioActual) {
		this.anuncioActual = anuncioActual;
	}


	public negocio.Producto getProductoModificar() {
		return productoModificar;
	}


	public void setProductoModificar(negocio.Producto productoModificar) {
		this.productoModificar = productoModificar;
	}
	
	public negocio.CatalogoProductos getCatalogoProductos() {
		return catalogoProductos;
	}

	public void setCatalogoProductos(negocio.CatalogoProductos catalogoProductos) {
		this.catalogoProductos = catalogoProductos;
	}
	//---------------------------------------------------------------

	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************


	/////////////////////////////////////////////////////////////////
	//
	/////////////////////////////////////////////////////////////////
	public void inicializarCatalogos() throws Exception
	{
		this.catalogoCategorias.obtenerCategorias();
		this.catalogoSubCategorias.obtenerSubCategorias();
		this.catalogoProductos.obtenerProductos();
		this.catalogoAnuncios.obtenerAnuncios();
		this.catalogoClientes.obtenerClientes();
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.1 - DSD 1.7.2 							   //
	/////////////////////////////////////////////////////////////////
	//LISTO
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
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.2 - DSD 1.7.3 							   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Producto> seleccionarSubcategoria(int idCategoria, int idSubCategoria) throws Exception 
	{
		negocio.SubCategoria subCatActual = new negocio.SubCategoria();
		
		subCatActual = catalogoSubCategorias.buscarSubCategoria(idCategoria,idSubCategoria);
				
		Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
		
		if(subCatActual.getProductos().isEmpty())
			subCatActual.obtenerProductos();

		productos = subCatActual.getProductos();
		
		return productos;
	}
	//---------------------------------------------------------------
	
	

	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.3 - DSD 1.7.4 							   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> seleccionarProducto(int idProducto) throws Exception 
	{
		//se crea instancia de producto
		negocio.Producto productoActual = new negocio.Producto();
		
		//se busca el producto y se guarda en la instancia creada
		//si no se encuentra el producto se guarda null en la instancia
		productoActual = catalogoProductos.buscarProducto(idProducto);	
		
		//se valida que el producto exista
		if (productoActual != null)
		{
			//
			//arrClientesInteresados = catalogoClientes.obtenerClientesProducto(productoActual);
			for(negocio.Cliente clienteNegocio : catalogoClientes.obtenerClientesProducto(productoActual))
			{
				//SI EL CLIENTE ACTUAL NO ESTA EN LA COLECCION LO AGREGA
				if(!arrClientesInteresados.contains(clienteNegocio))
				{
					arrClientesInteresados.add(clienteNegocio);
				}
				
			}
			
			//AGREGA EL PRODUCTO A LA COLECCION
			arrProductosPublicacion.add(productoActual);
		}
		return arrClientesInteresados;
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.4 										   //
	/////////////////////////////////////////////////////////////////
	//LISTO - DEPURACION
	public boolean finalizarCargaProducto() 
	{
		try
		{			
			//se setea estado
			this.anuncioActual.setEstado("PENDIENTE");
		
			//se guardan los productos
			this.anuncioActual.setProductos(this.arrProductosPublicacion);
			
			//se guardan los clientes destinatarios
			this.anuncioActual.setClientes(this.arrClientesInteresados);
		
			return true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.2.1 //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void redactarMensaje(String mensaje) 
	{		
		this.anuncioActual.setTextoMensaje(mensaje);
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.3.1//
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean guardarAnuncio() 
	{
		try
		{
			anuncioActual.setEstado("ENVIADO");
			catalogoAnuncios.guardarAnuncio(this.anuncioActual);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.4.1 - DSD NO SE ELABORO POR SIMPLICIDAD        //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void enviarAnuncio(String[] mailsDestinatarios, String asuntoMail, Collection<String> imagenes) throws Exception
	{
		this.anuncioActual.enviarAnuncio(mailsDestinatarios, asuntoMail, imagenes);
		this.anuncioActual.setEstado("ENVIADO");
	}
	//---------------------------------------------------------------
		
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.5.1											   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public String modificarPrecioProducto(int idProducto) 
	{
		negocio.Producto productoModificar;

		productoModificar = anuncioActual.modificarPrecioProducto(idProducto);

		if (productoModificar != null)
			return Double.toString(productoModificar.getPrecioActual());
		else
			return null;
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.5.2											   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void cambiarPrecio(float nuevoPrecio) throws Exception 
	{
		negocio.Producto productoModificar = new negocio.Producto();

		productoModificar.setPrecioPromocional(nuevoPrecio);

		catalogoProductos.actualizarPrecioPromProducto(productoModificar, nuevoPrecio);

		anuncioActual.actualizarProducto(productoModificar);
	}
	//---------------------------------------------------------------
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	// Metodo DSD 1.6.1 (no modifica, solo muestra los posibles clientes a modificar) //
	////////////////////////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<Cliente> modificarClientesDestinatarios() 
	{
		Collection<Cliente> arrClientes = new ArrayList<Cliente>();

		arrClientes = anuncioActual.getClientes();

		return arrClientes;
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.6.2 										   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void seleccionarClientes(String[] idCliente) 
	{
		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();

		arrClientesTemp = anuncioActual.seleccionarClientes(idCliente);

		anuncioActual.setClientes(arrClientesTemp);

		//El anuncio actual ya tiene los clientes como atributo
		catalogoAnuncios.guardarCambioClientesAnuncio(anuncioActual);
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//											   //
	/////////////////////////////////////////////////////////////////
	//
	public negocio.Cliente buscarCliente(int idCliente)
	{
		//cliente temporal
		negocio.Cliente cliente;
				
		//se busca al cliente por su idCliente		
		cliente = catalogoClientes.buscarCliente(idCliente);
		
		return cliente;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	//											   //
	/////////////////////////////////////////////////////////////////
	//
	public Collection<negocio.Cliente> buscarCliente(String descParcial)
	{
			
		Collection<negocio.Cliente> clientes = new ArrayList<negocio.Cliente>();
						
		clientes = catalogoClientes.buscarClientesDescPcial(descParcial);
		
		return clientes;
	}
	//---------------------------------------------------------------
	
	
	
	
	public Collection<negocio.Cliente> buscarClientesPorEspecialidad(String especialidad)
	{
			
		Collection<negocio.Cliente> clientes = new ArrayList<negocio.Cliente>();
						
		clientes = catalogoClientes.buscarClientesPorEspecialidad(especialidad);
		
		return clientes;
	}
	//---------------------------------------------------------------
	
	
		
	/////////////////////////////////////////////////////////////////
	// Metodo 1.7.1 											   //
	/////////////////////////////////////////////////////////////////
	//FALTA COMPLETAR
	public void eliminarProducto(int idProducto) 
	{
		negocio.Producto productoActual = new negocio.Producto();
		//Collection<negocio.Cliente> arrClientesEliminar = new ArrayList<negocio.Cliente>();

		
		productoActual = catalogoProductos.buscarProducto(idProducto);

		//arrClientesEliminar = catalogoClientes.obtenerClientesProducto(productoActual);

		//VALIDAR QUE EL CLIENTE NO TENGA OTRO PRODUCTO
		//ES DECIR, SI ELIMINAMOS UN CLIENTE QUE SEA UN POSIBLE INTERESADO DE OTRO
		//PRODUCTO DEL ANUNCIO
		//arrClientesInteresados.remove(arrClientesEliminar);

		arrProductosPublicacion.remove(productoActual);
	}
}
