package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Venta 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idVenta;
	private Date fechaVenta;
	private Collection<datos.LineaDeVenta>  lineasDeVenta;
	private double total;
	//---------------------------------------------------------------
	
	
	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Venta() 
	{
		this.idVenta = 0;
		this.fechaVenta = new Date();
		this.lineasDeVenta = new ArrayList<datos.LineaDeVenta>();
		this.total = 0.00;
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************	
	public int getIdVenta() 
	{
		return idVenta;
	}
	
	public void setIdVenta(int idVenta) 
	{
		this.idVenta = idVenta;
	}

	public Date getFechaVenta() 
	{
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) 
	{
		this.fechaVenta = fechaVenta;
	}


	public Collection<datos.LineaDeVenta> getLineas() 
	{
		return lineasDeVenta;
	}


	public void setLineas(Collection<datos.LineaDeVenta> lineasDeVenta) 
	{
		this.lineasDeVenta = lineasDeVenta;
	}


	public double getTotal() 
	{
		return total;
	}


	public void setTotal(double total) 
	{
		this.total = total;
	}
	//---------------------------------------------------------------


	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// 	OBTIENE LAS LINEAS DE VENTA DE UNA VENTA ESPECIFICA		   //
	/////////////////////////////////////////////////////////////////
	public void obtenerLineasDeVenta(int idVenta)
	{
		Session session = null;	
			
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Ventas v where v.idVenta = :idV");
            query.setParameter("idV", idVenta);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.LineaDeVenta lineaDeVentaDatos = new datos.LineaDeVenta();
	           
	        	entidades.Ventas entVenta = (entidades.Ventas) it.next();
	        	
	            for(entidades.LineasDeVentas ELDV: entVenta.getLineasDeVentases())
	            {
	            	//datos de la linea
	            	lineaDeVentaDatos.setCantidad(ELDV.getCantidad()); 
	            	lineaDeVentaDatos.setSubTotal(ELDV.getSubtotal());
	            	//lineaDeVentaDatos.setIdVenta(ELDV.getId().getIdProducto());
	        	
		        	//se crea instancia de producto entidades
	            	entidades.Productos entProducto = ELDV.getProductos();
		        	
		        	//se crea instancia de producto datos
		        	datos.Producto productoDato = new datos.Producto();
		        	
		        	//se setean datos del producto
		        	productoDato.setCodProducto(entProducto.getCodProducto());
		        	productoDato.setCodProducto(entProducto.getCodProducto());
		        	productoDato.setExistenciaStock(entProducto.getStock());
		        	productoDato.setIdProducto(entProducto.getIdProducto());
		        	productoDato.setNombre(entProducto.getNombre());
		        	
		        	//se setea el producto en la linea
		        	lineaDeVentaDatos.setProductoLinea(productoDato);
		        	
		           	this.lineasDeVenta.add(lineaDeVentaDatos);
	            }
            }

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