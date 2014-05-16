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
			
			for(int i = 0 ; i<mailsDestinatarios.length ; i++)
			{
				mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(mailsDestinatarios[i]));
			}
						
			
			//SE DEFINE EL CONTENIDO DEL MAIL
			//MimeMultipart multipart = new MimeMultipart("related");
			
			// first part  (the html)
	        //BodyPart messageBodyPart = new MimeBodyPart();
	        
	        String cabecera = "<HTML><BODY><img src='cid:cidcabecera'/><br/><br/>";
	        String pie = "<img src='cid:cidpie'/><br/><br/></BODY></HTML>";
	        
	        //messageBodyPart.setContent(cabecera,"text/html; charset=iso-8859-1");

//	        messageBodyPart.setContent(htmlText, "text/html");
	        //messageBodyPart.setContent(textoMensaje, "text/html; charset=iso-8859-1");
	        
	        //messageBodyPart.setContent(pie,"text/html; charset=iso-8859-1");
	        
	        addContent(cabecera+textoMensaje+pie);
	        
	        int cidCont = 0;
	        
	        for(String imgString : imagenes)
	        {	
	        	addCID("IMG"+cidCont,imgString);
	        	++cidCont;
	        }
	        
	        addCID("cidcabecera", "C:\\Proyecto_SSC\\Codificación\\SSC_Proyecto\\recursos\\presentacion\\imgInicioInf.jpg");
	        addCID("cidpie","C:\\Proyecto_SSC\\Codificación\\SSC_Proyecto\\recursos\\presentacion\\imgInicioSup.jpg");
	        
	        
	        // enviar adjuntos
	       // if (adjuntos!=null){
	            //for (String adjunto : adjuntos) {
	           //     addAttach("C:\\Proyecto_SSC\\Codificación\\SSC_Proyecto\\recursos\\mails\\imagenes_mails\\SillonAbril2014.jpg"); //ruta donde se encuentra el fichero que queremos adjuntar.
	          //  }
	      //  }
	        
	        
	        // add it
	        //multipart.addBodyPart(messageBodyPart);

	        // put everything together
	        //mensaje.setContent(multipart);
			
			//SE ENVIA EL MENSAJE
			//Transport.send(mensaje);

	        //Transport transport = sesionMail.getTransport();
	       
	        mensaje.setContent(multipart);
	        //transport.connect();
	        Transport.send(mensaje);
	        //transport.sendMessage(mensaje, mensaje.getRecipients(Message.RecipientType.TO));
	        //transport.close();
				
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
	public void addAttach(String pathname) throws Exception
    {
        File file = new File(pathname);
        BodyPart messageBodyPart = new MimeBodyPart();
        DataSource ds = new FileDataSource(file);
        messageBodyPart.setDataHandler(new DataHandler(ds));
        messageBodyPart.setFileName(file.getName());
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
