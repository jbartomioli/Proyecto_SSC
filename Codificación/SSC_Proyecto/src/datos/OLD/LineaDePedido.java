package datos.OLD;

public class LineaDePedido 
{
	//ATRIBUTOS
	private datos.OLD.Producto producto;
	private double subTotal;
	private int cantidadPedida;
	
	
	//CONSTRUCTOR
	public LineaDePedido() 
	{
		this.producto = new datos.OLD.Producto();
		this.subTotal = 0.00;
		this.cantidadPedida = 0;
	}


	//GETTER & SETTER
	public datos.OLD.Producto getProducto() 
	{
		return producto;
	}


	public void setProducto(datos.OLD.Producto producto) 
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
	
	public void delete(datos.OLD.LineaDePedido linea)
	{
		
	}
}
