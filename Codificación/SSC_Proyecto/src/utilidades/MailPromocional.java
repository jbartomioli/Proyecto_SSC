package utilidades;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

import org.infinispan.util.Base64;

public class MailPromocional {
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	Properties propiedades;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public MailPromocional()
	{
		this.propiedades = null;
	}
	//---------------------------------------------------------------
	
	
	
	
	//***************************************************************
	//* METODOS														*
	//***************************************************************	
	
	/////////////////////////////////////////////////////////////////
	//	//
	/////////////////////////////////////////////////////////////////
	public void enviarMail(String textoMensaje, String [] mailsDestinatarios, String asuntoMail) throws MessagingException
	{
		try
		{
			this.propiedades = System.getProperties();

						
			this.propiedades.put("mail.smtp.host", utilidades.Configuraciones.SMTP_HOST);
			this.propiedades.put("mail.smtp.starttls.enable",utilidades.Configuraciones.SMTP_TTLS);
			this.propiedades.put("mail.smtp.user", utilidades.Configuraciones.SMTP_USER);
			this.propiedades.put("mail.smtp.port", utilidades.Configuraciones.SMTP_PORT);
			this.propiedades.put("mail.smtp.auth", utilidades.Configuraciones.SMTP_AUTH);
			
			final String usuarioMail = utilidades.Configuraciones.SMTP_USER;
			final String passMail = utilidades.Configuraciones.SMTP_PASS;
			
			javax.mail.Authenticator authenticator = new javax.mail.Authenticator()
		    {
		    protected javax.mail.PasswordAuthentication getPasswordAuthentication() 
		        {
		        return new javax.mail.PasswordAuthentication(usuarioMail,passMail);
		        }
		    };       
		
			Session sesionMail = Session.getDefaultInstance(this.propiedades, authenticator);
			sesionMail.setDebug(true);
		    
			//SE CREA EL MENSAJE
			MimeMessage mensaje = new MimeMessage(sesionMail);
			
			//SE DEFINE EL ASUNTO DEL MAIL
			mensaje.setSubject(asuntoMail);
			
			//SE DEFINE EL REMITENTE
			mensaje.setFrom(new InternetAddress(utilidades.Configuraciones.SMTP_USER));
				
			//SE DEFINEN DESTINATARIOS
			//mensaje.addRecipient(Message.RecipientType.TO, 
			//	new InternetAddress(...));
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(utilidades.Configuraciones.SMTP_USER));
			
			
			//SE DEFINE EL CONTENIDO DEL MAIL
			MimeMultipart multipart = new MimeMultipart("related");
			
			// first part  (the html)
	        BodyPart messageBodyPart = new MimeBodyPart();
	        //String htmlText = "<H1>Prueba Adjuntos</H1><img src=\"cid:CONFECCIONAR_300.png\">";
	        String htmlText = 
	        		"<H1>Prueba Adjuntos</H1><img src=\"data:image/png;base64,"+
	        		Base64.encodeFromFile("D:\\Proyecto_Final_SSC\\Codificaci\u00F3n\\SSC_Proyecto\\recursos\\iconos\\CONFECCIONAR_300.png").toString()+"\"";
	        messageBodyPart.setContent(htmlText, "text/html");
	        
	        // add it
	        multipart.addBodyPart(messageBodyPart);

	        // put everything together
	        mensaje.setContent(multipart);
			
			//SE ENVIA EL MENSAJE
			Transport.send(mensaje);
				
		}
		finally
		{
			
		}
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//	//
	/////////////////////////////////////////////////////////////////
	private String concatenarDirecciones(String [] mailsDestinatarios)
	{
		String concatenacion = "";
		int i = 0;
		
		concatenacion = mailsDestinatarios[0]+",";
		
		for(i=1; i<=mailsDestinatarios.length; i++)
		{
			concatenacion = concatenacion + "," + mailsDestinatarios[i];
		}
		return concatenacion;
	}
	//---------------------------------------------------------------
}
