package interfaces.interfaces_software;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;


public class TrabajoInicializar implements Runnable{
    
    public static boolean band=false;    
    private negocio.ControladorConfeccionarAnuncio ctrlAnuncios;
	//private negocio.ControladorRealizarSeguimientoCliente controladorSeguimiento;
	//private negocio.ControladorRegistrarPedidoCliente controladorPedido;


    
    public TrabajoInicializar()
    {
    	this.ctrlAnuncios = new negocio.ControladorConfeccionarAnuncio();
    }
    
    @Override
    public void run()
    {
        band=false;
		
        try
        {		
        	ctrlAnuncios.inicializarCatalogos();
        	
        	//
			@SuppressWarnings("unused")
			interfaces.Principal principal = new interfaces.Principal(ctrlAnuncios);
        	
        	Thread.sleep( 1000 );
        }
        catch (InterruptedException e)
        {
            //System.err.println( e.getMessage() );
        }
		catch (NullPointerException npe)
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error grave.\n\n"
					+ "El sistema no puede continuar...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);		
		}
		catch(HibernateException he)
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error al conectarse al servidor.\n\n"
					+ "El sistema no puede continuar...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(
					null, 
					"Se ha producido un error grave.\n\n"
					+ "El sistema no puede continuar...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}
        finally
        {
        	band=true;
        }
    }
    
}
