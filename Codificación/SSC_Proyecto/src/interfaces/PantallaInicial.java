package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Canvas;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

import utilidades.Configuraciones;

public class PantallaInicial {

	private JFrame frmInicio;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PantallaInicial window = new PantallaInicial();
//					window.frmInicio.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public PantallaInicial(utilidades.Configuraciones configuraciones) {
		initialize(configuraciones);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(utilidades.Configuraciones configuraciones) {
		frmInicio = new JFrame();
		frmInicio.setBackground(Color.WHITE);
		frmInicio.getContentPane().setBackground(Color.WHITE);
		frmInicio.getContentPane().setLayout(null);
		frmInicio.setUndecorated(true);
		
		JLabel lblImagenSup = new JLabel("");
		lblImagenSup.setBackground(Color.WHITE);
		lblImagenSup.setIcon(new ImageIcon(configuraciones.getIMG_RECURSOS()+"imgInicioSup.jpg"));
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(configuraciones.getIMG_RECURSOS()+"imgInicioInf.jpg"));
		label.setBounds(0, 194, 400, 81);
		frmInicio.getContentPane().add(label);
		
		JProgressBar prgBarraProgreso = new JProgressBar();
		
		prgBarraProgreso.setBackground(Color.WHITE);
		prgBarraProgreso.setBounds(0, 276, 400, 24);
		frmInicio.getContentPane().add(prgBarraProgreso);
		frmInicio.setBounds(100, 100, 450, 300);
		frmInicio.setResizable(false);
		frmInicio.setSize(400, 300);
		frmInicio.setVisible(true);
		frmInicio.setLocationRelativeTo(null);
		frmInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    for (int i = 0; i <= 100; i++)
	    {
	      for (long j=0; j<1000000; ++j)//modifica el numero segun la velidad q desees
	      {
	        String poop = " " + (j + i);
	      }
	      prgBarraProgreso.setValue(i);        //si no quieres q muestre nada, solo la barra
	   }
	   System.exit(0);
	    
		

	}
}
