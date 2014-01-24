package datos;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ParametrosNegocio 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private String membrete;
	private int ultIdPedido;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public ParametrosNegocio() 
	{
		this.membrete = "";
		this.ultIdPedido = 0;
		this.obtenerParametrosNegocio();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public String getMembrete() 
	{
		return membrete;
	}

	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}

	public int getUltIdPedido() 
	{
		return ultIdPedido;
	}

	public void setUltIdPedido(int ultIdPedido) 
	{
		this.ultIdPedido = ultIdPedido;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************

	/////////////////////////////////////////////////////////////////
	// OBTIENE LOS DATOS DE PARAMETROS NEGOCIO                     //
	/////////////////////////////////////////////////////////////////
	public void obtenerParametrosNegocio()
	{
		
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
	        Query query = session.createQuery("from ParametrosNegocio");  
	        @SuppressWarnings("unchecked")
			List<Query> list = query.list();
	        
	        for(Iterator<Query> it=list.iterator();it.hasNext();)
	        {  
				datos.ParametrosNegocio parametrosDatos = new datos.ParametrosNegocio();
	           
				entidades.ParametrosNegocio entParametro = (entidades.ParametrosNegocio) it.next();  
	           
	        	parametrosDatos.setMembrete(entParametro.getId().getMembrete());
	        	parametrosDatos.setUltIdPedido(entParametro.getId().getUltIdPedido());
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
	//FALTA
	public void guardarDatos() 
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		    
		    session.refresh(this);
		    
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