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
	//LISTO
	public void obtenerParametrosNegocio() throws Exception
	{
		
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
	        Query query = session.createQuery("from ParametrosNegocio");  
	        @SuppressWarnings("unchecked")
			List<Query> list = query.list();
	        
	        //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA
	        for(Iterator<Query> it=list.iterator();it.hasNext();)
	        {             
	        	//SE CREA OBJETO PARAMETROSNEGOCIO DE ENTIDADES
				entidades.ParametrosNegocio entParametro = (entidades.ParametrosNegocio) it.next();  
	           
				//SE SETEAN LOS DATOS
	        	setMembrete(entParametro.getMembrete());
	        	setUltIdPedido(entParametro.getUltIdPedido());       	
	        }
	        //SE CONFIRMA TRANSACCION
	        session.getTransaction().commit();
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
	public void guardarDatos() throws Exception
	{
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		    
		    session.refresh(this);
		    
	        session.getTransaction().commit();
		}		 
		finally
		{
		 	session.close();
		}	
	}
	//---------------------------------------------------------------
}