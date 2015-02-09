package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;



public class ModeloRegistrarPedidoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.CatalogoClientes catalogoClientes;
	private negocio.CatalogoProductos catalogoProductos;
	private negocio.CatalogoPedidos catalogoPedidos;
	private negocio.Pedido pedidoTemporal;
	private negocio.LineaDePedido lineaActual; //USADA EN 3.6.1 PARA GUARDAR LA LINEA ACTUAL Y LUEGO UTILIZARLA EN 3.6.2
	private negocio.Producto productoTemporal; //USADA EN 3.6.3.2 PARA GUARDAR EL PRODUCTO SELECCIONADO Y LUEGO UTILIZARLO EN 3.6.4
	//---------------------------------------------------------------

	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ModeloRegistrarPedidoCliente() throws Exception 
	{
		this.catalogoClientes = new negocio.CatalogoClientes();	
		this.catalogoProductos = new negocio.CatalogoProductos();
		this.catalogoPedidos = new negocio.CatalogoPedidos();
		
		this.pedidoTemporal = new negocio.Pedido();
		this.lineaActual = new negocio.LineaDePedido();
		this.productoTemporal = new negocio.Producto();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.CatalogoClientes getCatalogoClientes() {
		return catalogoClientes;
	}


	public void setCatalogoClientes(negocio.CatalogoClientes catalogoClientes) {
		this.catalogoClientes = catalogoClientes;
	}


	public negocio.CatalogoProductos getCatalogoProductos() {
		return catalogoProductos;
	}


	public void setCatalogoProductos(negocio.CatalogoProductos catalogoProductos) {
		this.catalogoProductos = catalogoProductos;
	}


	public negocio.CatalogoPedidos getCatalogoPedidos() {
		return catalogoPedidos;
	}


	public void setCatalogoPedidos(negocio.CatalogoPedidos catalogoPedidos) {
		this.catalogoPedidos = catalogoPedidos;
	}


	public negocio.Pedido getPedidoTemporal() {
		return pedidoTemporal;
	}


	public void setPedidoTemporal(negocio.Pedido pedidoTemporal) {
		this.pedidoTemporal = pedidoTemporal;
	}


	public negocio.LineaDePedido getLineaActual() {
		return lineaActual;
	}


	public void setLineaActual(negocio.LineaDePedido lineaActual) {
		this.lineaActual = lineaActual;
	}


	public negocio.Producto getProductoTemporal() {
		return productoTemporal;
	}


	public void setProductoTemporal(negocio.Producto productoTemporal) {
		this.productoTemporal = productoTemporal;
	}
	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	
	
	

	/**
	 * 
	 * @param user
	 * @param password
	 * @return
	 */
	public String iniciarSesion(String user, String password)
	{
		negocio.Userdetail usuarioNegocio = new negocio.Userdetail();
		
		try
		{
			usuarioNegocio.obtenerUser(user, password);
			
			if(usuarioNegocio.getName().equals(""))
				return null;
			else
				return usuarioNegocio.getName();			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.1.1 												/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public DatosClienteSalida buscarCliente(int idCliente)
	{
		negocio.Pedido PCTemporal = new negocio.Pedido();
		
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		clienteActual=catalogoClientes.buscarCliente(idCliente);
		
		DatosClienteSalida datosCliente = new DatosClienteSalida();
		
		if(clienteActual!= null)
		{	
			datosCliente.setNombre(clienteActual.getNombre());
			datosCliente.setApellido(clienteActual.getApellido());
			datosCliente.setDireccion(clienteActual.getDireccion());
			datosCliente.setTelefono(clienteActual.getTelefono());
			
			PCTemporal.setCliente(clienteActual);
			PCTemporal.setFecha(new Date());
			
			return datosCliente;		
		}
		else
			return null;

	}
	//---------------------------------------------------------------	
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.1.2 												/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public DatosClienteSalida buscarCliente(String apellido, String nombre)
	{
		
		negocio.Pedido PCTemporal = new negocio.Pedido();
		
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		clienteActual=catalogoClientes.buscarCliente(apellido, nombre);
		
		DatosClienteSalida datosCliente = new DatosClienteSalida();
		
		if(clienteActual!= null)
		{	
			datosCliente.setNombre(clienteActual.getNombre());
			datosCliente.setApellido(clienteActual.getApellido());
			datosCliente.setDireccion(clienteActual.getDireccion());
			datosCliente.setTelefono(clienteActual.getTelefono());
			
			PCTemporal.setCliente(clienteActual);
			PCTemporal.setFecha(new Date());
			
			return datosCliente;	
		}
		else
			return null;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.2.1 			            						/
	/////////////////////////////////////////////////////////////////
	//FALTA VER DEVOLUCION DE DATOS
	public ArrayList<String> seleccionarProducto(int idProducto, int cantidad)
	{
		negocio.Producto productoTemporal = new negocio.Producto();
		
		productoTemporal = catalogoProductos.buscarProducto(idProducto);
		
		if(productoTemporal != null)
		{
			int stockActual = productoTemporal.getExistenciaStock();
			
			//Obtener datos del producto mediante subclase
			
			if(stockActual>=cantidad)
			{
				pedidoTemporal.agregarProducto(productoTemporal, cantidad);
				
				return null; //Devolver datos
			}
			else
				return null;
		}
		else
			return null;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.2.2 			RN 13/09/2013        				/
	/////////////////////////////////////////////////////////////////
	//FALTA VER DEVOLUCION DE DATOS Y TAMBIEN BUSQUEDA POR DESCRIPCION
	public ArrayList<String> buscarProducto(String descParcial, int cantidad)
	{
		negocio.Producto producto = new negocio.Producto();
		
		//producto = cp.buscarProducto(descParcial);
		
		if(producto.getExistenciaStock()>=cantidad)
		{
			pedidoTemporal.agregarProducto(producto, cantidad);
			
			return null; //Devolver datos
		}
		else
			return null;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.3.1 			RN 13/09/2013						/
	/////////////////////////////////////////////////////////////////
	//FALTA	DEVOLUCION DE DATOS
	public ArrayList<String> pedidoCompleto() throws Exception
	{
		int idPedidoActual = 0;
		
		float total = 0;
		
		negocio.ParametrosNegocio parametrosNegocio = new negocio.ParametrosNegocio();
		parametrosNegocio.obtenerParametrosNegocio();
		
		Collection<negocio.LineaDePedido> arrLineasPedido = new ArrayList<negocio.LineaDePedido>();
		
		idPedidoActual = (parametrosNegocio.getUltIdPedido()) + 1;
		
		pedidoTemporal.setIdPedido(idPedidoActual);
		
		arrLineasPedido = pedidoTemporal.getLineas();
		
		for(negocio.LineaDePedido LP: arrLineasPedido)
		{
			catalogoProductos.actualizarStock(LP.getProducto(), LP.getCantidadPedida());
			total=pedidoTemporal.getTotal()+LP.getSubTotal();
			pedidoTemporal.setTotal(total);
		}
		
		negocio.MailDeposito mail = new negocio.MailDeposito();
		mail.enviarPedido(pedidoTemporal); //FALTA VALIDAR SI EL ENVIO ES CORRECTO
		catalogoPedidos.agregarPedido(pedidoTemporal);
		return null;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.5 					RN 13/09/2013					/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean eliminarProducto(int idProducto)
	{
		Collection<negocio.LineaDePedido> arrLineasPedido = new ArrayList<negocio.LineaDePedido>();
		boolean flag=false;
		arrLineasPedido = pedidoTemporal.getLineas();
		
		for(negocio.LineaDePedido LP: arrLineasPedido)
		{
			if(LP.getProducto().getIdProducto()==idProducto)
			{
				arrLineasPedido.remove(LP);
				flag=true;
				break;
			}
		}
		
		return flag;
	}	
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.6.1 - 3.6.3.1 			RN 13/09/2013				/
	/////////////////////////////////////////////////////////////////
	//LISTO - CAMBIE EL TIPO DE DEVOLUCION DE DATOS
	public String[] modificarProducto(int idProducto)
	{
		Collection<negocio.LineaDePedido> arrLineasPedido = new ArrayList<negocio.LineaDePedido>();
		String[] arrDatosSalida = new String[3];
		
		
		arrLineasPedido = pedidoTemporal.getLineas();
		
		for(negocio.LineaDePedido LP: arrLineasPedido)
		{
			if(LP.getProducto().getIdProducto()==idProducto)
			{
				arrDatosSalida[0] = Integer.toString(LP.getCantidadPedida());
				arrDatosSalida[1] = LP.getProducto().getNombre();
				arrDatosSalida[2] = Integer.toString(LP.getProducto().getExistenciaStock());
				lineaActual = LP;
				break;
			}
		}
		return arrDatosSalida;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.6.2 			RN 25/09/2013						/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean modificarCantidad(int nuevaCantidad)
	{	
		if(lineaActual.getProducto().getExistenciaStock()>=nuevaCantidad)
			lineaActual.setCantidadPedida(nuevaCantidad);
		
		return true;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.6.3.2 												/
	/////////////////////////////////////////////////////////////////
	//LISTO - UNI EL METODO CON INGRESAR CANTIDAD
	public DatosProductoSalida seleccionarNuevoProducto(String descParcial)
	{
		//productoTemporal = cp.buscarProducto(descParcial);
		
		if(productoTemporal != null)
		{
			//se crea instancia DatosProductoSalida
			DatosProductoSalida datosProdSalida = new DatosProductoSalida();
				
			//se obtienen datos del producto
			datosProdSalida.setNombreProducto(productoTemporal.getNombre());
			datosProdSalida.setStock(String.valueOf(productoTemporal.getExistenciaStock()));
			
			return datosProdSalida;
		}
		else 
			return null;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.6.4 		RN 25/09/2013   						/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean ingresarCantidad(int cantidad)
	{
		lineaActual.setProducto(productoTemporal);
		lineaActual.setCantidadPedida(cantidad);
		
		return true;
	}
	//---------------------------------------------------------------
	
	
	
	
	
	//***************************************************************
	// SUBCLASES SALIDA DE DATOS 									*
	//***************************************************************
	
	
	/////////////////////////////////////////////////////////////////
	//SUB CLASE PARA DEVOLVER DATOS DEL DSD 3.1 					/
	/////////////////////////////////////////////////////////////////
	public class DatosClienteSalida 
	{
		//ATRIBUTOS
		private String nombre, apellido, direccion, telefono;
	
		//CONSTRUCTOR
		public DatosClienteSalida() 
		{
			this.nombre = "";
			this.apellido = "";
			this.direccion = "";
			this.telefono = "";
		}
		
		
		public String getNombre() 
		{
			return nombre;
		}
		
		
		public void setNombre(String nombre) 
		{
			this.nombre = nombre;
		}
		
		
		public String getApellido() 
		{
			return apellido;
		}
		
		
		public void setApellido(String apellido) 
		{
			this.apellido = apellido;
		}
		
		
		public String getDireccion() 
		{
			return direccion;
		}
		
		
		public void setDireccion(String direccion) 
		{
			this.direccion = direccion;
		}
		
		
		public String getTelefono() 
		{
			return telefono;
		}
		
		
		public void setTelefono(String telefono) 
		{
			this.telefono = telefono;
		}

	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	//SUB CLASE PARA DEVOLVER DATOS DEL DSD 3.2 y 3.6 				/
	/////////////////////////////////////////////////////////////////
	public class DatosProductoSalida
	{
		private String nombreProducto, stock, cantPedida;
		
		public DatosProductoSalida()
		{
			this.cantPedida = "";
			this.nombreProducto = "";
			this.cantPedida = "";
		}

		public String getNombreProducto() {
			return nombreProducto;
		}

		public void setNombreProducto(String nombreProducto) {
			this.nombreProducto = nombreProducto;
		}

		public String getStock() {
			return stock;
		}

		public void setStock(String stock) {
			this.stock = stock;
		}

		public String getCantPedida() {
			return cantPedida;
		}

		public void setCantPedida(String cantPedida) {
			this.cantPedida = cantPedida;
		}
	}
	//---------------------------------------------------------------
		
	/////////////////////////////////////////////////////////////////
	//SUB CLASE PARA DEVOLVER DATOS DEL DSD 3.3 					/
	/////////////////////////////////////////////////////////////////
	public class DatosSalidaPedido
	{
		private String idPedido, total, fecha;
		
		public DatosSalidaPedido()
		{
			this.idPedido = "";
			this.fecha = "";
			this.total = "";
		}

		public String getIdPedido() {
			return idPedido;
		}

		public void setIdPedido(String idPedido) {
			this.idPedido = idPedido;
		}

		public String getTotal() {
			return total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		
	}
	//---------------------------------------------------------------

}
