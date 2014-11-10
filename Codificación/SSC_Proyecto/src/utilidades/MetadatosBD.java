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
	
	public Collection<String> obtenerNombresTablas() throws Exception
	{
		Connection conexion = null;
		nombresTablas = new ArrayList<String>();
				
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
	
	
	public String[][] obtenerCamposTabla(String nombreTabla) throws Exception
	{
		Connection conexion = null;

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
      
		res.last();
		int cantidad = res.getRow();
		res.first();
		
		String[][] camposTabla = new String[cantidad][2];
		
		camposTabla[0][0] = res.getString("COLUMN_NAME");
		camposTabla[0][1] = res.getString("TYPE_NAME");
		
		int i=1;
		while(res.next()) 
		{
			camposTabla[i][0] = res.getString("COLUMN_NAME");
			camposTabla[i][1] = res.getString("TYPE_NAME");		
			i++;
		}				
		res.close();

		conexion.close();
      
		return camposTabla;
	}
	
	
}
