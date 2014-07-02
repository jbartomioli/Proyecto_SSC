package interfaces;

import java.awt.Cursor;
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
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;



public class Configuraciones extends JDialog
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5183774197207425835L;
	private JTextField txtURL;
	private JTextField txtPuerto;
	private JTextField txtUsuario;
	private JPasswordField psfPass;
	private JTextField txtBD;
	private JCheckBox chkModoDepuracion; 
	private HashMap<String, String> propiedades;
	private utilidades.HibernateCFG archivoXML;
	private JPasswordField psfPassRep;
	private JTextField txtServerSmtp;
	private JTextField txtPuertoSmtp;
	private JPasswordField psfPassSmtp;
	private JPasswordField psfPassSmtpRep;
	private JTextField txtMail;
	private JCheckBox chkModoDepuracionSmtp;
	private JCheckBox chkAutenticacionSmtp;
	private JCheckBox chkTtlsSmtp;

	
	public Configuraciones(JFrame framePadre) 
	{
		super(framePadre);
		setResizable(false);
		setMinimumSize(new Dimension(500,500));
		getContentPane().setMinimumSize(new Dimension(500, 500));
		getContentPane().setMaximumSize(new Dimension(500, 500));
		setMaximumSize(new Dimension(500, 500));
		setLocationRelativeTo(null);
		setTitle("Configuraciones Generales");
		setIconImage(Toolkit.getDefaultToolkit().getImage(utilidades.Configuraciones.IMG_ICONOS+"CONFIGURACION_32.png"));
		setModalityType(ModalityType.APPLICATION_MODAL);
		setModal(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
		addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent arg0) {
	    		cerrar_salir();
	    	}
	    });
		
		JLabel lblTitulo = new JLabel("Configuraciones Generales de Programa");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(10, 11, 281, 23);
		getContentPane().add(lblTitulo);
		
		JPanel panelBD = new JPanel();
		panelBD.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Base de Datos", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelBD.setBounds(10, 45, 474, 135);
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
		lblUsuario.setBounds(10, 54, 71, 14);
		panelBD.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(81, 51, 111, 20);
		panelBD.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setBounds(235, 54, 86, 14);
		panelBD.add(lblPass);
		
		psfPass = new JPasswordField();
		psfPass.setBounds(324, 51, 140, 20);
		panelBD.add(psfPass);
		
		psfPassRep = new JPasswordField();
		psfPassRep.setText((String) null);
		psfPassRep.setBounds(324, 79, 140, 20);
		panelBD.add(psfPassRep);
		
		JLabel lblBD = new JLabel("Base de Datos:");
		lblBD.setBounds(10, 82, 111, 14);
		panelBD.add(lblBD);
		
		txtBD = new JTextField();
		txtBD.setBounds(131, 79, 86, 20);
		panelBD.add(txtBD);
		txtBD.setColumns(10);
		
		chkModoDepuracion = new JCheckBox("Modo Depuraci\u00F3n");
		chkModoDepuracion.setBounds(10, 103, 140, 23);
		panelBD.add(chkModoDepuracion);
		
		JPanel panelFile = new JPanel();
		panelFile.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Archivos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelFile.setBounds(10, 191, 474, 54);
		getContentPane().add(panelFile);
		panelFile.setLayout(null);
		
		JPanel panelMail = new JPanel();
		panelMail.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Mail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelMail.setBounds(10, 256, 474, 130);
		getContentPane().add(panelMail);	
		panelMail.setLayout(null);
		
		JLabel lblServidorSmtp = new JLabel("Servidor SMTP:");
		lblServidorSmtp.setBounds(10, 21, 94, 14);
		panelMail.add(lblServidorSmtp);
		
		txtServerSmtp = new JTextField();
		txtServerSmtp.setBounds(112, 18, 181, 20);
		panelMail.add(txtServerSmtp);
		txtServerSmtp.setColumns(10);
		
		JLabel lblPuertoSmtp = new JLabel("Puerto:");
		lblPuertoSmtp.setBounds(318, 21, 46, 14);
		panelMail.add(lblPuertoSmtp);
		
		txtPuertoSmtp = new JTextField();
		txtPuertoSmtp.setBounds(378, 18, 86, 20);
		panelMail.add(txtPuertoSmtp);
		txtPuertoSmtp.setColumns(10);
		
		JLabel lblMail = new JLabel("Direcci\u00F3n Mail:");
		lblMail.setBounds(10, 49, 94, 14);
		panelMail.add(lblMail);
		
		txtMail = new JTextField();
		txtMail.setBounds(112, 46, 128, 20);
		panelMail.add(txtMail);
		txtMail.setColumns(10);
		
		chkAutenticacionSmtp = new JCheckBox("Autenticaci\u00F3n");
		chkAutenticacionSmtp.setBounds(10, 97, 136, 23);
		panelMail.add(chkAutenticacionSmtp);
		
		JLabel lblPassSmtp = new JLabel("Contrase\u00F1a: ");
		lblPassSmtp.setBounds(250, 49, 75, 14);
		panelMail.add(lblPassSmtp);
		
		psfPassSmtp = new JPasswordField();
		psfPassSmtp.setBounds(328, 46, 136, 20);
		panelMail.add(psfPassSmtp);
		
		psfPassSmtpRep = new JPasswordField();
		psfPassSmtpRep.setBounds(328, 72, 136, 20);
		panelMail.add(psfPassSmtpRep);
		
		chkModoDepuracionSmtp = new JCheckBox("Modo Depuraci\u00F3n");
		chkModoDepuracionSmtp.setBounds(10, 71, 136, 23);
		panelMail.add(chkModoDepuracionSmtp);
		
		chkTtlsSmtp = new JCheckBox("TTLS");
		chkTtlsSmtp.setBounds(146, 97, 94, 23);
		panelMail.add(chkTtlsSmtp);
		
		
		interfaces.componentes.BotonesIconos btnAceptar = new interfaces.componentes.BotonesIconos("Aceptar", utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(294, 397);	
		btnAceptar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	action_aceptar();
	        	}});
		getContentPane().add(btnAceptar);
		
		
		interfaces.componentes.BotonesIconos btnCerrar = new interfaces.componentes.BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(394, 397);	
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	cerrar_salir();
	        	}});
		getContentPane().add(btnCerrar);
		
		inicializar();
	}
	
	
	
	//-------------------------------------------------------------
	protected void inicializar()
	{
		repaint();
		
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		
		archivoXML = new utilidades.HibernateCFG();
		archivoXML.leerConfiguraciones();
		
		propiedades = archivoXML.getElementos();
		
		String urlDB = propiedades.get("hibernate.connection.url");
		
		StringTokenizer tokenizer = new StringTokenizer(urlDB,":");
		String[] tokens = new String[tokenizer.countTokens()];
		int i = 0;
		
		while (tokenizer.hasMoreTokens())
		{
			tokens[i] = tokenizer.nextToken();
			i++;
		}
		
		txtURL.setText(tokens[2].substring(2));
		txtPuerto.setText(tokens[3].substring(0, tokens[3].indexOf('/')));
		txtUsuario.setText(propiedades.get("hibernate.connection.username"));
		psfPass.setText(propiedades.get("hibernate.connection.password"));
		psfPassRep.setText(propiedades.get("hibernate.connection.password"));
		txtBD.setText(tokens[3].substring(tokens[3].indexOf('/')+1));
		if(propiedades.get("hibernate.show_sql").equals("true"))
			chkModoDepuracion.setSelected(true);
		else
			chkModoDepuracion.setSelected(false);
		
		
		txtServerSmtp.setText(utilidades.Configuraciones.SMTP_HOST);
		txtPuertoSmtp.setText(utilidades.Configuraciones.SMTP_PORT);
		txtMail.setText(utilidades.Configuraciones.SMTP_USER);
		psfPassSmtp.setText(utilidades.Configuraciones.SMTP_PASS);
		psfPassSmtpRep.setText(utilidades.Configuraciones.SMTP_PASS);
		
		if(utilidades.Configuraciones.SMTP_DEBUG == true)
			chkModoDepuracionSmtp.setSelected(true);
		else
			chkModoDepuracionSmtp.setSelected(false);
		
		
		if(utilidades.Configuraciones.SMTP_AUTH.equals("true"))
			chkAutenticacionSmtp.setSelected(true);
		else
			chkAutenticacionSmtp.setSelected(false);
		
		if(utilidades.Configuraciones.SMTP_TTLS.equals("true"))
			chkTtlsSmtp.setSelected(true);
		else
			chkTtlsSmtp.setSelected(false);
		
	}
	
	
	//-------------------------------------------------------------
	@SuppressWarnings("deprecation")
	protected void action_aceptar()
	{
		if(validar_formulario())
		{
			propiedades.put("hibernate.connection.username", txtUsuario.getText());
			propiedades.put("hibernate.connection.password", psfPass.getText());
			if(chkModoDepuracion.isSelected())
				propiedades.put("hibernate.show_sql", "true");
			else
				propiedades.put("hibernate.show_sql", "false");
			
			String urlDB = "jdbc:mysql://"+txtURL.getText()+":"+txtPuerto.getText()+"/"+txtBD.getText();
			propiedades.put("hibernate.connection.url", urlDB);
			
			setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			archivoXML.guardarConfiguraciones(propiedades);
						
			cerrar_salir();
		}
		
	}

	
	
	//-------------------------------------------------------------
	@SuppressWarnings("deprecation")
	protected boolean validar_formulario()
	{
		boolean rta = true;
		String mensaje = "";
		
		if(txtURL.getText().equals(""))
		{
			mensaje += "El campo de servidor no puede estar vac�o\n";
			rta = false;
		}

		if(txtPuerto.getText().equals(""))
		{
			mensaje += "El campo de puerto no puede estar vac�o\n";
			rta = false;
		}
		
		if(txtUsuario.getText().equals(""))
		{
			mensaje += "El campo de usuario no puede estar vac�o\n";
			rta = false;
		}

		if(txtBD.getText().equals(""))
			mensaje += "El campo de base de datos no puede estar vac�o\n";
		
		if(psfPass.getText().equals(""))
		{
			mensaje += "El campo de contrase�a de base de datos no puede estar vac�o\n";
			rta = false;
		}
		
		if(!psfPass.getText().equals(psfPassRep.getText()))
		{
			mensaje += "Las contrase�as de base de datos no coinciden\n";
			rta = false;
		}
		
		if(txtServerSmtp.getText().equals(""))
		{
			mensaje += "El campo de servidor SMTP no puede estar vacio\n";
			rta = false;
		}
			
		if(txtPuertoSmtp.getText().equals(""))
		{
			mensaje += "El campo de puerto SMTP no puede estar vacio\n";
			rta = false;
		}
		
		if(!validar_mail(txtMail.getText()))
		{
			mensaje += "El campo de mail no es v�lido\n";
			rta = false;
		}
		
		if(psfPassSmtp.getText().equals(""))
		{
			mensaje += "El campo de contrase�a de mail no puede estar vac�o\n";
			rta = false;
		}
		
		if(!psfPassSmtpRep.getText().equals(psfPassSmtp.getText()))
		{
			mensaje += "Las contrase�as de mail no coinciden\n";
			rta = false;
		}
			
		if(!rta)
			JOptionPane.showMessageDialog(this, mensaje, "ATENCI�N", JOptionPane.WARNING_MESSAGE);
		
		return rta;
	}
	
	
	//-------------------------------------------------------------
	protected void cerrar_salir()
	{
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		dispose();	
	}
	
	//-------------------------------------------------------------
	protected boolean validar_mail(String mail)
    {
		String patron_mail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        // Compiles the given regular expression into a pattern.
        Pattern patron = Pattern.compile(patron_mail);
 
        // Match the given input against this pattern
        Matcher matcher = patron.matcher(mail);
        return matcher.matches();
 
    }
}
