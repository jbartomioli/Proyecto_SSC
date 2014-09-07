package utilidades;

import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import com.csvreader.CsvReader;
 
 
public class Importador
{
 
    @SuppressWarnings("rawtypes")
	public Importador(HashMap<String, String> tablas_archivos) 
    {
        try 
        {     
        	Iterator it_tablas = tablas_archivos.entrySet().iterator();
        	while (it_tablas.hasNext())
        	{
        		Map.Entry entryTablas = (Map.Entry)it_tablas.next();
        		
        		if(!entryTablas.getValue().toString().equals(""))
        		{
        			CsvReader contenidoArchivo = new CsvReader(entryTablas.getValue().toString());
        			contenidoArchivo.readHeaders();
        			
        			utilidades.MetadatosBD camposTabla = new utilidades.MetadatosBD();
        			String[][] campos_tabla = camposTabla.obtenerCamposTabla(entryTablas.getKey().toString());
        			
        			String sql = "INSERT INTO "+entryTablas.getKey()+" ( ";
        			
        			for(int j=0; j<campos_tabla.length; j++)
        			{
        				if(j<campos_tabla.length-1)
        					sql += campos_tabla[j][0]+", ";
        				else
        					sql += campos_tabla[j][0]+" ) VALUES (";
        			}
        				
        			while (contenidoArchivo.readRecord())
			        {
			        	int cantCampos = contenidoArchivo.getColumnCount();
			        	
			        	for(int i=0; i<cantCampos; i++)
			        	{
			        		String campo = contenidoArchivo.get(i);
			        		
			        		if(i!=cantCampos-1)
			        			sql += " "+campo+",";
			        		else	
			        			sql += " "+campo+" );";
			        		
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
