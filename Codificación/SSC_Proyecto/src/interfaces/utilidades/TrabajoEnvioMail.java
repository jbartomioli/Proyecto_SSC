package interfaces.utilidades;

import java.util.Collection;

import javax.mail.MessagingException;


public class TrabajoEnvioMail implements Runnable{
    
    public static boolean band=false;    
    private String textoMensaje;
    private String [] mailsDestinatarios;
    private String asuntoMail;
    private Collection<String> imagenes;
    

    
    public TrabajoEnvioMail( 
    		int tiempo, 
    		String textoMensaje, 
    		String [] mailsDestinatarios, 
    		String asuntoMail, 
    		Collection<String> imagenes)
    {
        this.textoMensaje = textoMensaje;
        this.mailsDestinatarios = mailsDestinatarios;
        this.asuntoMail = asuntoMail; 
        this.imagenes = imagenes;
    }
    
    @Override
    public void run()
    {
        band=false;
    	utilidades.MailPromocional mail = new utilidades.MailPromocional();
		
        try
        {		

        	mail.enviarMail(textoMensaje, mailsDestinatarios, asuntoMail, imagenes);

        	Thread.sleep( 1000 );
        }
        catch (InterruptedException e)
        {
            System.err.println( e.getMessage() );
        }
        catch (MessagingException me) 
        {
        	//
		}
        finally
        {
        	band=true;
        }
    }
    
}
