package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;




import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.KeyStroke;







import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.HyperlinkEvent;


public class Ayuda extends JDialog
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML;
	private File archivoHTML;
	private FileReader fr;
	private BufferedReader br;
	private interfaces.componentes.BotonesIconos btnAceptar;

	private JEditorPane visorHTML;

	private JScrollPane scrEditor;

	
	/****************
	 * CONSTRUCTOR
	 * @param padre
	 ****************/
	public Ayuda()
	{
		/******************
		 * FORMULARIO BASE
		 ******************/	
   		setResizable(false);
		setMinimumSize(new Dimension(800,600));
		getContentPane().setMinimumSize(new Dimension(800, 600));
		getContentPane().setMaximumSize(new Dimension(800, 600));
		setMaximumSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"AYUDA_32.PNG"));
		setTitle("Ayuda del Sistema");

		
		addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
		
		addEscapeListenerWindowDialog();
		
	    getContentPane().setLayout(null);
	    
	    visorHTML = new JEditorPane("text/html","");
	    visorHTML.addHyperlinkListener(new HyperlinkListener() {
	    	public void hyperlinkUpdate(HyperlinkEvent evento)
	    	{
	    		if(evento.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
	    		{
	    			try 
	    			{
	    				actualizarHTML(evento.getDescription().toString());
					} 
	    			catch (Exception e)
	    			{
						e.printStackTrace();
					}
	    		}
	    	}
	    });

	    visorHTML.setBounds(0, 0, 794, 480);
	    visorHTML.setEditable(false);
	    
	    scrEditor = new JScrollPane(visorHTML);
	    scrEditor.setBounds(12, 12, 770, 472);
	    getContentPane().add(scrEditor);
	    
	    
	    btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.PNG");
	    btnAceptar.setLocation(692, 496);
	    getContentPane().add(btnAceptar);
	    btnAceptar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
				try
	    		{
	    			if( null != fr ) 
	    				fr.close();
	    			dispose();
	    		} 
	    		catch (IOException e1) 
	    		{
	   				e1.printStackTrace();
	   			}	
	    	}
	    });
   
   		
   		/**
   		 * BOTON SALIR
   		 */
   		
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	}	
		
	
	
	public void cargarHTML()
	{
		actualizarHTML(utilidades.Configuraciones.DIR_HELP);
	}
	

	public void actualizarHTML(String rutaHTML)
	{				
		archivoHTML = new File(rutaHTML);
				
	   	fr = null;
	   	br = null;
	   	
	   	contenidoMailHTML = "";

	   	try 
	   	{		   		
	   		fr = new FileReader(archivoHTML);
	   		br = new BufferedReader(fr);
			 
	   		String renglon = "";
		 
	   		while((renglon=br.readLine())!=null)
	        		contenidoMailHTML += renglon;
	   		
	   		
			HTMLEditorKit kit = new HTMLEditorKit();
			
		    Document doc = kit.createDefaultDocument();
		    
	    	
		    visorHTML.setEditorKit(kit);
		    visorHTML.setDocument(doc);	   		
		    visorHTML.setText(contenidoMailHTML);
		    

		    
	        setVisible(true);
	   	}
	   	catch(Exception e)
	   	{
	   		e.printStackTrace();
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
        }
	}

	
	
	//
	protected void addEscapeListenerWindowDialog() 
	{
	 ActionListener escAction = new ActionListener() 
	 {
		 @Override
		 public void actionPerformed(ActionEvent e) 
		 {
			 cerrar_salir();
		 }
	 };
	 getRootPane().registerKeyboardAction(
			 escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}

	
	
	//---------------------------------------------------------------------
	public void cerrar_salir()
	{
		dispose();
	}
}