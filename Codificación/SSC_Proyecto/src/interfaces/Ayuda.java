package interfaces;

import interfaces.componentes.UtilidadesGUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.event.HyperlinkListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;


public class Ayuda extends JFrame
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
	 ****************/
	public Ayuda()
	{
		setMinimumSize(new Dimension(800,600));
		setLocationRelativeTo(null);
		setIconImage(UtilidadesGUI.obtenerIcono(UtilidadesGUI.X32,"AYUDA.png").getImage());
		setTitle("Ayuda del Sistema");

		
		addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
		
		addEscapeListenerWindowDialog();
	    
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
	    getContentPane().setLayout(new BorderLayout(0, 0));

	    visorHTML.setBounds(0, 0, 794, 480);
	    visorHTML.setEditable(false);
	    visorHTML.setMargin(new Insets(10, 10, 10, 10));

	    
	    scrEditor = new JScrollPane(visorHTML);
	    getContentPane().add(scrEditor, BorderLayout.CENTER);
	    
	    JPanel panel = new JPanel();
	    FlowLayout flowLayout = (FlowLayout) panel.getLayout();
	    flowLayout.setAlignment(FlowLayout.TRAILING);
	    getContentPane().add(panel, BorderLayout.SOUTH);
	    
	    
	    btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar","ACEPTAR.png");
	    panel.add(btnAceptar);
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
	

	protected void actualizarHTML(String rutaHTML)
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
		    
		    visorHTML.setCaretPosition(0);
		    

		    
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
		setSize(new Dimension(800,600));
		dispose();
	}
}