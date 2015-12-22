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
	private String codPedido;
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
		this.codPedido = "";
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
	
	public String getCodPedido() 
	{
		return codPedido;
	}

	public void setCodPedido(String codPedido) 
	{
		this.codPedido = codPedido;
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
	
	
	
	
	
	
	
	
	public void obtenerLineasDePedido() throws Exception
	{
//		//SE CREA OBJETO VENTA DE DATOS PARA RECUPERAR 
//		//LA INFORMACION DE LA BD
//		datos.Venta ventaDato = new datos.Venta();
//		
//		//SE RECUPERAN DE LA BD TODAS LAS LINEAS DE VENTA DE LA VENTA
//		ventaDato.obtenerLineasDeVenta(this.idVenta);
//		
//		//SI EL OBJETO VENTA DE NEGOCIO YA TIENE SUS LINEAS
//		//CARGADAS SE LAS VUELVE A SETEAR CON EL FIN DE MANTENER
//		//ACTUALIZADO EL ARRAY AL MOMENTO DE LLAMAR ESTE METODO
//		if(this.lineasDeVenta != null)
//		{
//			//SE RECORRE CADA OBJETO RESULTANTE DE LA CONSULTA A LA BD
//			for(datos.LineaDeVenta lineaDato: ventaDato.getLineas())
//			{
//				//SE CREA UN OBJETO LINEA DE VENTA DE NEGOCIO PARA
//				//SETEARLO Y LUEGO AGREGARLO AL ARRAY
//				negocio.LineaDeVenta lineaNegocio = new negocio.LineaDeVenta();
//				
//				//SE SETEAN DATOS DE LA LINEA
//				lineaNegocio.setCantidad(lineaDato.getCantidad());
//				lineaNegocio.setSubTotal(lineaDato.getSubTotal());
//				lineaNegocio.setIdVenta(lineaDato.getIdVenta());
//
//				{//SETEO DE DATOS DEL PRODUCTO DE LA LINEA
//					//SE CREA OBJETO PRODUCTO DE NEGOCIO PARA SETEAR EL PRODUCTO
//					negocio.Producto productoNegocio = new negocio.Producto();
//					
//					//SE CREA OBJETO PRODUCTO DE DATOS PARA OBTENER DATOS DEL MISMO
//					datos.Producto productoDato = lineaDato.getProductoLinea();
//					
//					//SE SETEAN DATOS DEL PRODUCTO DE NEGOCIO
//					productoNegocio.setCodProducto(productoDato.getCodProducto());
//					productoNegocio.setExistenciaStock(productoDato.getExistenciaStock());
//					productoNegocio.setIdProducto(productoDato.getIdProducto());
//					productoNegocio.setNombre(productoDato.getNombre());
//
//					//SE SETEA LA LINEA CON EL PRODUCTO
//					lineaNegocio.setProductoLinea(productoNegocio);
//				}
//				
//				//SE AGREGA LA LINEA DE VENTA EN EL ARRAY		
//				this.lineasDeVenta.add(lineaNegocio);
//			}
//		}
		
	}	
	
	
	
	
	
	
	
	
	
	
	
}
