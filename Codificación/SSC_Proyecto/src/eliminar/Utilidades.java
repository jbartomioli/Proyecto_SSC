package eliminar;


import java.io.UnsupportedEncodingException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



//CLASE QUE CONTIENE FUNCIONES Y CONSTANTES IMPLEMENTADAS EN TODAS LAS CAPAS
//PARA DIFERENTES OPERACIONES
public class Utilidades 
{
	

		
	//---FUNCIONES-------------------------------------------------------------------------
		// CONVERSION DE DATO DE CAMPO HTML A ENTERO
		public static int convertirCampo(String cadena)
		{
			int rta = 0;
			if(!cadena.equals(""))
				rta = Integer.parseInt(cadena);
				
			return rta;
		}
		
		
		//-------------------------------------------------------------------------------------
		//CONVERSIÓN DE FECHA DATE A FECHA DE SQL
		public static String formatoFechaSQL(Date fcDate)
		{
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

			String fcCorrecta;
			
			fcCorrecta = formato.format(fcDate); 	
			
			return fcCorrecta;
		}
		
		
		
		//-------------------------------------------------------------------------------------
		//CONVERSIÓN DE FECHA STRING A FECHA DATE
		public static Date formatoFechaDATE(String fcString)
		{
			SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
			
			Date fcCorrecta;
			
			try 
			{
				fcCorrecta = formato.parse(fcString);
			} 
			catch (ParseException e) 
			{
				fcCorrecta = null;
			}
			
			return fcCorrecta;
		}
		
		
		
		//-------------------------------------------------------------------------------------
		//CONVERSIÓN DE FECHA DATE A FECHA PARA MOSTRAR EN CONSULTAS
		public static String formatoFechaMuestra(Date fcDate)
		{
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

			String fcCorrecta;
			
			fcCorrecta = formato.format(fcDate); 	
			
			return fcCorrecta;
		}
		
			
		
		
		//-------------------------------------------------------------------------------------
		//OBTENER CARACTERISTICA DE UN NUMERO TELEFONO/CELULAR
		public static String obtenerCaracteristica(String nroEnBd)
		{
			int posicionGuion = 0;

			for(int i = 0; i<nroEnBd.length(); ++i)	
				if(nroEnBd.charAt(i) == '-')
					posicionGuion = i;
			
			return nroEnBd.substring(0, posicionGuion);
		}		
		
		
		//-------------------------------------------------------------------------------------
		//OBTENER NUMERO TELEFONO/CELULAR
		public static String obtenerNumero(String nroEnBd)
		{
			int posicionGuion = 0;

			for(int i = 0; i<nroEnBd.length(); ++i)	
				if(nroEnBd.charAt(i) == '-')
					posicionGuion = i;
			
			return nroEnBd.substring(posicionGuion+1);
		}	
		
		
		
		//-------------------------------------------------------------------------------------
		//CONVERTIR STRING DE UTF-8 A ISO-8859-1
		public static String utf8_decode(String utf)
		{
			String s;
			try 
			{
				s = new String(utf.getBytes("ISO-8859-1"), "utf-8");
				return s;

			} 
			catch (UnsupportedEncodingException e) 
			{
				e.printStackTrace();
			}
			return null;
		}
		
		
		//-------------------------------------------------------------------------------------
		//CONVERTIR STRING DE ISO-8859-1 A UTF-8
		public static String utf8_encode(String iso)
		{
			String s;
			try 
			{
				s = new String(iso.getBytes("utf-8"), "ISO-8859-1");
				return s;

			} 
			catch (UnsupportedEncodingException e) 
			{
				e.printStackTrace();
			}
			return null;
		}
		
		
		
}
		
