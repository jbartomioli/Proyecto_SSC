package interfaces;
/*
 * INTERFAZ PRINCIPAL DE LA APLICACION
 */

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Dimension;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Principal extends JFrame {

	//SERIALIZABLE
	private static final long serialVersionUID = 3856238941350632345L;
	
	//COMPONENTES
	private JPanel cntContenedor;
	private JLabel lblImagenfondo;
	private JMenuBar mnuBarraMenu;
	private JMenu mnuArchivo;
	private JMenuItem mntSalir;
	private JMenu mnuOperaciones;
	private interfaces.GenerarAnuncio generarAnuncio;
	private JMenuItem mntConfeccionar;
	private JMenuItem mntSeguimiento;
	private JMenuItem mntPrecios;
	private JMenu mnuAyuda;
	private JMenuItem mntContenidoAyuda;
	private JMenuItem mntAcerca;
	private interfaces.Acerca acerca;
	
	//CONSTRUCTOR
	public Principal(negocio.ControladorConfeccionarAnuncio controladorAnuncios) 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"SSC_128.png"));
		setMinimumSize(new Dimension(800, 600));
		setSize(getToolkit().getScreenSize());
		setTitle("SSC - Sistema de Seguimiento de Clientes");
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);		
		
        
        cntContenedor = new JPanel();
        cntContenedor.setBackground(Color.WHITE);
        cntContenedor.setLayout(null);
		
		
		lblImagenfondo = new JLabel("");
		lblImagenfondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblImagenfondo.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblImagenfondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblImagenfondo.setBounds(0, 0, 1365, 696);
		cntContenedor.add(lblImagenfondo);
		lblImagenfondo.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_PRESENTACION+"imgFondo.jpg"));

		
		mnuBarraMenu = new JMenuBar();
		setJMenuBar(mnuBarraMenu);
		
		
		mnuArchivo = new JMenu("Archivo");
		mnuArchivo.setMnemonic('A');
		mnuBarraMenu.add(mnuArchivo);
		
		mntSalir = new JMenuItem("Salir...");
		mntSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mntSalir.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"SALIR_16.png"));
		mntSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrando();
			}
		});
		mnuArchivo.add(mntSalir);
		
		
		//
		mnuOperaciones = new JMenu("Operaciones");
		mnuOperaciones.setMnemonic('O');
		mnuBarraMenu.add(mnuOperaciones);
		
		generarAnuncio = new interfaces.GenerarAnuncio(this, true, controladorAnuncios);
		
		mntConfeccionar = new JMenuItem("Confeccionar Anuncio");
		mntConfeccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				generarAnuncio.setVisible(true);
			}
		});
		mntConfeccionar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntConfeccionar.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"CONFECCIONAR_16.png"));
		mnuOperaciones.add(mntConfeccionar);
	
		mntSeguimiento = new JMenuItem("Realizar Seguimiento de Cliente");
		mntSeguimiento.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"SEGUIMIENTO_16.png"));
		mnuOperaciones.add(mntSeguimiento);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		//REVISAR
		mntPrecios = new JMenuItem("Modificar Precios");
		//mntPrecios.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"PRECIO_16.png"));
		mnuOperaciones.add(mntPrecios);
		/////////////////////////////////////////////////////////////////////////////////////////

		mnuAyuda = new JMenu("Ayuda");
		mnuAyuda.setMnemonic('u');
		mnuBarraMenu.add(mnuAyuda);
		
		mntContenidoAyuda = new JMenuItem("Contenidos");
		mntContenidoAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnuAyuda.add(mntContenidoAyuda);
		mntContenidoAyuda.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"AYUDA_16.png"));
		
		mntAcerca = new JMenuItem("Acerca de SSC");
		mntAcerca.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"ACERCA_16.png"));
		
		acerca = new interfaces.Acerca(this, true);

		mntAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acerca.setVisible(true);
			}
		});
		mntAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
		mnuAyuda.add(mntAcerca);
		
		setContentPane(cntContenedor);
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
            	cerrando();            	
            }
        });
	}
	
	
	
	public void cerrando()
	{
		int rta;
		rta = JOptionPane.showConfirmDialog(null, 
				"Esta a punto de salir de la aplicación:\n¿Realmente desea salir de la misma?",
				"ATENCIÓN",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, 
				new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"SALIR_32.png"));
		if(rta==JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
