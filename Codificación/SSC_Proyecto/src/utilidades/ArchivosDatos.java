package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;



/**
 * LECTURA DE ARCHIVOS EN DIRECTORIO DE IMPORTACION
 * NO EFECTUA LECTURA DEL CONTENIDO DEL ARCHIVO
 * @author User
 *
 */
public class ArchivosDatos 
{
	
	/**
	 * CONSTRUCTOR
	 */
	public ArchivosDatos()
	{
		
	}
	
	
	/**
	 * OBTIENE LOS ARCHIVOS CONTENIDOS EN EL DIRECTORIO
	 * DE IMPORTACION
	 * @param dirRaiz
	 * @return
	 */
	public Collection<String> obtenerArchivos(String dirRaiz)
	{
		File dir = new File(dirRaiz);
		
		if(!dir.exists())
			dir.mkdir();
		   
		String[] ficheros = dir.list();
		
		if (ficheros == null)
			return null;

		else 
		{
			Collection<String> arrArchivos = new ArrayList<String>();
			
			for (int i=0; i<ficheros.length; i++)
				arrArchivos.add(ficheros[i]);
			
			return arrArchivos;
		}
	}	
	
	
	/**
	 * SIN USO - PERMITE LEER LINEA POR LINEA UN ARCHIVO
	 * @param dirRaiz
	 * @param archivos
	 * @throws Exception
	 */
	public void leerArchivos(String dirRaiz, Collection<String> archivos) throws Exception
	{
		try
		{	
			for(String archivoActual : archivos)
			{				
				String rutaArchivo = dirRaiz+archivoActual;
									
				File archivo = new File(rutaArchivo);
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
		        
				String lineaLectura = new String();   
		         
		        while((lineaLectura = br.readLine()) != null)
		        {
		        	System.out.println(lineaLectura);
		        } 
		        try
		        {                    
		           if(fr != null)
		           {   
		              fr.close();  
		           }                  
		        }

		        catch(Exception e2)
		        { 
		           e2.printStackTrace();
		        }
			}
		}
		finally
		{
			
		}
	}
}
