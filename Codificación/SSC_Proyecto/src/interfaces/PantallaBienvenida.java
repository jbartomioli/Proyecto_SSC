package interfaces;

import interfaces.componentes.UtilidadesGUI;
import interfaces.interfaces_software.HiloBarraProgreso;
import interfaces.interfaces_software.TrabajoInicializar;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;


/**
 * PANTALLA DE BIENVENIDA AL SISTEMA
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class PantallaBienvenida extends JDialog{

	//SERIALIZABLE
	private static final long serialVersionUID = -4594499879058708929L;
	
	//COMPONENTES
	private JProgressBar prgBarraProgreso;
	

	/**
	 * CONSTRUCTOR
	 */
	public PantallaBienvenida()
	{
		//FORMUALRIO BASE
		setTitle("SSC - Sistema de Seguimiento de Clientes");
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		setIconImage(UtilidadesGUI.obtenerIcono(UtilidadesGUI.X128,"SSC.png").getImage());
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setUndecorated(true);
		
		
			//IMAGEN SUPERIOR
			JLabel lblImagenSup = new JLabel("");
			lblImagenSup.setBackground(Color.WHITE);
			lblImagenSup.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgInicioSup.jpg"));
			lblImagenSup.setBounds(0, 0, 400, 81);
			getContentPane().add(lblImagenSup);
			

			//TITULO PRINCIPAL
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
			
		
			//TEXTO AL PIE
			JLabel lblTitulo4 = new JLabel("Todos los derechos reservados");
			lblTitulo4.setFont(new Font("Tahoma", Font.ITALIC, 9));
			lblTitulo4.setBounds(10, 260, 131, 14);
			getContentPane().add(lblTitulo4);
			
			
			//IMAGEN INFERIOR
			JLabel lblImagenInf = new JLabel("");
			lblImagenInf.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgInicioInf.jpg"));
			lblImagenInf.setBounds(0, 194, 400, 81);
			getContentPane().add(lblImagenInf);
			
			
			//BARRA DE PROGRESO
			prgBarraProgreso = new JProgressBar();
			prgBarraProgreso.setBackground(Color.WHITE);
			prgBarraProgreso.setBounds(0, 276, 400, 24);
			getContentPane().add(prgBarraProgreso);
			setBounds(100, 100, 450, 300);
			setResizable(false);
			setSize(400, 300);
			setVisible(true);
			setLocationRelativeTo(null);
		////////////////////////////////
			
			
		//INICIAR OPERACIONES
		iniciar_trabajos();	
	}	
	////////////////////////////


	
	/**
	 * 
	 */
	protected void iniciar_trabajos()
	{
    	Thread trabajoInicializar = new Thread(new TrabajoInicializar());
    	trabajoInicializar.start();
    	
    	new Thread(new HiloBarraProgreso(trabajoInicializar, this, prgBarraProgreso, 200, true)).start(); 
	}
	//////////////////////////////////
}
