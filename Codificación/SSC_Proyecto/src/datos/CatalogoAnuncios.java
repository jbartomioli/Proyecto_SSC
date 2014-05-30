package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

public class CatalogoAnuncios 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<datos.Anuncio> anuncios;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoAnuncios() 
	{
		this.anuncios = new ArrayList<datos.Anuncio>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.Anuncio> getAnuncios() {
		return anuncios;
	}


	public void setAnuncios(Collection<datos.Anuncio> anuncios) {
		this.anuncios = anuncios;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODOS LOS ANUNCIOS 								   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerAnuncios()
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Anuncios");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SETEO DE LOS DATOS DEL ANUNCIO
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO ANUNCIO DE DATOS TEMPORAL PARA AGREGARLO AL ARRAY
	        	datos.Anuncio anuncioDatos = new datos.Anuncio();
	           
	        	//SE CREA OBJETO ANUNCIO DE ENTIDADES PARA RECORRER
	        	//CADA ELEMENTO DE LA CONSULTA A LA BD
	        	entidades.Anuncios entAnuncio = (entidades.Anuncios) it.next();  
	           
	        	//SE SETEAN LOS DATOS DEL ANUNCIO
				anuncioDatos.setIdAnuncio(entAnuncio.getIdAnuncio());
				anuncioDatos.setFecha(entAnuncio.getFecha());
				anuncioDatos.setEstado(entAnuncio.getEstado());
				anuncioDatos.setTextoMensaje(entAnuncio.getTextoMensaje());
				anuncioDatos.setMembrete(entAnuncio.getMembrete());
				
				//SE AGREGA EL ANUNCIO EN EL ARRAY
	           	anuncios.add(anuncioDatos);            
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
	
	
	/////////////////////////////////////////////////////////////////
	// GUARDA EL NUEVO ANUNCIO EN LA BD							   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void guardarAnuncio(datos.Anuncio anuncioActual)
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		    
		    //SE CREA ANUNCIO DE ENTIDADES PARA SETEO DE DATOS
		    entidades.Anuncios entAnuncio = new entidades.Anuncios();
		    
			//SE SETEAN LOS DATOS DEL ANUNCIO
		    entAnuncio.setIdAnuncio(anuncioActual.getIdAnuncio());
		    entAnuncio.setFecha(anuncioActual.getFecha());
		    entAnuncio.setEstado(anuncioActual.getEstado());
		    entAnuncio.setMembrete(anuncioActual.getMembrete());
			entAnuncio.setTextoMensaje(anuncioActual.getTextoMensaje());
			
			
			{//SETEO DE CLIENTES
				for(datos.Cliente clienteDatos : anuncioActual.getClientes())
				{
					entidades.Clientes entCliente = new entidades.Clientes();
					
					entCliente.setIdCliente(clienteDatos.getIdCliente());
				}
			}
			
			
			{//SETEO DE PRODUCTOS
				Set<entidades.Productos> arrayProductos = new HashSet<entidades.Productos>(0);
				
				for(datos.Producto productoDatos : anuncioActual.getProductos())
				{
					entidades.Productos entProducto = new entidades.Productos();
					
					entProducto.setIdProducto(productoDatos.getIdProducto());
					
					arrayProductos.add(entProducto);
				}
				entAnuncio.setProductoses(arrayProductos);
			}
	         
			//GUARDA EL ANUNCIO EN BD - INSERT
	        session.save(entAnuncio);
	        
	        //CONFIRMA LA TRANSACCION
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
	// GUARDA EN EL ANUNCIO EL NUEVO CONJUNTO DE CLIENTES 		   //
	/////////////////////////////////////////////////////////////////
	//VER
	public void guardarCambioClientesAnuncio(datos.Anuncio anuncioActual)
	{
		
	}
	//---------------------------------------------------------------
}


