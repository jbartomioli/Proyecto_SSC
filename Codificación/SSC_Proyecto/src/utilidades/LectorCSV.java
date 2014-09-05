package utilidades;

import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.util.Collection;

import com.csvreader.CsvReader;
 
 
public class LectorCSV
{
 
    public LectorCSV(String dirRaiz, Collection<String> archivos) 
    {
        try 
        {         
        	for(String archivo : archivos)
        	{
        		CsvReader contenidoArchivo = new CsvReader(dirRaiz+archivo);
	        	contenidoArchivo.readHeaders();
	         
		        while (contenidoArchivo.readRecord())
		        {
		        	int cantCampos = contenidoArchivo.getColumnCount();
		        	
		        	for(int i=0; i<cantCampos; i++)
		        	{
		        		String campo = contenidoArchivo.get(i);
		        		//System.out.println(campo);
		        	}
		        	//System.out.println("");
	            	
		        }
	         
		        contenidoArchivo.close();
        	}
	        
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
