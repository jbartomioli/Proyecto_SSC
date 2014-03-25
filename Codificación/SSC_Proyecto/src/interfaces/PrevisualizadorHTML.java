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


public class PrevisualizadorHTML extends JDialog
{
	private static final long serialVersionUID = 2483184216073019363L;
	
	private String contenidoMailHTML;



	public PrevisualizadorHTML()
	{
		getContentPane().setLayout(new BorderLayout(0, 0));
		  
	}
	  
	  
	public PrevisualizadorHTML(String nombreArchivo, JDialog padre)
	{
		super(padre);
		
		HTMLEditorKit kit = new HTMLEditorKit();
		        
		File archivoHTML = new File(Configuraciones.DIR_MAILS+nombreArchivo);
		
		contenidoMailHTML = "";
		
	    Document doc = kit.createDefaultDocument();
	
	    setModal(true);
	    setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
	    
    	addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        	//	cerrarEditor();
        	}
        });
    	
	    setSize(800, 600);
	    setLocationRelativeTo(null);
	    setTitle("Vista Previa del Mensaje");
	       
	    JEditorPane epnEditor = new JEditorPane();	       
	    epnEditor.setEditable(false);
	       
	    JScrollPane scrEditor = new JScrollPane(epnEditor);
	    scrEditor.setBounds(10, 10, 570, 270);
	    epnEditor.setEditorKit(kit);
	    epnEditor.setDocument(doc);
	    epnEditor.setText("");
	    getContentPane().add(scrEditor, BorderLayout.CENTER); 
       
	    JPanel pnlBotones = new JPanel();
	    pnlBotones.setBounds(10, 320, 570, 35);   
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
	   
	    getContentPane().add(pnlBotones, BorderLayout.SOUTH);
	   	
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setVisible(true);
	   
        
	   	FileReader fr = null;
	   	BufferedReader br = null;
	     
	   	try 
	   	{
	   		fr = new FileReader(archivoHTML);
	   		br = new BufferedReader(fr);
			 
	   		String renglon = "";
		 
	   		while((renglon=br.readLine())!=null)
	        		contenidoMailHTML += renglon;
		   
	   		epnEditor.setText(contenidoMailHTML);
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
     }
}
	  
	  
	  //-------------------------------------------------------------------
	  private void prepararContenidoPorMail(String contenidoEnviar)
	  {
		  
	  }
}