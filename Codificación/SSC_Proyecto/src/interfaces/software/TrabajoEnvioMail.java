package interfaces.software;

import java.util.Collection;

import negocio.ModeloConfeccionarAnuncio;





public class TrabajoEnvioMail implements Runnable{
	
    private ModeloConfeccionarAnuncio modeloConfeccionarAnuncio;
    private String [] mailsDestinatarios;
    private String asuntoMail;
    private Collection<String> imagenes;
        
    
    public TrabajoEnvioMail( 
    		int tiempo, 
    		ModeloConfeccionarAnuncio modeloConfeccionarAnuncio,
    		String [] mailsDestinatarios, 
    		String asuntoMail, 
    		Collection<String> imagenes)
    {
    	this.modeloConfeccionarAnuncio = modeloConfeccionarAnuncio;
        this.mailsDestinatarios = mailsDestinatarios;
        this.asuntoMail = asuntoMail; 
        this.imagenes = imagenes;
    }
    
    @Override
    public void run()
    {		
        try
        {		
        	modeloConfeccionarAnuncio.enviarAnuncio(mailsDestinatarios, asuntoMail, imagenes);
        	
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
