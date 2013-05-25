package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Pedido 
{
	//ATRIBUTOS
	private int idPedido;
	private float total;
	private int idCliente;
	private Date fecha;
	private Collection<negocio.LineaDePedido> lineas;
	private boolean estado;
	
	
	//CONSTRUCTOR
	public Pedido() 
	{
		this.idPedido = 0;
		this.total = 0;
		this.idCliente = 0;
		this.fecha = new Date();
		this.lineas = new ArrayList<negocio.LineaDePedido>();
		this.estado = false;
	}


	//GETTER & SETTER
	public int getIdPedido() 
	{
		return idPedido;
	}


	public void setIdPedido(int idPedido) 
	{
		this.idPedido = idPedido;
	}
	
	public float getTotal()
	{
		return total;	
	}
	
	public void setTotal(float total)
	{
		this.total = total;
	}


	public int getCliente() 
	{
		return idCliente;
	}


	public void setCliente(int idCliente) 
	{
		this.idCliente = idCliente;
	}


	public Date getFecha() 
	{
		return fecha;
	}


	public void setFecha(Date fecha) 
	{
		this.fecha = fecha;
	}


	public  Collection<negocio.LineaDePedido> getLineas() 
	{
		return lineas;
	}


	public void setLineas(Collection<negocio.LineaDePedido> lineas) 
	{
		this.lineas = lineas;
	}


	public Boolean getEstado() 
	{
		return estado;
	}


	public void setEstado(boolean estado) 
	{
		this.estado = estado;
	}


	//METODOS
	//----------------------------------------------------------------------------
	
	//Busca una linea en el pedido mediante comparacion de lineas
	public negocio.LineaDePedido buscarLinea(negocio.LineaDePedido lineaActual)
	{
		for(negocio.LineaDePedido LP : this.lineas)
		{
			if (LP == lineaActual)
				return LP;
		}
		return null;
	}
	
	
	//Busca una linea en el pedido con un producto especifico
	public negocio.LineaDePedido buscarLinea(int idProductoViejo)
	{
		return null;
	}
	
	
	

}
