package negocio;

public class LineaDeVenta 
{

	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************	
	private negocio.Producto productoLinea;
	private int cantidad;
	private double subTotal;
	private int idVenta;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public LineaDeVenta() 
	{
		this.productoLinea = new negocio.Producto();
		this.cantidad = 0;
		this.subTotal = 0;
		this.idVenta = 0;
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
	
	
	public int getIdVenta() 
	{
		return idVenta;
	}
	
	public void setIdVenta(int idVenta) 
	{
		this.idVenta = idVenta;
	}
	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	//COMPARA EL PRODUCTO SELECCIONADO CON EL PRODCUTO DE LA LINEA //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public boolean compararProductos(negocio.Producto productoActual)
	{		
		//SI LOS PRODUTOS SON LOS MISMOS DEVUELVE VERDADERO
		if(productoActual.getIdProducto() == this.getProductoLinea().getIdProducto())
			return true;
		//SINO DEVUELVE FALSO
		else
			return false;
	}
	//---------------------------------------------------------------
}
