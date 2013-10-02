package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoClientes {
	
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<negocio.Cliente> clientes;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoClientes() 
	{
		this.clientes = new ArrayList<negocio.Cliente>();
		this.obtenerClientes();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<negocio.Cliente> getClientes()
	{
		return clientes;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// inicializa la coleccion de clientes						   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void obtenerClientes()
	{
		//se crea un objeto catalogoclientes de datos
		datos.CatalogoClientes ctgDatos = new datos.CatalogoClientes();				
			
		for(datos.Cliente clienteDato: ctgDatos.getClientes())
		{
			negocio.Cliente clienteNegocio = new negocio.Cliente();
			
			clienteNegocio.setApellido(clienteDato.getApellido());
			clienteNegocio.setDireccion(clienteDato.getDireccion());
			clienteNegocio.setEmail(clienteDato.getEmail());
			clienteNegocio.setEspecialidad(clienteDato.getEspecialidad());
			clienteNegocio.setIdCliente(clienteDato.getIdCliente());
			clienteNegocio.setNombre(clienteDato.getNombre());
			clienteNegocio.setTelefono(clienteDato.getTelefono());
			
			clienteNegocio.obtenerVentas(clienteDato);
			
			/*
			Collection<negocio.Venta> ventas = new ArrayList<negocio.Venta>();
			
			for(datos.Venta DV : clienteDato.getVentas())
			{
				negocio.Venta ventaNegocio = new negocio.Venta();
				ventaNegocio.setFechaVenta(DV.getFechaVenta());

				Collection<negocio.LineaDeVenta> lineas = new ArrayList<negocio.LineaDeVenta>();
           		
           		for(datos.LineaDeVenta DLDV: DV.getLineas())
           		{
           			negocio.LineaDeVenta linea = new negocio.LineaDeVenta();
           			
           			linea.setCantidad(DLDV.getCantidad());
           			
           			negocio.Producto producto = new negocio.Producto();
           			
           			producto.setCodProducto(DLDV.getProducto().getCodProducto());
           			producto.setExistenciaStock(DLDV.getProducto().getStock());
           			producto.setNombre(DLDV.getProducto().getNombre());
           			//producto.setPrecios(LDV.getProductos().getPrecioses());
           			
           			linea.setProductoLinea(producto);
           			
           			//linea.setSubTotal(LDV.getSubtotal());
           			
           			lineas.add(linea);
           			
           		}
           		
           		ventaNegocio.setLineas(lineas);
							
				//ventaNegocio.setTotal(DV.getTotal());
				
				ventas.add(ventaNegocio);
			}	
				
			//ventas.addAll(clienteDato.getVentas());
			
			clienteNegocio.setVentas(ventas);
			*/
			clientes.add(clienteNegocio);
		}

	}
	//---------------------------------------------------------------
	
	
	//////////////////////////////////////////////////////////////////
	// Obtiene los clientes que han comprado un producto específico //
	//////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> obtenerClientesProducto(negocio.Producto producto)
	{
		Collection<negocio.Cliente> arrClientesInteresados;
		
		//Se crea una coleccion de clientes interesados en el producto actual
		arrClientesInteresados = new ArrayList<negocio.Cliente>();
		
		for(negocio.Cliente C: this.clientes)
		{
			//si el cliente compro el producto lo agrego al arreglo
			if(C.comproProducto(producto))
				arrClientesInteresados.add(C);
		}
	
		//devuelve el arreglo con los clientes
		return arrClientesInteresados;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// DSD 2.1.1 - 	Busca un cliente mediante su Id				   //
	/////////////////////////////////////////////////////////////////
	public negocio.Cliente buscarCliente(int idCliente)
	{	

		for(negocio.Cliente c : this.clientes)
		{
			if (c.getIdCliente() == idCliente)
				return c;
		}
		return null;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// Busca un cliente mediante su nombre y apellido			   //
	/////////////////////////////////////////////////////////////////
	public negocio.Cliente buscarCliente(String nombre, String apellido)
	{	
		for(negocio.Cliente c : this.clientes)
		{
			if ((c.getNombre().equals(nombre))
				&& (c.getApellido().equals(apellido)))
				return c;
		}
		return null;
	}
	//---------------------------------------------------------------	
	
	
	/////////////////////////////////////////////////////////////////
	//Devuelve un subconjunto de clientes						   // 
	/////////////////////////////////////////////////////////////////
	public Collection<negocio.Cliente> buscarClientes(boolean tipoCliente)
	{
		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();

		for(negocio.Cliente c : this.getClientes())
		{
			if(c.getTipoCliente() == tipoCliente)
				arrClientesTemp.add(c);
		}
		return arrClientesTemp;	
	}
	//---------------------------------------------------------------

	
	
}
