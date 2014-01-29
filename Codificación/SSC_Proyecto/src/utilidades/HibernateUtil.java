package utilidades;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    @SuppressWarnings("deprecation")
	public static SessionFactory buildSessionFactory() {
        try {
            //CREA LA SESION A PARTIR DEL ARCHIVO hibernate.cfg.xml
            return new Configuration().configure("/main/resources/hibernate.cfg.xml").buildSessionFactory();
        }
        catch (Throwable ex) {
            //
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

