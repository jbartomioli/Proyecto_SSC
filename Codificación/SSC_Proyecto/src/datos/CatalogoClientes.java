package datos;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class CatalogoClientes 
{
	//ATRIBUTOS
	private Set<Clientes> clientes = new HashSet<Clientes>(0);
	
	
	//CONSTRUCTOR
	public CatalogoClientes() 
	{
		this.clientes = null;
		this.obtenerClientes();
	}


	//GETTER & SETTER
	public Set<Clientes> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Set<Clientes> clientes) 
	{
		this.clientes = clientes;
	}
	
	
	
	
	
	//METODOS
	//-------------------------------------------------------------
	public List obtenerClientes()
	{
		Session session = null;	
		List result = null;
		
		try
		{
			//SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
			//session = utilidades.HibernateUtil.getSessionFactory().getCurrentSession();
					    
		    session.beginTransaction();
	        result = session.createQuery("from Clientes").list();
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
        return result;
	}
}
