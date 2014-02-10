package interfaces;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import java.awt.Toolkit;


public class PantallaBienvenida {

	private JFrame frmInicio;

	/**
	 * Create the application.
	 */
	public PantallaBienvenida(negocio.ControladorConfeccionarAnuncio controladorAnuncios) 
	{
		inicializar(controladorAnuncios);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void inicializar(negocio.ControladorConfeccionarAnuncio controladorAnuncios) {
		frmInicio = new JFrame("SSC - Sistema de Seguimiento de Clientes");
		frmInicio.setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"SSC_128.png"));
		frmInicio.setBackground(Color.WHITE);
		frmInicio.getContentPane().setBackground(Color.WHITE);
		frmInicio.getContentPane().setLayout(null);
		frmInicio.setUndecorated(true);
		
		JLabel lblImagenSup = new JLabel("");
		lblImagenSup.setBackground(Color.WHITE);
		lblImagenSup.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgInicioSup.jpg"));
		lblImagenSup.setBounds(0, 0, 400, 81);
		frmInicio.getContentPane().add(lblImagenSup);
		
		JLabel lblTitulo = new JLabel("Sistema de Seguimiento");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblTitulo.setBounds(0, 70, 400, 40);
		frmInicio.getContentPane().add(lblTitulo);
		
		JLabel lblTitulo2 = new JLabel("de Clientes");
		lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo2.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblTitulo2.setBounds(0, 108, 400, 40);
		frmInicio.getContentPane().add(lblTitulo2);
		
		JLabel lblTitulo3 = new JLabel("Proyecto Final - UTN");
		lblTitulo3.setFont(new Font("Calibri", Font.PLAIN, 17));
		lblTitulo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo3.setBounds(0, 159, 400, 24);
		frmInicio.getContentPane().add(lblTitulo3);
		
		JLabel lblTitulo4 = new JLabel("Todos los derechos reservados");
		lblTitulo4.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblTitulo4.setBounds(10, 260, 131, 14);
		frmInicio.getContentPane().add(lblTitulo4);
		
		JLabel lblImagenInf = new JLabel("");
		lblImagenInf.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgInicioInf.jpg"));
		lblImagenInf.setBounds(0, 194, 400, 81);
		frmInicio.getContentPane().add(lblImagenInf);
		
		JProgressBar prgBarraProgreso = new JProgressBar();
		
		prgBarraProgreso.setBackground(Color.WHITE);
		prgBarraProgreso.setBounds(0, 276, 400, 24);
		frmInicio.getContentPane().add(prgBarraProgreso);
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setResizable(false);
		frmInicio.setSize(400, 300);
		frmInicio.setVisible(true);
		frmInicio.setLocationRelativeTo(null);
		
//	    for (int i = 0; i <= 100; i++)
//	    {
//	      for (long j=0; j<1000000; ++j)//modifica el numero segun la velidad q desees
//	      {
//	        @SuppressWarnings("unused")
//			String poop = " " + (j + i);
//	      }
//	      prgBarraProgreso.setValue(i);        //si no quieres q muestre nada, solo la barra
//	   }

		controladorAnuncios.inicializarCatalogos();
		prgBarraProgreso.setValue(100);  
		
	    frmInicio.dispose();
		

	}
}
