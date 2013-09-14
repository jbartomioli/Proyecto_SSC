package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.swing.border.EmptyBorder;

import org.hibernate.type.descriptor.java.UUIDTypeDescriptor.ToStringTransformer;
import org.jgroups.demos.TotalOrder;


public class ControladorRegistrarPedidoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.CatalogoClientes cc;
	private negocio.CatalogoProductos cp;
	private negocio.CatalogoPedidos cpe;
	private negocio.Pedido PCTemporal;
	//---------------------------------------------------------------

	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorRegistrarPedidoCliente() 
	{
		this.cc = new negocio.CatalogoClientes();
		this.cp = new negocio.CatalogoProductos();
		this.cpe = new negocio.CatalogoPedidos();
		this.PCTemporal = new negocio.Pedido();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.CatalogoClientes getCc() 
	{
		return cc;
	}


	public void setCc(negocio.CatalogoClientes cc) 
	{
		this.cc = cc;
	}


	public negocio.CatalogoProductos getCp() 
	{
		return cp;
	}


	public void setCp(negocio.CatalogoProductos cp) 
	{
		this.cp = cp;
	}


	public negocio.CatalogoPedidos getCpe() 
	{
		return cpe;
	}


	public void setCpe(negocio.CatalogoPedidos cpe) 
	{
		this.cpe = cpe;
	}


	public negocio.Pedido getPCTemporal() 
	{
		return PCTemporal;
	}


	public void setPCTemporal(negocio.Pedido pCTemporal) 
	{
		PCTemporal = pCTemporal;
	}
	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.1.1 												/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public DatosClienteSalida buscarCliente(int idCliente)
	{
		negocio.Pedido PCTemporal = new negocio.Pedido();
		
		negocio.Cliente clienteActual = new negocio.Cliente();
		
		clienteActual=cc.buscarCliente(idCliente);
		
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
		
		clienteActual=cc.buscarCliente(apellido, nombre);
		
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
		
		productoTemporal = cp.buscarProducto(idProducto);
		
		if(productoTemporal != null)
		{
			int stockActual = productoTemporal.getExistenciaStock();
			
			//Obtener datos del producto mediante subclase
			
			if(stockActual>=cantidad)
			{
				PCTemporal.setProducto(productoTemporal, cantidad);
				
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
	//FALTA VER DEVOLUCION DE DATOS
	public ArrayList<String> buscarProducto(String descParcial, int cantidad)
	{
		negocio.Producto producto = new negocio.Producto();
		
		producto = cp.buscarProducto(descParcial);
		
		if(producto != null)
		{
			int stockActual = producto.getExistenciaStock();
			
			//Obtener datos del producto mediante subclase
			
			if(stockActual>=cantidad)
			{
				PCTemporal.setProducto(producto, cantidad);
				
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
	// Metodo 3.3.1 			RN 13/09/2013						/
	/////////////////////////////////////////////////////////////////
	//FALTA	DEVOLUCION DE DATOS
	public ArrayList<String> pedidoCompleto()
	{
		int idProducto = 0;
		
		float total = 0;
		
		negocio.ParametrosNegocio paramUltPedido = new ParametrosNegocio();
		
		Collection<negocio.LineaDePedido> arrLineasPedido = new ArrayList<negocio.LineaDePedido>();
		
		idProducto = paramUltPedido.getUltIdPedido();
		
		PCTemporal.setIdPedido(idProducto);
		
		arrLineasPedido = PCTemporal.getLineas();
		
		for(negocio.LineaDePedido LP: arrLineasPedido)
		{
			cp.actualizarStock(LP.getProducto(), LP.getCantidadPedida());
			total=PCTemporal.getTotal()+LP.getSubTotal();
			PCTemporal.setTotal(total);
		}
		
		negocio.MailDeposito mail = new negocio.MailDeposito();
		mail.enviarPedido(PCTemporal); //FALTA VALIDAR SI EL ENVIO ES CORRECTO
		cpe.agregarPedido(PCTemporal);
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
		arrLineasPedido = PCTemporal.getLineas();
		
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
	public String[] seleccionarProducto(int idProducto)
	{
		Collection<negocio.LineaDePedido> arrLineasPedido = new ArrayList<negocio.LineaDePedido>();
		String[] arrDatosSalida = new String[3];
		
		arrLineasPedido = PCTemporal.getLineas();
		
		for(negocio.LineaDePedido LP: arrLineasPedido)
		{
			if(LP.getProducto().getIdProducto()==idProducto)
			{
				arrDatosSalida[0] = Integer.toString(LP.getCantidadPedida());
				arrDatosSalida[1] = LP.getProducto().getNombre();
				arrDatosSalida[2] = Integer.toString(LP.getProducto().getExistenciaStock());
				break;
			}
		}
		return arrDatosSalida;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.6.2 			RN 13/09/2013						/
	/////////////////////////////////////////////////////////////////
	//FALTA - VER COMO LLAMAR A LA LINEA ACTUAL
	public boolean modificarCantidad(int nuevaCantidad)
	{	
		return true;
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// Metodo 3.6.3.2 												/
	/////////////////////////////////////////////////////////////////
	//LISTO
	public DatosProductoSalida seleccionarNuevoProducto(String descParcial)
	{
		//se crea un producto temporal para guardar resultado de la busqueda
		negocio.Producto productoTemporal = new negocio.Producto();
		
		productoTemporal = cp.buscarProducto(descParcial);
		
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
	// Metodo 3.6.4 												/
	/////////////////////////////////////////////////////////////////
	//FALTA
	public boolean ingresarCantidad(int cantidad)
	{
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
