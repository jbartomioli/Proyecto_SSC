package negocio;

import java.util.ArrayList;
import java.util.Collection;


public class ControladorRealizarSeguimientoCliente 
{
	//ATRIBUTOS
	private negocio.CatalogoClientes cc;
	
	
	//CONSTRUCTOR
	public ControladorRealizarSeguimientoCliente() 
	{
		this.cc = new negocio.CatalogoClientes();
	}


	//GETTER & SETTER
	public negocio.CatalogoClientes getCc() 
	{
		return cc;
	}

	public void setCc(negocio.CatalogoClientes cc) 
	{
		this.cc = cc;
	}

	
	//METODOS
	//-------------------------------------------------------------------
	//Metodo 2.1.1
	public DatosSalida buscarCliente(int idCliente)
	{
		negocio.Cliente cliente;
		
		DatosSalida salidaObj = new DatosSalida();
		
		cc = new negocio.CatalogoClientes();
		
		cliente = cc.buscarCliente(idCliente);
		
		
		if (cliente != null)
		{
			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
			
			salidaObj.setNombre(cliente.getNombre());
			salidaObj.setApellido(cliente.getApellido());
			
					
			ventas = cliente.getVentas();
			
			if (ventas != null)
			{		
				for(negocio.Venta v : ventas)
				{
					Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
					lineas = v.getLineasDeVenta();
					
					for(negocio.LineaDeVenta ldv : lineas)
					{
						negocio.Producto producto = new negocio.Producto();
						
						producto = ldv.getProductoLinea();
						
						String[] aux = { Integer.toString(producto.getIdProducto()),producto.getNombre(),Integer.toString(ldv.getCantidad())};
						
						salidaObj.productos.add(aux);			
					}
				}
			}
		}
		return salidaObj;
	}
	//*******************************************************************
	
	
	//Metodo 2.1.2
	public DatosSalida buscarCliente(String apellido, String nombre)
	{
	
		negocio.Cliente cliente;
		
		DatosSalida salidaObj = new DatosSalida();
		
		cc = new negocio.CatalogoClientes();
		
		cliente = cc.buscarCliente(apellido,nombre);
		
		
		if (cliente != null)
		{
			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
			
			salidaObj.setNombre(cliente.getNombre());
			salidaObj.setApellido(cliente.getApellido());
			
					
			ventas = cliente.getVentas();
			
			if (ventas != null)
			{		
				for(negocio.Venta v : ventas)
				{
					Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
					lineas = v.getLineasDeVenta();
					
					for(negocio.LineaDeVenta ldv : lineas)
					{
						negocio.Producto producto = new negocio.Producto();
						
						producto = ldv.getProductoLinea();
						
						String[] aux = { Integer.toString(producto.getIdProducto()),producto.getNombre(),Integer.toString(ldv.getCantidad())};
						
						salidaObj.productos.add(aux);			
					}
				}
			}
		}
		return salidaObj;
	}
	//*******************************************************************

	
	
	//Metodo 2.1.3
	//FALTA SALIDA
	public Collection<DatosSalida> seleccionarClientes(boolean tipoCliente)
	{
		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();
		
		Collection<DatosSalida> salida = new ArrayList<DatosSalida>();

		cc = new CatalogoClientes();
		
		arrClientesTemp = cc.buscarClientes(tipoCliente);
		
		
		for(negocio.Cliente cliente : arrClientesTemp)
		{
			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
			
			DatosSalida salidaObj = new DatosSalida();
		
			salidaObj.setNombre(cliente.getNombre());
			salidaObj.setApellido(cliente.getApellido());
			
			ventas = cliente.getVentas();
			
			if (ventas != null)
			{
				for(negocio.Venta v : ventas)
				{
					Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
					lineas = v.getLineasDeVenta();
					
					for(negocio.LineaDeVenta ldv : lineas)
					{
						negocio.Producto producto = new negocio.Producto();
						
						producto = ldv.getProductoLinea();
						
						String[] aux = { Integer.toString(producto.getIdProducto()),producto.getNombre(),Integer.toString(ldv.getCantidad())};
						
						salidaObj.productos.add(aux);	
					}
				}
			}
			salida.add(salidaObj);
		}
		return salida;
	}
	//*******************************************************************

	
	
	//-------------------------------------------------------------------
	public class DatosSalida
	{
		String nombre;
		String apellido;
		Collection<String[]> productos;
		
		public DatosSalida()
		{		
			this.nombre = "";
			this.apellido = "";
			this.productos = new ArrayList<String[]>();
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Collection<String[]> getProductos() {
			return productos;
		}

		public void setProductos(Collection<String[]> productos) {
			this.productos = productos;
		}
		
	}
	
}
