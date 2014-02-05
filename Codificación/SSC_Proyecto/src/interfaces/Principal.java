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


public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 */
	public Principal(utilidades.Configuraciones configuraciones) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyecto_Final_SSC\\Codificaci\u00F3n\\SSC_Proyecto\\recursos\\iconos\\SSC.png"));
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

		
		JMenuBar mnuBarraMenu = new JMenuBar();
		setJMenuBar(mnuBarraMenu);
		
		JMenu mnuMenu1 = new JMenu("New menu");
		mnuBarraMenu.add(mnuMenu1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnuMenu1.add(mntmNewMenuItem);
		
		JMenuItem mntSalir = new JMenuItem("Salir...");
		mntSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rta = 0;
				rta = JOptionPane.showConfirmDialog(null, "Esta a punto de salir de la aplicación:\n¿Realmente desea salir de la misma?","ATENCIÓN", JOptionPane.YES_NO_OPTION);
				if(rta==0)
					System.exit(0);
			}
		});
		mnuMenu1.add(mntSalir);
		
		JMenu mnuMenu2 = new JMenu("New menu");
		mnuBarraMenu.add(mnuMenu2);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		mnuBarraMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		mnuBarraMenu.add(mnNewMenu_3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(cntContenedor);
	
		setVisible(true);

	}
}
