//CLASE LISTA

package controladores;

import java.util.ArrayList;
import java.util.Collection;




public class ControladorRealizarSeguimientoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.CatalogoClientes catalogoClientes;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ControladorRealizarSeguimientoCliente() 
	{
		this.catalogoClientes = new negocio.CatalogoClientes();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.CatalogoClientes getCatalogoClientes() 
	{
		return catalogoClientes;
	}

	public void setCatalogoClientes(negocio.CatalogoClientes catalogoClientes) 
	{
		this.catalogoClientes = catalogoClientes;
	}
	//---------------------------------------------------------------

	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	
	public void inicializarCatalgos() throws Exception
	{
		this.catalogoClientes.obtenerClientes();
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////
	//Metodo 2.1.1 												   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public DatosSalidaSeguimiento buscarCliente(int idCliente)
	{
		//cliente temporal
		negocio.Cliente cliente;
		
		//instancia clase salida datos
		DatosSalidaSeguimiento salidaObj = new DatosSalidaSeguimiento();
		
		//se busca al cliente por su idCliente		
		cliente = catalogoClientes.buscarCliente(idCliente);
		
		//si el cliente no es nulo
		if (cliente != null)
		{
			//array de ventas temporal
			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
			
			//seteos atributos clase salida datos
			salidaObj.setNombre(cliente.getNombre());
			salidaObj.setApellido(cliente.getApellido());
			
			//se obtienen las ventas del cliente
			ventas = cliente.getVentas();
			
			//si la venta es no nula
			if (ventas != null)
			{		
				for(negocio.Venta v : ventas)
				{
					Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
					lineas = v.getLineas();
					
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
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	//Metodo 2.1.2 												   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public DatosSalidaSeguimiento buscarCliente(String apellido, String nombre)
	{
	
		negocio.Cliente cliente;
		
		DatosSalidaSeguimiento salidaObj = new DatosSalidaSeguimiento();
				
		cliente = catalogoClientes.buscarCliente(apellido,nombre);
		
		
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
					lineas = v.getLineas();
					
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
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//Metodo 2.1.3 												   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<DatosSalidaSeguimiento> seleccionarClientes(boolean tipoCliente)
	{
		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();
		
		Collection<DatosSalidaSeguimiento> salida = new ArrayList<DatosSalidaSeguimiento>();
		
		arrClientesTemp = catalogoClientes.buscarClientes(tipoCliente);
		
		if(arrClientesTemp != null)
		{
			
			for(negocio.Cliente cliente : arrClientesTemp)
			{
				Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
				
				DatosSalidaSeguimiento salidaObj = new DatosSalidaSeguimiento();
			
				salidaObj.setNombre(cliente.getNombre());
				salidaObj.setApellido(cliente.getApellido());
				
				ventas = cliente.getVentas();
				
				
				if (ventas != null)
				{
					for(negocio.Venta v : ventas)
					{
						Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
						lineas = v.getLineas();
						
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
		}
		return salida;
	}
	//---------------------------------------------------------------

	
	
	/////////////////////////////////////////////////////////////////
	// SUBCLASE PARA SALIDA DE DATOS 							   //
	/////////////////////////////////////////////////////////////////
	public class DatosSalidaSeguimiento
	{
		String nombre;
		String apellido;
		Collection<String[]> productos;
		
		public DatosSalidaSeguimiento()
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
	//---------------------------------------------------------------

}
