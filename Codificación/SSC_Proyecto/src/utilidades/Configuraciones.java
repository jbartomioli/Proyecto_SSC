package utilidades;

import java.util.*;
import java.io.*;

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
	
	//CONFIGURACIONES DIRECTORIOS
	public static String IMG_PRESENTACION;
	public static String IMG_ANUNCIOS;
	public static String IMG_ICONOS;
	public static String IMG_ENCABEZADO_MAIL;
	public static String IMG_PIE_MAIL;
	
	public static String DIR_MAILS;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Configuraciones() throws FileNotFoundException, IOException
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
	public static void obtenerConfiguraciones() throws IOException, FileNotFoundException
	{
			Properties propiedades = new Properties();
			
			propiedades.load(new FileInputStream("configuraciones.ini"));
			
			SMTP_HOST = propiedades.getProperty("SMTP_HOST").toString();
			SMTP_PORT = propiedades.getProperty("SMTP_PORT").toString();
			SMTP_AUTH = propiedades.getProperty("SMTP_AUTH").toString();
			SMTP_USER = propiedades.getProperty("SMTP_USER").toString();
			SMTP_PASS = propiedades.getProperty("SMTP_PASS").toString();
			SMTP_TTLS = propiedades.getProperty("SMTP_TTLS").toString();
			
			IMG_PRESENTACION = propiedades.getProperty("IMG_PRESENTACION").toString();
			IMG_ANUNCIOS = propiedades.getProperty("IMG_ANUNCIOS").toString();
			IMG_ICONOS = propiedades.getProperty("IMG_ICONOS").toString();
			IMG_ENCABEZADO_MAIL = propiedades.getProperty("IMG_ENCABEZADO_MAIL").toString();
			IMG_PIE_MAIL = propiedades.getProperty("IMG_PIE_MAIL").toString();
			
			DIR_MAILS = propiedades.getProperty("DIR_MAILS").toString();
	}
	//---------------------------------------------------------------
}
