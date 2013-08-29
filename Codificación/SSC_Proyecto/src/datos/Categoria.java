package datos;


public class Categoria 
{
	//ATRIBUTOS
	private int idCategoria;
	private String descripcion;
	private int subCat;
	private int producto;
	
	
	//CONSTRUCTOR
	public Categoria() 
	{
		this.idCategoria = 0;
		this.descripcion = "";
		this.subCat = 0;
		this.producto = 0;
	}
	
	
	//GETTER & SETTER
	public int getIdCategoria() 
	{
		return idCategoria;
	}
	
	public void setIdCategoria(int idCategoria) 
	{
		this.idCategoria = idCategoria;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) 
	{
		this.descripcion = descripcion;
	}
	
	
	public int getSubCat() 
	{
		return subCat;
	}
	
	public void setSubCat(int subCat) 
	{
		this.subCat = subCat;
	}
	
	public int getProducto() 
	{
		return producto;
	}
	
	public void setProducto(int producto) 
	{
		this.producto = producto;
	}
}
