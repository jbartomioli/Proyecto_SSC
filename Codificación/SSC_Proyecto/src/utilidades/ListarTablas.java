package utilidades;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class ListarTablas 
{
	private Collection<String> nombresTablas;
	
	public ListarTablas() 
	{
		
	}
	
	public Collection<String> obtenerNombresTablas()
	{
		Connection conexion = null;
		nombresTablas = new ArrayList<String>();
		
	    try 
	    {
	      Class.forName("com.mysql.jdbc.Driver");
	      conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.103:3306/BD_SSC","ssc_acceso","zLvSUVUaDnWFNKzG");
	      
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
}
