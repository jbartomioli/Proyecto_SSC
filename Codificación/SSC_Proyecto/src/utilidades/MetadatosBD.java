package utilidades;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MetadatosBD 
{
	private Collection<String> nombresTablas;
	
	public MetadatosBD() 
	{
		
	}
	
	public Collection<String> obtenerNombresTablas()
	{
		Connection conexion = null;
		nombresTablas = new ArrayList<String>();
				
	    try 
	    {
	    	utilidades.HibernateCFG archivoXML = new utilidades.HibernateCFG();
			archivoXML.leerConfiguraciones();
			
			HashMap<String, String> propiedades = archivoXML.getElementos();
	    	
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(
	    		  propiedades.get("hibernate.connection.url"),
	    		  propiedades.get("hibernate.connection.username"),
	    		  propiedades.get("hibernate.connection.password"));
	      
			DatabaseMetaData meta = conexion.getMetaData();
			ResultSet res = meta.getTables(null, null, null, new String[] {"TABLE"});
	      
			while (res.next()) 
			{
//				System.out.println(
//           	"   "+res.getString("TABLE_CAT") 
//           	+ ", "+res.getString("TABLE_SCHEM")
//           	+ ", "+res.getString("TABLE_NAME")
//           	+ ", "+res.getString("TABLE_TYPE")
//           	+ ", "+res.getString("REMARKS")); 
				nombresTablas.add(res.getString("TABLE_NAME"));
			
			}
			res.close();
	
			conexion.close();
	      
			return nombresTablas;
	    } 
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	return null;
	    }
  }
	
	
	public HashMap<String, String> obtenerCamposTabla(String nombreTabla)
	{
		Connection conexion = null;
		HashMap<String, String> camposTabla = new HashMap<String, String>();
				
	    try 
	    {
	    	utilidades.HibernateCFG archivoXML = new utilidades.HibernateCFG();
			archivoXML.leerConfiguraciones();
			
			HashMap<String, String> propiedades = archivoXML.getElementos();
	    	
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(
	    		  propiedades.get("hibernate.connection.url"),
	    		  propiedades.get("hibernate.connection.username"),
	    		  propiedades.get("hibernate.connection.password"));
	      
			DatabaseMetaData meta = conexion.getMetaData();
			ResultSet res = meta.getColumns(null, null, nombreTabla, null);
	      
			while (res.next()) 
			{
				camposTabla.put(res.getString("COLUMN_NAME"), res.getString("TYPE_NAME"));
				System.out.println(nombreTabla+" "+camposTabla.get(res.getString("COLUMN_NAME"))+" "+res.getString("COLUMN_NAME"));
			}
			res.close();
	
			conexion.close();
	      
			return camposTabla;
	    } 
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	return null;
	    }
  }
	
	
}
