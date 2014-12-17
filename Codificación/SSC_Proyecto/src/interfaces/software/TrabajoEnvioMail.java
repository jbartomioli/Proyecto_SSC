package interfaces.software;

import java.util.Collection;





public class TrabajoEnvioMail implements Runnable{
	
    private negocio.ControladorConfeccionarAnuncio controlador;
    private String [] mailsDestinatarios;
    private String asuntoMail;
    private Collection<String> imagenes;
        
    
    public TrabajoEnvioMail( 
    		int tiempo, 
    		negocio.ControladorConfeccionarAnuncio controlador,
    		String [] mailsDestinatarios, 
    		String asuntoMail, 
    		Collection<String> imagenes)
    {
    	this.controlador = controlador;
        this.mailsDestinatarios = mailsDestinatarios;
        this.asuntoMail = asuntoMail; 
        this.imagenes = imagenes;
    }
    
    @Override
    public void run()
    {		
        try
        {		
        	controlador.enviarAnuncio(mailsDestinatarios, asuntoMail, imagenes);
        	
        	Thread.sleep( 1000 );
        }
        catch (InterruptedException e)
        {
            System.err.println( e.getMessage() );
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally
        {
        }
    }
    
}
