package interfaces;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import interfaces.componentes.*;




public class Configuraciones extends JDialogBaseFormularios
{
	
	/****************
	 * SERIALIZABLE 
	 ****************/
	private static final long serialVersionUID = 5183774197207425835L;
	
	
	/***************
	 * COMPONENTES 
	 ***************/
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
	private JTextField txtUbicacionFile;


	private JButton btnBuscarArchivo;


	private BotonesIconos btnCerrar;

	
	/*********************
	 * CONSTRUCTOR       
	 * @param framePadre 
	 *********************/
	public Configuraciones(JFrame framePadre) 
	{
		/*******************
		 * FORMULARIO BASE 
		 *******************/
		super(framePadre, "Configuraciones Generales", "CONFIGURACION_32.png", true);
		setDimensionFormulario(500,500);
		setBotonAyuda(452, 15);
		
		/**********
		 * TITULO 
		 **********/
		JLabel lblTitulo = new JLabel("Configuraciones Generales de Programa");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 374, 23);
		getContentPane().add(lblTitulo);
		
		/********** 
		 * IMAGEN 
		 **********/
		JLabel imagen = new JLabel();
		imagen.setBounds(385, 11, 32, 32);
		imagen.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"CONFIGURACION_32.png"));
		getContentPane().add(imagen);
		
		/**********************
		 * PANEL BASE DE DATOS 
		 **********************/
		JPanel panelBD = new JPanel();
		panelBD.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Base de Datos", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelBD.setBounds(10, 45, 474, 135);
		getContentPane().add(panelBD);
		panelBD.setLayout(null);
		
		/*********
		 * URL BD
		 *********/
		JLabel lblURL = new JLabel("Servidor:");
		lblURL.setBounds(10, 25, 61, 14);
		panelBD.add(lblURL);
		
		txtURL = new JTextField();
		txtURL.setBounds(72, 22, 218, 20);
		panelBD.add(txtURL);
		txtURL.setColumns(10);
		
		/************
		 * PUERTO BD
		 ************/
		JLabel lblPuerto = new JLabel("Puerto:");
		lblPuerto.setBounds(324, 25, 52, 14);
		panelBD.add(lblPuerto);
		
		txtPuerto = new JTextField();
		txtPuerto.setBounds(378, 22, 86, 20);
		panelBD.add(txtPuerto);
		txtPuerto.setColumns(10);
		
		/*************
		 * USUARIO BD
		 *************/
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(10, 54, 61, 14);
		panelBD.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(72, 51, 120, 20);
		panelBD.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		/**********
		 * PASS BD
		 **********/
		JLabel lblPass = new JLabel("Contrase\u00F1a:");
		lblPass.setBounds(261, 54, 69, 14);
		panelBD.add(lblPass);
		
		psfPass = new JPasswordField();
		psfPass.setBounds(338, 51, 126, 20);
		panelBD.add(psfPass);

		psfPassRep = new JPasswordField();
		psfPassRep.setText((String) null);
		psfPassRep.setBounds(338, 79, 126, 20);
		panelBD.add(psfPassRep);

		/****************
		 * BASE DE DATOS
		 ****************/
		JLabel lblBD = new JLabel("Base de Datos:");
		lblBD.setBounds(10, 82, 86, 14);
		panelBD.add(lblBD);
		
		txtBD = new JTextField();
		txtBD.setBounds(99, 79, 111, 20);
		panelBD.add(txtBD);
		txtBD.setColumns(10);
		
		/*************
		 * DEPURACION
		 *************/
		chkModoDepuracion = new JCheckBox("Modo Depuraci\u00F3n");
		chkModoDepuracion.setBounds(10, 103, 140, 23);
		panelBD.add(chkModoDepuracion);
		
		
		/*****************
		 * PANEL ARCHIVOS
		 *****************/
		JPanel panelFile = new JPanel();
		panelFile.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Archivos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelFile.setBounds(10, 185, 474, 68);
		getContentPane().add(panelFile);
		panelFile.setLayout(null);
		
		/************
		 * UBICACION
		 ************/
		JLabel lblUbicacin = new JLabel("Ubicaci\u00F3n:");
		lblUbicacin.setBounds(10, 26, 65, 16);
		panelFile.add(lblUbicacin);
		
		txtUbicacionFile = new JTextField();
		txtUbicacionFile.setBounds(74, 24, 255, 20);
		panelFile.add(txtUbicacionFile);
		txtUbicacionFile.setColumns(10);
		
		/*****************
		 * BUSCAR ARCHIVO
		 *****************/
		btnBuscarArchivo = new JButton("Buscar Archivo");
		btnBuscarArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				buscar_archivo();
			}
		});
		btnBuscarArchivo.setBounds(341, 21, 121, 26);
		panelFile.add(btnBuscarArchivo);
		
		
		/*************
		 * PANEL MAIL
		 *************/
		JPanel panelMail = new JPanel();
		panelMail.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Mail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelMail.setBounds(10, 256, 474, 130);
		getContentPane().add(panelMail);	
		panelMail.setLayout(null);
		
		/***********
		 * SERVIDOR
		 ***********/
		JLabel lblServidorSmtp = new JLabel("Servidor SMTP:");
		lblServidorSmtp.setBounds(10, 21, 94, 14);
		panelMail.add(lblServidorSmtp);
		
		txtServerSmtp = new JTextField();
		txtServerSmtp.setBounds(105, 18, 198, 20);
		panelMail.add(txtServerSmtp);
		txtServerSmtp.setColumns(10);
		
		/**************
		 * PUERTO SMTP
		 **************/
		JLabel lblPuertoSmtp = new JLabel("Puerto:");
		lblPuertoSmtp.setBounds(328, 21, 51, 14);
		panelMail.add(lblPuertoSmtp);
		
		txtPuertoSmtp = new JTextField();
		txtPuertoSmtp.setBounds(378, 18, 86, 20);
		panelMail.add(txtPuertoSmtp);
		txtPuertoSmtp.setColumns(10);
		
		/*******
		 * MAIL
		 *******/
		JLabel lblMail = new JLabel("Direcci\u00F3n Mail:");
		lblMail.setBounds(10, 49, 86, 14);
		panelMail.add(lblMail);
		
		txtMail = new JTextField();
		txtMail.setBounds(105, 46, 135, 20);
		panelMail.add(txtMail);
		txtMail.setColumns(10);
		
		
		/****************
		 * AUTENTICACION
		 ****************/
		chkAutenticacionSmtp = new JCheckBox("Autenticaci\u00F3n");
		chkAutenticacionSmtp.setBounds(10, 97, 136, 23);
		panelMail.add(chkAutenticacionSmtp);
		
		JLabel lblPassSmtp = new JLabel("Contrase\u00F1a: ");
		lblPassSmtp.setBounds(258, 49, 72, 14);
		panelMail.add(lblPassSmtp);
		
		/***********
		 * PASSWORD
		 ***********/
		psfPassSmtp = new JPasswordField();
		psfPassSmtp.setBounds(338, 46, 126, 20);
		panelMail.add(psfPassSmtp);
		
		psfPassSmtpRep = new JPasswordField();
		psfPassSmtpRep.setBounds(338, 72, 126, 20);
		panelMail.add(psfPassSmtpRep);
		
		
		/*************
		 * DEPURACION
		 *************/
		chkModoDepuracionSmtp = new JCheckBox("Modo Depuraci\u00F3n");
		chkModoDepuracionSmtp.setBounds(10, 71, 136, 23);
		panelMail.add(chkModoDepuracionSmtp);
		
		/******
		 * SSL
		 ******/
		chkTtlsSmtp = new JCheckBox("TTLS");
		chkTtlsSmtp.setBounds(146, 97, 94, 23);
		panelMail.add(chkTtlsSmtp);
		
		
		/****************
		 * BOTON ACEPTAR
		 ****************/
		BotonesIconos btnAceptar = 
				new BotonesIconos("Aceptar", utilidades.Configuraciones.IMG_ICONOS+"ACEPTAR_32.png");
		btnAceptar.setLocation(294, 397);	
		btnAceptar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento) {
	        	click_aceptar();
	        	}});
		getContentPane().add(btnAceptar);
		
		
		/*****************
		 * BOTON CANCELAR
		 *****************/
		btnCerrar = new BotonesIconos("Cerrar", utilidades.Configuraciones.IMG_ICONOS+"CERRAR_32.png");
		btnCerrar.setLocation(394, 397);	
		btnCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evento)
	        {
	        	cerrar_salir();
	        }});
		getContentPane().add(btnCerrar);
		
		addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent arg0) {
        		cerrar_salir();
        	}
        });
		
		
		/**********************************
		 * INICIALIZACIONES DE COMPONENTES
		 **********************************/
		inicializar();
	}	
	
	
	/**
	 * INICIALIZAR COMPONENTES
	 */
	protected void inicializar()
	{
		repaint();
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		
		//OPCIONES SERVIDOR DE BASE DE DATOS
		try
		{
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
			txtBD.setText(tokens[3].substring(tokens[3].indexOf('/')+1));
			
			txtUsuario.setText(propiedades.get("hibernate.connection.username"));
			psfPass.setText(propiedades.get("hibernate.connection.password"));
			psfPassRep.setText(propiedades.get("hibernate.connection.password"));

			if(propiedades.get("hibernate.show_sql").equals("true"))
				chkModoDepuracion.setSelected(true);
			else
				chkModoDepuracion.setSelected(false);
		}
		catch(NullPointerException npe)
		{
			//
		}
		
		//OPCIONES ARCHIVO DE CONFIGURACION GLOBAL
		txtUbicacionFile.setText(utilidades.Configuraciones.URL_FILE);

		
		//OPCIONES SERVIDOR MAIL - SMTP
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
	
	
	

	/**
	 * GUARDAR MODIFICACIONES
	 */
	@SuppressWarnings("deprecation")
	protected void click_aceptar()
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
			
			HashMap<String, String> atributosMail = new HashMap<String, String>();
			
			atributosMail.put("SMTP_HOST", txtServerSmtp.getText());
			atributosMail.put("SMTP_PORT", txtPuertoSmtp.getText());
			
			if(chkAutenticacionSmtp.isSelected())
				atributosMail.put("SMTP_AUTH", "true");
			else
				atributosMail.put("SMTP_AUTH", "false");
			
			atributosMail.put("SMTP_USER", txtMail.getText());
			atributosMail.put("SMTP_PASS", psfPassSmtp.getText());
			
			if(chkTtlsSmtp.isSelected())
				atributosMail.put("SMTP_TTLS", "true");
			else
				atributosMail.put("SMTP_TTLS", "false");
			
			if(chkTtlsSmtp.isSelected())
				atributosMail.put("SMTP_DEBUG", "true");
			else
				atributosMail.put("SMTP_DEBUG", "false");
			
			utilidades.Configuraciones.guardar_modificaciones_mail(atributosMail);
			
			utilidades.Configuraciones.modificar_url_archivo_config(txtUbicacionFile.getText());;
						
			cerrar_salir();
		}
		
	}
	

	
	/**
	 * VALIDAR DATOS DEL FORMULARIO
	 * @return
	 */
	@SuppressWarnings("deprecation")
	protected boolean validar_formulario()
	{
		boolean rta = true;
		String mensaje = "";
		
		if(txtURL.getText().equals(""))
		{
			mensaje += "El campo de servidor no puede estar vacío\n";
			rta = false;
		}

		if(!validar_puerto(txtPuerto.getText()))
		{
			mensaje += "El campo de puerto de BD no es válido\n";
			rta = false;
		}
		
		if(txtUsuario.getText().equals(""))
		{
			mensaje += "El campo de usuario no puede estar vacío\n";
			rta = false;
		}

		if(txtBD.getText().equals(""))
			mensaje += "El campo de base de datos no puede estar vacío\n";
		
		if(psfPass.getText().equals(""))
		{
			mensaje += "El campo de contraseña de base de datos no puede estar vacío\n";
			rta = false;
		}
		
		if(!psfPass.getText().equals(psfPassRep.getText()))
		{
			mensaje += "Las contraseñas de base de datos no coinciden\n";
			rta = false;
		}
		
		if(txtUbicacionFile.getText().equals(""))
		{
			mensaje += "El campo de ubicación del archivo de configuraciones no puede ser nulo\n";
			rta = false;
		}	
		
		if(txtServerSmtp.getText().equals(""))
		{
			mensaje += "El campo de servidor SMTP no puede estar vacio\n";
			rta = false;
		}
			
		if(!validar_puerto(txtPuertoSmtp.getText()))
		{
			mensaje += "El campo de puerto SMTP no es válido\n";
			rta = false;
		}
		
		if(!validar_mail(txtMail.getText()))
		{
			mensaje += "El campo de mail no es válido\n";
			rta = false;
		}
		
		if(psfPassSmtp.getText().equals(""))
		{
			mensaje += "El campo de contraseña de mail no puede estar vacío\n";
			rta = false;
		}
		
		if(!psfPassSmtpRep.getText().equals(psfPassSmtp.getText()))
		{
			mensaje += "Las contraseñas de mail no coinciden\n";
			rta = false;
		}
			
		if(!rta)
			JOptionPane.showMessageDialog(this, mensaje, "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
		
		return rta;
	}
	
	

	
	//-------------------------------------------------------------
	protected boolean validar_mail(String mail)
    {
		String patron_mail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron = Pattern.compile(patron_mail);
 
        Matcher matcher = patron.matcher(mail);
        return matcher.matches();
    }
	
	
	//-------------------------------------------------------------
	protected boolean validar_puerto(String puerto)
    {
		String patron_puerto = "\\d{1,5}";
        Pattern patron = Pattern.compile(patron_puerto);
 
        Matcher matcher = patron.matcher(puerto);
        return matcher.matches();
    }
	
	//-------------------------------------------------------------
	protected void buscar_archivo()
	{
		try
		{
			setCursor(new Cursor(Cursor.WAIT_CURSOR));

			JFileChooser buscarArchivo = new JFileChooser();
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("ini","INI");
			buscarArchivo.setFileFilter(filter);
			
			@SuppressWarnings("unused")
			int seleccion = buscarArchivo.showOpenDialog(this);
						
			buscarArchivo.setVisible(true);
			String urlArchivo = buscarArchivo.getSelectedFile().getAbsolutePath();
			txtUbicacionFile.setText(urlArchivo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}	
}
