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
		this.obtenerClientes();
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
	public Collection<datos.Cliente> obtenerClientes()
	{
		ResultSet conjuntoResult = null;
		utilidades.BDConector conector = null;
		
		
		try
		{
			
			conector = new utilidades.BDConector(utilidades.BDConstantes.URL_BD, 
					utilidades.BDConstantes.PORT, 
					utilidades.BDConstantes.DATABASE, 
					utilidades.BDConstantes.USER, 
					utilidades.BDConstantes.PASS);
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerClientes");
					
			
			while( conjuntoResult.next())
			{
				datos.Cliente c = new datos.Cliente();
				
				c.setIdCliente(conjuntoResult.getInt("idCliente"));
				c.setNombre(conjuntoResult.getString("nombre"));
				c.setApellido(conjuntoResult.getString("apellido"));
				c.setEmail(conjuntoResult.getString("email"));		
				c.setEspecialidad(conjuntoResult.getString("especialidad"));
				c.setTipoCliente(conjuntoResult.getBoolean("tipo"));
				c.setDireccion(conjuntoResult.getString("direccion"));
				c.setTelefono(conjuntoResult.getString("telefono"));
	
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
