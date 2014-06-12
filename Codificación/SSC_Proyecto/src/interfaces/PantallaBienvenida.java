package interfaces;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

import java.awt.Toolkit;


public class PantallaBienvenida extends JDialog{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4594499879058708929L;

	/**
	 * Create the application.
	 */
	public PantallaBienvenida() 
	{
		inicializar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void inicializar() 
	{
		setTitle("SSC - Sistema de Seguimiento de Clientes");
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"SSC_128.png"));
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setUndecorated(true);
		
		
		JLabel lblImagenSup = new JLabel("");
		lblImagenSup.setBackground(Color.WHITE);
		lblImagenSup.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgInicioSup.jpg"));
		lblImagenSup.setBounds(0, 0, 400, 81);
		getContentPane().add(lblImagenSup);
		
		JLabel lblTitulo = new JLabel("Sistema de Seguimiento");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblTitulo.setBounds(0, 70, 400, 40);
		getContentPane().add(lblTitulo);
		
		JLabel lblTitulo2 = new JLabel("de Clientes");
		lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblTitulo2.setBounds(0, 108, 400, 40);
		getContentPane().add(lblTitulo2);
		
		JLabel lblTitulo3 = new JLabel("Proyecto Final - UTN");
		lblTitulo3.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblTitulo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo3.setBounds(0, 159, 400, 24);
		getContentPane().add(lblTitulo3);
		
		JLabel lblTitulo4 = new JLabel("Todos los derechos reservados");
		lblTitulo4.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblTitulo4.setBounds(10, 260, 131, 14);
		getContentPane().add(lblTitulo4);
		
		JLabel lblImagenInf = new JLabel("");
		lblImagenInf.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgInicioInf.jpg"));
		lblImagenInf.setBounds(0, 194, 400, 81);
		getContentPane().add(lblImagenInf);
		
		JProgressBar prgBarraProgreso = new JProgressBar();
		
		prgBarraProgreso.setBackground(Color.WHITE);
		prgBarraProgreso.setBounds(0, 276, 400, 24);
		getContentPane().add(prgBarraProgreso);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		
    	Thread trabajoInicializar = new Thread(new interfaces.interfaces_software.TrabajoInicializar());
    	trabajoInicializar.start();
    	
    	new Thread(new interfaces.interfaces_software.HiloBarraProgreso(trabajoInicializar, this, prgBarraProgreso, 200, true)).start();        		
	}
}
