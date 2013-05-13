package datos;

public class Producto 
{
	//ATRIBUTOS
	int idProducto;
	String codProducto;
	String nombre;
	int existenciaStock;
	int idSubCategoria;
	int idPrecio;
	
	
	//CONSTRUCTOR
	public Producto() 
	{
		this.idProducto = 0;
		this.codProducto =  "";		
		this.nombre = "";
		this.existenciaStock = 0;
		this.idPrecio = 0;
	}


	//GETTER & SETTER
	public int getIdProducto() 
	{
		return idProducto;
	}


	public void setIdProducto(int idProducto) 
	{
		this.idProducto = idProducto;
	}


	public String getCodProducto()
	{
		return codProducto;
	}
	
	public void setCodProducto(String codProducto)
	{
		this.codProducto = codProducto;
	}
	
	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	public int getExistenciaStock() 
	{
		return existenciaStock;
	}


	public void setExistenciaStock(int existenciaStock) 
	{
		this.existenciaStock = existenciaStock;
	}


	public int getPrecios() 
	{
		return idPrecio;
	}


	public void setPrecios(int idPrecio) 
	{
		this.idPrecio = idPrecio;
	}
	
	public int getIdSubCategoria() 
	{
		return idSubCategoria;
	}


	public void setIdSubCategoria(int idSubCategoria) 
	{
		this.idSubCategoria = idSubCategoria;
	}
}
