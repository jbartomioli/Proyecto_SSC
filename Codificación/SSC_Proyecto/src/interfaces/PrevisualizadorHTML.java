package interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.JButton;
import javax.swing.JPanel;

import utilidades.Configuraciones;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PrevisualizadorHTML extends JDialog
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML;

	public PrevisualizadorHTML()
	  {
		  
	  }
	  
	  
	  public PrevisualizadorHTML(String nombreArchivo) throws IOException, FileNotFoundException
	  {
	   
	   // add an html editor kit
	   HTMLEditorKit kit = new HTMLEditorKit();
	        
	
	   // create some simple html as a string
	   File archivoHTML = new File(Configuraciones.DIR_MAILS+nombreArchivo);
	
	   contenidoMailHTML = "";
	   FileReader fr = null;
	   BufferedReader br = null;
	     
	   try 
        {
		   fr = new FileReader(archivoHTML);
		   br = new BufferedReader(fr);
			 
		   String renglon = "";
		 
		   while((renglon=br.readLine())!=null)
		        	contenidoMailHTML += renglon;
		   
		   
           // create a document, set it on the jeditorpane, then add the html
	        Document doc = kit.createDefaultDocument();

	          
	        setSize(600, 400);
	        setLocationRelativeTo(null);
	        setTitle("Vista Previa del Mensaje");
	        getContentPane().setLayout(null);
	        
	        // create jeditorpane
	        JEditorPane epnEditor = new JEditorPane();
	        epnEditor.setLocation(13, 0);
	        
	        // make it read-only
	        epnEditor.setEditable(false);
	        
	        // create a scrollpane; modify its attributes as desired
	        JScrollPane scrEditor = new JScrollPane(epnEditor);
	        scrEditor.setBounds(10, 10, 570, 270);
	        epnEditor.setEditorKit(kit);
	        epnEditor.setDocument(doc);
	        epnEditor.setText(contenidoMailHTML);
	        getContentPane().add(scrEditor);
	        
	        
	        
	        JPanel pnlBotones = new JPanel();
	        pnlBotones.setBounds(10, 320, 570, 35);
	        getContentPane().add(pnlBotones);
	        pnlBotones.setLayout(null);
	        
	        
	        
	        JButton btnAceptar = new JButton("Aceptar");
	        btnAceptar.setBounds(144, 5, 80, 25);
	        pnlBotones.add(btnAceptar);
	        btnAceptar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		prepararContenidoPorMail(contenidoMailHTML);
	        	}
	        });
	        
	        
	        
	        JButton btnCancelar = new JButton("Cancelar");
	        btnCancelar.setBounds(354, 5, 85, 25);
	        btnCancelar.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		//System.exit(0);
	        	}
	        });
	        pnlBotones.add(btnCancelar);
	
	        
	        // make it easy to close the application
	        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	      
	        
	        // center the jframe, then make it visible
	        setVisible(true);

		} 
        finally
        {
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
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
	  
	  
	  
	  private void prepararContenidoPorMail(String contenidoEnviar)
	  {
		  
	  }
}