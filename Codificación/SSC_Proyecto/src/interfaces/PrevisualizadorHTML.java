package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.mail.MessagingException;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;

import net.atlanticbb.tantlinger.io.Base64;
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
	  
	  
	public PrevisualizadorHTML(String nombreArchivo, JDialog padre)
	{
		super(padre);
		
		archivoHTML = new File(Configuraciones.DIR_MAILS+nombreArchivo);
		
	   	FileReader fr = null;
	   	BufferedReader br = null;
	   	
		contenidoMailHTML = "";

	   	try 
	   	{	
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
	   				preparar_enviar(contenidoMailHTML);
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
        	catch (Exception e2)
        	{ 
        		e2.printStackTrace();
        	}
     }
	}
	  
	  
	  //-------------------------------------------------------------------
	  public void preparar_enviar(String contenidoEnviar)
	  {
		  	MailPromocional mail = new MailPromocional();
			
			try 
			{	
				String asunto = obtenerAsunto(contenidoEnviar);
				
	        	setCursor(new Cursor(Cursor.WAIT_CURSOR));
	        	interfaces.componentes.ProgresoTarea progresoEnvio = new interfaces.componentes.ProgresoTarea(this,"Procesando Envío de E-Mails...");
	        	
	        	String contenidoProcesado = procesarImagenes(contenidoEnviar);
	        	
	        	for(int i = 0; i<=20; i++)
	        		progresoEnvio.avanceProgreso(i);
	        	
				mail.enviarMail(contenidoProcesado, new String []{"sscproyecto@gmail.com","sscproyecto@gmail.com"}, asunto);
				
	        	for(int i = 20; i<=100; i++)
	        		progresoEnvio.avanceProgreso(i);
				progresoEnvio.dispose();
				JOptionPane.showMessageDialog(
						this,
						"El mensaje ha sido enviado correctamente.",
						"TAREA COMPLETADA CON ÉXITO",
						JOptionPane.INFORMATION_MESSAGE);
				
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
			}
			finally
			{
				
	        	setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	        	dispose();
			}
	  }

	  
	  //-------------------------------------------------------------------
		private String procesarImagenes(String contenidoEnviar)
		    {
		        String tagImg = "<img ";
		        StringBuffer sb = new StringBuffer(contenidoEnviar);
		        
		        if(sb.indexOf(tagImg) != -1)
		        {
		            int i = sb.indexOf(tagImg);  		            
		            
		            while(i < contenidoEnviar.length() && i != -1)
			        {               		            
		            	char tope = ' ';
		            	String imagenCode = "";
		            	int j = i;
		            	
		            	while(tope != '>')
		            	{
		            		imagenCode += contenidoEnviar.charAt(j);
		            		++j;
		            		tope = contenidoEnviar.charAt(j);
		            	}
		            	
		            	imagenCode += " >";
		            	
		            	System.out.println(imagenCode);
		            	
		            	String atributoSrc = "src=";
		            	StringBuffer sbSrc = new StringBuffer(imagenCode);
		            	System.out.println(sbSrc.indexOf(atributoSrc));
		            	
		            	String srcOriginal = sbSrc.substring(sbSrc.indexOf(atributoSrc)+atributoSrc.length()).toString();
        				System.out.println(srcOriginal);
        				
        				String depuracionInicial = srcOriginal.substring("\"file:".length());
        				System.out.println(depuracionInicial);
        				
        				String depuracionFinal = depuracionInicial.substring(0,depuracionInicial.length()-3);			
        				System.out.println(depuracionFinal);
        				
        				String rutaArchivo = depuracionFinal.replace('\\', '/');
        				System.out.println(rutaArchivo);
        				
        				String imgEncriptado =  "data:image/png;base64,"+Base64.encodeFromFile(rutaArchivo).toString();
        				
        				
        				System.out.println(imagenCode.length());
		            	
        				sb.delete(i, sb.indexOf(">",i));	
        				System.out.println(i);

		            	sb.insert(i, "<img src=\""+imgEncriptado+"\" ");
		            	
		            	i = sb.indexOf(tagImg,(i+("<img src=\""+imgEncriptado+"\" ").length()));  
		            	

			        }
		            
		        }
	        
	        return sb.toString();
		
		
		
		
		
        //String htmlText = "<H1>Prueba Adjuntos</H1><img src=\"cid:CONFECCIONAR_300.png\">";
//        String htmlText = 
//        		"<H1>Prueba Adjuntos</H1><img src=\"data:image/png;base64,"+
//        		Base64.encodeFromFile("D:\\Proyecto_Final_SSC\\Codificaci\u00F3n\\SSC_Proyecto\\recursos\\iconos\\CONFECCIONAR_300.png").toString()+"\"";
		
		
		
		
		
		
			//String terna = contenidoEnviar.charAt(i)+""+contenidoEnviar.charAt(i+1)+""+contenidoEnviar.charAt(i+2)+""+contenidoEnviar.charAt(i+3); 
			//System.out.print(terna);
//			if(terna.equals("<img"))
//			{
//				String codImg = "";
//				
//				for(int j = i; j<contenidoEnviar.length()-1;j++)
//					codImg += contenidoEnviar.charAt(j);
//				
//				i+=4;
//				
//				System.out.println(codImg);
//			}
//		}
	}


	//---------------------------------------------------------------------
	private String obtenerAsunto(String contenidoEnviar)
	{
		StringTokenizer st = new StringTokenizer(contenidoEnviar, "<h1>");
		String asunto = st.nextToken();
		
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