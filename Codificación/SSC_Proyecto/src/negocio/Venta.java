package negocio;

import java.util.Collection;
import java.util.Date;

public class Venta 
{
	//ATRIBUTOS
	public Date fechaVenta;
	public Collection<negocio.LineaDeVenta> lineasDeVenta;
	public double total;
	
	
	//CONSTRUCTOR
	public Venta() 
	{
		this.fechaVenta = new Date();
		this.lineasDeVenta = null;
		this.total = 0;
	}


	//GETTER & SETETER
	public Date getFechaVenta() 
	{
		return fechaVenta;
	}


	public void setFechaVenta(Date fechaVenta) 
	{
		this.fechaVenta = fechaVenta;
	}


	public Collection<negocio.LineaDeVenta> getLineasDeVenta() 
	{
		return lineasDeVenta;
	}


	public void setLineasDeVenta(Collection<negocio.LineaDeVenta> lineasDeVenta) 
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

	
	//METODOS
	//----------------------------------------------------------
	public boolean comproProducto(negocio.Producto productoActual)
	{		
		return true;
	}
}