package negocio;

public class LineaDeVenta 
{

	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************	
	private negocio.Producto productoLinea;
	private int cantidad;
	private double subTotal;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public LineaDeVenta() 
	{
		this.productoLinea = null;
		this.cantidad = 0;
		this.subTotal = 0;
	}
	//---------------------------------------------------------------

	
	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public negocio.Producto getProductoLinea() 
	{
		return productoLinea;
	}
	
	public void setProductoLinea(negocio.Producto productoLinea) 
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
	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 															   //
	/////////////////////////////////////////////////////////////////
	//FALTA
	public boolean compararProductos(negocio.Producto productoActual)
	{		
		return true;
	}
	//---------------------------------------------------------------
}
