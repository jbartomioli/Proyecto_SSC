package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class CatalogoPedidos 
{

	//ATRIBUTOS
	private Collection<negocio.Pedido> pedidos;
	
	
	//CONSTRUCTOR
	public CatalogoPedidos() 
	{
		this.pedidos = new ArrayList<negocio.Pedido>();
	}

	
	//GETTER & SETTERS
	public Collection<negocio.Pedido> getPedidos() 
	{
		return pedidos;
	}


	public void setPedidos(Collection<negocio.Pedido> pedidos) 
	{
		this.pedidos = pedidos;
	}
	
	//METODOS
	//----------------------------------------------------------
	public void agregarPedido(negocio.Pedido PCTemporal)
	{
		this.pedidos.add(PCTemporal);
		//Guardar en BD
	}
}
