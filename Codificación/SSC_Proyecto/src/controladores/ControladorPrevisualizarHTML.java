package controladores;

import interfaces.GenerarAnuncio;
import interfaces.PrevisualizadorHTML;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

import negocio.ControladorConfeccionarAnuncio;

public class ControladorPrevisualizarHTML implements ActionListener, WindowListener
{
	
	public PrevisualizadorHTML guiPrevisualizadorHTML;
	
	private String contenidoMailHTML = "";
	private File archivoHTML;
	private FileReader fr;
	private BufferedReader br;
	private boolean aux;
	private String [] mailsClientes;
	private Collection<String> imagenes;
	private String encabezado_mail = "<html><body><img src=\"file:"+utilidades.Configuraciones.IMG_ENCABEZADO_MAIL+"\"/><br/><br/>";
	private String pie_mail = "<img src=\"file:"+utilidades.Configuraciones.IMG_PIE_MAIL+"\"/></body></html>";
	
	private negocio.ControladorConfeccionarAnuncio controlador;
	

	
	/**
	 *
	 * @param guiPrevisualizador
	 * @param framePadre
	 */
	public ControladorPrevisualizarHTML(PrevisualizadorHTML guiPrevisualizador, GenerarAnuncio framePadre, ControladorConfeccionarAnuncio controlador, String nombreArchivo, String [] mailsDestino) 
	{
		this.guiPrevisualizadorHTML = guiPrevisualizador;
		this.controlador = controlador;
		this.guiPrevisualizadorHTML.btnAceptarEnviar.addActionListener(this);
		this.guiPrevisualizadorHTML.btnVolverModificar.addActionListener(this);
		this.guiPrevisualizadorHTML.frmPrevisualizacion.addWindowListener(this);
		cargar_vista_previa(nombreArchivo, mailsDestino);
	}
	
	
	
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		
		if(evento.getSource().equals(guiPrevisualizadorHTML.btnAceptarEnviar))
		{
			if(preparar_enviar(contenidoMailHTML, mailsClientes))
				try
   				{
   					if( null != fr ) 
   						fr.close();
   					aux = true;
   				} 
   				catch (IOException e1) 
   				{
   					aux = false;
	   				e1.printStackTrace();
	   			}	
   		}
   
		if(evento.getSource().equals(guiPrevisualizadorHTML.btnVolverModificar))
		{
   			guiPrevisualizadorHTML.frmPrevisualizacion.dispose();
   		}

		
	}

	
	
	
	@Override
	public void windowActivated(WindowEvent arg0) 
	{		
	}




	@Override
	public void windowClosed(WindowEvent evento)
	{		
	}




	@Override
	public void windowClosing(WindowEvent evento) 
	{
//		if(evento.getSource().equals(guiPrevisualizadorHTML.frmPrevisualizacion))
//			cerrar_salir();
	}




	@Override
	public void windowDeactivated(WindowEvent evento) 
	{		
	}




	@Override
	public void windowDeiconified(WindowEvent evento) 
	{
	}




	@Override
	public void windowIconified(WindowEvent evento)
	{
	}




	@Override
	public void windowOpened(WindowEvent evento)
	{
	}
	
	
	
	
	
	
	
	/**
	 * INICIALIZACION
	 * @param nombreArchivo
	 * @param mailsDestino
	 * @return
	 */
	@SuppressWarnings("finally")
	private boolean cargar_vista_previa(String nombreArchivo, String [] mailsDestino)
	{
		
		mailsClientes = mailsDestino;
				
		imagenes = new ArrayList<String>();
				
		archivoHTML = new File(utilidades.Configuraciones.DIR_MAILS+nombreArchivo);
		
	   	fr = null;
	   	br = null;
	   	


	   	try 
	   	{	
			contenidoMailHTML += encabezado_mail;
	   		
	   		aux = false;
	   		
	   		fr = new FileReader(archivoHTML);
	   		br = new BufferedReader(fr);
			 
	   		String renglon = "";
		 
	   		while((renglon=br.readLine())!=null)
	        		contenidoMailHTML += renglon;
	   		
	   		contenidoMailHTML += pie_mail;
	   		

			
			HTMLEditorKit kit = new HTMLEditorKit();
			
		    Document doc = kit.createDefaultDocument();
		    
	    	
		    guiPrevisualizadorHTML.epnEditor.setEditorKit(kit);
		    guiPrevisualizadorHTML.epnEditor.setDocument(doc);
		    guiPrevisualizadorHTML.epnEditor.setText(contenidoMailHTML);
	   		
	   		
		    guiPrevisualizadorHTML.frmPrevisualizacion.getContentPane().add(guiPrevisualizadorHTML.epnEditor);
		    
	   		
		    guiPrevisualizadorHTML.frmPrevisualizacion.setVisible(true);
	   	}
	   	catch(FileNotFoundException fne)
	   	{
	   		JOptionPane.showMessageDialog(
	   				guiPrevisualizadorHTML.frmPrevisualizacion, 
	   				"No se ha encontrado el archivo generado con el contenido del mail.\n"
	   				+ "Primero debe confeccionarse el cuerpo del mensaje.",
	   				"ERROR",
	   				JOptionPane.ERROR_MESSAGE);
	   		guiPrevisualizadorHTML.frmPrevisualizacion.dispose();
	   	} 
	   	catch (IOException ioe) 
	   	{
	   		JOptionPane.showMessageDialog(
	   			 guiPrevisualizadorHTML.frmPrevisualizacion, 
	   				"Se ha producido un error en la lectura del archivo.\n"
	   				+ "Deberá reconfeccionar el contenido del mensaje.",
	   				"ERROR",
	   				JOptionPane.ERROR_MESSAGE);
	   		guiPrevisualizadorHTML.frmPrevisualizacion.dispose();
	   		
	   	}
        finally
        {
        	try
        	{                    
        		if( null != fr )   
        			fr.close();
        	}
        	catch (IOException e2)
        	{ 
        		e2.printStackTrace();
        	}
        	return aux;
     }
	}

	

	
	

	/**
	 * 
	 * @param contenidoEnviar
	 * @param mailsClientes
	 * @param controlador
	 * @return
	 */
	@SuppressWarnings("finally")
	private boolean preparar_enviar(String contenidoEnviar, String [] mailsClientes)
	{
		boolean resultado = false;
	  	
		try 
		{	
			guiPrevisualizadorHTML.frmPrevisualizacion.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			desactivar_controles();
			
			String asunto = obtenerAsunto(contenidoEnviar);
			
	    	String contenidoProcesado = procesarImagenes(contenidoEnviar);
	    	
	    	controlador.redactarMensaje(contenidoProcesado);
	    	
	    	
	    	Thread trabajoEnvio = new Thread(new interfaces.software.TrabajoEnvioMail(0, controlador, mailsClientes, asunto, imagenes));
	    	trabajoEnvio.start();
	    	
	    	new Thread(new interfaces.software.HiloBarraProgreso(trabajoEnvio, guiPrevisualizadorHTML.frmPrevisualizacion, guiPrevisualizadorHTML.barraProgreso, 200, true)).start();
	    	        		        	
			resultado = true;
		}	
		finally
		{
	    	return resultado;
		}
	}

	
	
	
	/**
	 * 
	 * @param contenidoEnviar
	 * @return
	 */
	private String procesarImagenes(String contenidoEnviar)
	{
		int cidCont = 0;
	    String tagImg = "<img ";
	    char tagImgCierre = '>';
		String atributoSrc = "src=";
	
	    StringBuffer sb = new StringBuffer(contenidoEnviar);
	    
	    if(sb.indexOf(tagImg) != -1)
	    {
	    	int i = sb.indexOf(tagImg);  		            
	        
	        while(i < sb.length() && i != -1)
	        {               		            
	        	char tope = ' ';
	        	String imagenCode = "";
	        	int j = i;
	        	
	        	while(tope != tagImgCierre)
	        	{
	        		imagenCode += sb.charAt(j);
	        		++j;
	        		tope = sb.charAt(j);
	        	}
	        	
	        	imagenCode += " >";
	        			            	
	        	StringBuffer sbSrc = new StringBuffer(imagenCode);
	        	//System.out.println(imagenCode);
	        	
	        	String srcOriginal = sbSrc.substring(sbSrc.indexOf(atributoSrc)+atributoSrc.length());
	        	//System.out.println(srcOriginal);
	        	
				String depuracionInicial = srcOriginal.substring("\"file:".length());
	        	//System.out.println(depuracionInicial);
				
				
				String depuracionFinal = depuracionInicial.substring(0,depuracionInicial.indexOf("\""));			
	        	//System.out.println(depuracionFinal);
	
				
				String rutaArchivo = depuracionFinal.replace('\\', '/');
	        	//System.out.println(rutaArchivo);
					
				imagenes.add(rutaArchivo);
				
				String imgInsertar = "cid:IMG"+cidCont;
				
				++cidCont;
				
				int iDelete = sb.indexOf(atributoSrc, i)+atributoSrc.length();
				
				sb.delete(iDelete, sb.indexOf("\"",iDelete+1));	
				
				String insertCadena = "\""+imgInsertar;
	
	        	sb.insert(iDelete, insertCadena);
	        	
	        	int iInsert = i + insertCadena.length()+1;
	        
	        	i = sb.indexOf(tagImg,iInsert);
	        	
	        }
	        
	    }      
	   return sb.toString();
	}
	
	
	
	
	/**
	 * 
	 * @param contenidoEnviar
	 * @return
	 */
	private String obtenerAsunto(String contenidoEnviar)
	{
		String asunto = "";
		int inicio = 0;
		int fin = 0;
		String tagInicio = "<!--";
		String tagFin = "-->";
				
		inicio = contenidoEnviar.indexOf(tagInicio)+tagInicio.length();
		fin = contenidoEnviar.indexOf(tagFin);
				
		asunto = contenidoEnviar.substring(inicio,fin);
				
		return asunto;
	}
	
	


//	/**
//	 * 
//	 */
//	private void cerrar_salir()
//	{
//		int rta = JOptionPane.showConfirmDialog(
//				 	guiPrevisualizadorHTML.frmPrevisualizacion, 
//					"Está a punto de salir sin enviar el mensaje.\n"
//						+ "¿Desea salir y volver al editor de mensaje?\n"
//						+ "Si presiona NO, se enviará el mensaje",
//					"ATENCIÓN",
//					JOptionPane.YES_NO_OPTION);
//				
//		switch(rta)
//		{
//		case(JOptionPane.YES_OPTION): //guiPrevisualizadorHTML.frmPrevisualizacion.dispose();
//									break;
//		case(JOptionPane.NO_OPTION):  guiPrevisualizadorHTML.btnAceptarEnviar.doClick();
//				 					break;
//		}
//	}
	
	


	/**
	 * 
	 */
	private void desactivar_controles() 
	{
		guiPrevisualizadorHTML.btnAceptarEnviar.setEnabled(false);
		guiPrevisualizadorHTML.btnVolverModificar.setEnabled(false);
		guiPrevisualizadorHTML.frmPrevisualizacion.setEnabled(false);
	}


	public boolean seEnvio()
	{
		return aux;
	}



}
