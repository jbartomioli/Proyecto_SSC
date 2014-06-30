package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

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
	public void guardarAnuncio(datos.Anuncio anuncioActual) throws Exception
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
			
			
			//GUARDA EL ANUNCIO EN BD - INSERT
	        session.save(entAnuncio);
			
	        session.getTransaction().commit();
	        
	        
	        session.beginTransaction();
			Query query = session.createSQLQuery("SELECT MAX(idAnuncio) FROM anuncios");
	        int maxIdAnuncio = 0;
			maxIdAnuncio = Integer.parseInt(query.list().get(0).toString());
	        
			JOptionPane.showMessageDialog(null,maxIdAnuncio);
			
	        
	        {//SETEO DE CLIENTES
				for(datos.Cliente clienteDatos : anuncioActual.getClientes())
				{
					entidades.Clientes entCliente = new entidades.Clientes();
					
					entCliente.setIdCliente(clienteDatos.getIdCliente());
					
					query = session.createSQLQuery("INSERT INTO clientes_anuncios (idCliente,idAnuncio) VALUES (:cliente, :anuncio)");
					query.setParameter("cliente", entCliente.getIdCliente());
					query.setParameter("anuncio", maxIdAnuncio);
					query.executeUpdate();
				}
			}
			
			{//SETEO DE PRODUCTOS				
				for(datos.Producto productoDatos : anuncioActual.getProductos())
				{
					entidades.Productos entProducto = new entidades.Productos();
					
					entProducto.setIdProducto(productoDatos.getIdProducto());

					query = session.createSQLQuery("INSERT INTO productos_anuncios (idProducto,idAnuncio) VALUES (:producto, :anuncio)");
					query.setParameter("producto", entProducto.getIdProducto());
					query.setParameter("anuncio", maxIdAnuncio);
					query.executeUpdate();
				}
			}
	         

	        
	        //CONFIRMA LA TRANSACCION
	        session.getTransaction().commit();
		   
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


