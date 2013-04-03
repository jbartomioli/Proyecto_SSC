package datos;

import java.util.ArrayList;
import java.util.Collection;

public class Producto 
{
	//ATRIBUTOS
	int idProducto;
	String nombre;
	int existenciaStock;
	private Collection<datos.Precio> precios;
	
	
	//CONSTRUCTOR
	public Producto() 
	{
		this.idProducto = 0;
		this.nombre = "";
		this.existenciaStock = 0;
		this.precios = new ArrayList<datos.Precio>();
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


	public Collection<datos.Precio> getPrecios() 
	{
		return precios;
	}


	public void setPrecios(Collection<datos.Precio> precios) 
	{
		this.precios = precios;
	}
}
