package interfaces;

import interfaces.componentes.BotonesIconos;
import interfaces.componentes.UtilidadesGUI;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;

/**
 * PANTALLA DE AYUDA DEL SISTEMA
 * 
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class Ayuda
{	
	//COMPONENTES
	public JFrame frmAyuda;
	public BotonesIconos btnAceptar;
	public JEditorPane visorHTML;
	public JScrollPane scrEditor;
	
	
	/**
	 * CONSTRUCTOR
	 */
	public Ayuda()
	{
		//FORMULARIO BASE
		frmAyuda = new JFrame();
		frmAyuda.setMinimumSize(new Dimension(800,600));
		frmAyuda.setLocationRelativeTo(null);
		frmAyuda.setIconImage(UtilidadesGUI.obtenerIcono(UtilidadesGUI.X32,"AYUDA.png").getImage());
		frmAyuda.setTitle("Ayuda del Sistema");
		frmAyuda.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	    frmAyuda.getContentPane().setLayout(new BorderLayout(0, 0));
	    	
	    	//VISOR HTML
		    visorHTML = new JEditorPane("text/html","");	
		    visorHTML.setBounds(0, 0, 794, 480);
		    visorHTML.setEditable(false);
		    visorHTML.setMargin(new Insets(10, 10, 10, 10));
	
		    //SCROLL EDITOR
		    scrEditor = new JScrollPane(visorHTML);
		    frmAyuda.getContentPane().add(scrEditor, BorderLayout.CENTER);
		    
		    //PANEL BOTON
		    JPanel panel = new JPanel();
		    FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		    flowLayout.setAlignment(FlowLayout.TRAILING);
		    frmAyuda.getContentPane().add(panel, BorderLayout.SOUTH);
	    
			    //BOTON ACEPTAR
			    btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar","ACEPTAR.png");
			    panel.add(btnAceptar);	 
		//////////////////////////////	
	}	
}