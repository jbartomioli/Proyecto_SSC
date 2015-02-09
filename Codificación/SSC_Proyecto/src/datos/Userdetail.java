package datos;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class Userdetail 
{
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	private int id;
	private String name;
	private String username;
	private String password;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Userdetail() 
	{
		this.id = 0;
		this.name = "";
		this.username = "";
		this.password = "";
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS 													*
	//***************************************************************

	

	/////////////////////////////////////////////////////////////////
	//  //
	/////////////////////////////////////////////////////////////////
	//LISTO
	public void obtenerUser(String user, String password) throws Exception
	{
		
		Session session = null;	
		
		try
		{
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
		    session.beginTransaction();
		        
	        Query query = session.createQuery("from Userdetail u where u.username like :uName and u.password like :uPass");
            query.setParameter("uName", user);
            query.setParameter("uPass", password);
	        @SuppressWarnings("unchecked")
			List<Query> list = query.list();
	        
	        //SE RECORRE CADA ELEMENTO RESULTANTE DE LA CONSULTA
	        for(Iterator<Query> it=list.iterator();it.hasNext();)
	        {             
	        	//SE CREA OBJETO  DE ENTIDADES
				entidades.Userdetail entUserdetail = (entidades.Userdetail) it.next();  
	           
				//SE SETEAN LOS DATOS
	        	setName(entUserdetail.getName());
	        	setUsername(entUserdetail.getUsername());
	        	setPassword(entUserdetail.getPassword());
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
}