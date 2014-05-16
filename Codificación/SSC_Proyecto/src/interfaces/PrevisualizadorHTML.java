package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.mail.MessagingException;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;

import utilidades.Configuraciones;
import utilidades.MailPromocional;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;


public class PrevisualizadorHTML extends JDialog
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML;
	private JEditorPane epnEditor;
	private File archivoHTML;
	private FileReader fr;
	private BufferedReader br;
	private boolean aux;
	private String [] mailsClientes;
	private Collection<String> imagenes;
	  
	public PrevisualizadorHTML(interfaces.GenerarAnuncio padre)
	{
		super(padre);
	}	
		
		
	@SuppressWarnings("finally")
	public boolean inicializar(String nombreArchivo, String [] mailsDestino)
	{
		
		mailsClientes = mailsDestino;
		
		imagenes = new ArrayList<String>();
		
		archivoHTML = new File(Configuraciones.DIR_MAILS+nombreArchivo);
		
	   	fr = null;
	   	br = null;
	   	
		contenidoMailHTML = "";

	   	try 
	   	{	
	   		aux = false;
	   		
	   		fr = new FileReader(archivoHTML);
	   		br = new BufferedReader(fr);
			 
	   		String renglon = "";
		 
	   		while((renglon=br.readLine())!=null)
	        		contenidoMailHTML += renglon;
	   		
	   		setResizable(false);
			setMinimumSize(new Dimension(800,600));
			getContentPane().setMinimumSize(new Dimension(800, 600));
			getContentPane().setMaximumSize(new Dimension(800, 600));
			setMaximumSize(new Dimension(800, 600));
			setLocationRelativeTo(null);
			setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"ENVIAR_32.png"));
			setTitle("Vista Previa de Contenido de E-Mail");
			
			HTMLEditorKit kit = new HTMLEditorKit();
			
		    Document doc = kit.createDefaultDocument();
		    setModal(true);



	    	addWindowListener(new WindowAdapter() {
	        	public void windowClosing(WindowEvent arg0) {
	        		cerrarEditor();
	        	}
	        });
		    getContentPane().setLayout(new BorderLayout(0, 0));
		    
		    epnEditor = new JEditorPane();	  
		    epnEditor.setEditable(false);
		       
		    JScrollPane scrEditor = new JScrollPane(epnEditor);
		    epnEditor.setEditorKit(kit);
		    epnEditor.setDocument(doc);
	   		epnEditor.setText(contenidoMailHTML);
	   		
	   		
		    getContentPane().add(scrEditor);
		    
	   		JPanel panel = new JPanel();
	   		getContentPane().add(panel, BorderLayout.SOUTH);
	   		panel.setLayout(new GridLayout(0, 2, 0, 0));
	   		
	   		JButton btnVolverModificar = new JButton("Volver y Modificar");
	   		btnVolverModificar.addActionListener(new ActionListener() {
	   			public void actionPerformed(ActionEvent arg0) {
	   				dispose();
	   			}
	   		});
	   		panel.add(btnVolverModificar, BorderLayout.EAST);
	   		
	   		JButton btnAceptarEnviar = new JButton("Aceptar y Enviar");
	   		btnAceptarEnviar.addActionListener(new ActionListener() {
	   			public void actionPerformed(ActionEvent e) {
	   				if(preparar_enviar(contenidoMailHTML, mailsClientes))
	   					try
		   				{
		   					if( null != fr ) 
		   						fr.close();
		   					archivoHTML.delete();
		   					aux = true;
		   				} 
		   				catch (IOException e1) 
		   				{
			   				e1.printStackTrace();
			   			}	
	   			}
	   		});
	   		panel.add(btnAceptarEnviar, BorderLayout.WEST);
		   	   		
	        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
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
	  
	  
	  //-------------------------------------------------------------------
	  @SuppressWarnings("finally")
	public boolean preparar_enviar(String contenidoEnviar, String [] mailsClientes)
	  {
		  	MailPromocional mail = new MailPromocional();
			boolean resultado = false;
		  	
			try 
			{	
				String asunto = obtenerAsunto(contenidoEnviar);
				
	        	setCursor(new Cursor(Cursor.WAIT_CURSOR));
	        	interfaces.componentes.ProgresoTarea progresoEnvio = new interfaces.componentes.ProgresoTarea(this,"Procesando Envío de E-Mails...");
	        	
	        	String contenidoProcesado = procesarImagenes(contenidoEnviar);
	        	
	        	for(int i = 0; i<=20; i++)
	        		progresoEnvio.avanceProgreso(i);
	        	
	        	
				mail.enviarMail(contenidoProcesado, mailsClientes, asunto, imagenes);
				
	        	for(int i = 20; i<=100; i++)
	        		progresoEnvio.avanceProgreso(i);
				progresoEnvio.dispose();
				JOptionPane.showMessageDialog(
						this,
						"El mensaje ha sido enviado correctamente.",
						"TAREA COMPLETADA CON ÉXITO",
						JOptionPane.INFORMATION_MESSAGE);
				resultado = true;
				
			}
			catch (MessagingException e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(
						this,
						"Se ha producido un error al intentar enviar el mensaje.\n"
						+ "Inténtelo más tarde.",
						"ERROR",
						JOptionPane.ERROR_MESSAGE);
				resultado = false;
			}
			finally
			{
	        	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        	dispose();
	        	return resultado;
			}
	  }

	  


	//-------------------------------------------------------------------
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
        				
        				//String imgEncriptado =  "data:image/jpeg;charset=utf-8;base64,"+Base64.encodeFromFile(rutaArchivo);//.toString();
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


	//-------------------------------------------------------------
	public void cerrarEditor()
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
		case(0): dispose();
				 break;
		}
	}
}