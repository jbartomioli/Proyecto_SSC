package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
		this.obtenerAnuncios();
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
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.Anuncio anuncioDatos = new datos.Anuncio();
	           
	        	entidades.Anuncios entAnuncio = (entidades.Anuncios) it.next();  
	           
				anuncioDatos.setIdAnuncio(entAnuncio.getIdAnuncio());
				anuncioDatos.setFecha(entAnuncio.getFecha());
				anuncioDatos.setEstado(entAnuncio.getEstado());
				anuncioDatos.setTextoMensaje(entAnuncio.getTextoMensaje());
				anuncioDatos.setMembrete(entAnuncio.getMembrete());
				
	           	anuncios.add(anuncioDatos);            
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


