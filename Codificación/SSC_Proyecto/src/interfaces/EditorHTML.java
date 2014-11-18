package interfaces;
import interfaces.componentes.UtilidadesGUI;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;

import net.atlanticbb.tantlinger.shef.HTMLEditorPane;
import utilidades.Configuraciones;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashMap;

/**
 * PANTALLA DE EDICION DE CONTENIDO HTML
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class EditorHTML extends JDialog
{
	//SERIALIZABLE
	private static final long serialVersionUID = -523425622964525664L;
	
	
	//COMPONENTES/VARIABLES
	private HTMLEditorPane editor = new HTMLEditorPane();
	
	
	/**
	 * CONSTRUCTOR
	 * @param padre JDialog - Pantalla padre
	 * @param productos Collection<HashMap<String,String>> - Elementos del contenido del mail
	 * @param asunto String - Asunto del mail
	*/
    public EditorHTML(JDialog padre,Collection<HashMap<String, String>> productos, String asunto)
    {
    	//FORMULARIO BASE
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(800,600));
		getContentPane().setMinimumSize(new Dimension(800, 600));
		getContentPane().setMaximumSize(new Dimension(800, 600));
		setMaximumSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setIconImage(UtilidadesGUI.obtenerIcono(UtilidadesGUI.X32,"GENERAR.png").getImage());
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		
		
		//INICIALIZAR
    	inicializarContenido(asunto, productos);
    	

    	addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrarEditor();
        	}
        });
        
    	
    	//BARRA MENU
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(editor.getEditMenu());
        menuBar.add(editor.getFormatMenu());
        menuBar.add(editor.getInsertMenu());
        setJMenuBar(menuBar);
        
        setTitle("Editor de Contenido HTML de E-Mail");
        setSize(800, 600);
        
        
        //EDITOR
        getContentPane().add(editor);
        

        //PANEL BOTONES
        JPanel panel = new JPanel();
        editor.add(panel, BorderLayout.SOUTH);
        panel.setLayout(new GridLayout(0, 2, 0, 0));
        
        
        //BOTON FINALIZAR
        JButton btnFinalizarEdicion = new JButton("Finalizar Edici\u00F3n");
        btnFinalizarEdicion.addActionListener(new ActionListener() 
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		finalizarEdicion();
        	}
        });
        panel.add(btnFinalizarEdicion);
        
        
        //BOTON CANCELAR
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		cerrarEditor();
        	}
        });
        panel.add(btnCancelar);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setVisible(true);

    }
    
    

    //METODOS
    
    /**
     * INICIALIZACION DE CONTENIDOS EN EL EDITOR
     * @param asunto String - Asunto del mensaje
     * @param productos Collection<HashMap<String,String>> - Productos del anuncio
     */
    public void inicializarContenido(String asunto, Collection<HashMap<String, String>> productos)
    {
    	
    	File plantillaHTML = new File(Configuraciones.DIR_MAILS+"plantilla_mail.html");
		
    	String contenidoMailHTML = "";
    	String contenidoPlantilla = "";
    	
	   	FileReader fr = null;
	   	BufferedReader br = null;
	   	
	   	try 
	   	{
	   		fr = new FileReader(plantillaHTML);
	   		br = new BufferedReader(fr);
			 
	   		String renglon = "";
	   		
	   		while((renglon=br.readLine())!=null)
	   				contenidoPlantilla += renglon;  
	   		
	   		String patron = "";
		   	String datosProductos = "";
		   	
	   		for(HashMap<String, String> productoActual: productos)
	   		{	
	   			patron = Configuraciones.VARIOS_PATTERN1;
	   			
	   			datosProductos += MessageFormat.format(
	   					patron,
	   					productoActual.get("ID"),
	   					productoActual.get("DESCRIPCION"),
	   					"$ "+productoActual.get("VIGENTE"),
	   					"$ "+productoActual.get("PROMOCIONAL"));
	   		}
	   		
	   		contenidoMailHTML = MessageFormat.format(contenidoPlantilla, asunto, datosProductos);
	   	}
	   	catch(IOException ioe)
	   	{		   	
		   	
	   		
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
	   		editor.setText(contenidoMailHTML);
	   	}
        
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////



    /**
     * CERRAR EL EDITOR Y SALIR
     */
    public void cerrarEditor()
    {
		int rta = JOptionPane.showConfirmDialog(
					this, 
					"Está a punto de salir sin guardar el contedido del mensaje.\n"
							+ "¿Desea salir guardando los cambios efectuados?",
					"ATENCIÓN",
					JOptionPane.YES_NO_CANCEL_OPTION);
				
		switch(rta)
		{
		case(0): finalizarEdicion();
				 break;
		case(1): dispose();
				 break;
		}
    }
    ///////////////////////////

    
    
    /**
     * FINALIZAR EDICION DE CONTENIDO DEL ANUNCIO
     */
    public void finalizarEdicion()
    {
    	FileWriter file;
    	BufferedWriter writer;
    	
    	try
    	{    		
    		file = new FileWriter(Configuraciones.DIR_MAILS+"temporal.html");
    		
    		writer = new BufferedWriter(file);
    		writer.write(editor.getText(), 0, editor.getText().length());
    	    
	        writer.close();
	        file.close();
    	}
    	catch(IOException ioe)
    	{
    		JOptionPane.showMessageDialog(
    				this,
    				"Se ha producido un error al guardar los cambios",
    				"ERROR",
    				JOptionPane.ERROR_MESSAGE);
    	}
    	finally
    	{
        	dispose();
    	}
    }
    ///////////////////////////////

}
