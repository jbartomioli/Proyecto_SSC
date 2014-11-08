package interfaces;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

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
import java.util.Collection;
import java.util.HashMap;



public class EditorHTML extends JDialog
{

	/***************
	 * SERIALIZABLE
	 ***************/
	private static final long serialVersionUID = -523425622964525664L;
	
	/************************
	 * COMPONENTES/VARIABLES
	 ************************/
	private HTMLEditorPane editor = new HTMLEditorPane();
	
	
	/*********************
	 * CONSTRUCTOR
	 * @param padre
	 * @param productos
	 * @param asunto
	 *********************/
    public EditorHTML(JDialog padre,Collection<HashMap<String, String>> productos, String asunto)
    {
    	/*******************
    	 * FORMULARIO BASE
    	 *******************/
		super(padre);
		setResizable(false);
		setMinimumSize(new Dimension(800,600));
		getContentPane().setMinimumSize(new Dimension(800, 600));
		getContentPane().setMaximumSize(new Dimension(800, 600));
		setMaximumSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"GENERAR_32.png"));
		
		/**************
		 * INICIALIZAR
		 **************/
    	inicializarContenido(asunto, productos);
    	
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
    	
    	addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrarEditor();
        	}
        });
        
    	/*************
    	 * BARRA MENU
    	 *************/
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(editor.getEditMenu());
        menuBar.add(editor.getFormatMenu());
        menuBar.add(editor.getInsertMenu());
        setJMenuBar(menuBar);
        
        setTitle("Editor de Contenido HTML de E-Mail");
        setSize(800, 600);
        
        /**********
         * EDITOR
         **********/
        getContentPane().add(editor);
        
        /****************
         * PANEL BOTONES
         ****************/
        JPanel panel = new JPanel();
        editor.add(panel, BorderLayout.SOUTH);
        panel.setLayout(new GridLayout(0, 2, 0, 0));
        
        /******************
         * BOTON FINALIZAR
         ******************/
        JButton btnFinalizarEdicion = new JButton("Finalizar Edici\u00F3n");
        btnFinalizarEdicion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		finalizarEdicion();
        	}
        });
        panel.add(btnFinalizarEdicion);
        
        /*****************
         * BOTON CANCELAR
         *****************/
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		cerrarEditor();
        	}
        });
        panel.add(btnCancelar);
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setVisible(true);

    }
    
    
    
    //------------------------------------------------------
    public void inicializarContenido(String asunto, Collection<HashMap<String, String>> productos)
    {
//    	File archivoHTML = new File(Configuraciones.DIR_MAILS+"temporal.html");
    	
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
	   			patron = "<tr>"
	   					+ "<td>%s</td>"
	   					+ "<td>%s</td>"
	   					+ "<td>$ %s</td>"
	   					+ "<td>$ %s</td>"
	   					+ "</tr>";
	   			
	   			datosProductos += String.format(
	   					patron,
	   					productoActual.get("ID"),
	   					productoActual.get("DESCRIPCION"),
	   					productoActual.get("VIGENTE"),
	   					productoActual.get("PROMOCIONAL"));
	   		}
	   		
	   		contenidoMailHTML = String.format(contenidoPlantilla, asunto, datosProductos);
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
    
    //-------------------------------------------------------------
//    private String modificarAsunto(String contenidoMailHTML, String asunto) 
//    {
//    	String asuntoAnterior;
//       
//        StringBuffer sb = new StringBuffer(contenidoMailHTML);
//
//        if(sb.indexOf(tagIniComentario) != -1)
//        {
//        	int i = sb.indexOf(tagIniComentario);
//        	int j = sb.indexOf(tagFinComentario);
//        	
//        	asuntoAnterior = sb.substring(i+tagIniComentario.length(), j);
//        	        	
//        	if(!asunto.equals(asuntoAnterior))
//        	{
//        		sb.delete(i,j+tagFinComentario.length());
//        		sb.insert(i,tagIniComentario+asunto+tagFinComentario);
//        	}
//        }
//        return sb.toString();
//    }



	//-------------------------------------------------------------
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
    
    //-------------------------------------------------------------
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
    

}
