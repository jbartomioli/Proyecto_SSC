package negocio;

import java.util.ArrayList;
import java.util.Collection;


public class ControladorRealizarSeguimientoCliente 
{
	//ATRIBUTOS
	datos.CatalogoClientes cc;
	private Collection<datos.Cliente> CT;
	
	
	//CONSTRUCTOR
	public ControladorRealizarSeguimientoCliente() 
	{
		this.cc = new datos.CatalogoClientes();
		CT = new ArrayList<datos.Cliente>();
	}


	//GETTER & SETTER
	public datos.CatalogoClientes getCc() 
	{
		return cc;
	}


	public void setCc(datos.CatalogoClientes cc) 
	{
		this.cc = cc;
	}


	public Collection<datos.Cliente> getCT() 
	{
		return CT;
	}


	public void setCT(Collection<datos.Cliente> cT) 
	{
		CT = cT;
	}
}
