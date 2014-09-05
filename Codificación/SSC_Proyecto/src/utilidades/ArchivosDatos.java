package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;

public class ArchivosDatos 
{
	
	public ArchivosDatos()
	{
		
	}
	
	
	public Collection<String> obtenerArchivos(String dirRaiz)
	{
		File dir = new File(dirRaiz);
		   
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
	
	
	public void leerArchivos(String dirRaiz, Collection<String> archivos) throws Exception
	{
		try
		{	
			for(String archivoActual : archivos)
			{				
				String rutaArchivo = dirRaiz+archivoActual;
				
				//String archivoNombre = archivoActual.substring(0, archivoActual.length()-4);
					
				File archivo = new File(rutaArchivo);
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
		        
		        @SuppressWarnings("unused")
				String lineaLectura = new String();   
		         
		        while((lineaLectura = br.readLine()) != null)
		        {
		        	//lineas.add(lineaLectura);
		        	//System.out.println(lineaLectura);
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
