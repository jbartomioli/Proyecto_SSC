package datos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ParametrosNegocio 
{
	//ATRIBUTOS
	String membrete;
	int ultIdPedido;

	
	
	//CONSTRUCTOR
	public ParametrosNegocio() 
	{
		this.membrete = "";
		this.ultIdPedido = 0;
	}


	//GETTER & SETTERS
	public String getMembrete() 
	{
		return membrete;
	}



	public void setMembrete(String membrete) 
	{
		this.membrete = membrete;
	}



	public int getUltIdPedido() 
	{
		return ultIdPedido;
	}



	public void setUltIdPedido(int ultIdPedido) 
	{
		this.ultIdPedido = ultIdPedido;
	}
	
	
	//METODOS
	//----------------------------------------------------------
	public datos.ParametrosNegocio getParametros()
	{
		ResultSet conjuntoResult = null;
		datos.BDConector conector = null;
		
		datos.ParametrosNegocio parametros = null;

		
		try
		{
			
			conector = new datos.BDConector(datos.BDConstantes.URL_BD, 
					datos.BDConstantes.PORT, 
					datos.BDConstantes.DATABASE, 
					datos.BDConstantes.USER, 
					datos.BDConstantes.PASS);
			

			conjuntoResult = conector.ejecutaPeticion("SELECT * FROM parametrosNegocio");
			

			
			while( conjuntoResult.next())
			{
				parametros = new datos.ParametrosNegocio();

				parametros.setMembrete(conjuntoResult.getString("membrete"));
				parametros.setUltIdPedido(conjuntoResult.getInt("ultIdPedido"));
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
		return parametros;
	}
}