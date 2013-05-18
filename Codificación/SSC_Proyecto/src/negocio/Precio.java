package negocio;

import java.util.Date;

public class Precio 
{
	//ATRIBUTOS
	public int idPrecio;
	public Date fechaDesde;
	public Date fechaHasta;
	public float precio;
	public float precioPromocional;
	//public datos.Producto productoPrecio;
	
	
	//CONSTRUCTOR
	public Precio() 
	{
		this.idPrecio = 0;
		this.fechaDesde = new Date();
		this.fechaHasta = new Date();
		this.precio = 0;
		this.precioPromocional = 0;
		//this.productoPrecio = new datos.Producto();
	}

	//GETTER & SETTERS
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
	
	public void setPrecio(float precio) 
	{
		this.precio = precio;
	}
	
	public double getPrecioPromocional()
	{
		return precioPromocional;
	}
	
	public void setPrecioPromocional(float precioPromocional)
	{
		this.precioPromocional = precioPromocional;
	}
//
//	public datos.Producto getProductoPrecio()
//	{
//		return productoPrecio;
//	}
//
//	public void setProductoPrecio(datos.Producto productoPrecio) 
//	{
//		this.productoPrecio = productoPrecio;
//	}	
//	
	
	
	//METODOS
	//----------------------------------------------------------
}