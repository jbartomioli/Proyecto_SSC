package interfaces.software;

import interfaces.Principal;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;

import utilidades.HibernateUtil;

public class TrabajoInicializar implements Runnable{
    
	
	/**
	 * CONSTRUCTOR
	 */
    public TrabajoInicializar()
    {
    	
    }
    ////////////////////////////
    
    /**
     * 
     */
    @Override
    public void run()
    {		
        try
        {		
        	HibernateUtil.buildSessionFactory();
        	
        	Thread.sleep(2000);

			@SuppressWarnings("unused")
			Principal principal = new Principal();
        	
        }
        catch (InterruptedException e)
        {
            System.err.println( e.getMessage() );
        }
		catch(HibernateException he )
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al conectarse al servidor.\n\n"
					+ "El sistema no puede continuar...\n",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
			he.printStackTrace();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error grave.\n\n"
					+ "El sistema no puede continuar...\n",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
			e.printStackTrace();
		}
   }
    //////////////////
}
