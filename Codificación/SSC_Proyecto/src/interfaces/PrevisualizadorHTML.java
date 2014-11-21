package interfaces;

import interfaces.componentes.JDialogBaseFormularios;


import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class PrevisualizadorHTML
{
	public JDialogBaseFormularios frmPrevisualizacion;
	public JEditorPane epnEditor;
	public JProgressBar barraProgreso;
	public JButton btnVolverModificar;
	public JButton btnAceptarEnviar;
	public JScrollPane scrEditor;
	
	
	
	/****************
	 * CONSTRUCTOR
	 * @param framePadre
	 ****************/
	public PrevisualizadorHTML(interfaces.GenerarAnuncio framePadre)
	{
		/******************
		 * FORMULARIO BASE
		 ******************/
		frmPrevisualizacion = new JDialogBaseFormularios((JDialog) framePadre,"Vista Previa de Contenido de E-Mail","ENVIAR.png",true);		
		frmPrevisualizacion.setDimensionFormulario(800,600);
		frmPrevisualizacion.getContentPane().setLayout(new BorderLayout(0, 0));
	    
	    	    
		//EDITOR
	    epnEditor = new JEditorPane();	  
	    epnEditor.setEditable(false);
	       
	    scrEditor = new JScrollPane(epnEditor);
	    
	    
	    /**
	     * PANEL BOTONES
	     */
	    JPanel panelInferior = new JPanel();
	    frmPrevisualizacion.getContentPane().add(panelInferior, BorderLayout.SOUTH);
   		panelInferior.setLayout(new GridLayout(0, 2, 0, 0));
   		
   		JPanel panelBotones = new JPanel();
   		panelInferior.add(panelBotones);
   		panelBotones.setLayout(new GridLayout(0, 2, 0, 0));
   		
   		/**
   		 * BOTON MODIFICAR
   		 */
   		btnVolverModificar = new JButton("Volver y Modificar");
   		panelBotones.add(btnVolverModificar);
   		
   		
   		/**
   		 * BOTON ENVIAR
   		 */
   		btnAceptarEnviar = new JButton("Aceptar y Enviar");
   		panelBotones.add(btnAceptarEnviar);

   		
   		/**
   		 * PANEL BARRA PROGRESO
   		 */
   		JPanel panelBarra = new JPanel();
   		panelInferior.add(panelBarra);
   		panelBarra.setLayout(new GridLayout(0, 1, 0, 0));
   		
   		barraProgreso = new JProgressBar(0,100);
   		barraProgreso.setStringPainted(true);
   		panelBarra.add(barraProgreso);
   		barraProgreso.setValue(0);
   		
   		frmPrevisualizacion.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	}	
}