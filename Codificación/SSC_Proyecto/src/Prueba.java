
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Categorias;



public class Prueba {

	//static SessionFactory sessionFactory;
	
	public Prueba()
	{
	}

	
	public static void main(String [] args)
	{ 
		
		Session session = null;
		Transaction tran = null;
		try
		{
			//SessionFactory sessFact = new Configuration().configure().buildSessionFactory();
		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
			//session = utilidades.HibernateUtil.getSessionFactory().getCurrentSession();
			
		    tran = session.beginTransaction();
		    
		    /*
		    Categorias categoria = new Categorias();
		    
		    categoria.setDescripcion("Anestesia");
		    
		    session.save(categoria);
		      */
		    tran.commit();
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
	
}