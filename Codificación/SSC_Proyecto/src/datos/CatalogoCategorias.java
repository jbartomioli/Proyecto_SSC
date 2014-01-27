package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class CatalogoCategorias 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<datos.Categoria> categorias;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoCategorias() 
	{
		this.categorias = new ArrayList<datos.Categoria>();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.Categoria> getCategorias() 
	{
		return categorias;
	}

	public void setCategorias(Collection<datos.Categoria> categorias) 
	{
		this.categorias = categorias;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// Seteo del array de categorias a partir de la capa de datos  //
	/////////////////////////////////////////////////////////////////
	public void obtenerCategorias()
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Categorias");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
	        	datos.Categoria categoriaDatos = new datos.Categoria();
	           
	        	entidades.Categorias entCategoria = (entidades.Categorias) it.next();  
	           
	           	categoriaDatos.setIdCategoria(entCategoria.getIdCategoria());
	           	categoriaDatos.setDescripcion(entCategoria.getDescripcion());
	           	
	           	categorias.add(categoriaDatos);            
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
