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
        			Session session = null;	
        			
        			CsvReader contenidoArchivo = new CsvReader(entryTablas.getValue().toString());
        			contenidoArchivo.readHeaders();
        			
	        		try
	        		{
	        			session = utilidades.HibernateUtil.getSessionFactory().openSession();
	        			session.beginTransaction();
        		    
	        			Query fk_off = session.createSQLQuery("SET FOREIGN_KEY_CHECKS=0");
	        			fk_off.executeUpdate();

	        			utilidades.MetadatosBD camposTabla = new utilidades.MetadatosBD();
	        			String[][] campos_tabla = camposTabla.obtenerCamposTabla(entryTablas.getKey().toString());
	        			
	        			String sql_inicio = "INSERT INTO "+entryTablas.getKey()+" ( ";
	        			
	        			for(int j=0; j<campos_tabla.length; j++)
	        			{
	        				if(j<campos_tabla.length-1)
	        					sql_inicio += campos_tabla[j][0]+", ";
	        				else
	        					sql_inicio += campos_tabla[j][0]+" ) VALUES (";
	        			}
	        				
	        			String sql = "";
	        			
	        			while (contenidoArchivo.readRecord())
				        {
				        	int cantCampos = contenidoArchivo.getColumnCount();
				        	
			        		sql += sql_inicio;
	
				        	for(int i=0; i<cantCampos; i++)
				        	{
				        		String campo = contenidoArchivo.get(i);
				        		
				        		if(campos_tabla[i][1].equals("VARCHAR") || campos_tabla[i][1].equals("LONGTEXT"))
				        			sql += " \""+campo+"\", ";
				        		else
				        			if(campos_tabla[i][1].equals("DATETIME"))
				        				sql += " \'"+campo+"\', ";
				        			else
				        				sql += " "+campo+", "; 		
				        	}
				        	sql = sql.substring(0,sql.length()-2);
				        	
				        	sql += " ); ";
				        	
			        		System.out.println(sql);
				        	
				        	Query query = session.createSQLQuery(sql);
				        	query.executeUpdate();
				        	sql = "";
				        }
	        			
		        		System.out.println(sql);
	
	        			Query fk_on = session.createSQLQuery("SET FOREIGN_KEY_CHECKS=1");
	        			fk_on.executeUpdate();
						
	        			session.getTransaction().commit();
	        		}
	        		catch(Exception ee)
	        		{
		        		ee.printStackTrace();
	        		}
	        		finally
	        		{
	        			session.close();
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
