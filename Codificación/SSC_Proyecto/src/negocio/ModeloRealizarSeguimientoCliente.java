//CLASE LISTA

package negocio;

import java.util.ArrayList;
import java.util.Collection;




public class ModeloRealizarSeguimientoCliente 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private negocio.CatalogoClientes catalogoClientes;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ModeloRealizarSeguimientoCliente() 
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
	
	
	public void inicializarCatalogos() throws Exception
	{
		this.catalogoClientes.obtenerClientes();
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////
	//Metodo 2.1.1 												   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Cliente buscarCliente(int idCliente)
	{
		//cliente temporal
		negocio.Cliente cliente;
				
		//se busca al cliente por su idCliente		
		cliente = catalogoClientes.buscarCliente(idCliente);
		
		//si el cliente no es nulo
//		if (cliente != null)
//		{
//			//array de ventas temporal
//			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
//			
//			
//			//se obtienen las ventas del cliente
//			ventas = cliente.getVentas();
//			
//			//si la venta es no nula
//			if (ventas != null)
//			{		
//				for(negocio.Venta v : ventas)
//				{
//					Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
//					lineas = v.getLineas();
//					
//					for(negocio.LineaDeVenta ldv : lineas)
//					{
//						negocio.Producto producto = new negocio.Producto();
//						
//						producto = ldv.getProductoLinea();				
//					}
//				}
//			}
//		}
		return cliente;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	//Metodo 2.1.2 												   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> buscarCliente(String descParcial)
	{
	
//		negocio.Cliente cliente;
		
		Collection<negocio.Cliente> clientes = new ArrayList<negocio.Cliente>();
						
		clientes = catalogoClientes.buscarClientesDescPcial(descParcial);
		
		
//		if (cliente != null)
//		{
//			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
			
					
//			ventas = cliente.getVentas();
			
//			if (ventas != null)
//			{		
//				for(negocio.Venta v : ventas)
//				{
//					Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
//					lineas = v.getLineas();
//					
//					for(negocio.LineaDeVenta ldv : lineas)
//					{
//						negocio.Producto producto = new negocio.Producto();
//						
//						producto = ldv.getProductoLinea();						
//					}
//				}
//			}
//		}
		return clientes;
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//Metodo 2.1.3 												   //
	/////////////////////////////////////////////////////////////////
	//LISTO
//	public Collection<DatosSalidaSeguimiento> seleccionarClientes(boolean tipoCliente)
//	{
//		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();
//		
//		Collection<DatosSalidaSeguimiento> salida = new ArrayList<DatosSalidaSeguimiento>();
//		
//		arrClientesTemp = catalogoClientes.buscarClientes(tipoCliente);
//		
//		if(arrClientesTemp != null)
//		{
//			
//			for(negocio.Cliente cliente : arrClientesTemp)
//			{
//				Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
//				
//				DatosSalidaSeguimiento salidaObj = new DatosSalidaSeguimiento();
//			
//				salidaObj.setNombre(cliente.getNombre());
//				salidaObj.setApellido(cliente.getApellido());
//				
//				ventas = cliente.getVentas();
//				
//				
//				if (ventas != null)
//				{
//					for(negocio.Venta v : ventas)
//					{
//						Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
//						lineas = v.getLineas();
//						
//						for(negocio.LineaDeVenta ldv : lineas)
//						{
//							negocio.Producto producto = new negocio.Producto();
//							
//							producto = ldv.getProductoLinea();
//							
//							String[] aux = { Integer.toString(producto.getIdProducto()),producto.getNombre(),Integer.toString(ldv.getCantidad())};
//							
//							salidaObj.productos.add(aux);	
//						}
//					}
//				}
//				salida.add(salidaObj);
//			}
//		}
//		return salida;
}