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
	public Collection<negocio.Cliente> obtenerClientesProdcuto(negocio.Producto producto)
	{
		Collection<negocio.Cliente> clientesInteresados;
		
		//Se crea una coleccion de clientes interesados en el producto actual
		clientesInteresados = new ArrayList<negocio.Cliente>();
		
		return clientesInteresados;
	}
	//************************************************************************************
	
	//Busca un cliente mediante su Id
	public negocio.Cliente buscarCliente(int idCliente)
	{
		return null;
	}
	//************************************************************************************
	
	//Busca un cliente mediante su nombre y apellido
	public negocio.Cliente buscarCliente(String nombre, String apellido)
	{
		return null;
	}
	//************************************************************************************
	
	

}
