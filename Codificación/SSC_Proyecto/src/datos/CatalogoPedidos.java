package datos;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoPedidos 
{

	//ATRIBUTOS
	private Collection<datos.Pedido> pedidos;
	
	
	//CONSTRUCTOR
	public CatalogoPedidos() 
	{
		this.pedidos = new ArrayList<datos.Pedido>();
	}


	
	//GETTER & SETTERS
	public Collection<datos.Pedido> getPedidos() 
	{
		return pedidos;
	}


	public void setPedidos(Collection<datos.Pedido> pedidos) 
	{
		this.pedidos = pedidos;
	}
	
	//METODOS
	//----------------------------------------------------------
}
