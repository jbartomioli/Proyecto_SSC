package interfaces;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Cursor;
import javax.swing.ImageIcon;


public class Acerca extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public Acerca(JFrame padre, boolean modal)
	{
		super(padre,modal);
		setRootPaneCheckingEnabled(false);
		getContentPane().setBackground(Color.WHITE);
		setUndecorated(true);
		setSize(new Dimension(400, 400));
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(102, 153, 255), 2));
		panel.setBounds(0, 0, 400, 400);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("SSC - Sistema de Seguimiento de Clientes");
		lblTitulo.setForeground(new Color(102, 153, 255));
		lblTitulo.setBounds(10, 23, 380, 42);
		panel.add(lblTitulo);
		lblTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 19));
		
		JSeparator sprSeparadorSup = new JSeparator();
		sprSeparadorSup.setForeground(new Color(153, 204, 255));
		sprSeparadorSup.setBounds(10, 63, 380, 2);
		panel.add(sprSeparadorSup);
		
		JLabel imgAcerca = new JLabel("");
		imgAcerca.setSize(new Dimension(128, 128));
		imgAcerca.setIcon(new ImageIcon("D:\\Proyecto_Final_SSC\\Codificaci\u00F3n\\SSC_Proyecto\\recursos\\iconos\\ACERCA_128.png"));
		imgAcerca.setBounds(260, 115, 130, 132);
		panel.add(imgAcerca);
		
		JTextPane txtInformacion = new JTextPane();
		txtInformacion.setAutoscrolls(false);
		txtInformacion.setEditable(false);
		txtInformacion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtInformacion.setText("Desarrollo final correspondiente para la c\u00E1tedra de Proyecto Final\r\nDe la Universidad Tecnol\u00F3gica Nacional - Facultad Regional Rosario");
		txtInformacion.setBounds(10, 76, 325, 35);
		panel.add(txtInformacion);
		
		JTextPane txtInformacion2 = new JTextPane();
		txtInformacion2.setText("Confeccionado por los alumnos:\r\n - Javier Bartomioli\r\n - Rodrigo Naredo\r\n\r\nProfesor a cargo:\r\n - Mario Osvaldo Bressano");
		txtInformacion2.setEditable(false);
		txtInformacion2.setAutoscrolls(false);
		txtInformacion2.setBounds(10, 122, 240, 100);
		panel.add(txtInformacion2);
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnAceptar.setMinimumSize(new Dimension(75, 25));
			btnAceptar.setMaximumSize(new Dimension(75, 25));
			btnAceptar.setBounds(306, 354, 84, 35);
			panel.add(btnAceptar);
			
			JTextPane txtpnVersinQueda = new JTextPane();
			txtpnVersinQueda.setForeground(Color.GRAY);
			txtpnVersinQueda.setEditable(false);
			txtpnVersinQueda.setAutoscrolls(false);
			txtpnVersinQueda.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			txtpnVersinQueda.setFont(new Font("Tahoma", Font.ITALIC, 10));
			txtpnVersinQueda.setText("Versi\u00F3n 1.01\r\n\r\nQueda prohibida la reproducci\u00F3n parcial y/o total del c\u00F3digo de la aplicaci\u00F3n, como as\u00ED tambi\u00E9n, los textos contenidos en manuales y pantallas, im\u00E1genes, y estructura y contenido de la base de datos, sin el previo consentimiento de los autores.\r\n\r\nTodos los derechos reservados.");
			txtpnVersinQueda.setBounds(10, 243, 380, 110);
			panel.add(txtpnVersinQueda);
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
				}
			});
		}
	}
}
