package interfaces;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import utilidades.LeerHibernateCFG;

public class Configuraciones extends JDialog
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5183774197207425835L;
	private JTextField txtURL;
	private JTextField txtPuerto;
	private JTextField txtUsuario;
	private JPasswordField pflPass;
	
	public Configuraciones(JFrame framePadre) 
	{
		super(framePadre);
		setResizable(false);
		setMinimumSize(new Dimension(500,500));
		getContentPane().setMinimumSize(new Dimension(500, 500));
		getContentPane().setMaximumSize(new Dimension(500, 500));
		setMaximumSize(new Dimension(500, 500));
		//setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height-50);
		setLocationRelativeTo(null);
		setTitle("Configuraciones Generales");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CONFIGURACION_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
		addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent arg0) {
	    		cerrar_salir();
	    	}
	    });
		
		JLabel lblTitulo = new JLabel("Configuraciones Generales de Programa");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(10, 11, 281, 23);
		getContentPane().add(lblTitulo);
		
		
		interfaces.componentes.BotonesIconos btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar", utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(294, 397);	
		btnAceptar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	inicializar();
	        	}});
		getContentPane().add(btnAceptar);
		
		
		interfaces.componentes.BotonesIconos btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(394, 397);	
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	cerrar_salir();
	        	}});
		getContentPane().add(btnCerrar);
		
		JPanel panelBD = new JPanel();
		panelBD.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Base de Datos", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelBD.setBounds(10, 45, 474, 144);
		getContentPane().add(panelBD);
		panelBD.setLayout(null);
		
		JLabel lblURL = new JLabel("Servidor:");
		lblURL.setBounds(10, 25, 71, 14);
		panelBD.add(lblURL);
		
		txtURL = new JTextField();
		txtURL.setBounds(81, 22, 209, 20);
		panelBD.add(txtURL);
		txtURL.setColumns(10);
		
		JLabel lblPuerto = new JLabel("Puerto:");
		lblPuerto.setBounds(318, 25, 58, 14);
		panelBD.add(lblPuerto);
		
		txtPuerto = new JTextField();
		txtPuerto.setBounds(378, 22, 86, 20);
		panelBD.add(txtPuerto);
		txtPuerto.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 62, 71, 14);
		panelBD.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(81, 59, 111, 20);
		panelBD.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setBounds(235, 62, 86, 14);
		panelBD.add(lblPass);
		
		pflPass = new JPasswordField();
		pflPass.setBounds(324, 59, 140, 20);
		panelBD.add(pflPass);
		
		JLabel lblModoDepuracion = new JLabel("Modo Depuraci\u00F3n:");
		lblModoDepuracion.setBounds(10, 103, 111, 14);
		panelBD.add(lblModoDepuracion);
		
		JComboBox<String> cmbModoDepuracion = new JComboBox<String>();
		cmbModoDepuracion.setModel(new DefaultComboBoxModel<String>(new String[] {"SI", "NO"}));
		cmbModoDepuracion.setSelectedIndex(0);
		cmbModoDepuracion.setBounds(131, 100, 49, 20);
		panelBD.add(cmbModoDepuracion);
		
		JPanel panelFile = new JPanel();
		panelFile.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Archivos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelFile.setBounds(10, 200, 474, 54);
		getContentPane().add(panelFile);
		
		JPanel panelMail = new JPanel();
		panelMail.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Mail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelMail.setBounds(10, 265, 474, 54);
		getContentPane().add(panelMail);
		
		
	}
	
	
	
	//-------------------------------------------------------------
	protected void inicializar()
	{
		utilidades.LeerHibernateCFG archivoXML = new utilidades.LeerHibernateCFG();
		
		String[] propiedades = archivoXML.getElementos();
		
		txtURL.setText(propiedades[0]);
		
	}
	
	
	//-------------------------------------------------------------
	protected void cerrar_salir()
	{
		int rta = JOptionPane.showConfirmDialog(
					this, 
					"¿Desea salir y volver al menu principal?\n"
						+ "Todo cambio que no haya guardado se perderá.",
					"ATENCIÓN",
					JOptionPane.YES_NO_OPTION);
				
		switch(rta)
		{
		case(1): //finalizarEdicion();
				 break;
		case(0): //limpiar_formulario();
				 dispose();
				 break;
		}
	}
}
