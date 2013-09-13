package negocio;

public class LineaDePedido 
{
	//ATRIBUTOS
	private negocio.Producto producto;
	private float subTotal;
	private int cantidadPedida;
	
	
	//CONSTRUCTOR
	public LineaDePedido() 
	{
		this.producto = new negocio.Producto();
		this.subTotal = 0;
		this.cantidadPedida = 0;
	}


	//GETTER & SETTER
	public negocio.Producto getProducto() 
	{
		return producto;
	}


	public void setProducto(negocio.Producto producto) 
	{
		this.producto = producto;
	}


	public float getSubTotal() 
	{
		return subTotal;
	}


	public void setSubTotal(float subTotal) 
	{
		this.subTotal = subTotal;
	}


	public int getCantidadPedida() 
	{
		return cantidadPedida;
	}


	public void setCantidadPedida(int cantidadPedida) 
	{
		this.cantidadPedida = cantidadPedida;
	}


	
	//METODOS
	//----------------------------------------------------------------------------

	//
	public void setNuevoProducto(int idProductoNuevo) //REVEER PORQUE DEBERIA MANDAR EL PRODUCTO
	{												// ADEMAS DE PODER USARSE EL SET AUTOGENERADO
	//	this.idProducto = idProductoNuevo;
	}
	//*************************************************************

	//
	//REEVER PORQUE PUEDE USARSE EL SET AUTOGENERADO
	public void setNuevaCantidad(int cantidad) 
	{
		this.cantidadPedida = cantidad;
	}
	//*************************************************************



}
