package datos;

public class SubCategoria 
{
	//ATRIBUTOS
	int idSubcategoria;
	int idCategoria;
	String descripcion;
	int producto;
	
	
	//CONSTRUCTOR
	public SubCategoria() 
	{
		this.idSubcategoria = 0;
		this.idCategoria = 0;
		this.descripcion = "";
		this.producto = 0;
	}


	//GETTER & SETTERS
	public int getIdSubcategoria() 
	{
		return idSubcategoria;
	}


	public void setIdSubcategoria(int idSubcategoria) 
	{
		this.idSubcategoria = idSubcategoria;
	}


	public String getDescripcion() 
	{
		return descripcion;
	}


	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}


	public int getProductos() 
	{
		return producto;
	}


	public void setProducto(int producto) 
	{
		this.producto = producto;
	}


	public int getIdCategoria() 
	{
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}
	
	//METODOS
	//----------------------------------------------------------
	

}
