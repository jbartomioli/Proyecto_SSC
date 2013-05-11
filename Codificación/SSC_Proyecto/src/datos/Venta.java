package datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Collection;

public class Venta 
{
	//ATRIBUTOS
	private Date fechaVenta;
	private Collection<datos.LineaDeVenta> lineasDeVenta;
	double total;
	
	
	//CONSTRUCTOR
	public Venta() 
	{
		this.fechaVenta = new Date();
		this.lineasDeVenta = new ArrayList<datos.LineaDeVenta>();
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


	public Collection<datos.LineaDeVenta> getLineasDeVenta() 
	{
		return lineasDeVenta;
	}


	public void setLineasDeVenta(Collection<datos.LineaDeVenta> lineasDeVenta) 
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
	
	public boolean comproProducto(datos.Producto producto)
	{
		boolean flag = false;
		
		return flag;
	}
}