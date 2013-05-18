package negocio;

import java.util.Collection;


public class Producto 
{
	//ATRIBUTOS
	public int idProducto;
	public String codProducto;
	public String nombre;
	public int existenciaStock;
	public negocio.SubCategoria subCategoria;
	public Collection<negocio.Precio> precios;
	
	
	//CONSTRUCTOR
	public Producto() 
	{
		this.idProducto = 0;
		this.codProducto =  "";		
		this.nombre = "";
		this.existenciaStock = 0;
		this.subCategoria = null;
		this.precios = null;
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



	public negocio.SubCategoria getSubCategoria() 
	{
		return subCategoria;
	}


	public void setSubCategoria(negocio.SubCategoria subCategoria) 
	{
		this.subCategoria = subCategoria;
	}
	
	
	public Collection<negocio.Precio> getPrecio() 
	{
		return precios;
	}


	public void setPrecio(Collection<negocio.Precio> precios) 
	{
		this.precios = precios;
	}
	
	
	//METODOS
	//----------------------------------------------------------
	public double getPrecioActual()
	{
		
		for(negocio.Precio precio: this.getPrecio())
		{
			if (precio.getFechaHasta() == null)
			{
				return precio.getPrecio();
			}
			else 
				return 0;
		}
		
		return 0;
	}
}
