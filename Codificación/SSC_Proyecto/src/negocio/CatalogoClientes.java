package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoClientes {
	
	//ATRIBUTOS
	private Collection<negocio.Cliente> clientes;

	
	//CONSTRUCTOR
	//VER --> Pensaba sacar esta seccion y generarla mediante un
	//metodo fuera del constructor y ejecutarlo en el main de la clase
	//dejando solo los constructores para inicializaciones
	public CatalogoClientes() 
	{
		//se crea un objeto catalogoclientes de datos
		datos.CatalogoClientes ctgDatos = new datos.CatalogoClientes();	
		
		//se inicializa el array de clientes del catalogo
		clientes = new ArrayList<negocio.Cliente>();
		
		
		for(datos.Cliente datosCliente: ctgDatos.getClientes())
		{
			negocio.Cliente clienteNegocio = new negocio.Cliente();
			
			clienteNegocio.setApellido(datosCliente.getApellido());
			clienteNegocio.setDireccion(datosCliente.getDireccion());
			clienteNegocio.setEmail(datosCliente.getEmail());
			clienteNegocio.setEspecialidad(datosCliente.getEspecialidad());
			clienteNegocio.setIdCliente(datosCliente.getIdCliente());
			clienteNegocio.setNombre(datosCliente.getNombre());
			clienteNegocio.setTelefono(datosCliente.getTelefono());
			//clienteNegocio.setVentas(ventas)
			
			clientes.add(clienteNegocio);
		}
	}

	//GETTERS & SETTERS
	public Collection<negocio.Cliente> getClientes()
	{
		return clientes;
	}
	
	
	//METODOS
	//------------------------------------------------------------------------------------
	
	//Obtiene los clientes que han comprado un producto específico
	public Collection<negocio.Cliente> obtenerClientesProducto(negocio.Producto producto)
	{
		Collection<negocio.Cliente> clientesInteresados;
		
		//Se crea una coleccion de clientes interesados en el producto actual
		clientesInteresados = new ArrayList<negocio.Cliente>();
		
		return clientesInteresados;
	}
	//************************************************************************************
	
	
	//DSD 2.1.1
	//Busca un cliente mediante su Id
	public negocio.Cliente buscarCliente(int idCliente)
	{	

		for(negocio.Cliente c : this.clientes)
		{
			if (c.getIdCliente() == idCliente)
				return c;
		}
		return null;
	}
	//************************************************************************************
	
	//Busca un cliente mediante su nombre y apellido
	public negocio.Cliente buscarCliente(String nombre, String apellido)
	{	
		for(negocio.Cliente c : this.clientes)
		{
			if ((c.getNombre() == nombre)
				&& (c.getApellido() == apellido))
				return c;
		}
		return null;
	}
	
	//************************************************************************************
	
	
	//Devuelve un subconjunto de clientes 
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
	

}
