package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Anuncio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int idAnuncio;
	private String textoMensaje;
	private String membrete;
	private String estado;
	private Date fecha;
	private Collection<datos.Cliente> clientes;
	private Collection<datos.Producto> productos;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Anuncio() 
	{
		this.idAnuncio = 0;
		this.textoMensaje = "";
		this.membrete = "";
		this.estado = "";
		this.fecha = new Date();
		this.productos = new ArrayList<datos.Producto>();
		this.clientes = new ArrayList<datos.Cliente>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.Producto> getProductos() 
	{
		return productos;
	}


	public void setProductos(Collection<datos.Producto> productos) 
	{
		this.productos = productos;
	}


	public Collection<datos.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<datos.Cliente> clientes) 
	{
		this.clientes = clientes;
	}


	public String getMembrete() 
	{
		return membrete;
	}


	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}


	public String getTextoMensaje() 
	{
		return textoMensaje;
	}


	public void setTextoMensaje(String textoMensaje) 
	{
		this.textoMensaje = textoMensaje;
	}


	public String getEstado() 
	{
		return estado;
	}


	public void setEstado(String estado) 
	{
		this.estado = estado;
	}


	public Date getFecha() 
	{
		return fecha;
	}


	public void setFecha(Date fecha) 
	{
		this.fecha = fecha;
	}


	public int getIdAnuncio() 
	{
		return idAnuncio;
	}


	public void setIdAnuncio(int idAnuncio) 
	{
		this.idAnuncio = idAnuncio;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// //
	/////////////////////////////////////////////////////////////////
	public void obtenerProductos(int idAnuncio)
	{
		Session session = null;	
			
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Anuncios a where a.idAnuncio = :idA");
            query.setParameter("idA", idAnuncio);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.Producto productoDatos = new datos.Producto();
	           
	        	entidades.Productos entProducto = (entidades.Productos) it.next();  
	           
	        	productoDatos.setCodProducto(entProducto.getCodProducto());
	        	productoDatos.setExistenciaStock(entProducto.getStock());
	        	productoDatos.setIdProducto(productoDatos.getIdProducto());
	        	productoDatos.setNombre(entProducto.getNombre());
	        	
	           	this.productos.add(productoDatos);
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
	
	
	/////////////////////////////////////////////////////////////////
	// //
	/////////////////////////////////////////////////////////////////
	public void obtenerClientes(int idAnuncio)
	{
		Session session = null;	
			
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Anuncios a where a.idAnuncio = :idA");
            query.setParameter("idA", idAnuncio);
            
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.Cliente clienteDato = new datos.Cliente();
	           
	        	entidades.Clientes entCliente = (entidades.Clientes) it.next();  
	           
	        	clienteDato.setApellido(entCliente.getApellido());
	        	clienteDato.setDireccion(entCliente.getDireccion());
	        	clienteDato.setEmail(entCliente.getEmail());
	        	clienteDato.setEspecialidad(entCliente.getEspecialidad());
	        	clienteDato.setIdCliente(entCliente.getIdCliente());
	        	clienteDato.setNombre(entCliente.getNombre());
	        	clienteDato.setTelefono(entCliente.getTelefono());
	        	clienteDato.setTipoCliente(entCliente.getTipo());
	        	
	           	this.clientes.add(clienteDato);
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


