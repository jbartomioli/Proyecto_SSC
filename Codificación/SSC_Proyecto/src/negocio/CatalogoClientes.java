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
	// DSD 2.1.1 - 	BUSCA UN CLIENTE POR SU ID					   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Cliente buscarCliente(int idCliente)
	{	
		//SE RECORRE CADA CLIENTE DEL ARRAY
		for(negocio.Cliente clienteNegocio : this.clientes)
		{
			//SI LOS ID SON IGUALES DEVUELVE EL CLIENTE
			if (clienteNegocio.getIdCliente() == idCliente)
				return clienteNegocio;
		}
		//SI NO LO ENCUENTRA DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// BUSCA UN CLIENTE MEDIANTE SU NOMBRE Y APELLIDO			   //
	/////////////////////////////////////////////////////////////////
	//LISTO - REVISAR SI SE USA. SE AGREGO MÉTODO ALTERNATIVO DEBAJO
	public negocio.Cliente buscarCliente(String nombre, String apellido)
	{	
		//SE RECORRE CADA CLIENTE DEL ARRAY
		for(negocio.Cliente clienteNegocio : this.clientes)
		{
			//SI EL NOMBRE Y EL APELLIDO COINCIDEN DEVUELVE EL PRIMER CLIENTE
			if ((clienteNegocio.getNombre().equals(nombre))
					&& (clienteNegocio.getApellido().equals(apellido)))
				return clienteNegocio;
		}
		//EN CASO DE NO ENCONTRARLO DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// BUSCA UN CLIENTE MEDIANTE SUBSTRING DE SU NOMBRE O APELLIDO //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> buscarClientesDescPcial(String descParcial)
	{	
		Collection<negocio.Cliente> arrClientesObtenidos = new ArrayList<negocio.Cliente>();
		//SE RECORRE CADA CLIENTE DEL ARRAY
		for(negocio.Cliente clienteNegocio : this.clientes)
		{
			//SI EL NOMBRE O EL APELLIDO COINCIDEN CON EL SUBSTRING INGRESADO AGREGA
			//EL CLIENTE AL ARRAY
			if ((clienteNegocio.getNombre().toUpperCase().contains(descParcial.toUpperCase()))
					|| (clienteNegocio.getApellido().toUpperCase().contains(descParcial.toUpperCase())))
				arrClientesObtenidos.add(clienteNegocio);
		}
		//DEVUELVE EL ARRAY CON LOS CLIENTES
		return arrClientesObtenidos;
	}
	//---------------------------------------------------------------	
	
	
	/////////////////////////////////////////////////////////////////
	// DEVUELVE UN SUBCONJUNTO DE CLIENTES						   // 
	/////////////////////////////////////////////////////////////////
	//LISTO
	public Collection<negocio.Cliente> buscarClientes(boolean tipoCliente)
	{
		//SE CREA ARRAY DE CLIENTES DE NEGOCIO TEMPORAL PARA AGREGAR CLIENTES
		Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();

		//SE RECORRE CADA CLIENTE DEL ARRAY
		for(negocio.Cliente clienteNegocio : this.getClientes())
		{
			//SE AGREGAN TODOS LOS CLIENTES QUE SON DE UN MISMO TIPO
			if(clienteNegocio.getTipoCliente() == tipoCliente)
				arrClientesTemp.add(clienteNegocio);
		}
		//DEVUELVE EL ARRAY TEMPORAL
		return arrClientesTemp;	
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// BUSCA UN CLIENTE POR ESPECIALIDAD            			   //
	/////////////////////////////////////////////////////////////////
	public Collection<negocio.Cliente> buscarClientesPorEspecialidad(String especialidad)
	{
		//SE CREA ARRAY DE CLIENTES DE NEGOCIO TEMPORAL PARA AGREGAR CLIENTES
				Collection<negocio.Cliente> arrClientesTemp = new ArrayList<negocio.Cliente>();
				
				//SE RECORRE CADA CLIENTE DEL ARRAY
				for(negocio.Cliente clienteNegocio : this.clientes)
				{
					//SE AGREGAN TODOS LOS CLIENTES QUE PERTENECEN A LA ESPECIALIDAD INGRESADA
					if(clienteNegocio.getEspecialidad().equals(especialidad))
						arrClientesTemp.add(clienteNegocio);
				}
				
				//DEVUELVE EL ARRAY TEMPORAL
				return arrClientesTemp;	
	}
}
