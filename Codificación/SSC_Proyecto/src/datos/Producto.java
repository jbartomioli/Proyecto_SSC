package datos;

public class Producto 
{
	//ATRIBUTOS
	private int idProducto;
	private String codProducto;
	private String nombre;
	private int existenciaStock;
	private datos.SubCategoria subcategoria;
	//private datos.Precio precio;
	
	
	//CONSTRUCTOR
	public Producto() 
	{
		this.idProducto = 0;
		this.codProducto =  "";		
		this.nombre = "";
		this.existenciaStock = 0;
		this.subcategoria = new SubCategoria();
		//this.precio = new Precio();
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


	public datos.SubCategoria getSubcategoria() {
		return subcategoria;
	}


	public void setSubcategoria(datos.SubCategoria subcategoria) {
		this.subcategoria = subcategoria;
	}


//	public datos.Precio getPrecio() {
//		return precio;
//	}
//
//
//	public void setPrecio(datos.Precio precio) {
//		this.precio = precio;
//	}



}
