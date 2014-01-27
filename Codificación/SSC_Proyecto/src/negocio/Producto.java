package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Producto 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idProducto;
	private String codProducto;
	private String nombre;
	private int existenciaStock;
	private negocio.SubCategoria subCategoria;
	private Collection<negocio.Precio> precios;
	//---------------------------------------------------------------


	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Producto() 
	{
		this.idProducto = 0;
		this.codProducto =  "";		
		this.nombre = "";
		this.existenciaStock = 0;
		this.subCategoria = new negocio.SubCategoria();
		this.precios = new ArrayList<negocio.Precio>();
	}
	//---------------------------------------------------------------


	
	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
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

	public Collection<negocio.Precio> getPrecios() 
	{
		return precios;
	}

	public void setPrecios(Collection<negocio.Precio> precios) 
	{
		this.precios = precios;
	}
	//---------------------------------------------------------------

		
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE EL PRECIO VIGENTE DEL PRODUCTO					   //
	/////////////////////////////////////////////////////////////////
	//VER
	public float getPrecioActual()
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio p: this.getPrecios())
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO VIGENTE
			if (p.getFechaHasta() == null)
				return p.getPrecio();
			//SINO CONTINUA ITERANDO
			else 
				//return 0;
				continue;
		}
		//FINALMENTE SI NO TIENE PRECIO DEVUELVE 0
		return 0;
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE EL PRECIO PROMOCIONAL DEL PRODUCTO				   //
	/////////////////////////////////////////////////////////////////
	//VER
	public float getPrecioPromocional()
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio p: this.getPrecios())
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO PROMOCIONAL VIGENTE
			if (p.getFechaHasta() == null)
				return p.getPrecioPromocional();
			//SINO CONTINUA ITERANDO
			else 
				//return 0;
				continue;
		}
		//FINALMENTE SI NO TIENE PRECIO DEVUELVE 0
		return 0;
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// DEFINE EL NUEVO PRECIO PROMOCIONAL DEL PRODUCTO			   //
	/////////////////////////////////////////////////////////////////
	//VER - FALTARIA ACTUALIZAR EN BD
	public void setPrecioPromocional(float nuevoPrecio)
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio p: this.precios)
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO PROMOCIONAL VIGENTE
			if (p.getFechaHasta() == null)
			{
				//SE MODIFICA EL PRECIO DEL PRODUCTO
				p.setPrecioPromocional(nuevoPrecio);
				
				//SE CORTA LA ITERACION
				break;
			}
		}
	}
	//---------------------------------------------------------------

}
