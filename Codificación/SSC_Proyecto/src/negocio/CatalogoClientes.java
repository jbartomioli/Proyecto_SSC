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
	// OBTIENE TODOS LOS CLIENTES DE LA BD						   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerClientes()
	{

		//SE CREA OBJETO DE CATALOGO DE CLIENTES DE DATOS
		datos.CatalogoClientes ctgDatos = new datos.CatalogoClientes();				
			
		//SE RECUPERAN TODOS LOS CLIENTES DE LA BD
		ctgDatos.obtenerClientes();
		
		//SE RECORREN TODOS LOS CLIENTES RECUPERADOS DE LA BD
		for(datos.Cliente clienteDato: ctgDatos.getClientes())
		{
			//SE CREA OBJETO CLIENTE DE NEGOCIO PARA SETEO DE DATOS
			//Y LUEGO AGREGARLO AL ARRAY
			negocio.Cliente clienteNegocio = new negocio.Cliente();
			
			//SE SETEA EL OBJETO CON LOS DATOS DEL CLIENTE
			clienteNegocio.setApellido(clienteDato.getApellido());
			clienteNegocio.setDireccion(clienteDato.getDireccion());
			clienteNegocio.setEmail(clienteDato.getEmail());
			clienteNegocio.setEspecialidad(clienteDato.getEspecialidad());
			clienteNegocio.setIdCliente(clienteDato.getIdCliente());
			clienteNegocio.setNombre(clienteDato.getNombre());
			clienteNegocio.setTelefono(clienteDato.getTelefono());
			clienteNegocio.setTipoCliente(clienteDato.getTipoCliente());
			
			//SE AGREGA EL CLIENTE AL ARRAY
			clientes.add(clienteNegocio);
		}

	}
	//---------------------------------------------------------------
	
	
	//////////////////////////////////////////////////////////////////
	// OBTIENE LOS CLIENTES QUE HAN COMPRADO UN PRODUCTO ESPECIFICO //
	//////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> obtenerClientesProducto(negocio.Producto producto)
	{
		//ARRAY TEMPORAL DE CLIENTES DE NEGOCIO UTILIZADO PARA AGREGARLOS POSIBLES CLIENTES DESTINATARIOS
		Collection<negocio.Cliente> arrClientesInteresados = new ArrayList<negocio.Cliente>();
		
		//SE RECORRE CADA CLIENTE DEL ARRAY
		for(negocio.Cliente clienteNegocio: this.clientes)
		{
			//SE RECUPERAN LAS VENTAS DEL CLIENTE ACTUAL
			clienteNegocio.obtenerVentas();
			
			//SE EVALUA SI EL CLIENTE COMPRO EL PRODUCTO
			//EN CASO AFIRMATIVO SE AGREGA EL CLIENTE ACTUAL
			//EN EL ARRAY
			if(clienteNegocio.comproProducto(producto))
				arrClientesInteresados.add(clienteNegocio);
		}
	
		//DEVUELVE EL ARRAY CON LOS CLIENTES
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
