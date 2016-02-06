package controladores;

import interfaces.Ayuda;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
/**
 * CONTROLADOR PANTALLA DE AYUDA
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class ControladorAyuda implements ActionListener, WindowListener, HyperlinkListener
{
	//ATRIBUTOS
	private Ayuda guiAyuda;
	
	//VARIABLES
	private String contenidoMailHTML;
	private File archivoHTML;
	private FileReader fr;
	private BufferedReader br;

	
	
	/**
	 * CONSTRUCTOR
	 * @param guiAyuda
	 */
	public ControladorAyuda(Ayuda guiAyuda)
	{
		this.guiAyuda = guiAyuda;
		this.guiAyuda.frmAyuda.addWindowListener(this);
		this.guiAyuda.btnAceptar.addActionListener(this);
		this.guiAyuda.visorHTML.addHyperlinkListener(this);
	}
	////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA ACTION PERFORMED
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(guiAyuda.btnAceptar))
		{
			try
			{
				fr.close();
				guiAyuda.frmAyuda.dispose();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA HIPERLINK EVENT
	 */
	@Override
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
	///////////////////////////////////////////////////
	
	
	
	/**
	 * REESCRITURA WINDOW LISTENER
	 */
	@Override
	public void windowActivated(WindowEvent arg0)
	{		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		cerrar_salir();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		cargarHTML();
	}
	///////////////////////////////////////////
	
	
		
	//METODOS
	/**
	 * INICIALIZAR CONTENIDO DE HTML EDITOR
	 */
	public void cargarHTML()
	{
		actualizarHTML(utilidades.Configuraciones.DIR_HELP);
	}
	/////////////////////////
		
		
		
	/**
	 * ACTUALIZAR CONTENIDO DE HTML EDITOR
	 * @param rutaHTML
	 */
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
		    
	    	
		    guiAyuda.visorHTML.setEditorKit(kit);
		    guiAyuda.visorHTML.setDocument(doc);	   		
		    guiAyuda.visorHTML.setText(contenidoMailHTML);
		    
		    guiAyuda.visorHTML.setCaretPosition(0);
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
	///////////////////////////////////////////////
	
	
	
	/**
	 * ACCION TECLA ESC
	 */
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
		guiAyuda.frmAyuda.getRootPane().registerKeyboardAction(
			 escAction, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	///////////////////////////////////////////////
	
	
	/**
	 * ACCION AL CERRAR O SALIR DE LA VENTANA
	 */
	public void cerrar_salir()
	{
		guiAyuda.frmAyuda.setSize(new Dimension(800,600));
		guiAyuda.frmAyuda.dispose();
	}
	///////////////////////////
}
