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
			
		ctgDatos.obtenerClientes();
		
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
			clienteNegocio.setTipoCliente(clienteDato.getTipoCliente());
			
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
			//
			C.obtenerVentas();
			
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
	//LISTO
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
	//LISTO
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
	//LISTO
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
