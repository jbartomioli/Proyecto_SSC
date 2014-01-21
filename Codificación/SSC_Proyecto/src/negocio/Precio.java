package negocio;

import java.util.Date;

public class Precio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idPrecio;
	private Date fechaDesde;
	private Date fechaHasta;
	private double precio;
	private double precioPromocional;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Precio() 
	{
		this.idPrecio = 0;
		this.fechaDesde = new Date();
		this.fechaHasta = new Date();
		this.precio = 0;
		this.precioPromocional = 0;
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getIdPrecio() 
	{
		return idPrecio;
	}
	
	public void setIdPrecio(int idPrecio) 
	{
		this.idPrecio = idPrecio;
	}
	
	public Date getFechaDesde() 
	{
		return fechaDesde;
	}
	
	public void setFechaDesde(Date fechaDesde) 
	{
		this.fechaDesde = fechaDesde;
	}
	
	public Date getFechaHasta() 
	{
		return fechaHasta;
	}
	
	public void setFechaHasta(Date fechaHasta) 
	{
		this.fechaHasta = fechaHasta;
	}
	
	public double getPrecio() 
	{
		return precio;
	}
	
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	public double getPrecioPromocional()
	{
		return precioPromocional;
	}
	
	public void setPrecioPromocional(double precioPromocional)
	{
		this.precioPromocional = precioPromocional;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
}