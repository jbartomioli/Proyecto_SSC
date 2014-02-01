package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Venta 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************	
	private int idVenta;
	private Date fechaVenta;
	private Collection<negocio.LineaDeVenta> lineasDeVenta;
	private double total;
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Venta() 
	{
		this.idVenta = 0;
		this.fechaVenta = new Date();
		this.lineasDeVenta = new ArrayList<negocio.LineaDeVenta>();
		this.total = 0;
	}
	//---------------------------------------------------------------
	


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	
	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFechaVenta() 
	{
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) 
	{
		this.fechaVenta = fechaVenta;
	}

	public Collection<negocio.LineaDeVenta> getLineas() 
	{
		return lineasDeVenta;
	}

	public void setLineas(Collection<negocio.LineaDeVenta> lineasDeVenta) 
	{
		this.lineasDeVenta = lineasDeVenta;
	}

	public double getTotal() 
	{
		return total;
	}

	public void setTotal(double total) 
	{
		this.total = total;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// RECUPERA TODAS LAS LINEAS DE VENTA DE UNA VENTA ESPECIFICA  //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerLineasDeVenta()
	{
		//SE CREA OBJETO VENTA DE DATOS PARA RECUPERAR 
		//LA INFORMACION DE LA BD
		datos.Venta ventaDato = new datos.Venta();
		
		//SE RECUPERAN DE LA BD TODAS LAS LINEAS DE VENTA DE LA VENTA
		ventaDato.obtenerLineasDeVenta(this.idVenta);
		
		//SI EL OBJETO VENTA DE NEGOCIO YA TIENE SUS LINEAS
		//CARGADAS SE LAS VUELVE A SETEAR CON EL FIN DE MANTENER
		//ACTUALIZADO EL ARRAY AL MOMENTO DE LLAMAR ESTE METODO
		if(this.lineasDeVenta != null)
		{
			//SE RECORRE CADA OBJETO RESULTANTE DE LA CONSULTA A LA BD
			for(datos.LineaDeVenta lineaDato: ventaDato.getLineas())
			{
				//SE CREA UN OBJETO LINEA DE VENTA DE NEGOCIO PARA
				//SETEARLO Y LUEGO AGREGARLO AL ARRAY
				negocio.LineaDeVenta lineaNegocio = new negocio.LineaDeVenta();
				
				//SE SETEAN DATOS DE LA LINEA
				lineaNegocio.setCantidad(lineaDato.getCantidad());
				lineaNegocio.setSubTotal(lineaDato.getSubTotal());
				lineaNegocio.setIdVenta(lineaDato.getIdVenta());

				{//SETEO DE DATOS DEL PRODUCTO DE LA LINEA
					//SE CREA OBJETO PRODUCTO DE NEGOCIO PARA SETEAR EL PRODUCTO
					negocio.Producto productoNegocio = new negocio.Producto();
					
					//SE CREA OBJETO PRODUCTO DE DATOS PARA OBTENER DATOS DEL MISMO
					datos.Producto productoDato = lineaDato.getProductoLinea();
					
					//SE SETEAN DATOS DEL PRODUCTO DE NEGOCIO
					productoNegocio.setCodProducto(productoDato.getCodProducto());
					productoNegocio.setExistenciaStock(productoDato.getExistenciaStock());
					productoNegocio.setIdProducto(productoDato.getIdProducto());
					productoNegocio.setNombre(productoDato.getNombre());

					//SE SETEA LA LINEA CON EL PRODUCTO
					lineaNegocio.setProductoLinea(productoNegocio);
				}
				
				//SE AGREGA LA LINEA DE VENTA EN EL ARRAY		
				this.lineasDeVenta.add(lineaNegocio);
			}
		}
		
	}	
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// VERIFICA SI EL PRODUCTO ESTA EN UNA LINEA ANTERIOR		   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean comproProducto(negocio.Producto productoActual)
	{	
		//SE RECORRE CADA LINEA DE LA VENTA ACTUAL
		for(negocio.LineaDeVenta lineaNegocio: this.lineasDeVenta)
		{
			//COMPARA LOS PRODUCTOS Y SI SON IGUALES DEVUELVE 
			//VERDADERO Y CORTA LA ITERACION
			if(lineaNegocio.compararProductos(productoActual))
				return true;
		}
		//EN CASO CONTRARIO DEVUELVE FALSO
		return false;
	}
	//---------------------------------------------------------------
}