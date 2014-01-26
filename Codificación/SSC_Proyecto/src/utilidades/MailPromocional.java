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
		this.propiedades = System.getProperties();
	}
	//---------------------------------------------------------------
	
	public void enviarMail() throws MessagingException
	{
		Configuraciones configuracionesMail = new Configuraciones();
		
		propiedades.put("mail.smtp.host", configuracionesMail.getSMTP_HOST());
		propiedades.put("mail.smtp.starttls.enable",configuracionesMail.getSMTP_TTLS());
		propiedades.put("mail.smtp.user", configuracionesMail.getSMTP_USER());
		propiedades.put("mail.smtp.port", configuracionesMail.getSMTP_PORT());
		propiedades.put("mail.smtp.auth", configuracionesMail.getSMTP_AUTH());
		
		final String usuarioMail = configuracionesMail.getSMTP_USER();
		final String passMail = configuracionesMail.getSMTP_PASS();
		
		javax.mail.Authenticator authenticator = new javax.mail.Authenticator()
	    {
	    protected javax.mail.PasswordAuthentication getPasswordAuthentication() 
	        {
	        return new javax.mail.PasswordAuthentication(usuarioMail,passMail);
	        }
	    };       
	
		//Session sesionMail = Session.getDefaultInstance(propiedades, authenticator);
		//sesionMail.setDebug(true);
	
		try
		{
			//Message mensaje = new MimeMessage(sesion);
			
			//mensaje.setSubject("Asunto");
			
			//mensaje.setFrom(new InternetAddress("sscproyecto@gmail.com"));
			
			//mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress("sscproyecto@gmail.com"));
			
			//mensaje.setText("Probando Mail");
						
			//Transport.send(mensaje);
			
		}
		finally
		{
			
		}
	}
}
