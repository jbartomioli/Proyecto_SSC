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
		this.productoLinea = new negocio.Producto();
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
	//FALTA VALIDAR CATEGORIA O CAMBIAR ENFOQUE
	public boolean compararProductos(negocio.Producto productoActual)
	{		
		if(
			((productoActual.getSubCategoria() != null)
			&& (this.productoLinea.getSubCategoria() != null)
			&& (productoActual.getSubCategoria() == this.productoLinea.getSubCategoria()))
			/*||
			((productoActual.getSubCategoria() != null)
			&& (this.productoLinea.getSubCategoria() != null)
			&& (productoActual.getSubCategoria() == this.productoLinea.getSubCategoria())
			)*/)
			return true;
		else
			return false;
	}
	//---------------------------------------------------------------
}
