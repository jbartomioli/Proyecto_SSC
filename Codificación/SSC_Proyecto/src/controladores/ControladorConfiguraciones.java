package controladores;

import interfaces.Configuraciones;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import utilidades.HibernateCFG;
/**
 * CONTROLADOR CONFIGURACIONES GENERALES DEL PROGRAMA
 * @author Javier
 *
 */
public class ControladorConfiguraciones implements ActionListener
{
	
	//ATRIBUTOS
	private Configuraciones guiConfiguraciones;
	
	//VARIABLES
	private HashMap<String, String> propiedades;
	private HibernateCFG archivoXML;

	
	/**
	 * CONSTRUCTOR
	 * @param guiConfiguraciones
	 */
	public ControladorConfiguraciones(Configuraciones guiConfiguraciones)
	{
		this.guiConfiguraciones = guiConfiguraciones;
		
		this.guiConfiguraciones.btnBuscarArchivo.addActionListener(this);
		this.guiConfiguraciones.btnAceptar.addActionListener(this);
		this.guiConfiguraciones.btnCerrar.addActionListener(this);

		inicializar();
		guiConfiguraciones.frmConfiguraciones.setVisible(true);	
	}
	//////////////////////////////////////////////////////////////////////
	
	
	
	//METODOS
	/**
	 * REESCRITURA ACTION PERFORMED
	 */
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(evento.getSource().equals(guiConfiguraciones.btnBuscarArchivo))
			buscar_archivo();
		
		if(evento.getSource().equals(guiConfiguraciones.btnAceptar))
			click_aceptar();
		
		if(evento.getSource().equals(guiConfiguraciones.btnCerrar))
			cerrar_salir();
	}
	////////////////////////////////////////////////
	
	
	
	/**
	 * INICIALIZAR COMPONENTES
	 */
	protected void inicializar()
	{
		guiConfiguraciones.frmConfiguraciones.repaint();
		guiConfiguraciones.frmConfiguraciones.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		
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
			
			guiConfiguraciones.txtURL.setText(tokens[2].substring(2));
			guiConfiguraciones.txtPuerto.setText(tokens[3].substring(0, tokens[3].indexOf('/')));
			guiConfiguraciones.txtBD.setText(tokens[3].substring(tokens[3].indexOf('/')+1));
			
			guiConfiguraciones.txtUsuario.setText(propiedades.get("hibernate.connection.username"));
			guiConfiguraciones.psfPass.setText(propiedades.get("hibernate.connection.password"));
			guiConfiguraciones.psfPassRep.setText(propiedades.get("hibernate.connection.password"));

			if(propiedades.get("hibernate.show_sql").equals("true"))
				guiConfiguraciones.chkModoDepuracion.setSelected(true);
			else
				guiConfiguraciones.chkModoDepuracion.setSelected(false);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(
					guiConfiguraciones.frmConfiguraciones,
					"Se ha producido un error grave. Comuníquese con los desarrolladores y exponga el caso.\n"
					+ "Gracias.",
					"ERROR GRAVE",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		
		//OPCIONES ARCHIVO DE CONFIGURACION GLOBAL
		guiConfiguraciones.txtUbicacionFile.setText(utilidades.Configuraciones.URL_FILE);

		
		//OPCIONES SERVIDOR MAIL - SMTP
		guiConfiguraciones.txtServerSmtp.setText(utilidades.Configuraciones.SMTP_HOST);
		guiConfiguraciones.txtPuertoSmtp.setText(utilidades.Configuraciones.SMTP_PORT);
		guiConfiguraciones.txtMail.setText(utilidades.Configuraciones.SMTP_USER);
		guiConfiguraciones.psfPassSmtp.setText(utilidades.Configuraciones.SMTP_PASS);
		guiConfiguraciones.psfPassSmtpRep.setText(utilidades.Configuraciones.SMTP_PASS);
				
		if(utilidades.Configuraciones.SMTP_DEBUG.equals("true"))
			guiConfiguraciones.chkModoDepuracionSmtp.setSelected(true);
		else
			guiConfiguraciones.chkModoDepuracionSmtp.setSelected(false);
		
		if(utilidades.Configuraciones.SMTP_AUTH.equals("true"))
			guiConfiguraciones.chkAutenticacionSmtp.setSelected(true);
		else
			guiConfiguraciones.chkAutenticacionSmtp.setSelected(false);
		
		if(utilidades.Configuraciones.SMTP_TTLS.equals("true"))
			guiConfiguraciones.chkTtlsSmtp.setSelected(true);
		else
			guiConfiguraciones.chkTtlsSmtp.setSelected(false);
	}
	/////////////////////////////
	
	

	/**
	 * GUARDAR MODIFICACIONES
	 */
	@SuppressWarnings("deprecation")
	protected void click_aceptar()
	{
		if(validar_formulario())
		{
			propiedades.put("hibernate.connection.username", guiConfiguraciones.txtUsuario.getText());
			propiedades.put("hibernate.connection.password", guiConfiguraciones.psfPass.getText());
			if(guiConfiguraciones.chkModoDepuracion.isSelected())
				propiedades.put("hibernate.show_sql", "true");
			else
				propiedades.put("hibernate.show_sql", "false");
			
			String urlDB = "jdbc:mysql://"+guiConfiguraciones.txtURL.getText()+":"+guiConfiguraciones.txtPuerto.getText()+"/"+guiConfiguraciones.txtBD.getText();
			propiedades.put("hibernate.connection.url", urlDB);
			
			guiConfiguraciones.frmConfiguraciones.setCursor(new Cursor(Cursor.WAIT_CURSOR));
			
			archivoXML.guardarConfiguraciones(propiedades);
			
			HashMap<String, String> atributosMail = new HashMap<String, String>();
			
			atributosMail.put("SMTP_HOST", guiConfiguraciones.txtServerSmtp.getText());
			atributosMail.put("SMTP_PORT", guiConfiguraciones.txtPuertoSmtp.getText());
			
			if(guiConfiguraciones.chkAutenticacionSmtp.isSelected())
				atributosMail.put("SMTP_AUTH", "true");
			else
				atributosMail.put("SMTP_AUTH", "false");
			
			atributosMail.put("SMTP_USER", guiConfiguraciones.txtMail.getText());
			atributosMail.put("SMTP_PASS", guiConfiguraciones.psfPassSmtp.getText());
			
			if(guiConfiguraciones.chkTtlsSmtp.isSelected())
				atributosMail.put("SMTP_TTLS", "true");
			else
				atributosMail.put("SMTP_TTLS", "false");
			
			if(guiConfiguraciones.chkModoDepuracionSmtp.isSelected())
				atributosMail.put("SMTP_DEBUG", "true");
			else
				atributosMail.put("SMTP_DEBUG", "false");
			
			utilidades.Configuraciones.guardar_modificaciones_mail(atributosMail);
			
			utilidades.Configuraciones.modificar_url_archivo_config(guiConfiguraciones.txtUbicacionFile.getText());
			
			
			
			int rta = JOptionPane.showConfirmDialog(
								guiConfiguraciones.frmConfiguraciones,
								"Deberá reiniciar la aplicación para que los cambios de configuración surtan efectos.\n"
								+ "¿Desea cerrar la aplicación en este momento?",
								"ATENCIÓN",
								JOptionPane.YES_NO_OPTION);
			
			cerrar_salir();
			
			if(rta == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			
		}
		
	}
	///////////////////////////////
	

	
	/**
	 * VALIDAR DATOS DEL FORMULARIO
	 * @return boolean - Formulario valido
	 */
	@SuppressWarnings("deprecation")
	protected boolean validar_formulario()
	{
		boolean rta = true;
		String mensaje = "";
		
		if(guiConfiguraciones.txtURL.getText().equals(""))
		{
			mensaje += "El campo de servidor no puede estar vacío\n";
			rta = false;
		}

		if(!validar_puerto(guiConfiguraciones.txtPuerto.getText()))
		{
			mensaje += "El campo de puerto de BD no es válido\n";
			rta = false;
		}
		
		if(guiConfiguraciones.txtUsuario.getText().equals(""))
		{
			mensaje += "El campo de usuario no puede estar vacío\n";
			rta = false;
		}

		if(guiConfiguraciones.txtBD.getText().equals(""))
			mensaje += "El campo de base de datos no puede estar vacío\n";
		
		if(guiConfiguraciones.psfPass.getText().equals(""))
		{
			mensaje += "El campo de contraseña de base de datos no puede estar vacío\n";
			rta = false;
		}
		
		if(!guiConfiguraciones.psfPass.getText().equals(guiConfiguraciones.psfPassRep.getText()))
		{
			mensaje += "Las contraseñas de base de datos no coinciden\n";
			rta = false;
		}
		
		if(guiConfiguraciones.txtUbicacionFile.getText().equals(""))
		{
			mensaje += "El campo de ubicación del archivo de configuraciones no puede ser nulo\n";
			rta = false;
		}	
		
		if(guiConfiguraciones.txtServerSmtp.getText().equals(""))
		{
			mensaje += "El campo de servidor SMTP no puede estar vacio\n";
			rta = false;
		}
			
		if(!validar_puerto(guiConfiguraciones.txtPuertoSmtp.getText()))
		{
			mensaje += "El campo de puerto SMTP no es válido\n";
			rta = false;
		}
		
		if(!validar_mail(guiConfiguraciones.txtMail.getText()))
		{
			mensaje += "El campo de mail no es válido\n";
			rta = false;
		}
		
		if(guiConfiguraciones.psfPassSmtp.getText().equals(""))
		{
			mensaje += "El campo de contraseña de mail no puede estar vacío\n";
			rta = false;
		}
		
		if(!guiConfiguraciones.psfPassSmtpRep.getText().equals(guiConfiguraciones.psfPassSmtp.getText()))
		{
			mensaje += "Las contraseñas de mail no coinciden\n";
			rta = false;
		}
			
		if(!rta)
			JOptionPane.showMessageDialog(guiConfiguraciones.frmConfiguraciones, mensaje, "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
		
		return rta;
	}
	///////////////////////////////////////
	

	
	/**
	 * VALIDACION DE MAIL INGRESADO
	 * @param mail - Mail a validar
	 * @return boolean - Mail validado
	 */
	protected boolean validar_mail(String mail)
    {
		String patron_mail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron = Pattern.compile(patron_mail);
 
        Matcher matcher = patron.matcher(mail);
        return matcher.matches();
    }
	////////////////////////////////////////////
	
	

	/**
	 * VALIDAR NRO DE PUERTO INGRESADO
	 * @param puerto - Nro a validar
	 * @return boolean - Puerto validado
	 */
	protected boolean validar_puerto(String puerto)
    {
		String patron_puerto = "\\d{1,5}";
        Pattern patron = Pattern.compile(patron_puerto);
 
        Matcher matcher = patron.matcher(puerto);
        return matcher.matches();
    }
	////////////////////////////////////////////////

	
	/**
	 * BUSCAR ARCHIVO DE CONFIGURACIONES
	 */
	protected void buscar_archivo()
	{
		String urlArchivoOLD = guiConfiguraciones.txtUbicacionFile.getText();
		
		try
		{
			guiConfiguraciones.frmConfiguraciones.setCursor(new Cursor(Cursor.WAIT_CURSOR));

			JFileChooser buscarArchivo = new JFileChooser();
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("ini","INI");
			buscarArchivo.setFileFilter(filter);
			
			@SuppressWarnings("unused")
			int seleccion = buscarArchivo.showOpenDialog(guiConfiguraciones.frmConfiguraciones);
						
			buscarArchivo.setVisible(true);
			String urlArchivo = buscarArchivo.getSelectedFile().getAbsolutePath();
			guiConfiguraciones.txtUbicacionFile.setText(urlArchivo);
		}
		catch(NullPointerException npe)
		{
			String urlArchivo = urlArchivoOLD;
			guiConfiguraciones.txtUbicacionFile.setText(urlArchivo);
			npe.printStackTrace();
		}
		finally
		{
			guiConfiguraciones.frmConfiguraciones.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
	}	
	////////////////////////////////
	
	
	
	/**
	 * CIERRA PAANTALLA DE CONFIGURACION
	 */
	private void cerrar_salir()
	{
		guiConfiguraciones.frmConfiguraciones.dispose();
	}
	////////////////////////////
}
