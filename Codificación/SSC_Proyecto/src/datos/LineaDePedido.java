package datos;

public class LineaDePedido 
{
	//ATRIBUTOS
	datos.Producto producto;
	double subTotal;
	int cantidadPedida;
	
	
	//CONSTRUCTOR
	public LineaDePedido() 
	{
		this.producto = new datos.Producto();
		this.subTotal = 0.00;
		this.cantidadPedida = 0;
	}


	//GETTER & SETTER
	public datos.Producto getProducto() 
	{
		return producto;
	}


	public void setProducto(datos.Producto producto) 
	{
		this.producto = producto;
	}


	public double getSubTotal() 
	{
		return subTotal;
	}


	public void setSubTotal(double subTotal) 
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
	
	public void delete(datos.LineaDePedido linea)
	{
		
	}
}
