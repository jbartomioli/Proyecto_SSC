package negocio;

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
	private negocio.Cliente cliente;
	private Date fecha;
	private Collection<negocio.LineaDePedido> lineas;
	private String estado;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Pedido() 
	{
		this.idPedido = 0;
		this.total = 0;
		this.cliente = new negocio.Cliente();
		this.fecha = new Date();
		this.lineas = new ArrayList<negocio.LineaDePedido>();
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

	public negocio.Cliente getCliente() 
	{
		return cliente;
	}

	public void setCliente(negocio.Cliente cliente) 
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

	public  Collection<negocio.LineaDePedido> getLineas() 
	{
		return lineas;
	}

	public void setLineas(Collection<negocio.LineaDePedido> lineas) 
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
	// SE AGREGA EL PRODUCTO AL PEDIDO ACTUAL					   //
	/////////////////////////////////////////////////////////////////
	//VER TEMA PRECIO PROMOCIONAL
	public void agregarProducto(negocio.Producto productoAgregar, int cantidad)
	{
		//SE CREA OBJETO LINEA DE PEDIDO DE NEGOCIO PARA
		//SETEARLO Y AGREGARLO AL ARRAY
		negocio.LineaDePedido lineaNegocio = new negocio.LineaDePedido();
		
		//SE SETEAN DATOS
		lineaNegocio.setProducto(productoAgregar);
		lineaNegocio.setCantidadPedida(cantidad);
		
		float precioVigente = 0;
		float subTotal = 0;
		
		precioVigente = productoAgregar.getPrecioActual();
		subTotal = precioVigente*cantidad;
		
		lineaNegocio.setSubTotal(subTotal);
		
		//SE AGREGA LA LINEA AL ARRAY
		this.lineas.add(lineaNegocio);
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	// BUSCA UNA LINEA DE PEDIDO ESPECIFICA						   //
	/////////////////////////////////////////////////////////////////
	//VER
	public negocio.LineaDePedido buscarLinea(negocio.LineaDePedido lineaActual)
	{
		//SE RECORRE CADA ELEMENTO DEL ARRAY
		for(negocio.LineaDePedido lineaNegocio : this.lineas)
		{
			//SI LAS LINEAS SON IGUALES SE DEVUELVE LA LINEA ACTUAL
			if (lineaNegocio == lineaActual)
				return lineaNegocio;
		}
		//FINALMENTE SI NO ENCUENTRA LA LINEA DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// BUSCA UNA LINEA DE PEDIDO POR PRODUCTO ESPECIFICO		   //
	/////////////////////////////////////////////////////////////////
	//VER
	public negocio.LineaDePedido buscarLinea(int idProductoViejo)
	{
		//SE RECORRE CADA ELEMENTO DEL ARRAY
		for(negocio.LineaDePedido lineaNegocio : this.lineas)
		{
			//SI LAS LINEAS TIENEN EL MISMO PRODUCTO DEVUELVE LA LINEA ACTUAL
			if (lineaNegocio.getProducto().getIdProducto() == idProductoViejo)
				return lineaNegocio;
		}
		//FINALMENTE SI NO ENCUENTRA LA LINEA DEVUELVE NULO
		return null;
	}
	//---------------------------------------------------------------
}
