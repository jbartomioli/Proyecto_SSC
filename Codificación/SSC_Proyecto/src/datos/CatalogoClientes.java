package datos;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoClientes 
{
	//ATRIBUTOS
	private Collection<datos.Cliente> clientes;
	
	
	//CONSTRUCTOR
	public CatalogoClientes() 
	{
		this.clientes = new ArrayList<datos.Cliente>();
	}


	//GETTER & SETTER
	public Collection<datos.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<datos.Cliente> clientes) 
	{
		this.clientes = clientes;
	}
	
}
