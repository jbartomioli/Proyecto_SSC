package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
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
		ResultSet conjuntoResult = null;
		datos.BDConector conector = null;
		
		
		try
		{
			
			conector = new datos.BDConector(datos.BDConstantes.URL_BD, 
					datos.BDConstantes.PORT, 
					datos.BDConstantes.DATABASE, 
					datos.BDConstantes.USER, 
					datos.BDConstantes.PASS);
			

			conjuntoResult = conector.ejecutaPeticion("SELECT * FROM `clientes`");
					
			
			while( conjuntoResult.next())
			{
				datos.Cliente c = new datos.Cliente();
				
				c.setIdCliente(conjuntoResult.getInt("idCliente"));
				c.setNombre(conjuntoResult.getString("nombre"));
				c.setApellido(conjuntoResult.getString("apellido"));
				c.setEmail(conjuntoResult.getString("email"));			
				clientes.add(c);
			}			
		}
		catch ( SQLException excepcionSql)
		{
			excepcionSql.printStackTrace();
		}
		finally
		{
			try
			{
				conjuntoResult.close();
				conector.cierraConexion();
			}
			catch (Exception excepcion)
			{
				excepcion.printStackTrace();
			}
		}
		return clientes;
	}
}
