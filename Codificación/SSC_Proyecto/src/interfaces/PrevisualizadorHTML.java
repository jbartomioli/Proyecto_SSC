package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;
import utilidades.Configuraciones;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class PrevisualizadorHTML extends JDialog
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML;
	private JEditorPane epnEditor;
	  
	  
	public PrevisualizadorHTML(String nombreArchivo, JDialog padre)
	{
		super(padre);
		
		HTMLEditorKit kit = new HTMLEditorKit();
		
		contenidoMailHTML = "";
		
	    Document doc = kit.createDefaultDocument();
	    setModal(true);
	    setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
        setSize(800, 600);

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
	    leerArchivo(nombreArchivo);
	    getContentPane().add(scrEditor);
	    
   		JPanel panel = new JPanel();
   		getContentPane().add(panel, BorderLayout.SOUTH);
   		panel.setLayout(new GridLayout(0, 2, 0, 0));
   		
   		JButton btnVolverModificar = new JButton("Volver y Modificar");
   		btnVolverModificar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent arg0) {
   				setModal(false);
   				dispose();
   			}
   		});
   		panel.add(btnVolverModificar, BorderLayout.EAST);
   		
   		JButton btnAceptarEnviar = new JButton("Aceptar y Enviar");
   		btnAceptarEnviar.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				//
   			}
   		});
   		panel.add(btnAceptarEnviar, BorderLayout.WEST);
	   	   		
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
        
	}
	
	
	
	
	//-----------------------------------------------------------------------
	public void leerArchivo(String nombreArchivo)
	{
		File archivoHTML = new File(Configuraciones.DIR_MAILS+nombreArchivo);
		
	   	FileReader fr = null;
	   	BufferedReader br = null;
	   	
	   	try 
	   	{
	   		fr = new FileReader(archivoHTML);
	   		br = new BufferedReader(fr);
			 
	   		String renglon = "";
		 
	   		while((renglon=br.readLine())!=null)
	        		contenidoMailHTML += renglon;
		   
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
	   	catch (IOException e) 
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
        	
        	epnEditor.setText(contenidoMailHTML);
     }
	}
	  
	  
	  //-------------------------------------------------------------------
	  public void prepararContenidoPorMail(String contenidoEnviar)
	  {
		  
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
		case(0): setModal(false);
				 dispose();
				 break;
		}
	}
}