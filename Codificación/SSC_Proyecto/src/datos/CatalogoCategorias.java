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
	// OBTIENE TODAS LAS CATEGORIAS DE LA BD					   //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerCategorias() throws Exception
	{ 
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Categorias");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE RECORRE EL CONJUNTO RESULTANTE DE LA CONSULTA
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO CATEGORIA DE DATOS PARA DESPUES AGREGARLO AL ARRAY
	        	datos.Categoria categoriaDatos = new datos.Categoria();
	           
	        	//SE CREA OBJETO CATEGORIA DE ENTIDADES PARA RECUPERAR DATOS
	        	entidades.Categorias entCategoria = (entidades.Categorias) it.next();  
	           
	        	//SE SETEA LA CATEGORIA DE DATOS
	           	categoriaDatos.setIdCategoria(entCategoria.getIdCategoria());
	           	categoriaDatos.setDescripcion(utilidades.Utilidades.utf8_decode(entCategoria.getDescripcion()));
	           	
	           	//SE AGREGA LA CATEGORIA AL ARRAY
	           	categorias.add(categoriaDatos);            
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
}
