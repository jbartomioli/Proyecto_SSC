package utilidades;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class ListarDirectorio 
{
	private String dirRaiz = "C:\\TMP\\";
	
	public ListarDirectorio()
	{
		
	}
	
	
	public Collection<String> obtenerArchivos()
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
}
