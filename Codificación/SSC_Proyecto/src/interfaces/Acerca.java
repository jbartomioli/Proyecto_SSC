package interfaces;
/*
 * PANTALLA PARA MOSTRAR INFORMACION
 * SOBRE EL DESARROLLO
 */

import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;


public class Acerca extends JDialog {

	private static final long serialVersionUID = 143340851367791756L;
	
	private JPanel pnlContenido;
	private JLabel lblTitulo;
	private JSeparator sprSeparadorSup;
	private JLabel imgAcerca;
	private JTextPane txtInformacion;
	private JTextPane txtInformacion2;
	private interfaces.componentes.BotonesIconos btnAceptar;
	private JTextPane txtVersion;


	/**
	 * CONSTRUCTOR
	 * @param padre
	 * @param modal
	 */
	public Acerca(JFrame padre, boolean modal)
	{
		/**
		 * FORMULARIO BASE
		 */
		super(padre,modal);
		setRootPaneCheckingEnabled(false);
		getContentPane().setBackground(Color.WHITE);
		setUndecorated(true);
		setSize(new Dimension(400, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		
		/**
		 * PANEL SUPERIOR
		 */
		pnlContenido = new JPanel();
		pnlContenido.setBackground(Color.WHITE);
		pnlContenido.setBorder(new LineBorder(new Color(102, 153, 255), 2));
		pnlContenido.setBounds(0, 0, 400, 400);
		getContentPane().add(pnlContenido);
		pnlContenido.setLayout(null);
		
		
		/**
		 * TITULO PRINCIPAL
		 */
		lblTitulo = new JLabel("SSC - Sistema de Seguimiento de Clientes");
		lblTitulo.setForeground(new Color(102, 153, 255));
		lblTitulo.setBounds(10, 23, 380, 42);
		pnlContenido.add(lblTitulo);
		lblTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 19));
		
		
		/**
		 * SEPARADOR
		 */
		sprSeparadorSup = new JSeparator();
		sprSeparadorSup.setForeground(new Color(153, 204, 255));
		sprSeparadorSup.setBounds(10, 63, 380, 2);
		pnlContenido.add(sprSeparadorSup);
		
		
		/**
		 * IMAGEN
		 */
		imgAcerca = new JLabel("");
		imgAcerca.setSize(new Dimension(128, 128));
		imgAcerca.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"ACERCA_128.png"));
		imgAcerca.setBounds(260, 115, 130, 132);
		pnlContenido.add(imgAcerca);
		
		
		/**
		 * TEXTO INFORMATIVO SUPERIOR
		 */
		txtInformacion = new JTextPane();
		txtInformacion.setAutoscrolls(false);
		txtInformacion.setEditable(false);
		txtInformacion.setText("Desarrollo final correspondiente para la c\u00E1tedra de Proyecto Final\r\nDe la Universidad Tecnol\u00F3gica Nacional - Facultad Regional Rosario");
		txtInformacion.setBounds(10, 76, 325, 35);
		pnlContenido.add(txtInformacion);
		
		
		/**
		 * TEXTO INFORMATIVO INFERIOR
		 */
		txtInformacion2 = new JTextPane();
		txtInformacion2.setOpaque(false);
		txtInformacion2.setText("Confeccionado por los alumnos:\r\n - Javier Bartomioli\r\n - Rodrigo Naredo\r\n\r\nProfesor a cargo:\r\n - Mario Osvaldo Bressano");
		txtInformacion2.setEditable(false);
		txtInformacion2.setAutoscrolls(false);
		txtInformacion2.setBounds(10, 122, 240, 100);
		pnlContenido.add(txtInformacion2);
			
		
		/**
		 * VERSION
		 */
		txtVersion = new JTextPane();
		txtVersion.setOpaque(false);
		txtVersion.setForeground(Color.GRAY);
		txtVersion.setEditable(false);
		txtVersion.setAutoscrolls(false);
		txtVersion.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtVersion.setText("Versi\u00F3n 1.01\r\n\r\nQueda prohibida la reproducci\u00F3n parcial y/o total del c\u00F3digo de la aplicaci\u00F3n, como as\u00ED tambi\u00E9n, los textos contenidos en manuales y pantallas, im\u00E1genes, y estructura y contenido de la base de datos, sin el previo consentimiento de los autores.\r\n\r\nTodos los derechos reservados.");
		txtVersion.setBounds(10, 243, 380, 110);
		pnlContenido.add(txtVersion);
		
		
		/**
		 * BOTON ACEPTAR
		 */
		btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar",utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(300, 329);
		pnlContenido.add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	clickBotonCerrar(evento);
	        }
	      });
	}
	//--------------------------------------------------------------------------------------
	
	
	
	//EVENTOS	
	//EVENTO BOTON ACEPTAR
	private void clickBotonCerrar(ActionEvent evento)
	{
		dispose();
	}
	
}
