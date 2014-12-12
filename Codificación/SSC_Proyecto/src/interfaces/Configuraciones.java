package interfaces;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import interfaces.componentes.*;



/**
 * PANTALLA DE CONFIGURACIONES GLOBALES
 * @author Javier Bartomioli - Rodrigo Naredo
 *
 */
public class Configuraciones
{
	
	//COMPONENTES
	public JDialogBaseFormularios frmConfiguraciones;
	public JTextField txtURL;
	public JTextField txtPuerto;
	public JTextField txtUsuario;
	public JPasswordField psfPass;
	public JTextField txtBD;
	public JCheckBox chkModoDepuracion; 
	public JPasswordField psfPassRep;
	public JTextField txtServerSmtp;
	public JTextField txtPuertoSmtp;
	public JPasswordField psfPassSmtp;
	public JPasswordField psfPassSmtpRep;
	public JTextField txtMail;
	public JCheckBox chkModoDepuracionSmtp;
	public JCheckBox chkAutenticacionSmtp;
	public JCheckBox chkTtlsSmtp;
	public JTextField txtUbicacionFile;
	public JButton btnBuscarArchivo;
	public BotonesIconos btnCerrar;
	public BotonesIconos btnAceptar;

	
	/**
	 * CONSTRUCTOR
	 * @param framePadre JFrame - Ventana padre
	 */
	public Configuraciones(JFrame framePadre)
	{
		//FORMULARIO BASE
		frmConfiguraciones = new JDialogBaseFormularios(framePadre, "Configuraciones Generales", "CONFIGURACION.png", true);
		frmConfiguraciones.setDimensionFormulario(500,500);
		frmConfiguraciones.setBotonAyuda(452, 15);
		
		
		//TITULO
		JLabel lblTitulo = new JLabel("Configuraciones Generales de Programa");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(10, 11, 374, 23);
		frmConfiguraciones.getContentPane().add(lblTitulo);
		
		
		//IMAGEN
		JLabel imagen = new JLabel();
		imagen.setBounds(385, 11, 32, 32);
		imagen.setIcon(new ImageIcon(utilidades.Configuraciones.IMG_ICONOS+"CONFIGURACION_32.png"));
		frmConfiguraciones.getContentPane().add(imagen);
		
		//PANEL BASE DE DATOS 
		JPanel panelBD = new JPanel();
		panelBD.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Base de Datos", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelBD.setBounds(10, 45, 474, 135);
		frmConfiguraciones.getContentPane().add(panelBD);
		panelBD.setLayout(null);
		
		
			//URL BD
			JLabel lblURL = new JLabel("Servidor:");
			lblURL.setBounds(10, 25, 61, 14);
			panelBD.add(lblURL);
			
			txtURL = new JTextField();
			txtURL.setBounds(72, 22, 218, 20);
			panelBD.add(txtURL);
			txtURL.setColumns(10);
			
		
			//PUERTO BD 
			JLabel lblPuerto = new JLabel("Puerto:");
			lblPuerto.setBounds(324, 25, 52, 14);
			panelBD.add(lblPuerto);
			
			txtPuerto = new JTextField();
			txtPuerto.setBounds(378, 22, 86, 20);
			panelBD.add(txtPuerto);
			txtPuerto.setColumns(10);
			
			
			//USUARIO BD
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(10, 54, 61, 14);
			panelBD.add(lblUsuario);
			
			txtUsuario = new JTextField();
			txtUsuario.setBounds(72, 51, 120, 20);
			panelBD.add(txtUsuario);
			txtUsuario.setColumns(10);
			
			
			//PASS BD
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
	

			//BASE DE DATOS
			JLabel lblBD = new JLabel("Base de Datos:");
			lblBD.setBounds(10, 82, 86, 14);
			panelBD.add(lblBD);
			
			txtBD = new JTextField();
			txtBD.setBounds(99, 79, 111, 20);
			panelBD.add(txtBD);
			txtBD.setColumns(10);
			
			
			//DEPURACION
			chkModoDepuracion = new JCheckBox("Modo Depuraci\u00F3n");
			chkModoDepuracion.setBounds(10, 103, 140, 23);
			panelBD.add(chkModoDepuracion);
		///////////////////////////////////
		
			

		//PANEL ARCHIVOS
		JPanel panelFile = new JPanel();
		panelFile.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Archivos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panelFile.setBounds(10, 185, 474, 68);
		frmConfiguraciones.getContentPane().add(panelFile);
		panelFile.setLayout(null);
			
		
			//UBICACION
			JLabel lblUbicacin = new JLabel("Ubicaci\u00F3n:");
			lblUbicacin.setBounds(10, 26, 65, 16);
			panelFile.add(lblUbicacin);
			
			txtUbicacionFile = new JTextField();
			txtUbicacionFile.setBounds(74, 24, 255, 20);
			panelFile.add(txtUbicacionFile);
			txtUbicacionFile.setColumns(10);
			
			
			//BUSCAR ARCHIVO
			btnBuscarArchivo = new JButton("Buscar Archivo");
			btnBuscarArchivo.setBounds(341, 21, 121, 26);
			panelFile.add(btnBuscarArchivo);
		////////////////////////////////////
		
			
			
		//PANEL MAIL
		JPanel panelMail = new JPanel();
		panelMail.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Mail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panelMail.setBounds(10, 256, 474, 130);
		frmConfiguraciones.getContentPane().add(panelMail);	
		panelMail.setLayout(null);
		
		
			//SERVIDOR
			JLabel lblServidorSmtp = new JLabel("Servidor SMTP:");
			lblServidorSmtp.setBounds(10, 21, 94, 14);
			panelMail.add(lblServidorSmtp);
			
			txtServerSmtp = new JTextField();
			txtServerSmtp.setBounds(105, 18, 198, 20);
			panelMail.add(txtServerSmtp);
			txtServerSmtp.setColumns(10);
			

			//PUERTO SMTP
			JLabel lblPuertoSmtp = new JLabel("Puerto:");
			lblPuertoSmtp.setBounds(328, 21, 51, 14);
			panelMail.add(lblPuertoSmtp);
			
			txtPuertoSmtp = new JTextField();
			txtPuertoSmtp.setBounds(378, 18, 86, 20);
			panelMail.add(txtPuertoSmtp);
			txtPuertoSmtp.setColumns(10);
			

			//MAIL
			JLabel lblMail = new JLabel("Direcci\u00F3n Mail:");
			lblMail.setBounds(10, 49, 86, 14);
			panelMail.add(lblMail);
			
			txtMail = new JTextField();
			txtMail.setBounds(105, 46, 135, 20);
			panelMail.add(txtMail);
			txtMail.setColumns(10);
			
			
			//AUTENTICACION
			chkAutenticacionSmtp = new JCheckBox("Autenticaci\u00F3n");
			chkAutenticacionSmtp.setBounds(10, 97, 136, 23);
			panelMail.add(chkAutenticacionSmtp);
			
			JLabel lblPassSmtp = new JLabel("Contrase\u00F1a: ");
			lblPassSmtp.setBounds(258, 49, 72, 14);
			panelMail.add(lblPassSmtp);
			

			//PASSWORD
			psfPassSmtp = new JPasswordField();
			psfPassSmtp.setBounds(338, 46, 126, 20);
			panelMail.add(psfPassSmtp);
			
			psfPassSmtpRep = new JPasswordField();
			psfPassSmtpRep.setBounds(338, 72, 126, 20);
			panelMail.add(psfPassSmtpRep);
			
			
			//DEPURACION
			chkModoDepuracionSmtp = new JCheckBox("Modo Depuraci\u00F3n");
			chkModoDepuracionSmtp.setBounds(10, 71, 136, 23);
			panelMail.add(chkModoDepuracionSmtp);
		
			
			//SSL
			chkTtlsSmtp = new JCheckBox("TTLS");
			chkTtlsSmtp.setBounds(146, 97, 94, 23);
			panelMail.add(chkTtlsSmtp);
		///////////////////////////////
		
			
			
		//BOTON ACEPTAR
		btnAceptar = new BotonesIconos("Aceptar","ACEPTAR.png");
		btnAceptar.setLocation(294, 397);	
		frmConfiguraciones.getContentPane().add(btnAceptar);
		
		
		//BOTON CANCELAR
		btnCerrar = new BotonesIconos("Cerrar", "CERRAR.png");
		btnCerrar.setLocation(394, 397);	
		frmConfiguraciones.getContentPane().add(btnCerrar);
	}	
	//////////////////////////////////////////
}
