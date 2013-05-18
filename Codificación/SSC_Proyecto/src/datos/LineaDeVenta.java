package datos;

public class LineaDeVenta 
{
	
	//ATRIBUTOS
	datos.Producto productoLinea;
	int idVenta;
	int cantidad;
	float subTotal;
	
	
	//CONSTRUCTOR
	public LineaDeVenta() 
	{
		this.productoLinea = new datos.Producto();
		this.idVenta = 0;
		this.cantidad = 0;
		this.subTotal = 0;
	}
	
	
	//GETTERS & SETTERS
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
	
	
	public float getSubTotal() 
	{
		return subTotal;
	}
	
	public void setSubTotal(float subTotal) 
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
	
	public boolean compararProductos(datos.Producto productoActual)
	{		
		return true;
	}
}
