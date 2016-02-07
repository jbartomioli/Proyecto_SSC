package interfaces.software;

import interfaces.Principal;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


import utilidades.HibernateUtil;

public class TrabajoInicializar implements Runnable
{
    
	JDialog pantalla;
	
	/**
	 * CONSTRUCTOR
	 * @param pantallaBienvenida 
	 */
    public TrabajoInicializar(JDialog pantalla)
    {
    	this.pantalla = pantalla;
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
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(
					pantalla, 
					"Se ha producido un error grave al inicializar el sistema.\n"
					+ "Contáctese con los desarrolladores.\n\n"
					+ "El sistema no puede continuar...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
			e.printStackTrace();
		}
   }
    //////////////////
}
