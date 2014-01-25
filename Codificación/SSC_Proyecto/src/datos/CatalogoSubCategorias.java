package datos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class CatalogoSubCategorias 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private Collection<datos.SubCategoria> subcategorias;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public CatalogoSubCategorias() 
	{
		this.subcategorias = new ArrayList<datos.SubCategoria>();
		this.obtenerSubCategorias();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public Collection<datos.SubCategoria> getSubcategorias() 
	{
		return subcategorias;
	}

	public void setSubcatgorias(Collection<datos.SubCategoria> subcategorias) 
	{
		this.subcategorias = subcategorias;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************
	
	/////////////////////////////////////////////////////////////////
	// OBTIENE TODAS LAS SUBCATEGORIAS                             //
	/////////////////////////////////////////////////////////////////
	public void obtenerSubCategorias()
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
            Query query = session.createQuery("from Subcategorias");  
            @SuppressWarnings("unchecked")
			List<Query> list = query.list();
            
            //SE RECORRE CADA ELEMENTO DE LA CONSULTA
            for(Iterator<Query> it=list.iterator();it.hasNext();)
            {  
            	//SE CREA OBJETO SUBCATEGORIA DATOS PARA SETEARLO Y AGREGARLO EN EL ARRAY 
	        	datos.SubCategoria subCategoriaDatos = new datos.SubCategoria();
	           
	        	//SE CREA OBKJETO SUBCATEGORIA ENTIDADES PARA OBTENER DATOS DE LA BD
	        	entidades.Subcategorias entSubCategoria = (entidades.Subcategorias) it.next();  
	           
	        	//SE SETEAN LOS DATOS DE LA SUBCATEGORIA
	           	subCategoriaDatos.setIdSubcategoria(entSubCategoria.getId().getIdSubcategoria());
	           	subCategoriaDatos.setDescripcion(entSubCategoria.getDescripcion());
	           	
	           	//SE AGREGA LA SUBCATEGORIA EN EL ARRAY
	           	subcategorias.add(subCategoriaDatos);            
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
