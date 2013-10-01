package negocio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Venta 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************	
	private Date fechaVenta;
	private Collection<negocio.LineaDeVenta> lineasDeVenta;
	private double total;
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Venta() 
	{
		this.fechaVenta = new Date();
		this.lineasDeVenta = new ArrayList<negocio.LineaDeVenta>();
		this.total = 0;
	}
	//---------------------------------------------------------------
	

	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
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