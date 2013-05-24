package negocio;

public class LineaDeVenta 
{
	
	//ATRIBUTOS
	private negocio.Producto productoLinea;
	private int idVenta;
	private int cantidad;
	private double subTotal;
	
	
	//CONSTRUCTOR
	public LineaDeVenta() 
	{
		this.productoLinea = null;
		this.idVenta = 0;
		this.cantidad = 0;
		this.subTotal = 0;
	}
	
	
	//GETTERS & SETTERS
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

	public int getIdVenta()
	{
		return idVenta;
	}


	public void setIdVenta(int idVenta) 
	{
		this.idVenta = idVenta;
	}
	
	
	
	//METODOS
	//----------------------------------------------------------
	
	public boolean compararProductos(negocio.Producto productoActual)
	{		
		return true;
	}
}
