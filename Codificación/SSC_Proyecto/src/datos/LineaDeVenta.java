package datos;

public class LineaDeVenta 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private datos.Producto productoLinea;
	private int idVenta;
	private int cantidad;
	private double subTotal;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public LineaDeVenta() 
	{
		this.productoLinea = new datos.Producto();
		this.idVenta = 0;
		this.cantidad = 0;
		this.subTotal = 0;
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public datos.Producto getProductoLinea() 
	{
		return productoLinea;
	}
		
	public void setProductoLinea(datos.Producto productoLinea) 
	{
		this.productoLinea = productoLinea;
	}
	
	public int getCantidad() 
	{
		return cantidad;
	}
	
	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}
	
	public double getSubTotal() 
	{
		return subTotal;
	}
	
	public void setSubTotal(double subTotal) 
	{
		this.subTotal = subTotal;
	}

	public int getIdVenta()
	{
		return idVenta;
	}

	public void setIdVenta(int idVenta) 
	{
		this.idVenta = idVenta;
	}
	//---------------------------------------------------------------
}
