package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class ControladorConfeccionarAnuncio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.CatalogoCategorias cctg;
	private negocio.CatalogoSubCategorias csctg;
	private negocio.CatalogoProductos cp;
	private negocio.CatalogoAnuncios ca;
	private negocio.CatalogoClientes cc;
	private Collection<negocio.Producto> productos;
	private Collection<negocio.SubCategoria> subCats;
	private negocio.Producto productoActual;
	private Collection<negocio.Cliente> arrClientesInteresados;
	private Collection<negocio.Producto> arrProductosPublicación;
	private negocio.Anuncio anuncioActual;
	private negocio.Producto productoModificar;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorConfeccionarAnuncio() 
	{
		this.cctg = new negocio.CatalogoCategorias();
		this.csctg = new negocio.CatalogoSubCategorias();
		this.cp = new negocio.CatalogoProductos();
		this.ca = new negocio.CatalogoAnuncios();
		this.cc = new negocio.CatalogoClientes();
		this.productos = new ArrayList<negocio.Producto>();
		this.subCats = new ArrayList<negocio.SubCategoria>();
		this.productoActual = new negocio.Producto();
		this.arrClientesInteresados = new ArrayList<negocio.Cliente>();
		this.arrProductosPublicación = new ArrayList<negocio.Producto>();
		this.anuncioActual = new negocio.Anuncio();
		this.productoModificar = new negocio.Producto();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.CatalogoCategorias getCctg() 
	{
		return cctg;
	}

	public void setCctg(negocio.CatalogoCategorias cctg) 
	{
		this.cctg = cctg;
	}

	public negocio.CatalogoSubCategorias getCsctg() 
	{
		return csctg;
	}

	public void setCsctg(negocio.CatalogoSubCategorias csctg) 
	{
		this.csctg = csctg;
	}

	public negocio.CatalogoProductos getCp() 
	{
		return cp;
	}

	public void setCp(negocio.CatalogoProductos cp) 
	{
		this.cp = cp;
	}

	public negocio.CatalogoAnuncios getCa() 
	{
		return ca;
	}

	public void setCa(negocio.CatalogoAnuncios ca) 
	{
		this.ca = ca;
	}

	public Collection<negocio.Producto> getProductos() 
	{
		return productos;
	}

	public void setProductos(Collection<negocio.Producto> productos) 
	{
		this.productos = productos;
	}

	public Collection<negocio.SubCategoria> getSubCats() 
	{
		return subCats;
	}

	public void setSubCats(Collection<negocio.SubCategoria> subCats) 
	{
		this.subCats = subCats;
	}

	public negocio.Producto getProductoActual() 
	{
		return productoActual;
	}

	public void setProductoActual(negocio.Producto productoActual) 
	{
		this.productoActual = productoActual;
	}

	public Collection<negocio.Cliente> getArrClientesInteresados() 
	{
		return arrClientesInteresados;
	}

	public void setArrClientesInteresados(
			Collection<negocio.Cliente> arrClientesInteresados) 
	{
		this.arrClientesInteresados = arrClientesInteresados;
	}

	public Collection<negocio.Producto> getArrProductosPublicación() 
	{
		return arrProductosPublicación;
	}

	public void setArrProductosPublicación(
			Collection<negocio.Producto> arrProductosPublicación) 
	{
		this.arrProductosPublicación = arrProductosPublicación;
	}

	public negocio.Anuncio getAnuncioActual() 
	{
		return anuncioActual;
	}

	public void setAnuncioActual(negocio.Anuncio anuncioActual) 
	{
		this.anuncioActual = anuncioActual;
	}

	public negocio.Producto getProductoModificar() 
	{
		return productoModificar;
	}

	public void setProductoModificar(negocio.Producto productoModificar) 
	{
		this.productoModificar = productoModificar;
	}
	//---------------------------------------------------------------

	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.1 - DSD 1.7.2 							   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<SalidaDatos> seleccionarCategoria(int idCategoria) 
	{
		negocio.Categoria categoriaActual = new negocio.Categoria();
		
		categoriaActual = cctg.buscarCategoria(idCategoria);
		
		Collection<negocio.SubCategoria> subCats = new ArrayList<negocio.SubCategoria>();
		
		Collection<SalidaDatos> salidaDatos = new ArrayList<SalidaDatos>();
		
		subCats = categoriaActual.getSubCats();

		//
		if(subCats == null)
		{
			productos = categoriaActual.getProductos();
			
			for(negocio.Producto P: productos)
			{
				SalidaDatos salidaProd = new SalidaDatos();
				
				salidaProd.setId(Integer.toString(P.getIdProducto()));
				salidaProd.setDescripcion(P.getNombre());

				salidaDatos.add(salidaProd);	
			}
		}
		else
		{
			for(negocio.SubCategoria SC : subCats)
			{
				SalidaDatos salidaSub = new SalidaDatos();
				
				salidaSub.setId(Integer.toString(SC.getIdSubcategoria()));
				salidaSub.setDescripcion(SC.getDescripcion());

				salidaDatos.add(salidaSub);	
			}
		}
		
		return salidaDatos;
		
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.2 - DSD 1.7.3 							   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<SalidaDatos> seleccionarSubcategoria(int idSubCategoria) 
	{
		negocio.SubCategoria subCatActual = new negocio.SubCategoria();
		
		subCatActual = csctg.buscarSubCategoria(idSubCategoria);
		
		Collection<SalidaDatos> salidaDatos = new ArrayList<SalidaDatos>();
		
		Collection<negocio.Producto> productos = new ArrayList<negocio.Producto>();
		
		productos = subCatActual.getProductos();
		
		for(negocio.Producto P : productos)
		{
			SalidaDatos salidaProd = new SalidaDatos();
			
			salidaProd.setId(Integer.toString(P.getIdProducto()));
			salidaProd.setDescripcion(P.getNombre());

			salidaDatos.add(salidaProd);
		}
		
		return salidaDatos;
	}
	//---------------------------------------------------------------
	
	

	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.1.3 - DSD 1.7.4 							   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public SalidaDatosSeleccionaProductos seleccionarProducto(int idProducto) 
	{
		//se crea instancia de producto
		negocio.Producto productoActual = new negocio.Producto();
		
		//se busca el producto y se guarda en la instancia creada
		//si no se encuentra el producto se guarda null en la instancia
		productoActual = cp.buscarProducto(idProducto);	
		
		//se crea una instancia de datos de salida
		SalidaDatosSeleccionaProductos salida = new SalidaDatosSeleccionaProductos();
		
		//se valida que el producto exista
		if (productoActual != null)
		{
			//se setean datos de salida
			salida.setStock(Integer.toString(productoActual.getExistenciaStock()));
			salida.setPrecio(Double.toString(productoActual.getPrecioActual()));
			
			Collection<negocio.Cliente> arrClientesInteresados = new ArrayList<negocio.Cliente>();
			
			arrClientesInteresados = cc.obtenerClientesProducto(productoActual);
			
			int i=0;
			
			//se crea array temporal de string para datos de salida de clientes
			String[][] datosClientes = new String[arrClientesInteresados.size()][3]; 
			
			for(Cliente C: arrClientesInteresados)
			{
				//se setean datos de los clientes en array temporal
				datosClientes[0][i] = Integer.toString(C.getIdCliente());
				datosClientes[1][i] = C.getNombre();
				datosClientes[2][i] = C.getApellido();
			}
			
			//se setea el array de salida de datos a partir del array temporal
			salida.setClientes(datosClientes);
			
			arrProductosPublicación.add(productoActual);
		}
		return salida;
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
			this.anuncioActual = new negocio.Anuncio();
			
			//se setea estado
			this.anuncioActual.setEstado("PENDIENTE");
		
			//se guardan los productos
			this.anuncioActual.setProductos(this.arrProductosPublicación);
			
			//se guardan los clientes destinatarios
			this.anuncioActual.setClientes(this.arrClientesInteresados);
		
			return true;
		}
		catch (Exception e)
		{
			//DEPURACION
			e.printStackTrace();
			return false;
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.2.1 //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public TipoMensaje redactarMensaje(String mensaje) 
	{
		anuncioActual.setTextoMensaje(mensaje);
		
		TipoMensaje datosMensaje=new TipoMensaje();
		
		negocio.ParametrosNegocio parametroNegocio=new negocio.ParametrosNegocio();
		
		
		///SALIDA
		int i=0;
		
		for(negocio.Producto p : arrProductosPublicación)
		{	
			datosMensaje.arrDatosProductos[i][0]=Integer.toString(p.getIdProducto());
			datosMensaje.arrDatosProductos[i][1]=p.getNombre();
			datosMensaje.arrDatosProductos[i][2]=Double.toString(p.getPrecioActual());
			datosMensaje.arrDatosProductos[i][3]=Double.toString(p.getPrecioPromocional());
			i++;
		}
		
		anuncioActual.setMembrete(parametroNegocio.getMembrete());
		datosMensaje.setMembrete(parametroNegocio.getMembrete());

		return datosMensaje;
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.3.1//
	/////////////////////////////////////////////////////////////////
	//LISTO - DEPURACION
	public boolean guardarAnuncio() 
	{
		try
		{
			ca.guardarAnuncio(this.anuncioActual);
			return true;
		}
		catch(Exception e)
		{
			//DEPURACION
			e.printStackTrace();
			return false;
		}
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.4.1 - DSD NO SE ELABORO POR SIMPLICIDAD        //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean enviarAnuncios() 
	{
		try
		{
			anuncioActual.enviarAnuncio();
			return true;
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
			return false;
		}
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
	public void cambiarPrecio(float nuevoPrecio) 
	{
		negocio.Producto productoModificar = new negocio.Producto();

		productoModificar.setPrecioPromocional(nuevoPrecio);

		cp.actualizarPrecioPromProducto(productoModificar, nuevoPrecio);

		anuncioActual.actualizarProducto(productoModificar);

		//return null;
	}
	//---------------------------------------------------------------
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	// Metodo DSD 1.6.1 (no modifica, solo muestra los posibles clientes a modificar) //
	////////////////////////////////////////////////////////////////////////////////////
	//LISTO
	public String[][] modificarClientesDestinatarios() 
	{
		Collection<negocio.Cliente> arrClientes = new ArrayList<negocio.Cliente>();

		arrClientes = anuncioActual.getClientes();

		//SALIDA
		String[][] arrDatos = new String[arrClientes.size()][2];

		int i = 0;

		for (negocio.Cliente c : arrClientes) 
		{
			arrDatos[i][0] = Integer.toString(c.getIdCliente());
			arrDatos[i][1] = c.getNombre();
			arrDatos[i][2] = c.getApellido();
			i++;
		}

		return arrDatos;
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo DSD 1.6.2 										   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public String[][] seleccionarClientes(String[] idCliente) 
	{
		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();

		arrClientesTemp = anuncioActual.seleccionarClientes(idCliente);

		anuncioActual.setClientes(arrClientesTemp);

		//El anuncio actual ya tiene los clientes como atributo
		ca.guardarCambioClientesAnuncio(anuncioActual);

		//SALIDA
		String[][] arrDatos = new String[arrClientesTemp.size()][2]; // Revisar definicion

		int i = 0;

		for (negocio.Cliente c : arrClientesTemp) 
		{
			arrDatos[i][0] = Integer.toString(c.getIdCliente());
			arrDatos[i][1] = c.getNombre();
			arrDatos[i][2] = c.getApellido();
			i++;
		}

		return arrDatos;
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// Metodo 1.7.1 											   //
	/////////////////////////////////////////////////////////////////
	//FALTA COMPLETAR
	public String[][] eliminarProducto(int idProducto) 
	{
		negocio.Producto productoActual = new negocio.Producto();
		Collection<negocio.Cliente> arrClientesEliminar = new ArrayList<negocio.Cliente>();

		
		productoActual = cp.buscarProducto(idProducto);

		arrClientesEliminar = cc.obtenerClientesProducto(productoActual);

		//VALIDAR QUE EL CLIENTE NO TENGA OTRO PRODUCTO
		//ES DECIR, SI ELIMINAMOS UN CLIENTE QUE SEA UN POSIBLE INTERESADO DE OTRO
		//PRODUCTO DEL ANUNCIO
		arrClientesInteresados.remove(arrClientesEliminar);

		//SALIDA
		String[][] arrDatos = new String[arrClientesInteresados.size()][2];

		int i = 0;

		for (negocio.Cliente c : arrClientesInteresados) 
		{
			arrDatos[i][0] = Integer.toString(c.getIdCliente());
			arrDatos[i][1] = c.getNombre();
			arrDatos[i][2] = c.getApellido();
			i++;
		}

		arrProductosPublicación.remove(productoActual);

		return arrDatos;
	}

	
	
	
	
	
	
	//***************************************************************
	// SUBCLASES SALIDA DE DATOS 									*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	//SUB CLASE PARA DEVOLVER DATOS DEL DSD 1.1.1 y 1.1.2		   //
	/////////////////////////////////////////////////////////////////
	private class SalidaDatos
	{
		private String descripcion;
		private String id;
		
		public SalidaDatos()
		{
			this.descripcion = "";
			this.id = "";
		}

		@SuppressWarnings("unused")
		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		@SuppressWarnings("unused")
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}	
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	//SUB CLASE PARA DEVOLVER DATOS DEL DSD 1.1.3 y 1.1.7		   //
	/////////////////////////////////////////////////////////////////
	private class SalidaDatosSeleccionaProductos
	{
		private String stock;
		private String precio;
		private String[][] clientes;
		
		public SalidaDatosSeleccionaProductos()
		{
			this.stock = "";
			this.precio = "";
			this.clientes = new String[arrClientesInteresados.size()][3];
		}

		@SuppressWarnings("unused")
		public String getStock() {
			return stock;
		}

		public void setStock(String stock) {
			this.stock = stock;
		}

		@SuppressWarnings("unused")
		public String getPrecio() {
			return precio;
		}

		public void setPrecio(String precio) {
			this.precio = precio;
		}

		@SuppressWarnings("unused")
		public String[][] getClientes() {
			return clientes;
		}

		public void setClientes(String[][] clientes) {
			this.clientes = clientes;
		}


	}
	//---------------------------------------------------------------
	
		
	/////////////////////////////////////////////////////////////////
	//SUB CLASE PARA DEVOLVER DATOS DEL DSD 1.2.1 				   //
	/////////////////////////////////////////////////////////////////
	private class TipoMensaje 
	{
		private String membrete;
		private String[][] arrDatosProductos;

		
		//CONSTRUCTOR
		public TipoMensaje() 
		{
			this.membrete = "";
			this.arrDatosProductos = new String[arrProductosPublicación.size()][3];
		}


		@SuppressWarnings("unused")
		public String getMembrete() 
		{
			return membrete;
		}


		public void setMembrete(String membrete) 
		{
			this.membrete = membrete;
		}


		@SuppressWarnings("unused")
		public String[][] getArrDatosProductos() 
		{
			return arrDatosProductos;
		}


		@SuppressWarnings("unused")
		public void setArrDatosProductos(String[][] arrDatosProductos) 
		{
			this.arrDatosProductos = arrDatosProductos;
		}
		
	}
	//---------------------------------------------------------------
	
	//////////////////////////////////////////////////////////////////////////////////
	//REVISAR Y GENERAR SUBCLASES SALIDA PARA DATOS EN PANTALLA METODOS ANTERIORES //
	//////////////////////////////////////////////////////////////////////////////////
}
