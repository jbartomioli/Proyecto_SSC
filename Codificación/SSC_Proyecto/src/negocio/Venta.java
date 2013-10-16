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
	//	//
	/////////////////////////////////////////////////////////////////
	public void obtenerLineasDeVenta()
	{
		//
		datos.Venta ventaDato = new datos.Venta();
		
		//se setean las ventas del cliente de datos
		ventaDato.obtenerLineasDeVenta(this.idVenta);
		
		//se obtiene cada venta del cliente de datos
		//para luego agregarlas al cliente de negocio
		
		//esta opcion o volver a crear el array y setear siempre los datos
		//if(this.ventas != null)
		//{
			for(datos.LineaDeVenta LDVD: ventaDato.getLineas())
			{
				negocio.LineaDeVenta lineaNegocio = new negocio.LineaDeVenta();
				
				lineaNegocio.setCantidad(LDVD.getCantidad());
				//lineaNegocio.setProductoLinea(LDVD.getProductoLinea());
				lineaNegocio.setSubTotal(LDVD.getSubTotal());
				
				this.lineasDeVenta.add(lineaNegocio);
			}
		//}
		
	}	
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean comproProducto(negocio.Producto productoActual)
	{		
		for(negocio.LineaDeVenta LDV: this.lineasDeVenta)
		{
			if(LDV.compararProductos(productoActual))
				return true;
		}
		
		return false;
	}
	//---------------------------------------------------------------
}