package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.GridLayout;


public class PrevisualizadorHTML extends interfaces.componentes.JDialogBaseFormularios
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML = "";
	private JEditorPane epnEditor;
	private JScrollPane scrEditor;
	private File archivoHTML;
	private FileReader fr;
	private BufferedReader br;
	private boolean aux;
	private String [] mailsClientes;
	private JProgressBar barraProgreso;
	private Collection<String> imagenes;
	private String encabezado_mail = "<html><body><img src=\"file:"+utilidades.Configuraciones.IMG_ENCABEZADO_MAIL+"\"/><br/><br/>";
	private String pie_mail = "<img src=\"file:"+utilidades.Configuraciones.IMG_PIE_MAIL+"\"/></body></html>";
	private JButton btnVolverModificar;
	private JButton btnAceptarEnviar;

	
	/****************
	 * CONSTRUCTOR
	 * @param padre
	 ****************/
	public PrevisualizadorHTML(interfaces.GenerarAnuncio padre)
	{
		/******************
		 * FORMULARIO BASE
		 ******************/
		super((JDialog) padre,"Vista Previa de Contenido de E-Mail","ENVIAR_32.png",true);		
		setDimensionFormulario(800,600);
		
		
	    getContentPane().setLayout(new BorderLayout(0, 0));
	    
	    /**
	     * EDITOR
	     */
	    
	    epnEditor = new JEditorPane();	  
	    epnEditor.setEditable(false);
	       
	    scrEditor = new JScrollPane(epnEditor);
	    
	    
	    /**
	     * PANEL BOTONES
	     */
	    JPanel panelInferior = new JPanel();
   		getContentPane().add(panelInferior, BorderLayout.SOUTH);
   		panelInferior.setLayout(new GridLayout(0, 2, 0, 0));
   		
   		JPanel panelBotones = new JPanel();
   		panelInferior.add(panelBotones);
   		panelBotones.setLayout(new GridLayout(0, 2, 0, 0));
   		
   		/**
   		 * BOTON MODIFICAR
   		 */
   		btnVolverModificar = new JButton("Volver y Modificar");
   		panelBotones.add(btnVolverModificar);
   		
   		
   		/**
   		 * BOTON ENVIAR
   		 */
   		btnAceptarEnviar = new JButton("Aceptar y Enviar");
   		panelBotones.add(btnAceptarEnviar);
   		btnAceptarEnviar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				if(preparar_enviar(contenidoMailHTML, mailsClientes))
   					try
	   				{
	   					if( null != fr ) 
	   						fr.close();
	   					aux = true;
	   				} 
	   				catch (IOException e1) 
	   				{
		   				e1.printStackTrace();
		   			}	
   			}
   		});
   		btnVolverModificar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
   				dispose();
   			}
   		});
   		
   		/**
   		 * PANEL BARRA PROGRESO
   		 */
   		JPanel panelBarra = new JPanel();
   		panelInferior.add(panelBarra);
   		panelBarra.setLayout(new GridLayout(0, 1, 0, 0));
   		
   		barraProgreso = new JProgressBar(0,100);
   		barraProgreso.setStringPainted(true);
   		panelBarra.add(barraProgreso);
   		barraProgreso.setValue(0);
   		
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	}	
		
	
	/**
	 * INICIALIZACION
	 * @param nombreArchivo
	 * @param mailsDestino
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean inicializar(String nombreArchivo, String [] mailsDestino)
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
		    
	    	
		    epnEditor.setEditorKit(kit);
		    epnEditor.setDocument(doc);
	   		epnEditor.setText(contenidoMailHTML);
	   		
	   		
		    getContentPane().add(scrEditor);
		    
	   		
	        setVisible(true);
	   	}
	   	catch(FileNotFoundException fne)
	   	{
	   		JOptionPane.showMessageDialog(
	   				null, 
	   				"No se ha encontrado el archivo generado con el contenido del mail.\n"
	   				+ "Primero debe confeccionarse el cuerpo del mensaje.",
	   				"ERROR",
	   				JOptionPane.ERROR_MESSAGE);
	   		dispose();
	   	} 
	   	catch (IOException ioe) 
	   	{
	   		JOptionPane.showMessageDialog(
	   				null, 
	   				"Se ha producido un error en la lectura del archivo.\n"
	   				+ "Deberá reconfeccionar el contenido del mensaje.",
	   				"ERROR",
	   				JOptionPane.ERROR_MESSAGE);
	   		dispose();
	   		
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

	

	
	
	//---------------------------------------------------------------------
	@SuppressWarnings("finally")
	public boolean preparar_enviar(String contenidoEnviar, String [] mailsClientes)
	{
		boolean resultado = false;
	  	
		try 
		{	
			setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			desactivar_controles();
			
			String asunto = obtenerAsunto(contenidoEnviar);
			
	    	String contenidoProcesado = procesarImagenes(contenidoEnviar);
	    	
	    	Thread trabajoEnvio = new Thread(new interfaces.interfaces_software.TrabajoEnvioMail(0, contenidoProcesado, mailsClientes, asunto, imagenes));
	    	trabajoEnvio.start();
	    	
	    	new Thread(new interfaces.interfaces_software.HiloBarraProgreso(trabajoEnvio, this, this.barraProgreso, 200, true)).start();
	    	        		        	
			resultado = true;
		}	
		finally
		{
	    	return resultado;
		}
	}

	
	//---------------------------------------------------------------------
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
	
	
	//---------------------------------------------------------------------
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
	
	
	//---------------------------------------------------------------------
	public void cerrar_salir()
	{
		int rta = JOptionPane.showConfirmDialog(
					this, 
					"Está a punto de salir sin enviar el mensaje.\n"
						+ "¿Desea salir y volver al editor de mensaje?\n"
						+ "Si presiona NO se enviará el mensaje",
					"ATENCIÓN",
					JOptionPane.YES_NO_OPTION);
				
		switch(rta)
		{
		case(1): //finalizarEdicion();
				 break;
		case(0): super.cerrar_salir();
				 break;
		}
	}
	
	
	//---------------------------------------------------------------------
	private void desactivar_controles() 
	{
		btnAceptarEnviar.setEnabled(false);
		btnVolverModificar.setEnabled(false);
		setEnabled(false);
	}
}