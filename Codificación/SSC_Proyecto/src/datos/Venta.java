package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Venta 
{
	//ATRIBUTOS
	private Date fechaVenta;
	private Collection<datos.LineaDeVenta>  lineas;
	private double total;
	
	
	//CONSTRUCTOR
	public Venta() 
	{
		this.fechaVenta = new Date();
		this.lineas = new ArrayList<datos.LineaDeVenta>();
		this.total = 0.00;
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


	public Collection<datos.LineaDeVenta> getLineas() 
	{
		return lineas;
	}


	public void setLineas(Collection<datos.LineaDeVenta> lineas) 
	{
		this.lineas = lineas;
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
	
	public boolean comproProducto(datos.Producto productoActual)
	{		
		return true;
	}
}