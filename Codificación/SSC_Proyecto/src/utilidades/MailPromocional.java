package utilidades;

import java.io.File;
import java.util.Collection;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class MailPromocional {
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	Properties propiedades;
	MimeMultipart multipart;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public MailPromocional()
	{
		this.propiedades = null;
		this.multipart = new MimeMultipart("related");
	}
	//---------------------------------------------------------------
	
	
	
	
	//***************************************************************
	//* METODOS														*
	//***************************************************************	
	
	/////////////////////////////////////////////////////////////////
	//	//
	/////////////////////////////////////////////////////////////////
	public void enviarMail(String textoMensaje, String [] mailsDestinatarios, String asuntoMail, Collection<String> imagenes) throws MessagingException
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
			sesionMail.setDebug(false);
		    
			//SE CREA EL MENSAJE
			MimeMessage mensaje = new MimeMessage(sesionMail);
			
			//SE DEFINE EL ASUNTO DEL MAIL
			mensaje.setSubject(asuntoMail);
			
			//SE DEFINE EL REMITENTE
			mensaje.setFrom(new InternetAddress(utilidades.Configuraciones.SMTP_USER));
				
			//SE DEFINEN DESTINATARIOS
			for(int i = 0 ; i<mailsDestinatarios.length ; i++)
			{
				mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(mailsDestinatarios[i]));
			}
						
	        
	        addContent(textoMensaje);
	        
	        int cidCont = 0;
	        
	        for(String imgString : imagenes)
	        {	
	        	String cid = "IMG"+cidCont;
	        	addCID(cid,imgString);
	        	++cidCont;
	        	addAttach(imgString,cid);
	        }
	        
	        mensaje.setContent(multipart);
	        
	        Transport.send(mensaje);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}
	
	
	
	//---------------------------------------------------------------
	public void addCID(String cidname,String pathname) throws Exception
    {
        DataSource fds = new FileDataSource(pathname);
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setDataHandler(new DataHandler(fds));
        messageBodyPart.setHeader("Content-ID","<"+cidname+">");
        this.multipart.addBodyPart(messageBodyPart);
    }
	
	//---------------------------------------------------------------
	public void addContent(String htmlText) throws Exception
    {
        // first part (the html)
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(htmlText, "text/html");
        // add it
        this.multipart.addBodyPart(messageBodyPart);
    }
	
	//---------------------------------------------------------------
	public void addAttach(String pathname, String cid) throws Exception
    {
        File file = new File(pathname);
        BodyPart messageBodyPart = new MimeBodyPart();
        DataSource ds = new FileDataSource(file);
        messageBodyPart.setDataHandler(new DataHandler(ds));
        //messageBodyPart.setFileName(file.getName());
        messageBodyPart.setFileName(cid+".JPG");
        messageBodyPart.setDisposition(Part.ATTACHMENT);
        this.multipart.addBodyPart(messageBodyPart);
    }
	
	//---------------------------------------------------------------
	public void sendMultipart() throws Exception
    {
//        Session mailSession = Session.getDefaultInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication("miUsuarioGmail","misPassword");
//                    }
//                });
//        //mailSession.setDebug(true);
//        Transport transport = mailSession.getTransport();
//        MimeMessage message = new MimeMessage(mailSession);
//        message.setSubject(this.getSubject());
//        message.setFrom(new InternetAddress(this.getFrom()));
//        message.addRecipient(Message.RecipientType.TO,
//                new InternetAddress(this.getTo()));
        // put everything together
//        message.setContent(multipart);
//        transport.connect();
//        transport.sendMessage(message,
//                message.getRecipients(Message.RecipientType.TO));
//        transport.close();
    }
}
