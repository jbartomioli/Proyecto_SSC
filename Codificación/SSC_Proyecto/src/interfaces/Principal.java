package interfaces;

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


public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public Principal(utilidades.Configuraciones configuraciones) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(configuraciones.getIMG_ICONOS()+"SSC_128.png"));
		setMinimumSize(new Dimension(800, 600));
		setTitle("SSC - Sistema de Seguimiento de Clientes");
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);		
		
        
        JPanel cntContenedor = new JPanel();
        cntContenedor.setBackground(Color.WHITE);
        cntContenedor.setLayout(null);
		
		
		JLabel lblImagenfondo = new JLabel("");
		lblImagenfondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblImagenfondo.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblImagenfondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblImagenfondo.setBounds(0, 0, 1365, 696);
		cntContenedor.add(lblImagenfondo);
		lblImagenfondo.setIcon(new ImageIcon(configuraciones.getIMG_PRESENTACION()+"imgFondo.jpg"));

		//
		JMenuBar mnuBarraMenu = new JMenuBar();
		setJMenuBar(mnuBarraMenu);
		
		
		//
		JMenu mnuArchivo = new JMenu("Archivo");
		mnuArchivo.setMnemonic('A');
		mnuBarraMenu.add(mnuArchivo);
		
		JMenuItem mntSalir = new JMenuItem("Salir...");
		mntSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mntSalir.setIcon(new ImageIcon(configuraciones.getIMG_ICONOS()+"SALIR_16.png"));
		mntSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rta = 0;
				rta = JOptionPane.showConfirmDialog(null, "Esta a punto de salir de la aplicación:\n¿Realmente desea salir de la misma?","ATENCIÓN", JOptionPane.YES_NO_OPTION);
				if(rta==0)
					System.exit(0);
			}
		});
		mnuArchivo.add(mntSalir);
		
		
		//
		JMenu mnuOperaciones = new JMenu("Operaciones");
		mnuOperaciones.setMnemonic('O');
		mnuBarraMenu.add(mnuOperaciones);
		
		JMenuItem mntConfeccionar = new JMenuItem("Confeccionar Anuncio");
		mntConfeccionar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntConfeccionar.setIcon(new ImageIcon(configuraciones.getIMG_ICONOS()+"CONFECCIONAR_16.png"));
		mnuOperaciones.add(mntConfeccionar);
	
		JMenuItem mntSeguimiento = new JMenuItem("Realizar Seguimiento de Cliente");
		mntSeguimiento.setIcon(new ImageIcon(configuraciones.getIMG_ICONOS()+"SEGUIMIENTO_16.png"));
		mnuOperaciones.add(mntSeguimiento);
		
		
		//
		JMenu mnuAyuda = new JMenu("Ayuda");
		mnuAyuda.setMnemonic('u');
		mnuBarraMenu.add(mnuAyuda);
		
		JMenuItem mntContenidoAyuda = new JMenuItem("Contenidos");
		mntContenidoAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnuAyuda.add(mntContenidoAyuda);
		mntContenidoAyuda.setIcon(new ImageIcon(configuraciones.getIMG_ICONOS()+"AYUDA_16.png"));
		
		JMenuItem mntAcerca = new JMenuItem("Acerca de SSC");
		mntAcerca.setIcon(new ImageIcon(configuraciones.getIMG_ICONOS()+"ACERCA_16.png"));
		final interfaces.Acerca acerca = new interfaces.Acerca(this, true);

		mntAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acerca.setVisible(true);
			}
		});
		mntAcerca.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
		mnuAyuda.add(mntAcerca);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(cntContenedor);
	
		setVisible(true);

	}
}
