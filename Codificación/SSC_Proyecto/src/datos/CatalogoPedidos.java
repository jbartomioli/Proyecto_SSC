package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class CatalogoPedidos 
{

	//ATRIBUTOS
	private Collection<datos.Pedido> pedidos;
	
	
	//CONSTRUCTOR
	public CatalogoPedidos() 
	{
		this.pedidos = new ArrayList<datos.Pedido>();
		this.obtenerPedidos();
	}


	
	//GETTER & SETTERS
	public Collection<datos.Pedido> getPedidos() 
	{
		return pedidos;
	}


	public void setPedidos(Collection<datos.Pedido> pedidos) 
	{
		this.pedidos = pedidos;
	}
	
	//METODOS
	//----------------------------------------------------------

	public Collection<datos.Pedido> obtenerPedidos()
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
			

			conjuntoResult = conector.ejecutaPeticion("CALL obtenerPedidos");
					
			
			while( conjuntoResult.next())
			{
				datos.Pedido p = new datos.Pedido();
				
				p.setIdPedido(conjuntoResult.getInt("idPedido"));
				p.setTotal(conjuntoResult.getFloat("total"));
				p.setFecha(conjuntoResult.getDate("fecha"));
				p.setEstado(conjuntoResult.getBoolean("estado"));			
				p.setCliente(conjuntoResult.getInt("idCliente"));
				p.setLinea(conjuntoResult.getInt("idLinea"));
				pedidos.add(p);
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
		return pedidos;
	}

}
