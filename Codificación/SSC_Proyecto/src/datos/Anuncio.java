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
	// OBTIENE LOS PRODUCTOS DE UN ANUNCIO ANTERIOR				   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerProductos(int idAnuncio) throws Exception
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
            
            //SETEO DE LOS PRODUCTOS DEL ANUNCIO
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//OBJETO PRODUCTO DE DATO TEMPORAL PARA AGREGAR AL ARRAY
	        	datos.Producto productoDatos = new datos.Producto();
	           
	        	//OBJETO PRODUCTO DE ENTIDADES PARA RECORRER CADA 
	        	//ELEMENTO RESULTANTE DE LA CONSULTA
	        	entidades.Productos entProducto = (entidades.Productos) it.next();  
	           
	        	//SE SETEAN LOS DATOS DEL PRODUCTO
	        	productoDatos.setCodProducto(entProducto.getCodProducto());
	        	productoDatos.setExistenciaStock(entProducto.getStock());
	        	productoDatos.setIdProducto(productoDatos.getIdProducto());
	        	productoDatos.setNombre(utilidades.Utilidades.utf8_decode(entProducto.getNombre()));
	        	
	        	//SE AGREGA EL PRODUCTO AL ARRAY DE PRODUCTOS DEL ANUNCIO ACTUAL
	           	this.productos.add(productoDatos);
            }
            
            //SE CONFIRMA LA TRANSACCION           
	        session.getTransaction().commit();
		} 
		finally
		{
		 	session.close();
		}	
	}
	//---------------------------------------------------------------
	
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE LOS CLIENTES DESTINATARIOS DE UN ANUNCIO ANTERIOR   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerClientes(int idAnuncio) throws Exception
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
            
            //SETEO DE LOS CLIENTES DESTINATARIOS DEL ANUNCIO
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO CLIENTE DATO TEMPORAL PARA AGREGARLO EN EL ARRAY
	        	datos.Cliente clienteDato = new datos.Cliente();
	           
	        	//OBJETO CLIENTE DE ENTIDADES PARA RECORRER CADA 
	        	//ELEMENTO RESULTANTE DE LA CONSULTA
	        	entidades.Clientes entCliente = (entidades.Clientes) it.next();  
	           
	        	//SE SETEAN LOS DATOS DEL CLIENTE EN EL OBJETO CLIENTE DE DATOS
	        	clienteDato.setApellido(utilidades.Utilidades.utf8_decode(entCliente.getApellido()));
	        	clienteDato.setDireccion(utilidades.Utilidades.utf8_decode(entCliente.getDireccion()));
	        	clienteDato.setEmail(utilidades.Utilidades.utf8_decode(entCliente.getEmail()));
	        	clienteDato.setEspecialidad(utilidades.Utilidades.utf8_decode(entCliente.getEspecialidad()));
	        	clienteDato.setIdCliente(entCliente.getIdCliente());
	        	clienteDato.setNombre(utilidades.Utilidades.utf8_decode(entCliente.getNombre()));
	        	clienteDato.setTelefono(entCliente.getTelefono());
	        	clienteDato.setTipoCliente(entCliente.getTipo());
	        	
	        	//SE AGREGA EL CLIENTE EN EL ARRAY
	           	this.clientes.add(clienteDato);
            }

	        session.getTransaction().commit();
		} 
		finally
		{
		 	session.close();
		}	
	}
	//---------------------------------------------------------------
}


