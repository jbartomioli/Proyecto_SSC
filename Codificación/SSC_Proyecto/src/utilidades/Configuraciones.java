package utilidades;

import java.util.*;
import java.io.*;

public class Configuraciones {
	
	
	//***************************************************************
	//* ATRIBUTOS													*
	//***************************************************************
	//CONFIGURACIONES MAIL
	private String SMTP_HOST;
	private String SMTP_PORT;
	private String SMTP_AUTH;
	private String SMTP_USER;
	private String SMTP_PASS;
	private String SMTP_TTLS;
	
	//CONFIGURACIONES DIRECTORIOS
	private String IMG_PRESENTACION;
	private String IMG_ANUNCIOS;
	//---------------------------------------------------------------


	//***************************************************************
	//* CONSTRUCTOR													*
	//***************************************************************
	public Configuraciones()
	{
		//CONFIGURACIONES MAIL
		this.SMTP_HOST = "";
		this.SMTP_PORT = "";
		this.SMTP_AUTH = "";
		this.SMTP_USER = "";
		this.SMTP_PASS = "";
		this.SMTP_TTLS = "";
		
		//CONFIGURACIONES DIRECTORIOS
		this.IMG_PRESENTACION = "";
		this.IMG_ANUNCIOS = "";
	}
	//---------------------------------------------------------------


	//***************************************************************
	//* GETTES & SETTERS											*
	//***************************************************************
	public String getSMTP_HOST() 
	{
		return SMTP_HOST;
	}


	public void setSMTP_HOST(String sMTP_HOST) 
	{
		SMTP_HOST = sMTP_HOST;
	}


	public String getSMTP_PORT() 
	{
		return SMTP_PORT;
	}


	public void setSMTP_PORT(String sMTP_PORT) 
	{
		SMTP_PORT = sMTP_PORT;
	}


	public String getSMTP_AUTH() 
	{
		return SMTP_AUTH;
	}


	public void setSMTP_AUTH(String sMTP_AUTH) 
	{
		SMTP_AUTH = sMTP_AUTH;
	}


	public String getSMTP_USER() 
	{
		return SMTP_USER;
	}


	public void setSMTP_USER(String sMTP_USER) 
	{
		SMTP_USER = sMTP_USER;
	}


	public String getSMTP_PASS() 
	{
		return SMTP_PASS;
	}


	public void setSMTP_PASS(String sMTP_PASS) 
	{
		SMTP_PASS = sMTP_PASS;
	}


	public String getSMTP_TTLS() 
	{
		return SMTP_TTLS;
	}


	public void setSMTP_TTLS(String sMTP_TTLS) 
	{
		SMTP_TTLS = sMTP_TTLS;
	}
	
	
	public String getIMG_PRESENTACION()
	{
		return IMG_PRESENTACION;
	}


	public void getIMG_PRESENTACION(String iMG_PRESENTACION) 
	{
		IMG_PRESENTACION = iMG_PRESENTACION;
	}


	public String getIMG_ANUNCIOS() 
	{
		return IMG_ANUNCIOS;
	}


	public void setIMG_ANUNCIOS(String iMG_ANUNCIOS) 
	{
		IMG_ANUNCIOS = iMG_ANUNCIOS;
	}
	//---------------------------------------------------------------
	
	
	
	//***************************************************************
	//* METODOS														*
	//***************************************************************
	



	/////////////////////////////////////////////////////////////////
	// OBTIENE LOS DATOS DE CONFIGURACIONES DEL ARCHIVO DE CONFIG. //
	/////////////////////////////////////////////////////////////////
	public void obtenerConfiguraciones() 
	{
		try
		{
			Properties propiedades = new Properties();
			
			propiedades.load(new FileInputStream("configuraciones.ini"));
			
			this.SMTP_HOST = propiedades.getProperty("SMTP_HOST").toString();
			this.SMTP_PORT = propiedades.getProperty("SMTP_PORT").toString();
			this.SMTP_AUTH = propiedades.getProperty("SMTP_AUTH").toString();
			this.SMTP_USER = propiedades.getProperty("SMTP_USER").toString();
			this.SMTP_PASS = propiedades.getProperty("SMTP_PASS").toString();
			this.SMTP_TTLS = propiedades.getProperty("SMTP_TTLS").toString();
			
			this.IMG_PRESENTACION = propiedades.getProperty("IMG_PRESENTACION").toString();
			this.IMG_ANUNCIOS = propiedades.getProperty("IMG_ANUNCIOS").toString();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al leer el archivo de configuración."+ e.getMessage());
			e.printStackTrace();
		}
	}
	//---------------------------------------------------------------
}
