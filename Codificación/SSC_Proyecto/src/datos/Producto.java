package datos;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;

public class Producto 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idProducto;
	private String codProducto;
	private String nombre;
	private int existenciaStock;
	private datos.SubCategoria subcategoria;
	private Collection<datos.Precio> precios;
	//private datos.Precio precios;
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
		this.subcategoria = new SubCategoria();
		this.precios = new ArrayList<datos.Precio>();
		//this.precios = new datos.Precio();
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

	public datos.SubCategoria getSubcategoria() 
	{
		return subcategoria;
	}

	public void setSubcategoria(datos.SubCategoria subcategoria) 
	{
		this.subcategoria = subcategoria;
	}

	public Collection<datos.Precio> getPrecios() 
	{
		return precios;
	}

	public void setPrecios(Collection<datos.Precio> precios) 
	{
		this.precios = precios;
	}
	//---------------------------------------------------------------


	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// DEFINE EL NUEVO PRECIO PROMOCIONAL DEL PRODUCTO			   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void setPrecioPromocional(datos.Precio nuevoPrecio, int idProducto)
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
			
			//SE CREA OBJETO PRECIO DE ENTIDADES PARA SETEAR Y ACTUALIZAR
			entidades.Precios entPrecio = new entidades.Precios();
			entidades.PreciosId entPrecioId = new entidades.PreciosId();
			
		    
		    //SE BUSCA EL PRECIO A ACTUALIZAR			
			entPrecioId.setIdPrecio(nuevoPrecio.getIdPrecio());
			entPrecioId.setIdProducto(idProducto);
			
			entPrecio = (entidades.Precios) 
		    		session.get(entidades.Precios.class, entPrecioId); 
		    		
			/**
			 * 
			 */
			System.out.println(entPrecio.toString());
			
			//SE SETEA EL NUEVO PRECIO
			entPrecio.setPrecioPromocional(nuevoPrecio.getPrecioPromocional());
					
			//SE ACTUALIZA EL PRODUCTO EN BD
			session.update(entPrecio); 
			
			//SE CONFIRMA TRANSACCION
	        session.getTransaction().commit();
					
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		 
		finally
		{
		 	session.close();
		}	
	}
	//---------------------------------------------------------------
}
