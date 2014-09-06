package utilidades;

import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.csvreader.CsvReader;
 
 
public class LectorCSV
{
 
    @SuppressWarnings("rawtypes")
	public LectorCSV(HashMap<String, String> tablas_archivos) 
    {
        try 
        {     
        	Iterator it = tablas_archivos.entrySet().iterator();
        	while (it.hasNext())
        	{
        		Map.Entry e = (Map.Entry)it.next();
        		
        		if(!e.getValue().toString().equals(""))
        		{
        			CsvReader contenidoArchivo = new CsvReader(e.getValue().toString());
        			contenidoArchivo.readHeaders();
	         
        			String sql = "INSERT INTO "+e.getKey()+" VALUES (";
        			
			        while (contenidoArchivo.readRecord())
			        {
			        	int cantCampos = contenidoArchivo.getColumnCount();
			        	
			        	for(int i=0; i<cantCampos; i++)
			        	{
			        		String campo = contenidoArchivo.get(i);
			        		
			        		sql += campo + ",";
			        		
			        		//System.out.println(campo);
			        	}
			        	
			        	sql += " );";
			        	
		        		System.out.println(sql);
			        	
	//		        	switch(archivo)
	//		        	{
	//		        		case 1: ;
	//		        	}
			        	
			        	//System.out.println("");	
			        } 
			        contenidoArchivo.close();
        		}
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
