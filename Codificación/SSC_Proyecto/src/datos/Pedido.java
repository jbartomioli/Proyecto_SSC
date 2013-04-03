package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Pedido 
{
	//ATRIBUTOS
	int idPedido;
	datos.Cliente cliente;
	private Date fecha;
	private Collection<datos.LineaDePedido> lineas;
	Boolean estado;
	
	
	//CONSTRUCTOR
	public Pedido() 
	{
		this.idPedido = 0;
		this.cliente = new datos.Cliente();
		this.fecha = new Date();
		this.lineas = new ArrayList<datos.LineaDePedido>();
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


	public datos.Cliente getCliente() 
	{
		return cliente;
	}


	public void setCliente(datos.Cliente cliente) 
	{
		this.cliente = cliente;
	}


	public Date getFecha() 
	{
		return fecha;
	}


	public void setFecha(Date fecha) 
	{
		this.fecha = fecha;
	}


	public Collection<datos.LineaDePedido> getLineas() 
	{
		return lineas;
	}


	public void setLineas(Collection<datos.LineaDePedido> lineas) 
	{
		this.lineas = lineas;
	}


	public Boolean getEstado() 
	{
		return estado;
	}


	public void setEstado(Boolean estado) 
	{
		this.estado = estado;
	}
}
