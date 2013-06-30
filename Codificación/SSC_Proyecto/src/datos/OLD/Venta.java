package datos.OLD;

import java.util.Date;

public class Venta 
{
	//ATRIBUTOS
	private Date fechaVenta;
	private int  idLineaDeVenta;
	private double total;
	
	
	//CONSTRUCTOR
	public Venta() 
	{
		this.fechaVenta = new Date();
		this.idLineaDeVenta = 0;
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


	public int getLineaDeVenta() 
	{
		return idLineaDeVenta;
	}


	public void setLineasDeVenta(int lineaDeVenta) 
	{
		this.idLineaDeVenta = lineaDeVenta;
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
	
	public boolean comproProducto(datos.OLD.Producto productoActual)
	{		
		return true;
	}
}