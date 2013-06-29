import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;



public class Prueba {

	//static SessionFactory sessionFactory;
	
	public Prueba()
	{
	}

	
	public static void main(String [] args)
	{ 
		//utilidades.HibernateUtil util = new utilidades.HibernateUtil();
		//sessionFactory = util.getSessionFactory();
		
		//Session session = sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();

		String hqlInsert = "INSERT INTO categorias (descripcion) VALUES ('Anestesia')";
		
		/*," +
				"(2,'Descartables'), (3,'Materiales P/Obturacion'), (4,'Cementos/Prov./Acrilicos')," +
				"(5,'Materiales P/Impresion'), (6,'Endodoncia'), (7,'Radiologia'), (8,'Instrumental')," +
				"(9,'Aparatologia'), (10,'Rotatorio'), (11,'Papeleria'), (12,'Medicamentos'), " +
				"(13,'Varios'), (14,'Ortodoncia'), (15,'Implantes');";*/
		
		//SharedSessionContract s = null;
		
		//int createdEntities = s.createQuery( hqlInsert )
		//       .executeUpdate();
		//tx.commit();
		//session.close();
		
        Session session = utilidades.HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
         
        session.createQuery(hqlInsert);
        
        session.getTransaction().commit();
   }
	
}

