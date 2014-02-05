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
	// OBTIENE LAS LINEAS DE VENTA DE UNA VENTA ESPECIFICA		   //
	/////////////////////////////////////////////////////////////////
	//LISTO
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
            
            //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA A LA BD
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  	           
	        	//SE CREA OBJETO VENTA DE ENTIDADES
	        	entidades.Ventas entVenta = (entidades.Ventas) it.next();
	        	
	        	//SE RECORRE CADA LINEA DE LA VENTA ACTUAL
	            for(entidades.LineasDeVentas entLinea: entVenta.getLineasDeVentases())
	            {
	            	//SE CREA OBJETO LINEA DE VENTA DE DATOS PARA
	            	//SETEARLE LOS DATOS Y AGREGARLO AL ARRAY
		        	datos.LineaDeVenta lineaDatos = new datos.LineaDeVenta();
		        	
		        	//SE SETEAN LOS DATOS DE LA LINEA
	            	lineaDatos.setCantidad(entLinea.getCantidad()); 
	            	lineaDatos.setSubTotal(entLinea.getSubtotal());
	            	lineaDatos.setIdVenta(entLinea.getId().getIdVenta());
	        	
	            	{//SETEO DEL PRODUCTO DE LA LINEA
		            	//SE CREA OBJETO PRODUCTO DE ENTIDADES
		            	entidades.Productos entProducto = entLinea.getProductos();
			        	
			        	//SE CREA OBJETO PRODUCTO DE DATOS PARA SETEO
			        	datos.Producto productoDato = new datos.Producto();
			        	
			        	//SE SETEAN DATOS DEL PRODUCTO
			        	productoDato.setCodProducto(entProducto.getCodProducto());
			        	productoDato.setExistenciaStock(entProducto.getStock());
			        	productoDato.setIdProducto(entProducto.getIdProducto());
			        	productoDato.setNombre(entProducto.getNombre());
			        	
			        	//SE SETEA EL PRODUCTO EN LA LINEA
			        	lineaDatos.setProductoLinea(productoDato);
	            	}
	            	
		        	//SE AGREGA LA LINEA EN EL ARRAY
		           	this.lineasDeVenta.add(lineaDatos);
	            }
            }
            //SE CONFIRMA LA TRANSACCION
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