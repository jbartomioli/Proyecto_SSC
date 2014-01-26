package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Pedido 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idPedido;
	private float total;
	private datos.Cliente cliente;
	private Date fecha;
	private Collection<datos.LineaDePedido> lineas;
	private String estado;
	//---------------------------------------------------------------
	


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Pedido() 
	{
		this.idPedido = 0;
		this.total = 0;
		this.cliente = new datos.Cliente();
		this.fecha = new Date();
		this.lineas = new ArrayList<datos.LineaDePedido>();
		this.estado = "";
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
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


	public String getEstado() 
	{
		return estado;
	}


	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	public void agregarProducto(datos.Producto producto, int cantidad)
	{
		
	}
	//---------------------------------------------------------------
	
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
