package utilidades;

import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

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
        			
        			utilidades.MetadatosBD camposTabla = new utilidades.MetadatosBD();
        			camposTabla.obtenerCamposTabla(e.getKey().toString());
        			
			        while (contenidoArchivo.readRecord())
			        {
			        	int cantCampos = contenidoArchivo.getColumnCount();
			        	
			        	for(int i=0; i<cantCampos; i++)
			        	{
			        		String campo = contenidoArchivo.get(i);
			        		
			        		if(i!=cantCampos-1)
			        			sql += "" + campo + ",";
			        		else	
			        			sql += "" + campo + " );";
			        		
			        		//System.out.println(campo);
			        	}
			        	
		        		System.out.println(sql);
			        	
//		        		Session session = null;	
		        		
		        		try
		        		{
//		        		    session = utilidades.HibernateUtil.getSessionFactory().openSession();
//		        		    session.beginTransaction();
//		        		    
//		        			Query query = session.createSQLQuery(sql);
//		    				query.setParameter("producto", entProducto.getIdProducto());
//							query.setParameter("anuncio", maxIdAnuncio);
//							query.executeUpdate();
//
//		        	        session.getTransaction().commit();
		        		}
		        		catch(Exception ee)
		        		{
//		        			ee.printStackTrace();
		        		}
		        		finally
		        		{
//		        		 	session.close();
		        		}	
		        		
		        		
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
