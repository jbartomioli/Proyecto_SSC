package utilidades;

import java.util.*;
import java.io.*;

import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class Configuraciones{
	
	
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	//CONFIGURACIONES MAIL
	public static String SMTP_HOST;
	public static String SMTP_PORT;
	public static String SMTP_AUTH;
	public static String SMTP_USER;
	public static String SMTP_PASS;
	public static String SMTP_TTLS;
	public static boolean SMTP_DEBUG;
	
	//CONFIGURACIONES DIRECTORIOS
	public static String IMG_PRESENTACION;
	public static String IMG_ANUNCIOS;
	public static String IMG_ICONOS;
	public static String IMG_ENCABEZADO_MAIL;
	public static String IMG_PIE_MAIL;
	public static String DIR_HELP;
	
	public static String DIR_MAILS;
	
	public static String URL_FILE = "configuraciones.ini";
	
	public static String DIR_IMPORTADOR;
	
	public static String VARIOS_PATTERN1;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Configuraciones() throws IOException
	{
		obtenerConfiguraciones();
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS														*
	//***************************************************************
	


	/////////////////////////////////////////////////////////////////
	// OBTIENE LOS DATOS DE CONFIGURACIONES DEL ARCHIVO DE CONFIG. //
	/////////////////////////////////////////////////////////////////
	public static void obtenerConfiguraciones() throws IOException
	{
		Properties propiedades = new Properties();

		try
		{
			File archivo = new File("configuraciones.ini");
			
			URL_FILE = archivo.getAbsolutePath();
			
			propiedades.load(new FileInputStream(URL_FILE));
		}
		catch(FileNotFoundException fne)
		{
			JFileChooser buscarArchivo = new JFileChooser();
					
			FileNameExtensionFilter filter = new FileNameExtensionFilter("ini","INI");
			buscarArchivo.setFileFilter(filter);
			
			@SuppressWarnings("unused")
			int seleccion = buscarArchivo.showOpenDialog(new JDialog());
						
			buscarArchivo.setVisible(true);
			URL_FILE = buscarArchivo.getSelectedFile().getAbsolutePath();
			propiedades.load(new FileInputStream(URL_FILE));
		}
		
		
		IMG_PRESENTACION = propiedades.getProperty("IMG_PRESENTACION").toString();
		IMG_ANUNCIOS = propiedades.getProperty("IMG_ANUNCIOS").toString();
		IMG_ICONOS = propiedades.getProperty("IMG_ICONOS").toString();
		IMG_ENCABEZADO_MAIL = propiedades.getProperty("IMG_ENCABEZADO_MAIL").toString();
		IMG_PIE_MAIL = propiedades.getProperty("IMG_PIE_MAIL").toString();
		DIR_HELP = propiedades.getProperty("DIR_HELP").toString();
		
		DIR_MAILS = propiedades.getProperty("DIR_MAILS").toString();
		
		DIR_IMPORTADOR = propiedades.getProperty("DIR_IMPORTADOR");
		
		VARIOS_PATTERN1 = propiedades.getProperty("VARIOS_PATTERN1");

		SMTP_HOST = propiedades.getProperty("SMTP_HOST").toString();
		SMTP_PORT = propiedades.getProperty("SMTP_PORT").toString();
		SMTP_AUTH = propiedades.getProperty("SMTP_AUTH").toString();
		SMTP_USER = propiedades.getProperty("SMTP_USER").toString();
		SMTP_PASS = propiedades.getProperty("SMTP_PASS").toString();
		SMTP_TTLS = propiedades.getProperty("SMTP_TTLS").toString();
		SMTP_DEBUG = propiedades.getProperty("SMTP_DEBUG").toString()=="true"?true:false;
	}
	
	
	//---------------------------------------------------------------
	public static void guardar_modificaciones_mail(HashMap<String, String> atributosMail)
	{
		SMTP_HOST = atributosMail.get("SMTP_HOST");
		SMTP_PORT = atributosMail.get("SMTP_PORT");
		SMTP_AUTH = atributosMail.get("SMTP_AUTH");
		SMTP_USER = atributosMail.get("SMTP_USER");
		SMTP_PASS = atributosMail.get("SMTP_PASS");
		SMTP_TTLS = atributosMail.get("SMTP_TTLS");
		SMTP_DEBUG = atributosMail.get("SMTP_DEBUG")=="true"?true:false;
		
		Properties propiedades = new Properties();
		
		try
		{
			propiedades.load(new FileInputStream("configuraciones.ini"));
		
			propiedades.setProperty("SMTP_HOST", atributosMail.get("SMTP_HOST"));
			propiedades.setProperty("SMTP_PORT",atributosMail.get("SMTP_PORT"));
			propiedades.setProperty("SMTP_AUTH",atributosMail.get("SMTP_AUTH"));
			propiedades.setProperty("SMTP_USER",atributosMail.get("SMTP_USER"));		
			propiedades.setProperty("SMTP_PASS",atributosMail.get("SMTP_PASS"));
			propiedades.setProperty("SMTP_TTLS",atributosMail.get("SMTP_TTLS"));
			propiedades.setProperty("SMTP_DEBUG",atributosMail.get("SMTP_DEBUG"));
			
			propiedades.store(new FileOutputStream("configuraciones.ini"), "");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//---------------------------------------------------------------
	public static void modificar_url_archivo_config(String urlFile)
	{
		URL_FILE = urlFile;
	}
}
