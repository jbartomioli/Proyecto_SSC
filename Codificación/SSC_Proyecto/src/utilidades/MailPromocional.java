package utilidades;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
	public void enviarMail(String textoMensaje, String [] mailsDestinatarios, String asuntoMail)
	{
		try
		{
			this.propiedades = System.getProperties();

			
			Configuraciones configuracionesMail = new Configuraciones();
			
			this.propiedades.put("mail.smtp.host", configuracionesMail.getSMTP_HOST());
			this.propiedades.put("mail.smtp.starttls.enable",configuracionesMail.getSMTP_TTLS());
			this.propiedades.put("mail.smtp.user", configuracionesMail.getSMTP_USER());
			this.propiedades.put("mail.smtp.port", configuracionesMail.getSMTP_PORT());
			this.propiedades.put("mail.smtp.auth", configuracionesMail.getSMTP_AUTH());
			
			final String usuarioMail = configuracionesMail.getSMTP_USER();
			final String passMail = configuracionesMail.getSMTP_PASS();
			
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
			mensaje.setFrom(new InternetAddress(configuracionesMail.getSMTP_USER()));
				
			//SE DEFINEN DESTINATARIOS
			//mensaje.addRecipient(Message.RecipientType.TO, 
			//	new InternetAddress(...));
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(configuracionesMail.getSMTP_USER()));
			
			//SE DEFINE EL CONTENIDO DEL MAIL
			mensaje.setText(textoMensaje, "utf-8", "html");

			//SE ENVIA EL MENSAJE
			Transport.send(mensaje);
				
		}
		catch(Exception e)
		{

		}
		finally
		{
			
		}
	}
	//---------------------------------------------------------------

	
	/////////////////////////////////////////////////////////////////
	//	//
	/////////////////////////////////////////////////////////////////
	public String concatenarDirecciones(String [] mailsDestinatarios)
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
	
	
	
	public static void main(String [] args)
	{
		MailPromocional ma = new MailPromocional();
		
		ma.enviarMail("<h1>Probando un html</h1>", null, "Prueba");
	}
}
