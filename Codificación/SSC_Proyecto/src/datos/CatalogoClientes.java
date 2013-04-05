package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoClientes 
{
	//ATRIBUTOS
	private Collection<datos.Cliente> clientes;
	
	
	//CONSTRUCTOR
	public CatalogoClientes() 
	{
		this.clientes = new ArrayList<datos.Cliente>();
		this.cargarClientes();
	}


	//GETTER & SETTER
	public Collection<datos.Cliente> getClientes() 
	{
		return clientes;
	}


	public void setClientes(Collection<datos.Cliente> clientes) 
	{
		this.clientes = clientes;
	}
	
	
	
	
	
	//METODOS
	//-------------------------------------------------------------
	public Collection<datos.Cliente> cargarClientes()
	{
		Connection conexion = null;
		Statement instruccion = null;
		ResultSet conjuntoResult = null;
		
		
		try
		{
			Class.forName(datos.BDConstantes.CONTROLADOR);
			
			conexion = DriverManager.getConnection(
						datos.BDConstantes.URL_BD, 
						datos.BDConstantes.USER, 
						datos.BDConstantes.PASS);
			
			instruccion = conexion.createStatement();
			
			conjuntoResult = instruccion.executeQuery("SELECT * FROM `clientes`");
			
			
			while( conjuntoResult.next())
			{
				datos.Cliente c = new datos.Cliente();
				
				c.setIdCliente(conjuntoResult.getInt("idCliente"));
				c.setNombre(conjuntoResult.getString("nombre"));
							
				clientes.add(c);
			}
			
			
		}
		catch ( SQLException excepcionSql)
		{
			excepcionSql.printStackTrace();
		}
		catch (ClassNotFoundException noEncontroClase)
		{
			noEncontroClase.printStackTrace();
		}
		finally
		{
			try
			{
				conjuntoResult.close();
				instruccion.close();
				conexion.close();
			}
			catch (Exception excepcion)
			{
				excepcion.printStackTrace();
			}
		}
		return clientes;
	}
}
