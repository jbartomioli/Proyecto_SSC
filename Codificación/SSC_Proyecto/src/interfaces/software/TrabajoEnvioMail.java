package interfaces.software;

import java.util.Collection;

import javax.swing.JOptionPane;

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
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al procesar envío de mails");
        }
        catch(Exception e)
        {
        	if(e.toString().contains("AuthenticationFailedException"))
        	{
        		JOptionPane.showMessageDialog(
        				null,
        				"Se ha producido un error al iniciar sesión en el servidor de correo.\n"
        				+ "Revise que su configuración sea correcta.",
        				"ERROR",
        				JOptionPane.ERROR_MESSAGE);
        	}
        	
        	if(e.toString().contains("MessagingException"))
        	{
        		JOptionPane.showMessageDialog(
        				null,
        				"Se ha producido un error al enviar el correo.\n"
        				+ "Inténtelo más tarde.",
        				"ERROR",
        				JOptionPane.ERROR_MESSAGE);
        	}
        	
        	e.printStackTrace();
        }
    }
    
}
