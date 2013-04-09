package datos;

import java.sql.*;

public class BDConector {
	
	//ATRIBUTOS
	private String ip,puerto,base,login,password;
	@SuppressWarnings("unused")
	private boolean conectado = false;
	Connection conexion;
	private Statement s;
	private ResultSet rs;
	
	
	
	//METODOS
	//----------------------------------------------------------------------------
	public BDConector(String ip, String puerto, String base, String login, String password)
	{
		this.ip = ip;
		this.puerto = puerto;
		this.base = base;
		this.login = login;
		this.password = password;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection ("jdbc:mysql://"+this.ip+":"+this.puerto+"/"+this.base+"?user="+this.login+"&password="+this.password);
			conectado = true;
			//conexion.close();
		}
		catch (Exception e)
		{
			System.out.println("Intento de conexion fallida");
		}
	}
        
	//----------------------------------------------------------------------------    
	public BDConector()
	{
	   try
	   {	
		   Class.forName("com.mysql.jdbc.Driver").newInstance();
		   conexion = DriverManager.getConnection ("jdbc:mysql://"+this.ip+":"+this.puerto+"/"+this.base+"?user="+this.login+"&password="+this.password);
       }
	   catch (Exception e)
       {
		   System.out.println("Intento de conexion fallida");
		   e.printStackTrace();
       }
    }
    
	
	
	//----------------------------------------------------------------------------   
	public ResultSet ejecutaPeticion(String peticion)
	{
	   try
	   {
	       s= conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	       rs = s.executeQuery(peticion);
	       return rs;
       }   
	   catch(SQLException e)
	   {
		   System.err.println("SQLException: "+ e.getMessage());
	   }
           return null;
   }
   
   
	//----------------------------------------------------------------------------   
    public void ejecutaActualizacion(String actualizacion)
    {
    	try
        {
            s.executeUpdate(actualizacion);   
        }   
        catch(SQLException e)
        {
        	System.err.println("SQLException: "+ e.getMessage());
        }
    }
 
	//----------------------------------------------------------------------------
    public void cierraConexion()
   	{
    	try
    	{
            rs.close();
            s.close();
            conexion.close();
    	}
    	catch(Exception e)
    	{
    		System.err.println("SQLException: "+ e.getMessage());
    	}
   	}
    
   
	//----------------------------------------------------------------------------
    public void cierraConexionParcial()
    {
    	try
    	{
    		conexion.close();
	    }
    	catch(Exception e)
    	{
    		System.err.println("SQLException: "+ e.getMessage());
	    }
	 }
}
