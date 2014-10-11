package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;


public class Ayuda extends JDialog
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML = "";
	private JEditorPane epnEditor;
	private JScrollPane scrEditor;
	private File archivoHTML;
	private FileReader fr;
	private BufferedReader br;
	private JButton btnSalir;

	
	/****************
	 * CONSTRUCTOR
	 * @param padre
	 ****************/
	public Ayuda()
	{
		/******************
		 * FORMULARIO BASE
		 ******************/
//	
//	super(padre);		
   		setResizable(false);
		setMinimumSize(new Dimension(800,600));
		getContentPane().setMinimumSize(new Dimension(800, 600));
		getContentPane().setMaximumSize(new Dimension(800, 600));
		setMaximumSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"AYUDA_32.PNG"));
		setTitle("Ayuda del Sistema");
//		setModalityType(ModalityType.APPLICATION_MODAL);
//		setModal(true);
		
		addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
		
		addEscapeListenerWindowDialog();
		
		
	    getContentPane().setLayout(new BorderLayout(0, 0));
	    
	    /**
	     * EDITOR
	     */
	    epnEditor = new JEditorPane();	  
	    epnEditor.setEditable(false);
	    epnEditor.setDragEnabled(true);
	    
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
   		 * BOTON SALIR
   		 */
   		btnSalir = new JButton("Salir");
   		btnSalir.addActionListener(new ActionListener() {
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
   		panelBotones.add(btnSalir);
   		
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	}	
		
	

	public void cargarHTML()
	{				
//		archivoHTML = new File(utilidades.Configuraciones.DIR_HELP);
//				
//	   	fr = null;
//	   	br = null;
//	   	

	   	try 
	   	{		   		
//	   		fr = new FileReader(archivoHTML);
//	   		br = new BufferedReader(fr);
			 
//	   		String renglon = "";
//		 
//	   		while((renglon=br.readLine())!=null)
//	        		contenidoMailHTML += renglon;
	   		

			HTMLEditorKit kit = new HTMLEditorKit();
			
		    Document doc = kit.createDefaultDocument();
		    
	    	
		    epnEditor.setEditorKit(kit);
		    epnEditor.setDocument(doc);
	   		epnEditor.setContentType("html");
	   		epnEditor.setPage(new URL("http://www.ibcrosario.com.ar"));
	   		epnEditor.setEditable(false);
	   		
		    getContentPane().add(scrEditor);
		    
	   		
	        setVisible(true);
	   	}
	   	catch(FileNotFoundException fne)
	   	{
	   		
	   	} 
	   	catch (IOException ioe) 
	   	{
	   		
	   	}
//        finally
//        {
//        	try
//        	{                    
//        		if( null != fr )   
//        			fr.close();
//        	}
//        	catch (IOException e2)
//        	{ 
//        		e2.printStackTrace();
//        	}
//        }
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