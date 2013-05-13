package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoClientes {
	
	//ATRIBUTOS
	Collection<negocio.Cliente> clientes;

	
	//CONSTRUCTOR
	public CatalogoClientes() 
	{
		datos.CatalogoClientes ctgDatos = new datos.CatalogoClientes();	
		
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
	public Collection<negocio.Cliente> getClientes() {
		return clientes;
	}
	
	

}
