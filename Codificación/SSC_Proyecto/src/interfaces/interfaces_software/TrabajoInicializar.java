package interfaces.interfaces_software;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;


public class TrabajoInicializar implements Runnable{
    
    public TrabajoInicializar()
    {
    	
    }
    
    @Override
    public void run()
    {		
        try
        {		
			@SuppressWarnings("unused")
			interfaces.Principal principal = new interfaces.Principal();
        	
        	Thread.sleep( 1000 );
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
        finally
        {
        }
    }
    
}
