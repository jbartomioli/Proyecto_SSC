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
	//private negocio.Precio precios;
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
		//this.precios = new negocio.Precio();
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
		
	public String toString()
	{
		return nombre;
	}
	//---------------------------------------------------------------

		
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE EL PRECIO ACTUAL DEL PRODUCTO					   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public float getPrecioActual()
	{		
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio precioNegocio: this.getPrecios())
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO VIGENTE
			if (precioNegocio.getFechaHasta() == null)
				return precioNegocio.getPrecio();
			//SINO CONTINUA ITERANDO
			else 
				continue;
		}
		//FINALMENTE SI NO TIENE PRECIO DEVUELVE NULO
		return 0;
		
		//negocio.Precio precioNegocio = new negocio.Precio();
		
		//return precioNegocio.getPrecio();
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE EL PRECIO PROMOCIONAL DEL PRODUCTO				   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public float getPrecioPromocional()
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio precioNegocio: this.getPrecios())
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO PROMOCIONAL VIGENTE
			if (precioNegocio.getFechaHasta() == null)
				return precioNegocio.getPrecioPromocional();
			//SINO CONTINUA ITERANDO
			else 
				continue;
		}
		//FINALMENTE SI NO TIENE PRECIO DEVUELVE 0
		return 0;
		
		//negocio.Precio precioNegocio = new negocio.Precio();
		
		//return precioNegocio.getPrecioPromocional();
	}
	//---------------------------------------------------------------
	
	
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE EL PRECIO VIGENTE DEL PRODUCTO				       //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public negocio.Precio getPrecioVigente()
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio precioNegocio: this.getPrecios())
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO VIGENTE
			if (precioNegocio.getFechaHasta() == null)
				return precioNegocio;
			//SINO CONTINUA ITERANDO
			else 
				continue;
		}
		//FINALMENTE SI NO TIENE PRECIO DEVUELVE NULO
		return null;
		
		/*negocio.Precio precioNegocio = new negocio.Precio();
		
		precioNegocio = this.getPrecios();
		
		return precioNegocio;*/
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// DEFINE EL NUEVO PRECIO PROMOCIONAL DEL PRODUCTO			   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void setPrecioPromocional(float nuevoPrecio)
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio precioNegocio: this.precios)
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO VIGENTE
			if (precioNegocio.getFechaHasta() == null)
			{
				//SE MODIFICA EL PRECIO DEL PRODUCTO
				precioNegocio.setPrecioPromocional(nuevoPrecio);
				
				//SE CREA OBJETO PRODUCTO DE DATOS PARA ACTUALIZAR EN LA BD
				datos.Producto productoDatos = new datos.Producto();
				
				//SE CREA OBJETO PRECIO DE DATOS PARA SETEOS
				datos.Precio precioDatos = new datos.Precio();
				
				//SE SETEAN LOS DATOS NECESARIOS
				precioDatos.setIdPrecio(precioNegocio.getIdPrecio());
				precioDatos.setPrecioPromocional(nuevoPrecio);
				
				//SE GUARDA EN BD
				productoDatos.setPrecioPromocional(precioDatos);
								
				//SE CORTA LA ITERACION
				break;
			}
		}
	}
	//---------------------------------------------------------------
	
	/////////////////////////////////////////////////////////////////
	// DEFINE EL NUEVO PRECIO VIGENTE DEL PRODUCTO  			   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void setPrecio(float nuevoPrecio)
	{
		//SE RECORRE EL HISTORICO DE PRECIOS
		for(negocio.Precio precioNegocio: this.precios)
		{
			//SI LA FECHA HASTA ES NULA EL PRECIO ACTUAL
			//ES EL PRECIO VIGENTE
			if (precioNegocio.getFechaHasta() == null)
			{
				//SE MODIFICA EL PRECIO DEL PRODUCTO
				precioNegocio.setPrecio(nuevoPrecio);

				//SE CREA OBJETO PRODUCTO DE DATOS PARA ACTUALIZAR EN LA BD
				datos.Producto productoDatos = new datos.Producto();

				//SE CREA OBJETO PRECIO DE DATOS PARA SETEOS
				datos.Precio precioDatos = new datos.Precio();

				//SE SETEAN LOS DATOS NECESARIOS
				precioDatos.setIdPrecio(precioNegocio.getIdPrecio());
				precioDatos.setPrecioPromocional(nuevoPrecio);

				//SE GUARDA EN BD
				productoDatos.setPrecioPromocional(precioDatos);

				//SE CORTA LA ITERACION
				break;
			}
		}
	}
	//---------------------------------------------------------------

}
