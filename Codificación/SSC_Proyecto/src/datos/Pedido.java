package datos;

import java.util.Date;

public class Pedido 
{
	//ATRIBUTOS
	int idPedido;
	float total;
	int idCliente;
	private Date fecha;
	int idLinea;
	Boolean estado;
	
	
	//CONSTRUCTOR
	public Pedido() 
	{
		this.idPedido = 0;
		this.total = 0;
		this.idCliente = 0;
		this.fecha = new Date();
		this.idLinea = 0;
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


	public int getLinea() 
	{
		return idLinea;
	}


	public void setLinea(int idLinea) 
	{
		this.idLinea = idLinea;
	}


	public Boolean getEstado() 
	{
		return estado;
	}


	public void setEstado(Boolean estado) 
	{
		this.estado = estado;
	}


	//METODOS
		//----------------------------------------------------------------------------
	
	public void agregarProducto(datos.Producto producto, int cantidad)
	{
		
	}
	
	public datos.LineaDePedido buscarLinea(datos.LineaDePedido linea)
	{
		datos.LineaDePedido linea1 = new datos.LineaDePedido();
		
		return linea1;
	}
	
	public boolean buscarLinea(int idProductoViejo)
	{
		boolean flag = false;
		
		return flag;
	}
}
